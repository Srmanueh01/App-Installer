package instaladordeapps;

import java.awt.Color;
import java.awt.Desktop;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author Manuel Pretel | Junior Developer
 */
public class AppInstaller extends javax.swing.JFrame {

    int btnperso = 1;
    int btneditcolor = 0;
    int btnsavecolor = 0;

    public AppInstaller() {
        initComponents();

        text1.setEnabled(false);
        text2.setEnabled(false);
        text3.setEnabled(false);
        text4.setEnabled(false);
        text5.setEnabled(false);

        btnsave.setBackground(new Color(251, 110, 98)); //Rojo
        btnsave.setEnabled(false);

        enablebtn.setBackground(new Color(211, 250, 98)); //Verde

        btnedit.setBackground(new Color(250, 229, 98)); //Naranja
        btnedit.setEnabled(false);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        googlechrome = new javax.swing.JRadioButton();
        mozillafirefox = new javax.swing.JRadioButton();
        opera = new javax.swing.JRadioButton();
        operagx = new javax.swing.JRadioButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        vlc = new javax.swing.JRadioButton();
        spotify = new javax.swing.JRadioButton();
        vivaldi = new javax.swing.JRadioButton();
        jLabel5 = new javax.swing.JLabel();
        malwarebytes = new javax.swing.JRadioButton();
        avast = new javax.swing.JRadioButton();
        bitdefender = new javax.swing.JRadioButton();
        jLabel6 = new javax.swing.JLabel();
        winrar = new javax.swing.JRadioButton();
        googledrive = new javax.swing.JRadioButton();
        openoffice = new javax.swing.JRadioButton();
        adobeacrobat = new javax.swing.JRadioButton();
        jLabel7 = new javax.swing.JLabel();
        btndownload = new javax.swing.JButton();
        discord = new javax.swing.JRadioButton();
        text1 = new javax.swing.JTextField();
        text2 = new javax.swing.JTextField();
        text3 = new javax.swing.JTextField();
        text4 = new javax.swing.JTextField();
        text5 = new javax.swing.JTextField();
        btnsave = new javax.swing.JButton();
        btnedit = new javax.swing.JButton();
        enablebtn = new javax.swing.JButton();
        brave = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("App-Installer");

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setText("Custom Installer APP");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setText("Default:");

        googlechrome.setText("Google Chrome");

        mozillafirefox.setText("Mozilla Firefox");

        opera.setText("Opera");

        operagx.setText("Opera GX");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setText("Browsers:");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel4.setText("Audio & Video");

        vlc.setText("VLC");

        spotify.setText("Spotify");

        vivaldi.setText("Vivaldi");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel5.setText("Antivirus");

        malwarebytes.setText("Malwarebytes");

        avast.setText("Avast");

        bitdefender.setText("Bitdefender");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel6.setText("Others");

        winrar.setText("Winrar");

        googledrive.setText("Google Drive");

        openoffice.setText("OpenOffice");

        adobeacrobat.setText("Adobe Acrobat");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel7.setText("Your Apps:");

        btndownload.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btndownload.setText("Download");
        btndownload.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btndownloadActionPerformed(evt);
            }
        });

        discord.setText("Discord");

        text1.setText("https://obsproject.com/es/download");

        text2.setText("Your URL");

        text3.setText("Your URL");

        text4.setText("Your URL");

        text5.setText("Your URL");

        btnsave.setText("Save");
        btnsave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsaveActionPerformed(evt);
            }
        });

        btnedit.setText("Edit");
        btnedit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btneditActionPerformed(evt);
            }
        });

        enablebtn.setText("Enable");
        enablebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enablebtnActionPerformed(evt);
            }
        });

        brave.setText("Brave");
        brave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                braveActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel7)
                .addGap(155, 155, 155))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(61, 61, 61)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(operagx, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(vivaldi, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(opera, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(googlechrome, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(mozillafirefox, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(brave, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(jLabel4))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(vlc, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(spotify, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(discord, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(54, 54, 54)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addComponent(malwarebytes, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(avast, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(bitdefender, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(39, 39, 39)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(winrar, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel6)
                                    .addComponent(googledrive, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(openoffice, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(adobeacrobat)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(52, 52, 52)
                                .addComponent(btndownload)))
                        .addGap(53, 53, 53)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(text4)
                            .addComponent(text5)
                            .addComponent(text2)
                            .addComponent(text3)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnsave, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnedit, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(enablebtn, javax.swing.GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE))
                            .addComponent(text1))))
                .addGap(9, 9, 9))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1)
                        .addGap(72, 72, 72)
                        .addComponent(text1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(text2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(text3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(text4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(text5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(74, 74, 74)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jLabel7))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(googlechrome)
                            .addComponent(vlc)
                            .addComponent(malwarebytes)
                            .addComponent(winrar))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(mozillafirefox)
                            .addComponent(spotify)
                            .addComponent(avast)
                            .addComponent(googledrive))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(opera)
                            .addComponent(bitdefender)
                            .addComponent(openoffice)
                            .addComponent(discord))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(operagx)
                            .addComponent(adobeacrobat))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(vivaldi)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(brave)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnsave)
                    .addComponent(btnedit)
                    .addComponent(enablebtn))
                .addGap(22, 22, 22)
                .addComponent(btndownload)
                .addGap(73, 73, 73))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btndownloadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndownloadActionPerformed

        List<URI> urls = new ArrayList<>();
        String webpersonal1 = text1.getText();
        String webpersonal2 = text2.getText();
        String webpersonal3 = text3.getText();
        String webpersonal4 = text4.getText();
        String webpersonal5 = text5.getText();

        try {
            if (googlechrome.isSelected()) {
                urls.add(new URI("https://www.google.com/chrome/"));
            }
            if (mozillafirefox.isSelected()) {
                urls.add(new URI("https://www.mozilla.org/firefox/"));
            }
            if (opera.isSelected()) {
                urls.add(new URI("https://www.opera.com/"));
            }
            if (operagx.isSelected()) {
                urls.add(new URI("https://www.opera.com/gx"));
            }
            if (vivaldi.isSelected()) {
                urls.add(new URI("https://vivaldi.com/"));
            }
            if (brave.isSelected()) {
                urls.add(new URI("https://brave.com/es/download/"));
            }
            if (vlc.isSelected()) {
                urls.add(new URI("https://www.videolan.org/vlc/"));
            }
            if (spotify.isSelected()) {
                urls.add(new URI("https://www.spotify.com/es/download/other/"));
            }
            if (discord.isSelected()) {
                urls.add(new URI("https://discord.com/download"));
            }
            if (malwarebytes.isSelected()) {
                urls.add(new URI("https://www.malwarebytes.com/es/mwb-download/thankyou"));
            }
            if (avast.isSelected()) {
                urls.add(new URI("https://www.avast.com/es-es/free-antivirus-download#pc"));
            }
            if (bitdefender.isSelected()) {
                urls.add(new URI("https://www.bitdefender.es/solutions/free.html"));
            }
            if (winrar.isSelected()) {
                urls.add(new URI("https://winrar.es/descargas"));
            }
            if (googledrive.isSelected()) {
                urls.add(new URI("https://www.google.com/intl/es_es/drive/download/"));
            }
            if (openoffice.isSelected()) {
                urls.add(new URI("https://www.openoffice.org/es/descargar/"));
            }
            if (adobeacrobat.isSelected()) {
                urls.add(new URI("https://get.adobe.com/es/reader/"));
            }

            if (btnperso == 0) {
                if (webpersonal1.trim().isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Tu Enlace tiene que tener un formato válido");

                } else {
                    urls.add(new URI(webpersonal1));
                }
            } else if (btnperso == 1) {
                //JOptionPane.showMessageDialog(null, "Haz desactivado las URl's personalizadas");
            }

            if (urls.isEmpty()) {
                // Si no se selecciona ninguna opción
                JOptionPane.showMessageDialog(null, "Por favor, seleccione al menos una opción para descargar.");
            } else {
                // Abrir todas las URLs seleccionadas
                Desktop desktop = Desktop.getDesktop();
                for (URI url : urls) {
                    desktop.browse(url);
                }
            }
        } catch (IOException | URISyntaxException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null, "Ha ocurrido un error. Comprueba tus enlaces personalizados");
        }

    }//GEN-LAST:event_btndownloadActionPerformed

    private void btnsaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsaveActionPerformed
        if (btnsavecolor == 1) {
            text1.setEnabled(false);
            text2.setEnabled(false);
            text3.setEnabled(false);
            text4.setEnabled(false);
            text5.setEnabled(false);

            btnsave.setBackground(new Color(211, 250, 98)); //verde
        }

    }//GEN-LAST:event_btnsaveActionPerformed

    private void btneditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btneditActionPerformed
        // TODO add your handling code here:
        if (btnsavecolor == 0) {
            text1.setEnabled(true);
            text2.setEnabled(true);
            text3.setEnabled(true);
            text4.setEnabled(true);
            text5.setEnabled(true);
            btnsave.setBackground(new Color(251, 110, 98));
            btnsavecolor = 1;
        } else if (btnsavecolor == 1) {
            text1.setEnabled(true);
            text2.setEnabled(true);
            text3.setEnabled(true);
            text4.setEnabled(true);
            text5.setEnabled(true);
            btnsave.setBackground(new Color(251, 110, 98));
            btnsavecolor = 1;
        }

    }//GEN-LAST:event_btneditActionPerformed

    private void enablebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enablebtnActionPerformed

        if (btnperso == 1) {
            text1.setEnabled(true);
            text2.setEnabled(true);
            text3.setEnabled(true);
            text4.setEnabled(true);
            text5.setEnabled(true);
            enablebtn.setText("Disable");
            btnedit.setEnabled(true);
            btnsave.setEnabled(true);
            enablebtn.setBackground(new Color(251, 110, 98)); //Rojo

            btnperso = 0;
        } else if (btnperso == 0) {
            text1.setEnabled(false);
            text2.setEnabled(false);
            text3.setEnabled(false);
            text4.setEnabled(false);
            text5.setEnabled(false);

            enablebtn.setText("Enable");
            btnedit.setEnabled(false);
            btnsave.setEnabled(false);
            enablebtn.setBackground(new Color(211, 250, 98)); //Verde
            JOptionPane.showMessageDialog(null, "Haz desactivado las URl's personalizadas");
            btnperso = 1;
        }


    }//GEN-LAST:event_enablebtnActionPerformed

    private void braveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_braveActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_braveActionPerformed

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
            java.util.logging.Logger.getLogger(AppInstaller.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AppInstaller.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AppInstaller.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AppInstaller.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AppInstaller().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton adobeacrobat;
    private javax.swing.JRadioButton avast;
    private javax.swing.JRadioButton bitdefender;
    private javax.swing.JRadioButton brave;
    private javax.swing.JButton btndownload;
    private javax.swing.JButton btnedit;
    private javax.swing.JButton btnsave;
    private javax.swing.JRadioButton discord;
    private javax.swing.JButton enablebtn;
    private javax.swing.JRadioButton googlechrome;
    private javax.swing.JRadioButton googledrive;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JRadioButton malwarebytes;
    private javax.swing.JRadioButton mozillafirefox;
    private javax.swing.JRadioButton openoffice;
    private javax.swing.JRadioButton opera;
    private javax.swing.JRadioButton operagx;
    private javax.swing.JRadioButton spotify;
    private javax.swing.JTextField text1;
    private javax.swing.JTextField text2;
    private javax.swing.JTextField text3;
    private javax.swing.JTextField text4;
    private javax.swing.JTextField text5;
    private javax.swing.JRadioButton vivaldi;
    private javax.swing.JRadioButton vlc;
    private javax.swing.JRadioButton winrar;
    // End of variables declaration//GEN-END:variables
}
