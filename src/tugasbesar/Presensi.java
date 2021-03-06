package tugasbesar;

import java.sql.*;
import java.util.*;
//import java.util.Properties;
//import java.util.concurrent.Executor;

public class Presensi extends javax.swing.JFrame {
    
    //atribut
    public static HashMap<Integer, String> konfersi = new HashMap<>();
    //metod
    public Presensi() {
        initComponents();
        MenuUtama.setVisible(true);
        MenuPresensi.setVisible(false);
        MenuCariMahasiswa.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        MenuUtama = new javax.swing.JPanel();
        TextMenuUtama = new javax.swing.JTextArea();
        toMenuPresensi = new javax.swing.JButton();
        toMenuCariMahasiswa = new javax.swing.JButton();
        MenuPresensi = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        MenuCariMahasiswa = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        cariNim = new javax.swing.JTextField();
        klikCariNIM = new javax.swing.JButton();
        NamaCari = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        totSakit = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        MenuUtama.setBorder(new javax.swing.border.MatteBorder(null));
        MenuUtama.setMaximumSize(new java.awt.Dimension(200, 200));

        TextMenuUtama.setColumns(20);
        TextMenuUtama.setFont(new java.awt.Font("Arial", 2, 14)); // NOI18N
        TextMenuUtama.setRows(5);
        TextMenuUtama.setText("  Menu Utama");

        toMenuPresensi.setText("Isi Presensi");
        toMenuPresensi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                toMenuPresensiActionPerformed(evt);
            }
        });

        toMenuCariMahasiswa.setText("Cari Mahasiswa");
        toMenuCariMahasiswa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                toMenuCariMahasiswaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout MenuUtamaLayout = new javax.swing.GroupLayout(MenuUtama);
        MenuUtama.setLayout(MenuUtamaLayout);
        MenuUtamaLayout.setHorizontalGroup(
            MenuUtamaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MenuUtamaLayout.createSequentialGroup()
                .addGap(401, 401, 401)
                .addGroup(MenuUtamaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(toMenuPresensi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(toMenuCariMahasiswa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(TextMenuUtama, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        MenuUtamaLayout.setVerticalGroup(
            MenuUtamaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MenuUtamaLayout.createSequentialGroup()
                .addGap(249, 249, 249)
                .addComponent(TextMenuUtama, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(63, 63, 63)
                .addComponent(toMenuPresensi)
                .addGap(18, 18, 18)
                .addComponent(toMenuCariMahasiswa)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        MenuPresensi.setBorder(new javax.swing.border.MatteBorder(null));
        MenuPresensi.setMaximumSize(new java.awt.Dimension(200, 200));

        jLabel1.setText("Menu Presensi");

        javax.swing.GroupLayout MenuPresensiLayout = new javax.swing.GroupLayout(MenuPresensi);
        MenuPresensi.setLayout(MenuPresensiLayout);
        MenuPresensiLayout.setHorizontalGroup(
            MenuPresensiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MenuPresensiLayout.createSequentialGroup()
                .addGap(148, 148, 148)
                .addComponent(jLabel1)
                .addContainerGap(230, Short.MAX_VALUE))
        );
        MenuPresensiLayout.setVerticalGroup(
            MenuPresensiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MenuPresensiLayout.createSequentialGroup()
                .addContainerGap(147, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(231, 231, 231))
        );

        MenuCariMahasiswa.setBorder(new javax.swing.border.MatteBorder(null));
        MenuCariMahasiswa.setMaximumSize(new java.awt.Dimension(200, 200));

        jLabel2.setText("Menu Cari Mahasiswa");

        cariNim.setText("Masukan NIM");
        cariNim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cariNimActionPerformed(evt);
            }
        });

        klikCariNIM.setText("Cari");
        klikCariNIM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                klikCariNIMActionPerformed(evt);
            }
        });

        NamaCari.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NamaCariActionPerformed(evt);
            }
        });

        jLabel3.setText("Sakit/Izin :");

        javax.swing.GroupLayout MenuCariMahasiswaLayout = new javax.swing.GroupLayout(MenuCariMahasiswa);
        MenuCariMahasiswa.setLayout(MenuCariMahasiswaLayout);
        MenuCariMahasiswaLayout.setHorizontalGroup(
            MenuCariMahasiswaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MenuCariMahasiswaLayout.createSequentialGroup()
                .addGap(168, 168, 168)
                .addGroup(MenuCariMahasiswaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(MenuCariMahasiswaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(MenuCariMahasiswaLayout.createSequentialGroup()
                            .addGap(10, 10, 10)
                            .addComponent(klikCariNIM, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(cariNim, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel2)
                        .addComponent(NamaCari, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(MenuCariMahasiswaLayout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(totSakit, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(219, Short.MAX_VALUE))
        );
        MenuCariMahasiswaLayout.setVerticalGroup(
            MenuCariMahasiswaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MenuCariMahasiswaLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cariNim, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(klikCariNIM)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(NamaCari, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(MenuCariMahasiswaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(totSakit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(227, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(MenuUtama, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addGap(0, 71, Short.MAX_VALUE)
                    .addComponent(MenuPresensi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(MenuCariMahasiswa, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(MenuUtama, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addComponent(MenuPresensi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(MenuCariMahasiswa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void toMenuPresensiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_toMenuPresensiActionPerformed
        // TODO add your handling code here:
        MenuPresensi.setVisible(true);
        MenuUtama.setVisible(false);
        MenuCariMahasiswa.setVisible(false);
    }//GEN-LAST:event_toMenuPresensiActionPerformed

    private void toMenuCariMahasiswaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_toMenuCariMahasiswaActionPerformed
        // TODO add your handling code here:
        MenuPresensi.setVisible(false);
        MenuUtama.setVisible(false);
        MenuCariMahasiswa.setVisible(true);
    }//GEN-LAST:event_toMenuCariMahasiswaActionPerformed

    private void cariNimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cariNimActionPerformed
        // TODO add your handling code here:
        cariNim.getText();
    }//GEN-LAST:event_cariNimActionPerformed

    private void klikCariNIMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_klikCariNIMActionPerformed
        // TODO add your handling code here:
        MenuPresensi.setVisible(false);
        MenuUtama.setVisible(false);
        MenuCariMahasiswa.setVisible(true);
        
        try(    
                Connection conn = DriverManager.getConnection(
                        "jdbc:mysql://localhost/tugasbesarpbo", 
                        "root",
                        "");
                Statement stat = conn.createStatement();
            ) {
                String strSelect = "select * from mahasiswa where nim='" + cariNim.getText() + "'";
                ResultSet rset = stat.executeQuery(strSelect);
                
                //while(rset.next()) {
                rset.next();
                String nama = rset.getString("Nama");
                int sakit = rset.getInt("Sakit_Izin");
                NamaCari.setText(nama);
                totSakit.setText(konfersi.get(sakit));
                //}
              } catch (SQLException ex) {
                  NamaCari.setText("Tidak ditemukan");
                  totSakit.setText("Tidak ditemukan");
              }
        
    }//GEN-LAST:event_klikCariNIMActionPerformed

    private void NamaCariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NamaCariActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NamaCariActionPerformed

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
            java.util.logging.Logger.getLogger(Presensi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Presensi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Presensi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Presensi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        
        konfersi.put(1, "1");
        konfersi.put(2, "2");
        konfersi.put(3, "3");
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Presensi().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel MenuCariMahasiswa;
    private javax.swing.JPanel MenuPresensi;
    private javax.swing.JPanel MenuUtama;
    private javax.swing.JTextField NamaCari;
    private javax.swing.JTextArea TextMenuUtama;
    private javax.swing.JTextField cariNim;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JButton klikCariNIM;
    private javax.swing.JButton toMenuCariMahasiswa;
    private javax.swing.JButton toMenuPresensi;
    private javax.swing.JTextField totSakit;
    // End of variables declaration//GEN-END:variables
}
