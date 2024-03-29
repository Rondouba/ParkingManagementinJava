package classes;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

/**
 *
 * @author RMR
 */
public class Fenetre extends javax.swing.JFrame {
    ArrayList<Vehicule> vehicules;
    DefaultListModel modeleListe;
    File fichier;
    FileWriter fw;
    PrintWriter pw;
    /**
     * Creates new form Fenetre
     */
    public Fenetre() {
        initComponents();
        vehicules=new ArrayList<>();
        modeleListe=new DefaultListModel();
        
        try {
            fichier=new File("fichier.veh");
            fw=new FileWriter(fichier);
            pw= new PrintWriter(fw);
        } catch (IOException ex) {
            ex.printStackTrace();
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

        jScrollPane1 = new javax.swing.JScrollPane();
        listeVehicule = new javax.swing.JList<>();
        btnSupprimer = new javax.swing.JButton();
        btnModifier = new javax.swing.JButton();
        btnAjouter = new javax.swing.JButton();
        btnFermer = new javax.swing.JButton();
        btnEnregistrer = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jScrollPane1.setViewportView(listeVehicule);

        btnSupprimer.setFont(new java.awt.Font("Century", 1, 14)); // NOI18N
        btnSupprimer.setText("Supprimer");

        btnModifier.setFont(new java.awt.Font("Century", 1, 14)); // NOI18N
        btnModifier.setText("Modifier");

        btnAjouter.setFont(new java.awt.Font("Century", 1, 14)); // NOI18N
        btnAjouter.setText("Ajouter");
        btnAjouter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAjouterActionPerformed(evt);
            }
        });

        btnFermer.setFont(new java.awt.Font("Century", 1, 14)); // NOI18N
        btnFermer.setText("Fermer");
        btnFermer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFermerActionPerformed(evt);
            }
        });

        btnEnregistrer.setFont(new java.awt.Font("Century", 1, 14)); // NOI18N
        btnEnregistrer.setText("Enregistrer");
        btnEnregistrer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEnregistrerActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(128, 128, 128)
                        .addComponent(btnSupprimer, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnModifier)
                        .addGap(18, 18, 18)
                        .addComponent(btnEnregistrer, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnFermer, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(140, Short.MAX_VALUE))))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(30, 30, 30)
                    .addComponent(btnAjouter, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(689, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 356, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSupprimer, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnModifier, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEnregistrer, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnFermer, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap(362, Short.MAX_VALUE)
                    .addComponent(btnAjouter, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap()))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnFermerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFermerActionPerformed

        int choix=JOptionPane.showConfirmDialog(this, "Etes-vous sur de vouloir sortir?", "Confirmation",JOptionPane.YES_NO_OPTION, 
                JOptionPane.QUESTION_MESSAGE);
        if(choix==0)System.exit(0);        

    }//GEN-LAST:event_btnFermerActionPerformed

    private void btnEnregistrerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEnregistrerActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnEnregistrerActionPerformed

    private void btnAjouterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAjouterActionPerformed
        String marque, modele, immatriculation, type;
        int nombrePortes,vitesseMax, choix = 0;
        boolean remorque;
        type=JOptionPane.showInputDialog(this, "Entrez le type du véhicule Voiture/Camion/Moto", JOptionPane.PLAIN_MESSAGE);
        marque=JOptionPane.showInputDialog(this, "Entrez la marque du véhicule", "Marque", JOptionPane.PLAIN_MESSAGE);
        modele=JOptionPane.showInputDialog(this, "Entrez le modèle du véhicule", "Modele", JOptionPane.PLAIN_MESSAGE);
        immatriculation=JOptionPane.showInputDialog(this, "Entrez l'immatriculation du véhicule", "immatriculation", JOptionPane.PLAIN_MESSAGE);
        if (type.equalsIgnoreCase("Voiture")) 
            nombrePortes=Integer.parseInt(JOptionPane.showInputDialog(this, "Entrez le nombre de portes", "Nombre de portes", JOptionPane.PLAIN_MESSAGE));//convertir la chaine de caractere type en int 
        else if(type.equalsIgnoreCase("Moto"))
            vitesseMax=Integer.parseInt(JOptionPane.showInputDialog(this, "Entrez la vitesse maximale", "Vitesse maximale", JOptionPane.PLAIN_MESSAGE));//convertir la chaine de caractere type en int 
        else if(type.equalsIgnoreCase("Camion")){
            choix=Integer.parseInt(JOptionPane.showInputDialog(this, "Le camion a t-il une remorque?", "Remorque", JOptionPane.YES_NO_OPTION));//convertir la chaine de caractere type en int 
            if(choix==0)remorque=true;
            else remorque=false;
        }
        else{
            JOptionPane.showMessageDialog(this, "Votre choix est incorrect!!!", "Choix est incorrecr", JOptionPane.OK_OPTION);
        }
        
    }//GEN-LAST:event_btnAjouterActionPerformed

    
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
            java.util.logging.Logger.getLogger(Fenetre.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Fenetre.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Fenetre.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Fenetre.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
               Fenetre f= new Fenetre();
               f.setVisible(true);
               f.setTitle("GESTION DE PARKING");
               f.setLocationRelativeTo(null);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAjouter;
    private javax.swing.JButton btnEnregistrer;
    private javax.swing.JButton btnFermer;
    private javax.swing.JButton btnModifier;
    private javax.swing.JButton btnSupprimer;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JList<String> listeVehicule;
    // End of variables declaration//GEN-END:variables
}
