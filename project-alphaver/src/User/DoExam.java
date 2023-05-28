package User;

import java.util.ArrayList;
import javax.swing.JOptionPane;

class Soal {

    private String pertanyaan;
    private String optnA;
    private String optnB;
    private String optnC;
    private String optnD;
    private String jwbBenar;
    private String jwbSiswa;

    public Soal(String pertanyaan, String optnA, String optnB, String optnC, String optnD, String jwbBenar) {
        this.pertanyaan = pertanyaan;
        this.optnA = optnA;
        this.optnB = optnB;
        this.optnC = optnC;
        this.optnD = optnD;
        this.jwbBenar = jwbBenar;
    }

    public String getPertanyaan() {
        return pertanyaan;
    }

    public void setPertanyaan(String pertanyaan) {
        this.pertanyaan = pertanyaan;
    }

    public String getOptnA() {
        return optnA;
    }

    public void setOptnA(String optnA) {
        this.optnA = optnA;
    }

    public String getOptnB() {
        return optnB;
    }

    public void setOptnB(String optnB) {
        this.optnB = optnB;
    }

    public String getOptnC() {
        return optnC;
    }

    public void setOptnC(String optnC) {
        this.optnC = optnC;
    }

    public String getOptnD() {
        return optnD;
    }

    public void setOptnD(String optnD) {
        this.optnD = optnD;
    }

    public String getJwbBenar() {
        return jwbBenar;
    }

    public void setJwbBenar(String jwbBenar) {
        this.jwbBenar = jwbBenar;
    }

    public String getJwbSiswa() {
        return jwbSiswa;
    }

    public void setJwbSiswa(String jwbSiswa) {
        this.jwbSiswa = jwbSiswa;
    }
    
    public boolean isJawabanBenar () {
    return jwbBenar.equals(jwbSiswa);
}

}

public class DoExam extends javax.swing.JFrame {

    ArrayList<Soal> soal;
    int curIndex;

    public DoExam() {
        initComponents();
        reset();
        
       

        UpdateSoal();
    }

    public void reset() {
      
        soal = new ArrayList();
        
       soal.add(new Soal("Apa singkatan dari HTML?", "Hyper Text Markup Language", "Hyperlinks and Text Markup Language", "Home Tool Markup Language", "Hyperlinks and Textual Markup Language", "A"));
       soal.add(new Soal("Bahasa pemrograman yang digunakan untuk \n membuat halaman web interaktif adalah?", "JavaScript", " HTML", "CSS", "Python", "A"));
       soal.add(new Soal("Apa fungsi dari pernyataan \"import\" dalam Java?", "Membaca input dari pengguna", "Mengimpor pustaka yang diperlukan", "Membuat objek baru", "Menulis output ke console", "B"));
       soal.add(new Soal("Apa hasil dari eksekusi peryataan berikut ?\n int x = 5;\n int y = 2;\nSystem.out.println(x % y)", "2", "2.5", "1", "0.5", "C"));
       soal.add(new Soal("Apa output dari kode berikut ? \n System.out.println(\"Hello,\" + \"World!\"); ", "Hello, World!", "HelloWorld", "Hello, World!", "Hello,World!", "D"));
       soal.add(new Soal("Apa tipe data yang digunakan untuk \n menyimpan bilangan bulat pada java ?", "Double", "Integer", "String", "Boolean", "B"));
       soal.add(new Soal("Apa hasil dari pernyataan berikut?\nSystem.out.println(Math.pow(2, 3));", "8", "5", "6", "16", "D"));
       soal.add(new Soal("Apa hasil dari pernyataan berikut?\n System.out.println(\"Java\".length());", "5", "3", "4", "6", "C"));
       soal.add(new Soal("Apa tipe data yang digunakan untuk \n menyimpan nilai true atau false dalam Java?", "Integer", "Double", "String", "Boolean", "D"));
       soal.add(new Soal("Apa bahasa pemograman yang termasuk OOP ?", "Java", "Pascal", "Fortran", "HTML", "A"));
       
       curIndex = 0;
       UpdateSoal();
    }

    public void UpdateSoal() {
        TxtSoal.setText(soal.get(curIndex).getPertanyaan());
        A.setText(soal.get(curIndex).getOptnA());
        B.setText(soal.get(curIndex).getOptnB());
        C.setText(soal.get(curIndex).getOptnC());
        D.setText(soal.get(curIndex).getOptnD());
        NoSoal.setText(""+(curIndex+1));
       if(curIndex == 0){
           btnPrev.setVisible(false);
       } else {
           btnPrev.setVisible(true);
       }
       
       if (curIndex == (soal.size()-1)){
           btnNext.setVisible(false);
            btnSubmit.setVisible(true);
       } else {
           btnNext.setVisible(true);
            btnSubmit.setVisible(false);
       } 
       
       if(soal.get(curIndex).getJwbSiswa() != null){
          
           if (soal.get(curIndex).getJwbSiswa().equals("A")){
               A.setSelected(true);
           } else if (soal.get(curIndex).getJwbSiswa().equals("B")){
               B.setSelected(true);
           } else if (soal.get(curIndex).getJwbSiswa().equals("C")){
               C.setSelected(true);
           } else if (soal.get(curIndex).getJwbSiswa().equals("D")){
               D.setSelected(true);
           } else {
               btnPilihanGanda.clearSelection();
           }
       } else {
               btnPilihanGanda.clearSelection();
    }
    }
    public void UpdateJawaban (){
        String jwbSiswa="";
        if(A.isSelected()){
            jwbSiswa = "A";
        }else if(B.isSelected()){
            jwbSiswa = "B";
        } else if (C.isSelected()){
            jwbSiswa = "C";
        } else if (D.isSelected()){
            jwbSiswa = "D";
        }
        
        soal.get(curIndex).setJwbSiswa(jwbSiswa);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnPilihanGanda = new javax.swing.ButtonGroup();
        jLabel2 = new javax.swing.JLabel();
        A = new javax.swing.JRadioButton();
        B = new javax.swing.JRadioButton();
        C = new javax.swing.JRadioButton();
        btnNext = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        TxtSoal = new javax.swing.JTextArea();
        NoSoal = new javax.swing.JLabel();
        btnPrev = new javax.swing.JButton();
        btnSubmit = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        D = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel2.setText("Soal : ");

        btnPilihanGanda.add(A);
        A.setText("A");
        A.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AActionPerformed(evt);
            }
        });

        btnPilihanGanda.add(B);
        B.setText("B");
        B.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BActionPerformed(evt);
            }
        });

        btnPilihanGanda.add(C);
        C.setText("C");
        C.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CActionPerformed(evt);
            }
        });

        btnNext.setText("Next ");
        btnNext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNextActionPerformed(evt);
            }
        });

        TxtSoal.setEditable(false);
        TxtSoal.setColumns(20);
        TxtSoal.setRows(5);
        jScrollPane2.setViewportView(TxtSoal);

        btnPrev.setText("Prev");
        btnPrev.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPrevActionPerformed(evt);
            }
        });

        btnSubmit.setText("Submit");
        btnSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubmitActionPerformed(evt);
            }
        });

        jLabel1.setText("A.");

        jLabel3.setText("B.");

        jLabel4.setText("C.");

        jLabel5.setText("D.");

        btnPilihanGanda.add(D);
        D.setText("D");
        D.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 157, Short.MAX_VALUE)
                                .addComponent(btnPrev)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnNext)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnSubmit)))
                        .addGap(30, 30, 30))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(NoSoal, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(A))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(B))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(C))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(D)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(NoSoal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(A))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(B))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(C))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnNext)
                            .addComponent(btnPrev)
                            .addComponent(btnSubmit)))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(D))))
                .addGap(17, 17, 17))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnNextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNextActionPerformed
        // TODO add your handling code here:
        UpdateJawaban();
        curIndex++;
        UpdateSoal();

        
    }//GEN-LAST:event_btnNextActionPerformed

    private void btnPrevActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrevActionPerformed
        // TODO add your handling code here:
        UpdateJawaban();
        curIndex--;
        UpdateSoal();
    }//GEN-LAST:event_btnPrevActionPerformed

    private void btnSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubmitActionPerformed
        // TODO add your handling code here:
        UpdateJawaban();
        int countBenar = 0;
        for ( Soal soal : soal){
            if(soal.isJawabanBenar()){
                countBenar++;
            }
        }
        JOptionPane.showMessageDialog(this, "Soal yang benar sebanyak " + countBenar, "Rangkuman", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_btnSubmitActionPerformed

    private void CActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CActionPerformed

    private void DActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DActionPerformed

    private void AActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AActionPerformed

    private void BActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BActionPerformed

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
            java.util.logging.Logger.getLogger(DoExam.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DoExam.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DoExam.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DoExam.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DoExam().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton A;
    private javax.swing.JRadioButton B;
    private javax.swing.JRadioButton C;
    private javax.swing.JRadioButton D;
    private javax.swing.JLabel NoSoal;
    private javax.swing.JTextArea TxtSoal;
    private javax.swing.JButton btnNext;
    private javax.swing.ButtonGroup btnPilihanGanda;
    private javax.swing.JButton btnPrev;
    private javax.swing.JButton btnSubmit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}
