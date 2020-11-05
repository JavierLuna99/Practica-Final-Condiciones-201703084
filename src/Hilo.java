//Javier Enrique Luna Díaz
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import javax.swing.JTextArea;
public class Hilo extends Thread{
    private JTextArea area;
    private RCompartido rc;
    private final static int inicio = 995;
    private final static int fin = 1000;
    private boolean dead = false;
    private int algoritmo;
    private int i;
    private static volatile boolean[] b = new boolean[4];   //Dijkstra
    private static volatile boolean[] c = new boolean[4];   //Dijkstra
    private static volatile int k = 0;                      //Dijkstra
    private Lock mutexApi;      //Mutex Api
    private Mutex mutex;        //Mutex Tradicional
    private boolean reinicio;
    
    Hilo(JTextArea area,RCompartido rc){
        this.area = area;                   //Creamos el hilo con su respectiva area y rc
        this.rc = rc;
        //Mutex apppi
        mutexApi = new ReentrantLock();
        //Mutex tradicional
        mutex = new Mutex();
        reinicio = false;                   //Atributo usado para iniciar otro algoritmo una vez ya iniciado uno previamente.
    }
    
    public void run(){
        switch(this.algoritmo){
            case 1:     //Condiciones Competencias
                while(true){
                    try{
                        if(reinicio == false){          //Primero verificamos que no se quiera realizar otro algoritmo, esto aplica en los 7 casos
                            rc.setrc(this.getName());               //Al ser nuestro primer algoritmo, se accede al recurso sin condiciones
                            area.append(rc.getrc()+": Eats\n");
                            sleep(1000);
                            if(isDead()){   
                                stop();     //Método de clase para ejemplificar kill
                            }
                        }   
                    }catch(Exception e){
                        e.printStackTrace();
                    }
                }
            case 2:     //Desactivación de interrupciones
                while(true){                   
                    try{
                        if(reinicio == false){
                            if(rc.estadoDeLasInterrupciones()){ //Verificamos nuestro estado de nuestras interrupciones
                                rc.desactivarInterrupciones();      //Desactivamos nuestras interrupciones antes de entrar a la sección crítica                         
                                rc.setrc(this.getName());
                                area.append(rc.getrc()+": Eats\n");
                                if(isDead()){   
                                    stop();     //Método de clase para ejemplificar kill
                                }   
                                rc.activarInterrupciones();      //Activamos las interrupciones una vez salimos de la sección crítica                                           
                            }
                            else{
                                area.append("En espera...\n");  //Sino puede acceder al recurso se queda en espera
                            }
                            Thread.sleep((int) (inicio+Math.random()*fin));
                        }
                    }catch(Exception e){
                        e.printStackTrace();
                    }
                }
        
            case 3:     //Variable de cerradura
                while(true){            //Recordando que para bloquear y desbloquear se hace uso de la cerradura
                    try{
                        if(reinicio == false){
                            if(rc.statusCerradura()){      //Verificamos si podemos acceder el rc
                                rc.cerrarCerradura();      //Lo bloqueamos para los demás procesos
                                rc.setrc(this.getName());
                                area.append(rc.getrc()+": Eats\n");
                                if(isDead()){   
                                    stop();     //Método de clase para ejemplificar kill
                                }              
                                rc.abrirCerradura();       //Una vez acabamos de usar el recurso lo desbloqueamos
                            }
                            else{
                                area.append("En espera...\n");  //Sino puede acceder al recurso se queda en espera
                            }
                            Thread.sleep((int) (inicio+Math.random()*fin));
                        }
                    }catch(Exception e)
                        {e.printStackTrace();
                    }
                 }
            case 4:     //Dekker
                while (true){
                    try{
                        if(reinicio == false){
                            rc.setHilos(rc.getTurno(), true);       //Asignamos un true en la posición correspondiente al hilo en el arreglo
                            if(isPosOcupada() != -1){                          
                                rc.setHilos(rc.getTurno(), false);          //Procedemos a verificar que no esté ocupada la posición
                                Thread.sleep((int)(inicio + Math.random() * fin));
                            }
                            rc.setHilos(rc.getTurno(), true);       
                            rc.setrc(this.getName());           //Una vez verificado lo anterior se accede al rc
                            area.append(rc.getrc() + "\n");
                            if(isDead()){
                                stop();     //Método de clase para ejemplificar kill
                            }
                            rc.setHilos(rc.getTurno(), false);  
                            if(rc.getTurno() == 3){             //Tenemos 3 turnos debido a que tenemos 4 procesos
                                rc.setTurno(0);                 //Una vez igualado ese número se vuelve a comenzar
                            }
                            else{
                                rc.setTurno(rc.getTurno()+1);       //En el caso contrario seguimos con el siguiente turno
                            }
                            Thread.sleep((int)(inicio + Math.random() * fin));
                        }
                    }catch(Exception e){
                        System.out.println(e.getMessage());
                    }
                }    
            case 5:     //Dijkstra
                dijkstra:
                while(true){
                    if(reinicio == false){
                        b[i] = true;
                        b = b;                  //Esto se debe de realizar debido a que son variables volátiles
                        while(k != i){
                            c[i] = false;
                            c = c;
                            if (!b[k]) {
                                k = i;
                            }
                        }
                        c[i] = true;
                        c = c;
                        for (int j = 0; j < c.length; j++) {        //Para acceder al rc se debe tener solo un valor de  c[i] en true
                            if (j != i && c[j]) {                   //Si se da el caso de encontrar un true, se debe verificar los demás en false
                                System.out.println("Ocupado");      //Sino no se podrá acceder al rc
                                continue dijkstra;
                            }
                        }
                        try{
                            rc.setrc(this.getName());
                            area.append(rc.getrc()+"\n");       //Se accede al rc
                            if(isDead()){   
                                    stop();     //Método de clase para ejemplificar kill
                            }  
                            Thread.sleep(1000);
                        }catch(Exception e){
                            e.printStackTrace();
                        }
                        c[i] = false;       //Llegado a este punto se reinicia el proceso
                        c = c;
                        b[i] = false;
                        b = b;
                    }
                }
            case 6:     //Mutex APPI
                while(true){            //Recordando que para bloquear y desbloquear se hace uso de mutex
                    try{
                        if(reinicio == false){
                            if(mutexApi.tryLock()){     //Verificamos el estado del mutex
                                mutexApi.lock();        //Se bloquea para que sólo 1 acceda al rc
                                rc.setrc(this.getName());                   //Se accede al rc
                                area.append(rc.getrc()+": Eats" + "\n");   
                                if(isDead()){   
                                    stop();     //Método de clase para ejemplificar kill
                                }   
                                mutexApi.unlock();      //Se desbloquea para que alguien más acceda
                            }      
                            else{
                                area.append("En espera...\n");
                            }
                            Thread.sleep((int) (inicio+Math.random()*fin));
                        }
                    }catch(Exception e){e.printStackTrace();}
                }  
            case 7:     //Mutex tradicional
                while(true){            //Recordando que para bloquear y desbloquear se hace uso de mutex
                    try{
                        if(reinicio == false){
                            if(mutex.trylock()){        //De igual manera se realiza el mismo proceso
                                mutex.lock();           //Con la diferencia que en este no usamos la librería
                                rc.setrc(this.getName());       
                                area.append(rc.getrc()+": Eats" + "\n");
                                if(isDead()){   
                                    stop();     //Método de clase para ejemplificar kill
                                }   
                                mutex.unlock();
                            }
                            else{
                                area.append("En espera...");
                            }
                            Thread.sleep((int) (inicio+Math.random()*fin));
                        }
                        }catch(Exception e){
                            e.printStackTrace();
                        }
                }
        }
    }
    
    public boolean isDead(){
        return dead;
    }
    public void setDead(boolean d){
        dead = d;
    }

    public int getAlgoritmo() {
        return algoritmo;
    }

    public void setAlgoritmo(int algoritmo) {
        this.algoritmo = algoritmo;
    }
    
    public int isPosOcupada(){    //Función con la cual verificamos si no está ocupada la pos
        boolean aux[] = rc.getHilos();          //Es int y no boolean ya que necesitamos recuperar la posición
        for(int j = 0; j < aux.length; j++){
            if(rc.getTurno() != j){
                if(aux[j]){
                    return j; 
                }
            }
        }
        return -1;
    }
    
    public void setI(int i){
        this.i = i;
    }
    
    public void setReinicio(boolean r){
        reinicio = r;
    }
}
