/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package MataKuliah;

import java.io.BufferedReader;
import java.io.*;
import java.lang.System.Logger;
import java.util.logging.Level;
//import java.util.logging.Logger;
import java.sql.PreparedStatement;
import java.sql.*;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileSystemView;
import javax.swing.table.DefaultTableModel;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.view.JasperViewer;

/**
 *
 * @author acer_user
 */
public class MataKuliah extends javax.swing.JFrame {

    Connection conn;
    Statement stmt;
    PreparedStatement pstmt = null;

    String driver = "org.postgresql.Driver";
    String koneksi = "jdbc:postgresql://localhost:5432/MataKuliah";
    String user = "postgres";
    String password = "rini123tok";
    InputStreamReader inputStreamReader = new InputStreamReader(System.in);
    BufferedReader input = new BufferedReader(inputStreamReader);

    /**
     * Creates new form MataKuliah
     */
    public MataKuliah() {
        initComponents();

        showTable();
        try {
            Class.forName(driver);
            conn = DriverManager.getConnection(koneksi, user, password);
        } catch (Exception e) {
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtKodeMK = new javax.swing.JTextField();
        txtSks = new javax.swing.JTextField();
        txtNamaMK = new javax.swing.JTextField();
        txtSemester = new javax.swing.JTextField();
        btnInsert = new java.awt.Button();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblMK = new javax.swing.JTable();
        btnUpdate = new java.awt.Button();
        btnDelete = new java.awt.Button();
        btnCetak = new java.awt.Button();
        Upload = new java.awt.Button();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setText("MATA KULIAH ");

        jLabel2.setText("Kode MK");

        jLabel3.setText("SKS");

        jLabel4.setText("Nama MK ");

        jLabel5.setText("Semester Ajar");

        txtKodeMK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtKodeMKActionPerformed(evt);
            }
        });

        txtNamaMK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNamaMKActionPerformed(evt);
            }
        });

        btnInsert.setLabel("INSERT");
        btnInsert.setName(""); // NOI18N
        btnInsert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInsertActionPerformed(evt);
            }
        });

        tblMK.setModel(new javax.swing.table.DefaultTableModel(
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
        tblMK.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblMKMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblMK);

        btnUpdate.setLabel("UPDATE");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        btnDelete.setLabel("DELETE");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        btnCetak.setActionCommand("CETAK");
        btnCetak.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnCetak.setLabel("CETAK");
        btnCetak.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCetakMouseClicked(evt);
            }
        });
        btnCetak.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCetakActionPerformed(evt);
            }
        });

        Upload.setLabel("UPLOAD");
        Upload.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UploadActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel5)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtKodeMK, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(txtSks)
                    .addComponent(txtNamaMK)
                    .addComponent(txtSemester)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnInsert, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(29, 29, 29)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(btnCetak, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(Upload, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(66, 66, 66))
            .addGroup(layout.createSequentialGroup()
                .addGap(267, 267, 267)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel1)
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtKodeMK, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtSks, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txtNamaMK, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(txtSemester, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(28, 28, 28)
                        .addComponent(btnInsert, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCetak, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Upload, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(51, 51, 51))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtKodeMKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtKodeMKActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtKodeMKActionPerformed

    private void txtNamaMKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNamaMKActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNamaMKActionPerformed

    private void btnInsertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInsertActionPerformed
        if (txtKodeMK.getText().equals("") || txtNamaMK.getText().equals("") || txtSemester.equals("") || txtSks.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Data harus terisi ");
        } else {
            String kode, nama, semester, sks;
            kode = txtKodeMK.getText();
            sks = txtSks.getText();
            nama = txtNamaMK.getText();
            semester = txtSemester.getText();

            EntityManagerFactory emf = Persistence.createEntityManagerFactory("PboPU");
            EntityManager em = emf.createEntityManager();
            em.getTransaction().begin();

            Matakuliah_1 mk = new Matakuliah_1();
            mk.setKodemk(kode);
            mk.setNamamk(nama);
            mk.setSemesterajar(semester);
            mk.setSks(sks);

            em.persist(mk);

            em.getTransaction().commit();
            JOptionPane.showMessageDialog(null, "success");

            bersih();
            showTable();

        }
    }//GEN-LAST:event_btnInsertActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        if (txtKodeMK.getText().equals("") || txtNamaMK.getText().equals("") || txtSemester.equals("") || txtSks.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Data harus terisi");
        } else {
            String kode, nama, semester, sks;
            kode = txtKodeMK.getText();
            sks = txtSks.getText();
            nama = txtNamaMK.getText();
            semester = txtSemester.getText();

            try {
                sks = txtSks.getText();
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "SKS harus berupa angka", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }

            EntityManagerFactory emf = Persistence.createEntityManagerFactory("PboPU");
            EntityManager em = emf.createEntityManager();
            em.getTransaction().begin();

            Matakuliah_1 mk = em.find(Matakuliah_1.class, kode);
            if (mk == null) {
                JOptionPane.showMessageDialog(null, "Data tidak ditemukan");
            } else {
                mk.setKodemk(kode);
                mk.setNamamk(nama);
                mk.setSks(sks);
                mk.setSemesterajar(semester);

                em.getTransaction().commit();
                JOptionPane.showMessageDialog(null, "Data berhasil diupdate");

                bersih();
                txtKodeMK.setEditable(true);
            }
        }
        showTable();


    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        if (txtKodeMK.getText().equals("") || txtNamaMK.getText().equals("") || txtSemester.equals("") || txtSks.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Isi semua data");
        } else {
            String kode;
            kode = txtKodeMK.getText();
            EntityManagerFactory emf = Persistence.createEntityManagerFactory("PboPU");
            EntityManager em = emf.createEntityManager();

            int jawab = JOptionPane.showConfirmDialog(null, "Anda yakin ingin menghapus data? ",
                    "Konfirmasi Hapus", JOptionPane.YES_NO_OPTION);
            switch (jawab) {
                case JOptionPane.YES_OPTION -> {
                    em.getTransaction().begin();

                    Matakuliah_1 mk = em.find(Matakuliah_1.class, kode);
                    if (mk == null) {
                        JOptionPane.showMessageDialog(null, "Data tidak ditemukan");
                    } else {
                        em.remove(mk);

                        em.getTransaction().commit();
                        JOptionPane.showMessageDialog(null, "Data berhasil dihapus");
                        bersih();
                        txtKodeMK.setEditable(true);
                    }
                }
                case JOptionPane.NO_OPTION ->
                    JOptionPane.showMessageDialog(this, "Data tidak dihapus");
            }
            showTable();
        }
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void tblMKMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblMKMouseClicked
        int row = tblMK.getSelectedRow();
        txtKodeMK.setText(tblMK.getValueAt(row, 0).toString());
        txtSks.setText(tblMK.getValueAt(row, 1).toString());
        txtNamaMK.setText(tblMK.getValueAt(row, 2).toString());
        txtSemester.setText(tblMK.getValueAt(row, 3).toString());
        txtKodeMK.setEditable(false);
    }//GEN-LAST:event_tblMKMouseClicked

    private void btnCetakActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCetakActionPerformed
        try {
            JasperReport reports;
            String path = "src\\UTS\\MataKuliah.jasper";
            reports = (JasperReport) JRLoader.loadObjectFromFile(path);
            JasperPrint print = JasperFillManager.fillReport(path, null, conn);
            JasperViewer view = new JasperViewer(print, false);
            view.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
            view.setVisible(true);

        } catch (JRException e) {
            System.out.println(e.getMessage());
        }
    }//GEN-LAST:event_btnCetakActionPerformed

    private void btnCetakMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCetakMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCetakMouseClicked

    private void UploadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UploadActionPerformed
        JFileChooser jfc = new JFileChooser(FileSystemView.getFileSystemView().getHomeDirectory());
        int returnValue = jfc.showOpenDialog(null);
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("PboPU");
        EntityManager em = emf.createEntityManager();
        if (returnValue == JFileChooser.APPROVE_OPTION) {
            File filePilihan = jfc.getSelectedFile();
            System.out.println("yang dipilih : " + filePilihan.getAbsolutePath());

            try ( BufferedReader br = new BufferedReader(new FileReader(filePilihan))) {
                Class.forName(driver);
                conn = DriverManager.getConnection(koneksi, user, password);
                String baris;
                String pemisah = ";";

                while ((baris = br.readLine()) != null) {
                    String[] data = baris.split(pemisah);
                    String kode = data[0];
                    String sks = data[1];
                    String nama = data[2];
                    String semester = data[3];

                    if (!kode.isEmpty() && !nama.isEmpty() && !semester.isEmpty()) {
                        em.getTransaction().begin();

                        Matakuliah_1 mk = new Matakuliah_1();
                        mk.setKodemk(kode);
                        mk.setNamamk(nama);
                        mk.setSemesterajar(semester);
                        mk.setSks(sks);
                        em.persist(mk);

                        em.getTransaction().commit();
                        JOptionPane.showMessageDialog(null, "Success");
                        showTable();
                    } else {
                        JOptionPane.showMessageDialog(null, "Failed");
                    }
                }
            } catch (FileNotFoundException ex) {
                JOptionPane.showMessageDialog(null, "Failed");
            } catch (IOException ex) {
                JOptionPane.showMessageDialog(null, "Failed");
            } catch (ClassNotFoundException | SQLException ex) {
            }
        }
    }//GEN-LAST:event_UploadActionPerformed

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
            java.util.logging.Logger.getLogger(MataKuliah.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MataKuliah.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MataKuliah.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MataKuliah.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MataKuliah().setVisible(true);
            }
        });
    }

    public void showTable() {
        EntityManager em = Persistence.createEntityManagerFactory("PboPU").createEntityManager();

        Query q = em.createNamedQuery("Matakuliah_1.findAll");
        List<Matakuliah_1> hasil = q.getResultList();

        DefaultTableModel tbmk = new DefaultTableModel(new String[]{"KODE MK", "SKS", "NAMA MK", "SEMESTER"}, 0);
        for (Matakuliah_1 data : hasil) {
            Object[] baris = new Object[5];
            baris[0] = data.getKodemk();
            baris[1] = data.getSks();
            baris[2] = data.getNamamk();
            baris[3] = data.getSemesterajar();
            tbmk.addRow(baris);
        }
        tblMK.setModel(tbmk);
    }

    private void bersih() {
        txtKodeMK.setText("");
        txtSks.setText("");
        txtNamaMK.setText("");
        txtSemester.setText("");

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Button Upload;
    private java.awt.Button btnCetak;
    private java.awt.Button btnDelete;
    private java.awt.Button btnInsert;
    private java.awt.Button btnUpdate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblMK;
    private javax.swing.JTextField txtKodeMK;
    private javax.swing.JTextField txtNamaMK;
    private javax.swing.JTextField txtSemester;
    private javax.swing.JTextField txtSks;
    // End of variables declaration//GEN-END:variables
}
