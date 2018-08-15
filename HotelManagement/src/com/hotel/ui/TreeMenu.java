
package com.hotel.ui;

import java.awt.*;
import javax.swing.*;
import javax.swing.tree.*;
import javax.swing.event.*;

public class TreeMenu extends JPanel implements TreeSelectionListener {

    private JTree tree;

    public TreeMenu() {
        setLayout(new GridLayout());      
       
        DefaultMutableTreeNode root = new DefaultMutableTreeNode("Tree Menu");
        DefaultMutableTreeNode child1, child2 , child3,child4;
        DefaultMutableTreeNode grandChild1, grandChild2, grandChild3, grandChild4,grandChild5,
                                grandChild6, grandChild7, grandChild8 , grandChild9,grandChild10,
                                grandChild11;
        child1 = new DefaultMutableTreeNode("File");
        child2 = new DefaultMutableTreeNode("Registration Entry");
        child3 = new DefaultMutableTreeNode("Accounts");
        child4 = new DefaultMutableTreeNode("Search");
        
        root.add(child1);
        root.add(child2);
        root.add(child3);
        root.add(child4);

        grandChild1 = new DefaultMutableTreeNode("Exit");
        child1.add(grandChild1);

        grandChild2 = new DefaultMutableTreeNode("Single Entry");
        grandChild3 = new DefaultMutableTreeNode("Couple Entry");
        grandChild4 = new DefaultMutableTreeNode("Group Entry");
        grandChild5 = new DefaultMutableTreeNode("Daily");
        grandChild6 = new DefaultMutableTreeNode("Weekly");
        grandChild7 = new DefaultMutableTreeNode("Monthly");
        grandChild8 = new DefaultMutableTreeNode("Yearly");
        grandChild9 = new DefaultMutableTreeNode("Family Entry");
        grandChild10 = new DefaultMutableTreeNode("Date Search");
        grandChild11 = new DefaultMutableTreeNode("Withdraw");
        
        
        child2.add(grandChild2);
        child2.add(grandChild3);
        child2.add(grandChild4);
        child2.add(grandChild9);
        
        child3.add(grandChild5);
        child3.add(grandChild6);
        child3.add(grandChild7);
        child3.add(grandChild8);
        child3.add(grandChild11);
        
        child4.add(grandChild10);
        tree = new JTree(root);
        tree.addTreeSelectionListener(this);
        add(new JScrollPane(tree), BorderLayout.CENTER);
        //setBackground(Color.decode("#90EE90"));
        setSize(250, 275);
        setVisible(true);
    }

    @Override
    public void valueChanged(TreeSelectionEvent event) {
        if (tree.getLastSelectedPathComponent().toString().equals("Exit")) {
            System.exit(0);
        }
        if (tree.getLastSelectedPathComponent().toString().equals("Single Entry")) {
           // MainWindow.lblTest.setText("Open tab One");
            JScrollPane scrollPane = new JScrollPane(new SinglePanel());
            Icon icon = ClosableTabPanel.PAGE_ICON;
            ClosableTabPanel.addClosableTab(MainWindow.tabbedPane, scrollPane, "Single Entry", icon);
        }
        if (tree.getLastSelectedPathComponent().toString().equals("Couple Entry")) {
           //  MainWindow.lblTest.setText("Open tab Two");
            JScrollPane scrollPane = new JScrollPane(new CouplePanel());
            Icon icon = ClosableTabPanel.PAGE_ICON;
            ClosableTabPanel.addClosableTab(MainWindow.tabbedPane, scrollPane, "Couple Entry", icon);
        }
        if (tree.getLastSelectedPathComponent().toString().equals("Group Entry")) {
            // MainWindow.lblTest.setText("Open tab Three");
            JScrollPane scrollPane = new JScrollPane(new GroupPanel());
            Icon icon = ClosableTabPanel.PAGE_ICON;
            ClosableTabPanel.addClosableTab(MainWindow.tabbedPane, scrollPane, "Group Entry", icon);
        }
        if (tree.getLastSelectedPathComponent().toString().equals("Family Entry")) {
            // MainWindow.lblTest.setText("Open tab Three");
            JScrollPane scrollPane = new JScrollPane(new FamilyPanel());
            Icon icon = ClosableTabPanel.PAGE_ICON;
            ClosableTabPanel.addClosableTab(MainWindow.tabbedPane, scrollPane, "Family Entry", icon);
        }
        if (tree.getLastSelectedPathComponent().toString().equals("Daily")) {
            // MainWindow.lblTest.setText("Open tab Three");
            JScrollPane scrollPane = new JScrollPane(new AcDailyPanel());
            Icon icon = ClosableTabPanel.PAGE_ICON;
            ClosableTabPanel.addClosableTab(MainWindow.tabbedPane, scrollPane, "Daily", icon);
        }
        if (tree.getLastSelectedPathComponent().toString().equals("Weekly")) {
            // MainWindow.lblTest.setText("Open tab Three");
            JScrollPane scrollPane = new JScrollPane(new AcWeeklyPanel());
            Icon icon = ClosableTabPanel.PAGE_ICON;
            ClosableTabPanel.addClosableTab(MainWindow.tabbedPane, scrollPane, "Weekly", icon);
        }
        if (tree.getLastSelectedPathComponent().toString().equals("Monthly")) {
            // MainWindow.lblTest.setText("Open tab Three");
            JScrollPane scrollPane = new JScrollPane(new AcMonthlyPanel());
            Icon icon = ClosableTabPanel.PAGE_ICON;
            ClosableTabPanel.addClosableTab(MainWindow.tabbedPane, scrollPane, "Monthly", icon);
        }
        if (tree.getLastSelectedPathComponent().toString().equals("Yearly")) {
            // MainWindow.lblTest.setText("Open tab Three");
            JScrollPane scrollPane = new JScrollPane(new AcYearlyPanel());
            Icon icon = ClosableTabPanel.PAGE_ICON;
            ClosableTabPanel.addClosableTab(MainWindow.tabbedPane, scrollPane, "Yearly", icon);
        }
        if (tree.getLastSelectedPathComponent().toString().equals("Withdraw")) {
            // MainWindow.lblTest.setText("Open tab Three");
            JScrollPane scrollPane = new JScrollPane(new WithDrawPanel());
            Icon icon = ClosableTabPanel.PAGE_ICON;
            ClosableTabPanel.addClosableTab(MainWindow.tabbedPane, scrollPane, "Withdraw", icon);
    }
    }
}
