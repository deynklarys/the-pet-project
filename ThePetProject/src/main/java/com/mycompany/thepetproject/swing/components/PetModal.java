/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.thepetproject.swing.components;

import com.mycompany.thepetproject.main.PetList;
import com.mycompany.thepetproject.main.PetSex;
import com.mycompany.thepetproject.main.PetStatus;
import com.mycompany.thepetproject.main.PetType;
import com.mycompany.thepetproject.swing.pages.AdoptionForm;
import com.mycompany.thepetproject.swing.pages.PetGallery;
import java.util.UUID;

/**
 *
 * @author lilac
 */
public class PetModal extends javax.swing.JFrame {
    private UUID id;
    private String name;
    private PetSex sex;
    private PetType type;
    private int age;
    private String description;

    /**
     * Creates new form PetModal
     */
    public PetModal(){
        initComponents();
    }
    public PetModal(UUID id, String name, PetSex sex, PetType type, int age, String description) {
        initComponents();
        this.id = id;
        this.name = name;
        this.sex = sex;
        this.type = type;
        this.age = age;
        this.description = description;

        nameLabel.setText(name);
        sexLabel.setText(sex.toString());
        ageLabel.setText(String.valueOf(age));
        descriptionLabel.setText(description);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        nameLabel = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        sexLabel = new javax.swing.JLabel();
        ageLabel = new javax.swing.JLabel();
        age1 = new javax.swing.JLabel();
        age2 = new javax.swing.JLabel();
        submitBtn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        descriptionLabel = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(248, 208, 70));

        nameLabel.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        nameLabel.setForeground(new java.awt.Color(0, 0, 0));
        nameLabel.setText("Name");

        jLabel1.setText("image");
        jLabel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        sexLabel.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        sexLabel.setForeground(new java.awt.Color(0, 0, 0));
        sexLabel.setText("Sex");

        ageLabel.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        ageLabel.setForeground(new java.awt.Color(0, 0, 0));
        ageLabel.setText("Age");

        age1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        age1.setForeground(new java.awt.Color(0, 0, 0));
        age1.setText("-");

        age2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        age2.setForeground(new java.awt.Color(0, 0, 0));
        age2.setText("Years old");

        submitBtn.setBackground(new java.awt.Color(226, 70, 43));
        submitBtn.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        submitBtn.setForeground(new java.awt.Color(0, 0, 0));
        submitBtn.setText("Adopt!");
        submitBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                submitBtnMouseClicked(evt);
            }
        });
        submitBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitBtnActionPerformed(evt);
            }
        });

        descriptionLabel.setColumns(20);
        descriptionLabel.setRows(5);
        jScrollPane1.setViewportView(descriptionLabel);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(nameLabel)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(sexLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(age1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ageLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(age2)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(submitBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 252, Short.MAX_VALUE))
                    .addComponent(jScrollPane1))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(nameLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sexLabel)
                    .addComponent(age1)
                    .addComponent(ageLabel)
                    .addComponent(age2))
                .addGap(31, 31, 31)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(submitBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void submitBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_submitBtnActionPerformed

    private void submitBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_submitBtnMouseClicked
//        AdoptionForm adoptionForm = new AdoptionForm(id, name, sex, type, age, description);
//        adoptionForm.setVisible(true);
//        adoptionForm.pack();
//        adoptionForm.setLocationRelativeTo(null);
//        adoptionForm.setDefaultCloseOperation(javax.swing.JFrame.DISPOSE_ON_CLOSE);

        PetList.setPetStatus(id, PetStatus.PENDING);
        PetGallery.loadPetCards();
        System.out.println(id);
        System.out.println(PetList.getPet(id));

        this.dispose();
    }//GEN-LAST:event_submitBtnMouseClicked

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(PetModal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PetModal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PetModal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PetModal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PetModal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel age1;
    private javax.swing.JLabel age2;
    private javax.swing.JLabel ageLabel;
    private javax.swing.JTextArea descriptionLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel nameLabel;
    private javax.swing.JLabel sexLabel;
    private javax.swing.JButton submitBtn;
    // End of variables declaration//GEN-END:variables
}
