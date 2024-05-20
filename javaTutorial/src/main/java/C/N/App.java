package C.N;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class App {
    private JButton clickButton;
    private JPanel panel1;
    private JLabel label1;

    public App() {
        // Initialisation explicite des composants
        createUIComponents();

        // Ajout du bouton et du label au panneau
        panel1.add(clickButton);
        panel1.add(label1);

        // Définition de l'action du bouton
        clickButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Changer le texte de l'étiquette
                label1.setText("ICi Reagarde Vous avez cliqué sur le bouton");
            }
        });

        // Création et configuration de la fenêtre
        JFrame frame = new JFrame("App");
        frame.setContentPane(panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        // Lancer l'application
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new App();
            }
        });
    }

    private void createUIComponents() {
        // Initialisation des composants
        clickButton = new JButton("Cliquez-moi");
        panel1 = new JPanel();
        label1 = new JLabel("Texte initial");
    }
}
