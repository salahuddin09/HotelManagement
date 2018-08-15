/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hotel.ui;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

/**
 *
 * @author Personal
 */
public class ClosableTabPanel {

    public static final Icon CLOSE_TAB_ICON = new ImageIcon(ClosableTabPanel.class.getResource("close.png"));
    public static final Icon PAGE_ICON = new ImageIcon(ClosableTabPanel.class.getResource("new-tab.png"));
   
    public static void addClosableTab(final JTabbedPane tabbedPane, final JComponent c, final String title,
            final Icon icon) {
        
        tabbedPane.addTab(null, c);
        int pos = tabbedPane.indexOfComponent(c);
        
        FlowLayout f = new FlowLayout(FlowLayout.CENTER, 5, 0);

        
        JPanel pnlTab = new JPanel(f);
        pnlTab.setOpaque(false);

        
        JLabel lblTitle = new JLabel(title);
        lblTitle.setIcon(icon);

        
        JButton btnClose = new JButton();
        btnClose.setOpaque(false);

        
        btnClose.setRolloverIcon(CLOSE_TAB_ICON);
        btnClose.setRolloverEnabled(true);
        btnClose.setIcon(CLOSE_TAB_ICON);
        btnClose.setBorder(null);
        btnClose.setFocusable(false);

        
        pnlTab.add(lblTitle);
        pnlTab.add(btnClose);
        pnlTab.setBorder(BorderFactory.createEmptyBorder(2, 0, 0, 0));

       
        tabbedPane.setTabComponentAt(pos, pnlTab);

        ActionListener listener = new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                
                tabbedPane.remove(c);
            }
        };
        btnClose.addActionListener(listener);
        
        tabbedPane.setSelectedComponent(c);
    }
    
    public static void setFocasableTab(final JTabbedPane tabbedPane, final JComponent c){
        tabbedPane.setSelectedComponent(c);
    }
}
