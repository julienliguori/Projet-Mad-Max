package Vues;



import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.BoxLayout;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.Insets;

import Controleurs.wkf_cpte;


public class frm_auth
{
   
    private final wkf_cpte controller;
    
    
    public final JFrame frame;
    
  
    private final String DIALOG_TITLE = "Page de Connexion";
    
    
    public frm_auth(final wkf_cpte controller)
    {
        this.controller = controller;
        this.frame = new JFrame(DIALOG_TITLE);
        
        this.InitWindow();
    }
    
    // Initialise la fen�tre :
    private void InitWindow()
    {
        // Cr�ation des panneaux :
        final JPanel panel = new JPanel();

        final JPanel pheader = new JPanel();
        final JPanel plogin = new JPanel();
        final JPanel ppassword = new JPanel();
        final JPanel pconfirm = new JPanel();
                
        // Labels :
        final JLabel lheader = new JLabel("Veuillez entrer les informations de connexion.", SwingConstants.CENTER);
        final JLabel llogin = new JLabel("Nom d'utilisateur :");
        final JLabel lpassword = new JLabel("Mot de passe :");
        
        // Bouton de confirmation :
        final JButton confirm = new JButton("Connexion");
        
        // Champs de texte :
        final JTextField login = new JTextField();
        final JTextField password = new JTextField();
        
        // Positionnement & param�trage des widgets :
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));

        pheader.setBorder(new EmptyBorder(new Insets(8, 8, 8, 8)));
        
        plogin.setLayout(new GridLayout(1, 2));
        plogin.setBorder(new EmptyBorder(new Insets(48, 64, 16, 32)));
        
        ppassword.setLayout(new GridLayout(1, 2));
        ppassword.setBorder(new EmptyBorder(new Insets(16, 64, 16, 32)));
        
        pconfirm.setLayout(new BorderLayout());
        pconfirm.setBorder(new EmptyBorder(new Insets(16, 32, 16, 32)));
        
        confirm.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                // On teste les identifiants entr�s :
                if (controller.pcs_authentifier(login.getText(), password.getText()))
                    controller.OnLogin();
                else
                {
                    lheader.setText("Erreur ! Nom d'utilisateur ou mot de passe incoh�rent !");
                    lheader.setForeground(Color.black);
                }
            }
        });
        
        // Ajout des widgets :
        pheader.add(lheader);
        
        plogin.add(llogin);
        plogin.add(login);
                
        ppassword.add(lpassword);
        ppassword.add(password);
        
        pconfirm.add(confirm);
        
        panel.add(pheader);
        panel.add(plogin);
        panel.add(ppassword);
        panel.add(pconfirm);
        
        frame.add(panel);
        
        // Param�trage de la fen�tre :
        frame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        
        frame.setSize(640, 320);
        frame.setLocationRelativeTo(null);
        
        frame.addWindowListener(new WindowAdapter()
        {
            @Override
            public void windowClosing(WindowEvent e)
            {
                controller.OnClose();
            }
        });
        
        frame.setVisible(true);
    }
}