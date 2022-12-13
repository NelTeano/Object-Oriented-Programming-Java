
package activity4;


import java.util.Random;


/**
 *
 * @author Teano
 */
public class TicTacToeBoard extends javax.swing.JFrame {

    /**
     * Creates new form TicTacToeBoard
     */
    public TicTacToeBoard() {
        
        initComponents();
         Random ran = new Random();
        
        int num1 =  ran.nextInt(3);
        int num2 =  ran.nextInt(3);
        int num3 =  ran.nextInt(3);
        int num4 =  ran.nextInt(3);
        int num5 =  ran.nextInt(3);
        int num6 =  ran.nextInt(3);
        int num7 =  ran.nextInt(3);
        int num8 =  ran.nextInt(3);
        int num9 =  ran.nextInt(3);
        
        
        
        switch (num1) {          
               
                case 0:
                    sq1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/activity4/abbb.png")));
                break;
                
                case 1:
                     sq1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/activity4/accc.png")));
                break;
                
                case 2:
                     sq1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/activity4/akkk.png")));
                break;
        }
        
         switch (num2) {          
               
                case 0:
                    sq2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/activity4/abbb.png")));
                break;
                
                case 1:
                     sq2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/activity4/accc.png")));
                break;
                
                case 2:
                     sq2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/activity4/akkk.png")));
                break;
        }
         
          switch (num3) {          
               
                case 0:
                    sq3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/activity4/abbb.png")));
                break;
                
                case 1:
                     sq3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/activity4/accc.png")));
                break;
                
                case 2:
                     sq3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/activity4/akkk.png")));
                break;
        }
          
           switch (num4) {          
               
                case 0:
                    sq4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/activity4/abbb.png")));
                break;
                
                case 1:
                     sq4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/activity4/accc.png")));
                break;
                
                case 2:
                     sq4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/activity4/akkk.png")));
                break;
        }
           
            switch (num5) {          
               
                case 0:
                    sq5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/activity4/abbb.png")));
                break;
                
                case 1:
                     sq5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/activity4/accc.png")));
                break;
                
                case 2:
                     sq5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/activity4/akkk.png")));
                break;
        }
            
             switch (num6) {          
               
                case 0:
                    sq6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/activity4/abbb.png")));
                break;
                
                case 1:
                     sq6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/activity4/accc.png")));
                break;
                
                case 2:
                     sq6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/activity4/akkk.png")));
                break;
        }
             
              switch (num7) {          
               
                case 0:
                    sq7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/activity4/abbb.png")));
                break;
                
                case 1:
                     sq7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/activity4/accc.png")));
                break;
                
                case 2:
                     sq7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/activity4/akkk.png")));
                break;
        }
              
               switch (num8) {          
               
                case 0:
                    sq8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/activity4/abbb.png")));
                break;
                
                case 1:
                     sq8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/activity4/accc.png")));
                break;
                
                case 2:
                     sq8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/activity4/akkk.png")));
                break;
        }
               
                switch (num9) {          
               
                case 0:
                    sq9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/activity4/abbb.png")));
                break;
                
                case 1:
                     sq9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/activity4/accc.png")));
                break;
                
                case 2:
                     sq9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/activity4/akkk.png")));
                break;
        }   
                
                System.out.println(num1);
                System.out.println(num2);
                System.out.println(num3);
                System.out.println(num4);
                System.out.println(num5);
                System.out.println(num6);
                System.out.println(num7);
                System.out.println(num8);
                System.out.println(num9);
                System.out.println("end");
                
                
                
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        sq4 = new javax.swing.JLabel();
        sq7 = new javax.swing.JLabel();
        sq8 = new javax.swing.JLabel();
        sq1 = new javax.swing.JLabel();
        sq5 = new javax.swing.JLabel();
        sq3 = new javax.swing.JLabel();
        sq2 = new javax.swing.JLabel();
        sq6 = new javax.swing.JLabel();
        sq9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        sq4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/activity4/abbb.png"))); // NOI18N

        sq7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/activity4/abbb.png"))); // NOI18N

        sq8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/activity4/abbb.png"))); // NOI18N

        sq1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/activity4/abbb.png"))); // NOI18N

        sq5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/activity4/abbb.png"))); // NOI18N

        sq3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/activity4/abbb.png"))); // NOI18N

        sq2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/activity4/abbb.png"))); // NOI18N

        sq6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/activity4/abbb.png"))); // NOI18N

        sq9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/activity4/abbb.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(116, 116, 116)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(sq4)
                    .addComponent(sq7)
                    .addComponent(sq1))
                .addGap(124, 271, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(sq2)
                        .addGap(221, 221, 221)
                        .addComponent(sq3))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addComponent(sq8)
                            .addGap(221, 221, 221)
                            .addComponent(sq9))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addComponent(sq5)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(sq6))))
                .addGap(162, 162, 162))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(146, 146, 146)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(sq3)
                    .addComponent(sq1)
                    .addComponent(sq2))
                .addGap(74, 74, 74)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(sq4)
                    .addComponent(sq5)
                    .addComponent(sq6))
                .addGap(90, 90, 90)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(sq7)
                    .addComponent(sq8)
                    .addComponent(sq9))
                .addContainerGap(85, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

  
    
   
    
    
          
          
          
    public static void main(String args[]) {
      
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TicTacToeBoard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TicTacToeBoard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TicTacToeBoard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TicTacToeBoard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TicTacToeBoard().setVisible(true);
                
                
            }
        });
        

        
        
        
    }
    
    
   
    
    
    
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel sq1;
    private javax.swing.JLabel sq2;
    private javax.swing.JLabel sq3;
    private javax.swing.JLabel sq4;
    private javax.swing.JLabel sq5;
    private javax.swing.JLabel sq6;
    private javax.swing.JLabel sq7;
    private javax.swing.JLabel sq8;
    private javax.swing.JLabel sq9;
    // End of variables declaration//GEN-END:variables
}
