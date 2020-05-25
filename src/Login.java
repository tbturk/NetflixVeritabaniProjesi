import java.sql.ResultSet;
import java.awt.Color;
import java.sql.SQLException;

public class Login extends javax.swing.JPanel {

    /**
     * Creates new form Login
     */
    Register register;

    public Login() {
        initComponents();
        this.setBackground(Color.BLACK);
        okIcon.setVisible(false);
        parola.setEchoChar((char) 0);
        soz.setText("<html> <p style=\"text-align:center\">Sevdiğin şeyler için gel<p/> <p style=\"text-align:center\"> Keşfettiklerin için kal<p/></html>");
        soz.setVisible(true);
        okAsagiIcon.setVisible(false);
        kaydol.setText("<html> <p style=\"text-align:center\">Şimdi Aramıza Katıl<p/> </html>");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pwdIcon = new javax.swing.JLabel();
        soz = new javax.swing.JLabel();
        okIcon = new javax.swing.JLabel();
        netflixLogosu = new javax.swing.JLabel();
        eposta = new javax.swing.JTextField();
        mailIcon = new javax.swing.JLabel();
        parola = new javax.swing.JPasswordField();
        kaydol = new javax.swing.JLabel();
        hataMesaji = new javax.swing.JLabel();
        okAsagiIcon = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(800, 600));
        setLayout(null);

        pwdIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/parola.jpg"))); // NOI18N
        add(pwdIcon);
        pwdIcon.setBounds(470, 380, 30, 30);

        soz.setFont(new java.awt.Font("Ink Free", 1, 14)); // NOI18N
        soz.setForeground(new java.awt.Color(153, 153, 153));
        add(soz);
        soz.setBounds(295, 250, 180, 60);

        okIcon.setBackground(new java.awt.Color(0, 0, 0));
        okIcon.setForeground(new java.awt.Color(255, 255, 255));
        okIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ok.jpg"))); // NOI18N
        okIcon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                okIconMouseClicked(evt);
            }
        });
        add(okIcon);
        okIcon.setBounds(470, 380, 20, 30);

        netflixLogosu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/logo.png"))); // NOI18N
        add(netflixLogosu);
        netflixLogosu.setBounds(270, 40, 220, 220);

        eposta.setBackground(new java.awt.Color(0, 0, 0));
        eposta.setFont(new java.awt.Font("Times New Roman", 2, 14)); // NOI18N
        eposta.setForeground(new java.awt.Color(255, 255, 255));
        eposta.setText("E-posta");
        eposta.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        eposta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                epostaMouseClicked(evt);
            }
        });
        add(eposta);
        eposta.setBounds(290, 330, 170, 30);

        mailIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/mail.jpg"))); // NOI18N
        add(mailIcon);
        mailIcon.setBounds(470, 330, 30, 30);

        parola.setBackground(new java.awt.Color(0, 0, 0));
        parola.setFont(new java.awt.Font("Times New Roman", 2, 14)); // NOI18N
        parola.setForeground(new java.awt.Color(255, 255, 255));
        parola.setText("Parola");
        parola.setPreferredSize(new java.awt.Dimension(79, 23));
        parola.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                parolaMouseClicked(evt);
            }
        });
        add(parola);
        parola.setBounds(290, 380, 170, 30);

        kaydol.setBackground(new java.awt.Color(0, 0, 0));
        kaydol.setFont(new java.awt.Font("Ink Free", 1, 12)); // NOI18N
        kaydol.setForeground(new java.awt.Color(153, 153, 153));
        kaydol.setText("Şimdi Aramıza Katıl");
        kaydol.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                kaydolMouseClicked(evt);
            }
        });
        add(kaydol);
        kaydol.setBounds(310, 470, 140, 30);

        hataMesaji.setFont(new java.awt.Font("Times New Roman", 3, 13)); // NOI18N
        hataMesaji.setForeground(new java.awt.Color(255, 0, 0));
        add(hataMesaji);
        hataMesaji.setBounds(280, 420, 190, 30);

        okAsagiIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/okAsagi.jpg"))); // NOI18N
        add(okAsagiIcon);
        okAsagiIcon.setBounds(360, 445, 20, 30);
    }// </editor-fold>//GEN-END:initComponents

    private void epostaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_epostaMouseClicked
        eposta.setText("");
        hataMesaji.setVisible(false);
        okAsagiIcon.setVisible(false);
    }//GEN-LAST:event_epostaMouseClicked

    private void parolaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_parolaMouseClicked
        parola.setText("");
        pwdIcon.setVisible(false);
        okIcon.setVisible(true);
        parola.setEchoChar('*');
        hataMesaji.setVisible(false);
        okAsagiIcon.setVisible(false);
    }//GEN-LAST:event_parolaMouseClicked

    private void kaydolMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_kaydolMouseClicked
        pwdIcon.setVisible(true);
        hataMesaji.setVisible(false);
        okAsagiIcon.setVisible(false);  
        parola.setEchoChar((char) 0);
        eposta.setText("E-Posta");
        parola.setText("Parola");
        register = new Register();
        this.setVisible(true);
        this.setSize(800, 600);
        Main.ekran.add(register);
        Main.ekran.login.setVisible(false);
    }//GEN-LAST:event_kaydolMouseClicked

    private void okIconMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_okIconMouseClicked
        String batu = "select pwd from kullanici where mail=\"" + eposta.getText() + "\"";
        try {
            ResultSet rs = Main.statement.executeQuery(batu);
            String pwd = rs.getString("pwd");
            if (String.valueOf(parola.getPassword()).equals(pwd)) {
                Management management = new Management();
                management.setSize(Main.ekranX, Main.ekranY);
                Main.ekran.setSize(Main.ekranX, Main.ekranY);
                Main.ekran.add(management);
                management.setVisible(true);
                Main.ekran.setLocation(0, 0);
                Main.ekran.login.setVisible(false);
            }
            else{
                hataMesaji.setText("Doğru yazdığından emin misin?");
                hataMesaji.setVisible(true);
            }

        } catch (SQLException ex) {
            //Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
             hataMesaji.setText("<html> <p>Üzgünüm böyle biri aramızda yok<p/></html>");
             hataMesaji.setVisible(true);
             okAsagiIcon.setVisible(true);
        }

    }//GEN-LAST:event_okIconMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField eposta;
    private javax.swing.JLabel hataMesaji;
    private javax.swing.JLabel kaydol;
    private javax.swing.JLabel mailIcon;
    private javax.swing.JLabel netflixLogosu;
    private javax.swing.JLabel okAsagiIcon;
    private javax.swing.JLabel okIcon;
    private javax.swing.JPasswordField parola;
    private javax.swing.JLabel pwdIcon;
    private javax.swing.JLabel soz;
    // End of variables declaration//GEN-END:variables
}
