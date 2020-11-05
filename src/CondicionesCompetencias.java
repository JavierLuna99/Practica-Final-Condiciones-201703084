//Javier Enrique Luna Díaz
import javax.swing.JOptionPane;
public class CondicionesCompetencias extends javax.swing.JFrame {
    public static Hilo h1,h2,h3,h4;
    private RCompartido rc;    
    public CondicionesCompetencias() {
        setTitle("Prácticas de entrenamiento");
        initComponents();
        rc = new RCompartido();
        h1 = new Hilo(area1,rc);
        h1.setName("Perro 1");
        h2 = new Hilo(area2,rc);
        h2.setName("Perro 2");
        h3 = new Hilo(area3,rc);
        h3.setName("Perro 3");
        h4 = new Hilo(area4,rc);
        h4.setName("Perro 4");
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu3 = new javax.swing.JMenu();
        jButtonRun = new javax.swing.JButton();
        jButtonKill = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        area1 = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        area2 = new javax.swing.JTextArea();
        jScrollPane3 = new javax.swing.JScrollPane();
        area3 = new javax.swing.JTextArea();
        jScrollPane4 = new javax.swing.JScrollPane();
        area4 = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jButtonClean = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu4 = new javax.swing.JMenu();
        jMenuItemCC = new javax.swing.JMenuItem();
        jMenuItemDI = new javax.swing.JMenuItem();
        jMenuItemVC = new javax.swing.JMenuItem();
        jMenuItemDKK = new javax.swing.JMenuItem();
        jMenuItemDJK = new javax.swing.JMenuItem();
        jMenuItemMXA = new javax.swing.JMenuItem();
        jMenuItemMXT = new javax.swing.JMenuItem();

        jMenu3.setText("jMenu3");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setName("Desactivación de interrupciones"); // NOI18N

        jButtonRun.setText("Correr");
        jButtonRun.setEnabled(false);
        jButtonRun.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRunActionPerformed(evt);
            }
        });

        jButtonKill.setText("Kill rand");
        jButtonKill.setEnabled(false);
        jButtonKill.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonKillActionPerformed(evt);
            }
        });

        area1.setColumns(20);
        area1.setRows(5);
        jScrollPane1.setViewportView(area1);

        area2.setColumns(20);
        area2.setRows(5);
        jScrollPane2.setViewportView(area2);

        area3.setColumns(20);
        area3.setRows(5);
        jScrollPane3.setViewportView(area3);

        area4.setColumns(20);
        area4.setRows(5);
        jScrollPane4.setViewportView(area4);

        jLabel1.setText("Plato 1");

        jLabel2.setText("Plato 2");

        jLabel3.setText("Plato 3");

        jLabel4.setText("Plato 4");

        jButtonClean.setText("Limpiar");
        jButtonClean.setEnabled(false);
        jButtonClean.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCleanActionPerformed(evt);
            }
        });

        jMenu4.setText("Algoritmos");

        jMenuItemCC.setText("Condiciones Competencia");
        jMenuItemCC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemCCActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItemCC);

        jMenuItemDI.setText("Desactivación de interrupciones");
        jMenuItemDI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemDIActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItemDI);

        jMenuItemVC.setText("Variable de Cerradura");
        jMenuItemVC.setActionCommand("PetersonCommand");
        jMenuItemVC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemVCActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItemVC);

        jMenuItemDKK.setText("Dekker");
        jMenuItemDKK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemDKKActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItemDKK);

        jMenuItemDJK.setText("Dijkstra");
        jMenuItemDJK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemDJKActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItemDJK);

        jMenuItemMXA.setText("Mutex API");
        jMenuItemMXA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemMXAActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItemMXA);

        jMenuItemMXT.setText("Mutex Tradicional");
        jMenuItemMXT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemMXTActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItemMXT);

        jMenuBar1.add(jMenu4);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButtonKill, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonRun, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonClean, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(16, 16, 16)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(44, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(150, 150, 150)
                .addComponent(jLabel1)
                .addGap(106, 106, 106)
                .addComponent(jLabel2)
                .addGap(106, 106, 106)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addGap(96, 96, 96))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(67, 67, 67)
                        .addComponent(jButtonRun)
                        .addGap(37, 37, 37)
                        .addComponent(jButtonKill)
                        .addGap(35, 35, 35)
                        .addComponent(jButtonClean))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addGap(7, 7, 7)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 306, Short.MAX_VALUE)
                            .addComponent(jScrollPane2)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane4))))
                .addContainerGap(32, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private void jButtonRunActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRunActionPerformed
        h1.start();     //Botón para correr los hilos
        h2.start();
        h3.start();
        h4.start();
    }//GEN-LAST:event_jButtonRunActionPerformed

    private void jButtonKillActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonKillActionPerformed
        int id = (int)(Math.random()*4);        //Botón para matar un hilo al azar
        switch(id){
            case 0:
                try{
                    h1.setDead(true);
                    JOptionPane.showMessageDialog(null, "Se ha matado el proceso 1.");
                }catch(Exception e){JOptionPane.showMessageDialog(null, "Error");}
                break;
            case 1:
                try{
                    h2.setDead(true);
                    JOptionPane.showMessageDialog(null, "Se ha matado el proceso 2.");
                }catch(Exception e){JOptionPane.showMessageDialog(null, "Error");}
                break;
            case 2:
                try{
                    h3.setDead(true);
                    JOptionPane.showMessageDialog(null, "Se ha matado el proceso 3.");
                }catch(Exception e){JOptionPane.showMessageDialog(null, "Error");}
                break;
            case 3:
                try{
                    h4.setDead(true);
                    JOptionPane.showMessageDialog(null, "Se ha matado el proceso 4.");
                }catch(Exception e){JOptionPane.showMessageDialog(null, "Error");}
                break;
            default:
        }
        
    }//GEN-LAST:event_jButtonKillActionPerformed

    private void jMenuItemDIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemDIActionPerformed
        area1.setText("");      //Nos aseguramos de limpiar las areas al iniciar un nuevo algoritmo
        area2.setText("");
        area3.setText("");
        area4.setText("");  
        h1.setAlgoritmo(2);     //Confirmamos el algoritmo que se seleccionó
        h2.setAlgoritmo(2);
        h3.setAlgoritmo(2);
        h4.setAlgoritmo(2);
        jButtonRun.setEnabled(true);        //Activamos los botones para manejar los hilos para evitar errores.
        jButtonKill.setEnabled(true);
        jButtonClean.setEnabled(true);
    }//GEN-LAST:event_jMenuItemDIActionPerformed

    private void jMenuItemCCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemCCActionPerformed
        area1.setText("");      //La documentación aplica para todos los items
        area2.setText("");
        area3.setText("");
        area4.setText("");  
        h1.setAlgoritmo(1);
        h2.setAlgoritmo(1);
        h3.setAlgoritmo(1);
        h4.setAlgoritmo(1);
        jButtonRun.setEnabled(true);
        jButtonKill.setEnabled(true);
        jButtonClean.setEnabled(true);
    }//GEN-LAST:event_jMenuItemCCActionPerformed
        
    private void jMenuItemVCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemVCActionPerformed
        area1.setText("");
        area2.setText("");
        area3.setText("");
        area4.setText("");  
        h1.setAlgoritmo(3);
        h2.setAlgoritmo(3);
        h3.setAlgoritmo(3);
        h4.setAlgoritmo(3);
        jButtonRun.setEnabled(true);
        jButtonKill.setEnabled(true);
        jButtonClean.setEnabled(true);
    }//GEN-LAST:event_jMenuItemVCActionPerformed

    private void jMenuItemDKKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemDKKActionPerformed
        area1.setText("");
        area2.setText("");
        area3.setText("");
        area4.setText("");  
        h1.setAlgoritmo(4);
        h2.setAlgoritmo(4);
        h3.setAlgoritmo(4);
        h4.setAlgoritmo(4);
        jButtonRun.setEnabled(true);
        jButtonKill.setEnabled(true);
        jButtonClean.setEnabled(true);
    }//GEN-LAST:event_jMenuItemDKKActionPerformed

    private void jMenuItemDJKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemDJKActionPerformed
        area1.setText("");  //Cambia en dijkstra ya que necesitamos asignar nuestra I a nuestros procesos
        area2.setText("");
        area3.setText("");
        area4.setText("");  
        h1.setAlgoritmo(5);
        h1.setI(0);
        h2.setAlgoritmo(5);
        h2.setI(1);
        h3.setAlgoritmo(5);
        h3.setI(2);
        h4.setAlgoritmo(5);
        h4.setI(3);
        jButtonRun.setEnabled(true);
        jButtonKill.setEnabled(true);
        jButtonClean.setEnabled(true);
    }//GEN-LAST:event_jMenuItemDJKActionPerformed

    private void jMenuItemMXAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemMXAActionPerformed
        area1.setText("");
        area2.setText("");
        area3.setText("");
        area4.setText("");  
        h1.setAlgoritmo(6);
        h2.setAlgoritmo(6);
        h3.setAlgoritmo(6);
        h4.setAlgoritmo(6);
        jButtonRun.setEnabled(true);
        jButtonKill.setEnabled(true);
        jButtonClean.setEnabled(true);
    }//GEN-LAST:event_jMenuItemMXAActionPerformed

    private void jMenuItemMXTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemMXTActionPerformed
        area1.setText("");
        area2.setText("");
        area3.setText("");
        area4.setText("");  
        h1.setAlgoritmo(7);
        h2.setAlgoritmo(7);
        h3.setAlgoritmo(7);
        h4.setAlgoritmo(7);
        jButtonRun.setEnabled(true);
        jButtonKill.setEnabled(true);
        jButtonClean.setEnabled(true);
    }//GEN-LAST:event_jMenuItemMXTActionPerformed

    private void jButtonCleanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCleanActionPerformed
        h1.setReinicio(true);       //Botón limpiar, con el cual finalizamos los algoritmos y nos preparamos para ejecutar otro.
        h2.setReinicio(true);       //Avisamos que vamos a reiniciar
        h3.setReinicio(true);
        h4.setReinicio(true);
        rc = new RCompartido();     //Colocamos por defaault nuestros recurso e hilos para poder trabajar con un nuevo algoritmo
        h1 = new Hilo(area1,rc);
        h1.setName("Perro 1");
        h2 = new Hilo(area2,rc);
        h2.setName("Perro 2");
        h3 = new Hilo(area3,rc);
        h3.setName("Perro 3");
        h4 = new Hilo(area4,rc);
        h4.setName("Perro 4");
        area1.setText("");
        area2.setText("");
        area3.setText("");
        area4.setText("");             
        jButtonRun.setEnabled(false);       //Desactivamos los botones para evitar}]
        jButtonKill.setEnabled(false);
        jButtonClean.setEnabled(false);
    }//GEN-LAST:event_jButtonCleanActionPerformed

    
    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(CondicionesCompetencias.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CondicionesCompetencias.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CondicionesCompetencias.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CondicionesCompetencias.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CondicionesCompetencias().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea area1;
    private javax.swing.JTextArea area2;
    private javax.swing.JTextArea area3;
    private javax.swing.JTextArea area4;
    private javax.swing.JButton jButtonClean;
    private javax.swing.JButton jButtonKill;
    private javax.swing.JButton jButtonRun;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItemCC;
    private javax.swing.JMenuItem jMenuItemDI;
    private javax.swing.JMenuItem jMenuItemDJK;
    private javax.swing.JMenuItem jMenuItemDKK;
    private javax.swing.JMenuItem jMenuItemMXA;
    private javax.swing.JMenuItem jMenuItemMXT;
    private javax.swing.JMenuItem jMenuItemVC;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    // End of variables declaration//GEN-END:variables

}
