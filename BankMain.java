
package BankAccount;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;



public class BankMain extends javax.swing.JFrame {

    
    public BankMain() {
        initComponents();
    }

    ///a project by Tejas sharma  student of gl bajaj////
    @SuppressWarnings("unchecked")
    
    private void initComponents() {

        jButton1 = new JButton();
        jLabel1 = new JLabel();
        jButton2 = new JButton();
        jButton3 = new JButton();
        jButton4 = new JButton();
        jButton6 = new JButton();
        jButton7 = new JButton();
        jMenuBar1 = new JMenuBar();
        jMenu1 = new JMenu();
        jMenuItem1 = new JMenuItem();
        jSeparator1 = new JPopupMenu.Separator();
        jMenuItem3 = new JMenuItem();
        jMenuItem4 = new JMenuItem();
        jMenu2 = new JMenu();
        jMenuItem5 = new JMenuItem();
        jMenuItem6 = new JMenuItem();
        jMenuItem7 = new JMenuItem();

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setTitle("ITSOURCECODE Bank Account Manager");

        jButton1.setText("Create Account");
        jButton1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new Font("Microsoft Sans Serif", 1, 15)); // NOI18N
        jLabel1.setText("WELCOME TO ITSOURCECODE BANK RECORD MANAGER!");

        jButton2.setText("Deposit");
        jButton2.setMaximumSize(new Dimension(107, 23));
        jButton2.setMinimumSize(new Dimension(107, 23));
        jButton2.setPreferredSize(new Dimension(107, 23));
        jButton2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Withdraw");
        jButton3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("Check Balance");
        jButton4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton6.setText("About");
        jButton6.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton7.setText("EXIT");
        jButton7.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jMenu1.setText("New");

        jMenuItem1.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_N, InputEvent.CTRL_MASK));
        jMenuItem1.setText("New Account..");
        jMenuItem1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);
        jMenu1.add(jSeparator1);

        jMenuItem3.setText("About");
        jMenuItem3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem3);

        jMenuItem4.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_F4, InputEvent.ALT_MASK));
        jMenuItem4.setText("Exit");
        jMenuItem4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem4);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Transaction");

        jMenuItem5.setText("Deposit Amount..");
        jMenuItem5.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem5);

        jMenuItem6.setText("Withdraw Amount..");
        jMenuItem6.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem6);

        jMenuItem7.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_B, InputEvent.CTRL_MASK));
        jMenuItem7.setText("Check Account Balance..");
        jMenuItem7.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jMenuItem7ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem7);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton4, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(55, 55, 55)
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton6, GroupLayout.PREFERRED_SIZE, 107, GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addComponent(jButton3, GroupLayout.PREFERRED_SIZE, 107, GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton7, GroupLayout.PREFERRED_SIZE, 103, GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26))
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, GroupLayout.DEFAULT_SIZE, 472, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, GroupLayout.PREFERRED_SIZE, 72, GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addComponent(jButton3, GroupLayout.Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, 41, GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton1, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton2, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton4, GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE)
                    .addComponent(jButton6, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton7, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(110, 110, 110))
        );

        pack();
    }
    private static Account acc;
    
    private void jMenuItem6ActionPerformed(ActionEvent evt) {
           try
           {
               String num;
               num = JOptionPane.showInputDialog(null, "Enter a Amount To Withdraw:", "Withdraw Amount", 1);
               double num1 = Double.parseDouble(num);
               acc.withdraw(num1);
           }
           catch(BankAccountException | NumberFormatException | NullPointerException ex)
           {
               JOptionPane.showMessageDialog(null, ex, "Error", 2);
           }
    }

    private void jButton2ActionPerformed(ActionEvent evt) {
        try
        {
           String num;
           num = JOptionPane.showInputDialog(null, "Enter a Value To Deposit:", "Deposit Amount", 1);
           double num1 = Double.parseDouble(num);
           acc.deposit(num1);
        }
        catch(NumberFormatException | NullPointerException nfe1)
        {
            JOptionPane.showMessageDialog(null, nfe1, "Error", 2);
        }
    }

    private void jMenuItem1ActionPerformed(ActionEvent evt) {
        String name; 
        long num; 
        name = JOptionPane.showInputDialog(null, "Please Enter Account Holder Name:", "Create Account", 1);
        num = 1332522123;
        acc = new Account(name, num);
        JOptionPane.showMessageDialog(null, "Account Succesfully Created!", "Create Account", 1);
    }

    private void jButton6ActionPerformed(ActionEvent evt) {
        JOptionPane.showMessageDialog(null,"Created By ITSOURCECODE", "About", 1);
    }

    private void jMenuItem3ActionPerformed(ActionEvent evt) {
        JOptionPane.showMessageDialog(null,"Created By ITSOURCECODE", "About", 1);
    }

    private void jMenuItem4ActionPerformed(ActionEvent evt) {
        System.exit(0);
    }

    private void jMenuItem5ActionPerformed(ActionEvent evt) {
        try
        {
           String num;
           num = JOptionPane.showInputDialog(null, "Enter a Value To Deposit:", "Deposit Amount", 1);
           double num1 = Double.parseDouble(num);
           acc.deposit(num1);
        }
        catch(NumberFormatException | NullPointerException nfe1)
        {
            JOptionPane.showMessageDialog(null, nfe1, "Error", 2);
        }
    }

    private void jMenuItem7ActionPerformed(ActionEvent evt) {
       try
       {
         double num = acc.getBalance();
         JOptionPane.showMessageDialog(null, "Current Balance: " + num, "Current Balance", 1);
       }
       catch(NullPointerException npe)
       {
           JOptionPane.showMessageDialog(null, npe, "Error", 2);
       }
    }

    private void jButton1ActionPerformed(ActionEvent evt) {
        String name; 
        long num; 
        name = JOptionPane.showInputDialog(null, "Please Enter Account Holder Name:", "Create Account", 1);
        num = 1332522123;
        acc = new Account(name, num);
        JOptionPane.showMessageDialog(null, "Account Succesfully Created!", "Create Account", 1);
    }

    private void jButton3ActionPerformed(ActionEvent evt) {
        try
           {
               String num;
               num = JOptionPane.showInputDialog(null, "Enter a Amount To Withdraw:", "Withdraw Amount", 1);
               double num1 = Double.parseDouble(num);
               acc.withdraw(num1);
           }
           catch(BankAccountException | NumberFormatException | NullPointerException ex)
           {
               JOptionPane.showMessageDialog(null, ex, "Error", 2);
           }
    }

    private void jButton4ActionPerformed(ActionEvent evt) {
       try
       {
         double num = acc.getBalance();
         JOptionPane.showMessageDialog(null, "Current Balance: " + num, "Current Balance", 1);
       }
       catch(NullPointerException npe)
       {
           JOptionPane.showMessageDialog(null, npe, "Error", 2);
       }
    }

    private void jButton7ActionPerformed(ActionEvent evt) {
        System.exit(0);
    }
    
    public static void main(String args[]) {
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BankMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
        java.awt.EventQueue.invokeLater(() -> {
            new BankMain().setVisible(true);
        });
    }

    
    private JButton jButton1;
    private JButton jButton2;
    private JButton jButton3;
    private JButton jButton4;
    private JButton jButton6;
    private JButton jButton7;
    private JLabel jLabel1;
    private JMenu jMenu1;
    private JMenu jMenu2;
    private JMenuBar jMenuBar1;
    private JMenuItem jMenuItem1;
    private JMenuItem jMenuItem3;
    private JMenuItem jMenuItem4;
    private JMenuItem jMenuItem5;
    private JMenuItem jMenuItem6;
    private JMenuItem jMenuItem7;
    private JPopupMenu.Separator jSeparator1;
    
}
