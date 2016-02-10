/*
 * Copyright (C) 2016 nitrosito
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package GUI;

import NapakalakiGame.CombatResult;
import NapakalakiGame.Napakalaki;

/**
 *
 * @author nitrosito
 */
public class NapakalakiView extends javax.swing.JFrame {
    private Napakalaki napakalakiModel;
    
    public void setNapakalaki(Napakalaki valor){
        napakalakiModel = valor;
        playerView1.setNapakalaki(napakalakiModel);
        monsterView1.setMonster(napakalakiModel.getCurrentMonster());
        monsterView1.setVisible(false);
        nextturn.setVisible(false);
        combat.setEnabled(false);
        playerView1.setPlayer(napakalakiModel.getCurrentPlayer());
        aviso.setText("");
        repaint();
    }
    /**
     * Creates new form NapakalakiView
     */
    public NapakalakiView() {
        initComponents();
       setLocationRelativeTo(null); //  Centrado

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        playerView1 = new GUI.PlayerView();
        monsterView1 = new GUI.MonsterView();
        jLabel1 = new javax.swing.JLabel();
        meetmonster = new javax.swing.JToggleButton();
        combat = new javax.swing.JToggleButton();
        nextturn = new javax.swing.JToggleButton();
        jLabel2 = new javax.swing.JLabel();
        resultado = new javax.swing.JLabel();
        aviso = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setForeground(new java.awt.Color(255, 0, 0));
        jLabel1.setText("Resultado Combate: ");

        meetmonster.setText("Meet the Monster");
        meetmonster.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                meetmonsterActionPerformed(evt);
            }
        });

        combat.setText("Combat");
        combat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combatActionPerformed(evt);
            }
        });

        nextturn.setBackground(new java.awt.Color(0, 153, 204));
        nextturn.setText("Next Turn");
        nextturn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nextturnActionPerformed(evt);
            }
        });

        jLabel2.setText("Monstruo");

        resultado.setText(" ");

        aviso.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        aviso.setForeground(new java.awt.Color(255, 51, 51));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(playerView1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(meetmonster)
                        .addGap(18, 18, 18)
                        .addComponent(combat, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(103, 103, 103)
                        .addComponent(nextturn, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel2)
                    .addComponent(monsterView1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(resultado, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(aviso, javax.swing.GroupLayout.PREFERRED_SIZE, 317, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(monsterView1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(aviso, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(meetmonster)
                    .addComponent(combat))
                .addGap(29, 29, 29)
                .addComponent(nextturn)
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(resultado))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addComponent(playerView1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 70, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void meetmonsterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_meetmonsterActionPerformed
        monsterView1.setVisible(true);
        playerView1.hacervisible(false);
        combat.setEnabled(true);

        repaint();
    }//GEN-LAST:event_meetmonsterActionPerformed

    private void combatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combatActionPerformed
        CombatResult res = napakalakiModel.developCombat();
        
        if (res == CombatResult.WIN){
            resultado.setText("Has Ganado");
        }
        else if(res == CombatResult.LOSE){
            resultado.setText("Has Perdido");
            playerView1.ponerMallRollo(napakalakiModel.getCurrentMonster().getBadconsequence());
        }
        else if(res == CombatResult.LOSEANDCONVERT){
            resultado.setText("Has Perdido y te combiertes");
            playerView1.ponerMallRollo(napakalakiModel.getCurrentMonster().getBadconsequence());
        }
        else if(res == CombatResult.WINGAME){
            resultado.setText("HAS GANADO EL JUEGO");
            monsterView1.setEnabled(false);
            nextturn.setEnabled(false);
            meetmonster.setEnabled(false);
            combat.setEnabled(false);
            playerView1.hacervisible(false);           
        }
        
        setNapakalaki(napakalakiModel);
        monsterView1.setVisible(true); // quiero quede desplegada vista monstruo
        meetmonster.setEnabled(false);
        nextturn.setVisible(true);
        playerView1.hacervisible(true);
        combat.setEnabled(false);
        repaint();
    }//GEN-LAST:event_combatActionPerformed

    private void nextturnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nextturnActionPerformed
        if(napakalakiModel.nextTurnAllowed()){
            resultado.setText("");
            napakalakiModel.nextTurn();
            setNapakalaki(napakalakiModel);
            playerView1.hacervisible(true);
            meetmonster.setEnabled(true);
        }
        else
            aviso.setText("ALGO TE TENDRÁS QUE DESCARTAR!");
            
    }//GEN-LAST:event_nextturnActionPerformed
  
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel aviso;
    private javax.swing.JToggleButton combat;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JToggleButton meetmonster;
    private GUI.MonsterView monsterView1;
    private javax.swing.JToggleButton nextturn;
    private GUI.PlayerView playerView1;
    private javax.swing.JLabel resultado;
    // End of variables declaration//GEN-END:variables
}
