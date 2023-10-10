package br.com.calculadora.visao;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Tela extends JFrame {
    JTextField visor;

    public Tela() {

        setTitle("Calculadora");
        setVisible(true);
        setSize(258, 410);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        setLocationRelativeTo(null);
        setLayout(null);

        visor = new JTextField();
        visor.setBounds(0, 0, 240, 70);
        add(visor);

        JButton jButton = new JButton("AC");
        jButton.setBounds(0, 70, 60, 60);
        add(jButton);
        JButton jButton2 = new JButton("+/-");
        jButton2.setBounds(60, 70, 60, 60);
        add(jButton2);
        JButton jButton3 = new JButton("%");
        jButton3.setBounds(120, 70, 60, 60);
        add(jButton3);
        JButton jButton4 = new JButton("/");
        jButton4.setBounds(180, 70, 60, 60);
        add(jButton4);

        JButton jButton5 = new JButton("7");
        jButton5.setBounds(0, 130, 60, 60);
        add(jButton5);
        JButton jButton6 = new JButton("8");
        jButton6.setBounds(60, 130, 60, 60);
        add(jButton6);
        JButton jButton7 = new JButton("9");
        jButton7.setBounds(120, 130, 60, 60);
        add(jButton7);
        JButton jButton8 = new JButton("*");
        jButton8.setBounds(180, 130, 60, 60);
        add(jButton8);

        JButton jButtonq = new JButton("4");
        jButtonq.setBounds(0, 190, 60, 60);
        add(jButtonq);
        JButton jButtonw = new JButton("5");
        jButtonw.setBounds(60, 190, 60, 60);
        add(jButtonw);
        JButton jButtone = new JButton("6");
        jButtone.setBounds(120, 190, 60, 60);
        add(jButtone);
        JButton jButtonr = new JButton("-");
        jButtonr.setBounds(180, 190, 60, 60);
        add(jButtonr);

        JButton jButtont = new JButton("1");
        jButtont.setBounds(0, 250, 60, 60);
        add(jButtont);
        JButton jButtony = new JButton("2");
        jButtony.setBounds(60, 250, 60, 60);
        add(jButtony);
        JButton jButtonu = new JButton("3");
        jButtonu.setBounds(120, 250, 60, 60);
        add(jButtonu);
        JButton jButtoni = new JButton("+");
        jButtoni.setBounds(180, 250, 60, 60);
        add(jButtoni);

        JButton jButtono = new JButton("0");
        jButtono.setBounds(0, 310, 60, 60);
        add(jButtono);
        JButton jButtonp = new JButton(".");
        jButtonp.setBounds(60, 310, 60, 60);
        add(jButtonp);
        JButton jButtona = new JButton();
        jButtona.setText("=");
        jButtona.setBounds(120, 310, 120, 60);
        add(jButtona);
    }
}