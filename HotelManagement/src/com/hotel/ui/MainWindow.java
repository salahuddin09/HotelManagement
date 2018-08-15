package com.hotel.ui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class MainWindow extends JFrame implements ActionListener {

    JMenuBar bar;
    JMenu mnu1, mnu2,mnu3,mnu4;
    JMenuItem item1, item2, item3, item4,item5,item6,item7,item8,item9,item10;
    JSplitPane jSplitPane, jSplitPane2;
    JPanel jPanel1, jPanel2a, jPanel2b;
    public static JLabel lblTest;
    public static JTabbedPane tabbedPane;
    
    int w, h;

    public MainWindow() {
        w = Toolkit.getDefaultToolkit().getScreenSize().width;//
        h = Toolkit.getDefaultToolkit().getScreenSize().height;//

       
        bar = new JMenuBar();
        mnu1 = new JMenu("File");
        mnu2 = new JMenu("Registation Entry");
        mnu3 = new JMenu("Accounts");
        mnu4 = new JMenu("Search");
        item1 = new JMenuItem("Exit");
        item2 = new JMenuItem("Single Entry");
        item3 = new JMenuItem("Couple Entry");
        item4 = new JMenuItem("Group Entry");
        item5 = new JMenuItem("Family Entry");
        item6 = new JMenuItem("Daily");
        item7 = new JMenuItem("Weekly");
        item8 = new JMenuItem("Monthly");
        item9 = new JMenuItem("Yearly");
        item10 = new JMenuItem("Withdraw");
        lblTest = new JLabel();
        tabbedPane = new JTabbedPane();

        mnu1.add(item1);
        mnu2.add(item2);
        mnu2.add(item3);
        mnu2.add(item4);
        mnu2.add(item5);
        mnu3.add(item6);
        mnu3.add(item7);
        mnu3.add(item8);
        mnu3.add(item9);
        mnu3.add(item10);
        bar.add(mnu1);
        bar.add(mnu2);
        bar.add(mnu3);
        bar.add(mnu4);
        setJMenuBar(bar);
        setTitle("Hotel Management & Accounting System");
        item1.addActionListener(this);
        item2.addActionListener(this);
        item3.addActionListener(this);
        item4.addActionListener(this);
        item5.addActionListener(this);
        item6.addActionListener(this);
        item7.addActionListener(this);
        item8.addActionListener(this);
        item9.addActionListener(this);
        item10.addActionListener(this);
        
        jPanel1 = new JPanel();
        jPanel2a = new JPanel();
        jPanel2b = new JPanel();
        lblTest.setText("Hello User !!!!");
        jPanel1.setBackground(Color.GREEN);
        jPanel1.add(lblTest);
        jPanel1.setLayout(new GridLayout());
        jPanel2a.setLayout(new GridLayout());
        jPanel2b.setLayout(new GridLayout());
        jPanel2b.add(tabbedPane, BorderLayout.EAST);

        WelcomePanel wPanel = new WelcomePanel();        
        tabbedPane.add("Welcome", wPanel);
        
        TreeMenu tree = new TreeMenu();
        jPanel2a.add(tree);
        
        jSplitPane2 = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT,
                jPanel2a, jPanel2b);
        jSplitPane2.setOneTouchExpandable(true);

        jSplitPane2.setDividerLocation(200);
        jSplitPane2.setResizeWeight(0.15);

        jSplitPane = new JSplitPane(JSplitPane.VERTICAL_SPLIT,
                jSplitPane2, jPanel1);
        jSplitPane.setOneTouchExpandable(true);
        jSplitPane.setResizeWeight(0.95);
        jSplitPane.setDividerLocation(h-250);


        getContentPane().add(jSplitPane, BorderLayout.CENTER);
        setSize(800, 600);
        setLocationRelativeTo(null);
        setExtendedState(MAXIMIZED_BOTH);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {
        
         try
                        {
                            UIManager.setLookAndFeel("com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel");
                          //  UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
                            new MainWindow();
                            }
                catch (Exception unused) {
                    unused.printStackTrace();
                }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == item1) {
            System.exit(0);
        }
        if (e.getSource() == item2) {
            
            JScrollPane scrollPane = new JScrollPane(new SinglePanel());
            Icon icon = ClosableTabPanel.PAGE_ICON;
            ClosableTabPanel.addClosableTab(tabbedPane, scrollPane, "Single Entry", icon);
        }
        if (e.getSource() == item3) {
       
            JScrollPane scrollPane = new JScrollPane(new CouplePanel());
            Icon icon = ClosableTabPanel.PAGE_ICON;
            ClosableTabPanel.addClosableTab(tabbedPane, scrollPane, "Couple Entry", icon);
        }
        if (e.getSource() == item4) {
        
            JScrollPane scrollPane = new JScrollPane(new GroupPanel());
            Icon icon = ClosableTabPanel.PAGE_ICON;
            ClosableTabPanel.addClosableTab(tabbedPane, scrollPane, "Group Entry", icon);
        }
        if (e.getSource() == item5) {
        
            JScrollPane scrollPane = new JScrollPane(new FamilyPanel());
            Icon icon = ClosableTabPanel.PAGE_ICON;
            ClosableTabPanel.addClosableTab(tabbedPane, scrollPane, "Family Entry", icon);
        }
        if (e.getSource() == item6) {
        
            JScrollPane scrollPane = new JScrollPane(new AcDailyPanel());
            Icon icon = ClosableTabPanel.PAGE_ICON;
            ClosableTabPanel.addClosableTab(tabbedPane, scrollPane, "Daily", icon);
        }
        if (e.getSource() == item7) {
        
            JScrollPane scrollPane = new JScrollPane(new AcWeeklyPanel());
            Icon icon = ClosableTabPanel.PAGE_ICON;
            ClosableTabPanel.addClosableTab(tabbedPane, scrollPane, "Weekly", icon);
        }
        if (e.getSource() == item8) {
        
            JScrollPane scrollPane = new JScrollPane(new AcMonthlyPanel());
            Icon icon = ClosableTabPanel.PAGE_ICON;
            ClosableTabPanel.addClosableTab(tabbedPane, scrollPane, "Monthly", icon);
        }
        if (e.getSource() == item9) {
        
            JScrollPane scrollPane = new JScrollPane(new AcYearlyPanel());
            Icon icon = ClosableTabPanel.PAGE_ICON;
            ClosableTabPanel.addClosableTab(tabbedPane, scrollPane, "Yearly", icon);
        }
        if (e.getSource() == item10) {
        
            JScrollPane scrollPane = new JScrollPane(new WithDrawPanel());
            Icon icon = ClosableTabPanel.PAGE_ICON;
            ClosableTabPanel.addClosableTab(tabbedPane, scrollPane, "Withdraw", icon);
        }
    }
}
