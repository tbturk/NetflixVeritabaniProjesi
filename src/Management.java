/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Lenovo
 */
public class Management extends javax.swing.JPanel {

    /**
     * Creates new form Management
     */
    public Management() {
        initComponents();
        arkaPlan.setSize(Main.ekranX, Main.ekranY);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        arkaPlan = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(1870, 900));
        setLayout(null);

        arkaPlan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/anasayfa.png"))); // NOI18N
        add(arkaPlan);
        arkaPlan.setBounds(0, 0, 1870, 900);
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel arkaPlan;
    // End of variables declaration//GEN-END:variables
}