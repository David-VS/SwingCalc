package be.ehb;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class RekenenMetMenu extends JFrame {

    private JTextField getal1, getal2, resultaat;
    private JButton somButton, verschilButton, productButton, deelButton;
    private JMenuItem somMenuItem, verschilMenuItem, productMenuItem,
            QuotientMenuItem;
    private JMenuBar menuBar;
    private JMenu bewerkingsMenu;
    private JPanel inputPanel, buttonsPanel;
    private ActionListener myActionListener;

    public RekenenMetMenu() {
        myActionListener = new BewerkingListener(this);
        this.setTitle("Rekenen met menu");
        this.setJMenuBar(getCustomMenuBar());
        this.getContentPane().setLayout(new BorderLayout());
        this.getContentPane().add(getInputPanel(), BorderLayout.CENTER);
        this.getContentPane().add(getButtonsPanel(), BorderLayout.SOUTH);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.pack();
        this.setVisible(true);
    }

    public JTextField getGetal1() {
        return getal1;
    }

    public JTextField getGetal2() {
        return getal2;
    }

    public JTextField getResultaat() {
        return resultaat;
    }

    public JButton getSomButton() {
        somButton = new JButton("Som");
        somButton.addActionListener(myActionListener);
        return somButton;
    }

    public JButton getVerschilButton() {
        verschilButton = new JButton("Verschil");
        verschilButton.addActionListener(myActionListener);

        return verschilButton;
    }

    public JButton getProductButton() {
        productButton = new JButton("Product");
        productButton.addActionListener(myActionListener);
        return productButton;
    }

    public JButton getQuotientButton() {
        deelButton = new JButton("Quotient");
        deelButton.addActionListener(myActionListener);
        return deelButton;
    }

    public JMenuItem getSomMenuItem() {
        somMenuItem = new JMenuItem("Som");
        somMenuItem.addActionListener(myActionListener);
        return somMenuItem;
    }

    public JMenuItem getVerschilMenuItem() {
        verschilMenuItem = new JMenuItem("Verschil");
        verschilMenuItem.addActionListener(myActionListener);
        return verschilMenuItem;
    }

    public JMenuItem getProductMenuItem() {
        productMenuItem = new JMenuItem("Maal");
        productMenuItem.addActionListener(myActionListener);
        return productMenuItem;
    }

    public JMenuItem getQuotientMenuItem() {
        QuotientMenuItem = new JMenuItem("Deel");
        QuotientMenuItem.addActionListener(myActionListener);
        return QuotientMenuItem;
    }

    public JMenu getBewerkingsMenu() {
        bewerkingsMenu = new JMenu("Bewerking");

        bewerkingsMenu.add(getSomMenuItem());
        bewerkingsMenu.add(getVerschilMenuItem());
        bewerkingsMenu.add(getProductMenuItem());
        bewerkingsMenu.add(getQuotientMenuItem());

        return bewerkingsMenu;
    }

    public JMenuBar getCustomMenuBar() {
        menuBar = new JMenuBar();
        menuBar.add(getBewerkingsMenu());

        return menuBar;
    }

    public JPanel getInputPanel() {
        inputPanel = new JPanel();
        inputPanel.setLayout(new FlowLayout());
        inputPanel.add(new JLabel("Getal 1"));
        inputPanel.add(getal1 = new JTextField(3));
        inputPanel.add(new JLabel("Getal 2"));
        inputPanel.add(getal2 = new JTextField(3));
        inputPanel.add(new JLabel("Resultaat"));
        inputPanel.add(resultaat = new JTextField(4));
        resultaat.setEditable(false);
        return inputPanel;
    }

    public JPanel getButtonsPanel() {
        buttonsPanel = new JPanel();
        buttonsPanel.setLayout(new FlowLayout());
        buttonsPanel.add(getSomButton());
        buttonsPanel.add(getVerschilButton());
        buttonsPanel.add(getProductButton());
        buttonsPanel.add(getQuotientButton());
        return buttonsPanel;
    }
}