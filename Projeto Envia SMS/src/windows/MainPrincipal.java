package windows;

import java.awt.Container;
import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import dados.Login;

public class MainPrincipal extends javax.swing.JFrame {

    public MainPrincipal() {
        initComponents();
        this.maximizaWindow();
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setButtonSMS();
   
    }

    private void maximizaWindow() {
        Container c = getContentPane();
        Dimension tela = Toolkit.getDefaultToolkit().getScreenSize();
        this.setSize(tela.width - 10, tela.height - 50);
    }
    

    private void setButtonSMS()
    {
        ImageIcon addContact = new ImageIcon("resources/img/"+"addContato.png");
        this.jEnviaSMS.setIcon(addContact);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jUserPainel = new javax.swing.JPanel();
        jAddUser = new javax.swing.JButton();
        jEnviaSMS = new javax.swing.JButton();
        jAdminPainel = new javax.swing.JPanel();
        jConfig = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu9 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem9 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jMenu5 = new javax.swing.JMenu();
        jMenu6 = new javax.swing.JMenu();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenuItem7 = new javax.swing.JMenuItem();
        jMenuItem8 = new javax.swing.JMenuItem();
        jMenu7 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("EMPRESA XYZ - Gerenciamento de Mensagens e Envio em Massa de SMS");
        setResizable(false);

        jUserPainel.setBackground(new java.awt.Color(153, 153, 153));
        jUserPainel.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jAddUser.setText("Adicionar Contato");
        jAddUser.setToolTipText("Cadastrar novo Contato");
        jAddUser.setVerticalTextPosition(SwingConstants.BOTTOM);
        jAddUser.setHorizontalTextPosition(SwingConstants.CENTER);
        jAddUser.setBorderPainted(false);
        jAddUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jAddUserActionPerformed(evt);
            }
        });

        jEnviaSMS.setText("Enviar SMS");
        jEnviaSMS.setVerticalTextPosition(SwingConstants.BOTTOM);
        jEnviaSMS.setHorizontalTextPosition(SwingConstants.CENTER);
        jEnviaSMS.setToolTipText("Enviar SMS");
        jEnviaSMS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jEnviaSMSActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jUserPainelLayout = new javax.swing.GroupLayout(jUserPainel);
        jUserPainel.setLayout(jUserPainelLayout);
        jUserPainelLayout.setHorizontalGroup(
            jUserPainelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jUserPainelLayout.createSequentialGroup()
                .addComponent(jEnviaSMS, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jAddUser, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(813, Short.MAX_VALUE))
        );
        jUserPainelLayout.setVerticalGroup(
            jUserPainelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jUserPainelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jAddUser)
                .addComponent(jEnviaSMS))
        );

        jAdminPainel.setBackground(new java.awt.Color(204, 204, 204));
        jAdminPainel.setBorder(javax.swing.BorderFactory.createEtchedBorder(null, new java.awt.Color(255, 0, 0)));

        jConfig.setToolTipText("Configurações do Sistema");
        jConfig.setVerticalTextPosition(SwingConstants.BOTTOM);
        jConfig.setHorizontalTextPosition(SwingConstants.CENTER);

        javax.swing.GroupLayout jAdminPainelLayout = new javax.swing.GroupLayout(jAdminPainel);
        jAdminPainel.setLayout(jAdminPainelLayout);
        jAdminPainelLayout.setHorizontalGroup(
            jAdminPainelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jAdminPainelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jAdminPainelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jConfig, javax.swing.GroupLayout.DEFAULT_SIZE, 57, Short.MAX_VALUE)
                    .addGroup(jAdminPainelLayout.createSequentialGroup()
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jAdminPainelLayout.setVerticalGroup(
            jAdminPainelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jAdminPainelLayout.createSequentialGroup()
                .addComponent(jConfig, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 288, Short.MAX_VALUE))
        );

        jMenu1.setText("Sistema");

        jMenuItem1.setText("Sobre o Sistema");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuBar1.add(jMenu1);

        jMenu9.setText("Contatos");

        jMenuItem2.setText("Agenda");
        jMenu9.add(jMenuItem2);

        jMenuBar1.add(jMenu9);

        jMenu2.setText("Funcionários");

        jMenuItem9.setText("Cadastrar Funcionário");
        jMenu2.add(jMenuItem9);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("Relatórios");

        jMenuItem3.setText("Mensagens Enviadas");
        jMenu3.add(jMenuItem3);

        jMenuItem4.setText("Últimas Mensagens");
        jMenu3.add(jMenuItem4);

        jMenuItem5.setText("Crédito");
        jMenu3.add(jMenuItem5);

        jMenuBar1.add(jMenu3);

        jMenu4.setText("Administração");
        jMenuBar1.add(jMenu4);

        jMenu5.setText("Parâmetros");
        jMenuBar1.add(jMenu5);

        jMenu6.setText("Importações");

        jMenuItem6.setText("Contatos");
        jMenu6.add(jMenuItem6);

        jMenuItem7.setText("Modelo de Mensagem");
        jMenu6.add(jMenuItem7);

        jMenuItem8.setText("Grupo");
        jMenu6.add(jMenuItem8);

        jMenuBar1.add(jMenu6);

        jMenu7.setText("Exportações");
        jMenuBar1.add(jMenu7);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jUserPainel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jAdminPainel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jUserPainel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jAdminPainel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jAddUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jAddUserActionPerformed
        WinCadastrarContato contato = new WinCadastrarContato();
        contato.setVisible(true);
    }//GEN-LAST:event_jAddUserActionPerformed

    private void jEnviaSMSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jEnviaSMSActionPerformed
        UpdEnviarSMS sms = new UpdEnviarSMS();
        sms.setVisible(true);
    }//GEN-LAST:event_jEnviaSMSActionPerformed

    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainPrincipal().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jAddUser;
    private javax.swing.JPanel jAdminPainel;
    private javax.swing.JButton jConfig;
    private javax.swing.JButton jEnviaSMS;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenu jMenu7;
    private javax.swing.JMenu jMenu9;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JMenuItem jMenuItem9;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JPanel jUserPainel;
    // End of variables declaration//GEN-END:variables
}
