/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */



import javax.swing.BorderFactory;
import javax.swing.SwingUtilities;

/**
 *
 * @author rafae
 */
public class PlayerPanel extends javax.swing.JPanel {

    private final OverwatchStub client;
    private final Player player;
    
 
    public PlayerPanel(OverwatchStub client, Player player) {
        this.client = client;
        this.player = player;
        initComponents();
        this.styleComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        userLabel = new javax.swing.JLabel();
        rankingLabel = new javax.swing.JLabel();
        victoriesLabel = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();

        setBackground(new java.awt.Color(45, 54, 76));
        setMinimumSize(new java.awt.Dimension(548, 0));
        setPreferredSize(new java.awt.Dimension(548, 275));

        userLabel.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        userLabel.setForeground(new java.awt.Color(255, 255, 255));
        userLabel.setText("UserName");

        rankingLabel.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        rankingLabel.setForeground(new java.awt.Color(255, 255, 255));
        rankingLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        rankingLabel.setText("Password");

        victoriesLabel.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        victoriesLabel.setForeground(new java.awt.Color(255, 255, 255));
        victoriesLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        victoriesLabel.setText("Confirmar Password");

        jSeparator1.setBackground(new java.awt.Color(88, 144, 255));
        jSeparator1.setForeground(new java.awt.Color(88, 144, 255));
        jSeparator1.setOpaque(true);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 498, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(userLabel)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(rankingLabel)
                        .addGap(30, 30, 30)
                        .addComponent(victoriesLabel)))
                .addContainerGap(31, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(userLabel)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rankingLabel)
                    .addComponent(victoriesLabel))
                .addGap(19, 19, 19)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(181, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    private void styleComponents() {
        userLabel.setText(player.getUsername());
        rankingLabel.setText("Ranking: " + player.getRanking());
        victoriesLabel.setText("Victories: " + player.getVictories());
    }
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel rankingLabel;
    private javax.swing.JLabel userLabel;
    private javax.swing.JLabel victoriesLabel;
    // End of variables declaration//GEN-END:variables
}