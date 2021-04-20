package view;

import javax.swing.*;
import java.awt.*;

public class Finestra extends JFrame {

    JPanel panell;
    JLabel jlTitol, jlNomIn, jlCognomIn;
    JTextField jtfNomIn, jtfCognomIn;



    public Finestra(){
        setVisible(true);
        setSize(530,800);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setTitle("Aplicacio test!");
        setLocationRelativeTo(null);
        iniciarComponents();
    }

    private void iniciarComponents() {
        posarPanel();
        muntarEscenari();
        //posarLabels();
        //posarButtons();
    }



    private void posarPanel() {
        panell = new JPanel();
        getContentPane().add(panell);
        panell.setLayout(null);
    }


    private void muntarEscenari(){
        //titol
        jlTitol = new JLabel("Formulari de Contacte",SwingConstants.CENTER);
        jlTitol.setBounds(0,0,530,50);
        jlTitol.setFont(new Font("purisa", Font.BOLD,24));
        panell.add(jlTitol);

        jlNomIn = new JLabel("Nom:");
        jlNomIn.setBounds(30,70,200,40);
        jlNomIn.setFont(new Font("cooper black",Font.PLAIN,20));
        panell.add(jlNomIn);

        jtfNomIn = new JTextField();
        jtfNomIn.setBounds(280,70,230,40);
        panell.add(jtfNomIn);





    }

}
