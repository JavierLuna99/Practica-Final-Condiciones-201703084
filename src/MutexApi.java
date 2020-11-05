//Javier Enrique Luna Díaz
public class MutexApi {
    private boolean pass = false;
    
    MutexApi(){
        
    }
    
    public void lock(){
        try{
            wait();
        }catch(Exception e){
            e.printStackTrace();
        ;}
    }
    
    public void unlock(){
        notify();
    }
    
    public boolean trylock(){       //Lógica en caso de fallas stop(), interrupt, etc
        try{
            wait();
        }catch(Exception e){}
        finally{
            unlock();
            return false;
        }
        
    }
}
