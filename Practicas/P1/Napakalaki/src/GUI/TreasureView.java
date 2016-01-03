/*
 * Copyright (C) 2016 nico
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

import NapakalakiGame.Treasure;
import static NapakalakiGame.TreasureKind.ARMOR;
import static NapakalakiGame.TreasureKind.HELMET;
import static NapakalakiGame.TreasureKind.ONEHAND;
import static NapakalakiGame.TreasureKind.SHOES;

/**
 *
 * @author nico
 */
public class TreasureView extends javax.swing.JPanel {

    /**
     * Creates new form TreasureView
     */
    
    Treasure treasureModel; //referencia a un tesoro???
    
    public TreasureView() {
        initComponents();
    }
    
    public void setTreasure(Treasure aux){
        name.setText(aux.getName());
        bonus.setText(Integer.toString(aux.getBonus()));
        
        if(aux.getType()==SHOES){
            type.setText("SHOES");
        }else if(aux.getType()==ONEHAND){
            type.setText("ONEHAND");
        }else if(aux.getType()==HELMET){
            type.setText("HELMET");
        }else if(aux.getType()==ARMOR){
            type.setText("ARMOR");
        }else{
            type.setText("BOTHHANDS");
        }
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        name = new javax.swing.JLabel();
        bonus = new javax.swing.JLabel();
        type = new javax.swing.JLabel();

        name.setText("Nombre");

        bonus.setText("Bonus");

        type.setText("Tipo");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(167, 167, 167)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(name)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(bonus)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(type)))))
                .addContainerGap(183, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(name)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(bonus)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(type)
                .addContainerGap(179, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel bonus;
    private javax.swing.JLabel name;
    private javax.swing.JLabel type;
    // End of variables declaration//GEN-END:variables
}