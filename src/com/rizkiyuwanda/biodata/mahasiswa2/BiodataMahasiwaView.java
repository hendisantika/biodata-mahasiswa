/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rizkiyuwanda.biodata.mahasiswa2;

import javax.swing.JOptionPane;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

/**
 *
 * @author rizkiyuwanda
 */
public class BiodataMahasiwaView extends javax.swing.JFrame {

    private MahasiswaTableModel ordnerMahasiswa = new MahasiswaTableModel();

    public BiodataMahasiwaView() {
        initComponents();
        tableMahasiswa.setModel(ordnerMahasiswa);
        tableMahasiswaAction();
        refresh();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        textNim = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        textNama = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        comboBoxJenisKelamin = new javax.swing.JComboBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableMahasiswa = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        buttonInsert = new javax.swing.JButton();
        buttonUpdate = new javax.swing.JButton();
        buttonDelete = new javax.swing.JButton();
        buttonRefresh = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel1.setText("NIM :");

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("Nama :");

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("Jenis Kelamin :");

        comboBoxJenisKelamin.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Laki - Laki", "Perempuan" }));

        tableMahasiswa.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tableMahasiswa);

        jPanel1.setLayout(new java.awt.GridLayout());

        buttonInsert.setText("Insert");
        buttonInsert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonInsertActionPerformed(evt);
            }
        });
        jPanel1.add(buttonInsert);

        buttonUpdate.setText("Update");
        buttonUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonUpdateActionPerformed(evt);
            }
        });
        jPanel1.add(buttonUpdate);

        buttonDelete.setText("Delete");
        buttonDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonDeleteActionPerformed(evt);
            }
        });
        jPanel1.add(buttonDelete);

        buttonRefresh.setText("Refresh");
        buttonRefresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonRefreshActionPerformed(evt);
            }
        });
        jPanel1.add(buttonRefresh);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(12, 12, 12)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(textNama)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(textNim, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(comboBoxJenisKelamin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(textNim, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(textNama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(comboBoxJenisKelamin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel3))
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 179, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buttonInsertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonInsertActionPerformed
        insert();
    }//GEN-LAST:event_buttonInsertActionPerformed

    private void buttonUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonUpdateActionPerformed
        update();
    }//GEN-LAST:event_buttonUpdateActionPerformed

    private void buttonDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonDeleteActionPerformed
        delete();
    }//GEN-LAST:event_buttonDeleteActionPerformed

    private void buttonRefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonRefreshActionPerformed
        refresh();
    }//GEN-LAST:event_buttonRefreshActionPerformed
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonDelete;
    private javax.swing.JButton buttonInsert;
    private javax.swing.JButton buttonRefresh;
    private javax.swing.JButton buttonUpdate;
    private javax.swing.JComboBox comboBoxJenisKelamin;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tableMahasiswa;
    private javax.swing.JTextField textNama;
    private javax.swing.JTextField textNim;
    // End of variables declaration//GEN-END:variables

    private void insert() {
        try {
            Mahasiswa mahasiswaBaru = new Mahasiswa();

            mahasiswaBaru.setNim(textNim.getText());
            mahasiswaBaru.setNama(textNama.getText());
            mahasiswaBaru.setJenisKelamin(comboBoxJenisKelamin.getSelectedItem().toString());

            ordnerMahasiswa.insert(mahasiswaBaru);
            refresh();
        } catch (Exception exception) {
            JOptionPane.showMessageDialog(this, "Terjadi kesalahan : " + exception);
        }
    }

    private void update() {
        try {
            int row = tableMahasiswa.getSelectedRow();

            if (row != -1) {
                Mahasiswa mahasiswaUpdate = new Mahasiswa();

                mahasiswaUpdate.setNim(textNim.getText());
                mahasiswaUpdate.setNama(textNama.getText());
                mahasiswaUpdate.setJenisKelamin(comboBoxJenisKelamin.getSelectedItem().toString());

                ordnerMahasiswa.update(row, mahasiswaUpdate);
                refresh();
            }
        } catch (Exception exception) {
            JOptionPane.showMessageDialog(this, "Terjadi kesalahan : " + exception);
        }
    }
    
    private void delete() {
        try {
            int row = tableMahasiswa.getSelectedRow();

            if (row != -1) {
                ordnerMahasiswa.delete(row);
                refresh();
            }
        } catch (Exception exception) {
            JOptionPane.showMessageDialog(this, "Terjadi kesalahan : " + exception);
        }
    }

    private void refresh() {
        try {
            textNim.setText(null);
            textNama.setText(null);
            comboBoxJenisKelamin.setSelectedIndex(0);
            buttonInsert.setEnabled(true);
            buttonUpdate.setEnabled(false);
            buttonDelete.setEnabled(false);
            buttonRefresh.setEnabled(true);
            tableMahasiswa.setEnabled(true);
            tableMahasiswa.clearSelection();
        } catch (Exception exception) {
            JOptionPane.showMessageDialog(this, "Terjadi kesalahan : " + exception);
        }
    }

    private void tableMahasiswaAction() {
        try {
            tableMahasiswa.getSelectionModel().addListSelectionListener(new ListSelectionListener() {
                @Override
                public void valueChanged(ListSelectionEvent e) {
                    int row = tableMahasiswa.getSelectedRow();

                    if (row != -1) {
                        Mahasiswa biodataMahasiswa = ordnerMahasiswa.getMahasiswa(row);

                        textNim.setText(biodataMahasiswa.getNim());
                        textNama.setText(biodataMahasiswa.getNama());
                        comboBoxJenisKelamin.setSelectedItem(biodataMahasiswa.getJenisKelamin());

                        buttonInsert.setEnabled(false);
                        buttonUpdate.setEnabled(true);
                        buttonDelete.setEnabled(true);

                        tableMahasiswa.setEnabled(false);
                    }
                }
            });
        } catch (Exception exception) {
            JOptionPane.showMessageDialog(this, "Terjadi kesalahan : " + exception);
        }
    }
}
