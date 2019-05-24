/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Apresentacao;

public class frmPrincipal extends javax.swing.JDialog
{


    public
            frmPrincipal(java.awt.Frame parent, boolean modal)
    {
        super(parent, modal);
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {

        lblNp1 = new javax.swing.JLabel();
        lblNp2 = new javax.swing.JLabel();
        lblExame = new javax.swing.JLabel();
        txfNp1 = new javax.swing.JTextField();
        txfNp2 = new javax.swing.JTextField();
        txfExame = new javax.swing.JTextField();
        btnCalcular = new javax.swing.JButton();
        lblResposta = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        lblNp1.setText("N1");

        lblNp2.setText("N2");

        lblExame.setText("Exame");

        txfNp1.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                txfNp1ActionPerformed(evt);
            }
        });

        btnCalcular.setText("Calcular");
        btnCalcular.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnCalcularActionPerformed(evt);
            }
        });

        lblResposta.setText("Resposta");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(btnCalcular, javax.swing.GroupLayout.DEFAULT_SIZE, 108, Short.MAX_VALUE)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lblExame)
                                    .addComponent(lblNp1, javax.swing.GroupLayout.Alignment.LEADING))
                                .addComponent(lblNp2, javax.swing.GroupLayout.Alignment.LEADING))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txfNp1, javax.swing.GroupLayout.DEFAULT_SIZE, 66, Short.MAX_VALUE)
                                .addComponent(txfNp2)
                                .addComponent(txfExame))))
                    .addComponent(lblResposta))
                .addContainerGap(36, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNp1)
                    .addComponent(txfNp1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNp2)
                    .addComponent(txfNp2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txfExame, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblExame))
                .addGap(18, 18, 18)
                .addComponent(btnCalcular)
                .addGap(18, 18, 18)
                .addComponent(lblResposta)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txfNp1ActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_txfNp1ActionPerformed
    {//GEN-HEADEREND:event_txfNp1ActionPerformed
        
    }//GEN-LAST:event_txfNp1ActionPerformed

    private void btnCalcularActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnCalcularActionPerformed
    {//GEN-HEADEREND:event_btnCalcularActionPerformed
        Modelo.Controle controle = new Modelo.Controle(txfNp1.getText(),txfNp2.getText(),txfExame.getText());
        controle.Executar();
        if (controle.getMensagem().equals(""))
        {
            lblResposta.setText(controle.toString());
        }
        else 
        {
           lblResposta.setText(controle.getMensagem());
        }
    }//GEN-LAST:event_btnCalcularActionPerformed

    public static
            void main(String args[])
    {

        java.awt.EventQueue.invokeLater(new Runnable()
        {
            public
                    void run()
            {
                frmPrincipal dialog = new frmPrincipal(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter()
                {
                    @Override
                    public
                            void windowClosing(java.awt.event.WindowEvent e)
                    {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCalcular;
    private javax.swing.JLabel lblExame;
    private javax.swing.JLabel lblNp1;
    private javax.swing.JLabel lblNp2;
    private javax.swing.JLabel lblResposta;
    private javax.swing.JTextField txfExame;
    private javax.swing.JTextField txfNp1;
    private javax.swing.JTextField txfNp2;
    // End of variables declaration//GEN-END:variables
}
