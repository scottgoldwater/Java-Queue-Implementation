/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package queue;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author
 * Scott Goldwater 
 */
public class Main extends javax.swing.JFrame {

    /**
     * Creates
     * new
     * form
     * Main
     */
    public Main() {
        initComponents();
    }

    /**
     * This
     * method
     * is
     * called
     * from
     * within
     * the
     * constructor
     * to
     * initialize
     * the
     * form.
     * WARNING:
     * Do
     * NOT
     * modify
     * this
     * code.
     * The
     * content
     * of
     * this
     * method
     * is
     * always
     * regenerated
     * by
     * the
     * Form
     * Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        VarTable = new javax.swing.JTable();
        enqueueButton = new javax.swing.JButton();
        dequeueButton = new javax.swing.JButton();
        Title = new javax.swing.JLabel();
        QueueSize = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        VarTable.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        VarTable.setFont(new java.awt.Font("Helvetica", 1, 14)); // NOI18N
        VarTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Value"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(VarTable);

        enqueueButton.setText("Enqueue");
        enqueueButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enqueueButtonActionPerformed(evt);
            }
        });

        dequeueButton.setText("Dequeue");
        dequeueButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dequeueButtonActionPerformed(evt);
            }
        });

        Title.setFont(new java.awt.Font("Helvetica", 0, 18)); // NOI18N
        Title.setText("Scott Goldwater Queue Implementation");
        Title.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        QueueSize.setFont(new java.awt.Font("Helvetica", 1, 16)); // NOI18N
        QueueSize.setText("Queue Size:");

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .addContainerGap()
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
                    .add(Title, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 367, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(layout.createSequentialGroup()
                        .add(jScrollPane1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 193, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .add(18, 18, 18)
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING, false)
                            .add(enqueueButton, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 176, Short.MAX_VALUE)
                            .add(dequeueButton, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 176, Short.MAX_VALUE)
                            .add(QueueSize, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(28, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .addContainerGap()
                .add(Title, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 49, Short.MAX_VALUE)
                .add(18, 18, 18)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING, false)
                    .add(layout.createSequentialGroup()
                        .add(QueueSize, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 56, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .add(dequeueButton, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 78, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .add(18, 18, 18)
                        .add(enqueueButton, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 78, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                    .add(jScrollPane1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 383, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void enqueueButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enqueueButtonActionPerformed
        String[] options = {"Cancel","OK"};
        JPanel panel = new JPanel();
        JLabel lbl = new JLabel("Enter a new Interger Value");
        JTextField txt = new JTextField(10);
        panel.add(lbl);
        panel.add(txt);
        boolean isSet = false;
        String value = null;
        int number =0;
        do
        {
            int selectedOption = JOptionPane.showOptionDialog(null, panel, "Enter the Queue Size", JOptionPane.NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, options , options[1]);
            
            if(selectedOption == 0 )
                return;

            if(selectedOption == 1)
            {
                value = txt.getText();
                value = value.trim();
                
                try
                {
                    number = Integer.parseInt(value);
                    isSet = true;                
                }
                catch(NumberFormatException e)
                {
                    JOptionPane.showMessageDialog(this, "Please input an integer");
                }       
            }
        }while(!isSet);
        try
        {
            queueInstance.enqueue(number);
            
        }
        catch(QueueFullException e)
        {
            JOptionPane.showMessageDialog(this,e.toString());
            return; 
        }
        ((DefaultTableModel)VarTable.getModel()).addRow(new Object[] {number});
    }//GEN-LAST:event_enqueueButtonActionPerformed

    private void dequeueButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dequeueButtonActionPerformed
        int value; 
        try
        {
            value = queueInstance.dequeue();
        }
        catch(QueueEmptyException e)
        {
            JOptionPane.showMessageDialog(this,e.toString());
            return; 
        }
        JOptionPane.showMessageDialog(this, "The value returned is "+ value);
        ((DefaultTableModel)VarTable.getModel()).removeRow(0);
    }//GEN-LAST:event_dequeueButtonActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        String[] options = {"Start"};
        JPanel panel = new JPanel();
        JLabel lbl = new JLabel("Enter the size of the queue ");
        JTextField txt = new JTextField(10);
        panel.add(lbl);
        panel.add(txt);
        boolean isSet = false;
        String value = null;
        int number =0;
        do
        {
            int selectedOption = JOptionPane.showOptionDialog(null, panel, "Enter the Queue Size", JOptionPane.CLOSED_OPTION, JOptionPane.QUESTION_MESSAGE, null, options , options[0]);
            
            if(selectedOption == -1)
                System.exit(0);
            if(selectedOption == 0)
            {
                value = txt.getText();
                value = value.trim();
                
                try
                {
                    number = Integer.parseInt(value);
                    if(number>0 && number<=10000000)
                    {
                        isSet = true;
                    }
                    else
                    {
                        JOptionPane.showMessageDialog(this,"Please put an integer greater than one and less than 10000000");
                    }                
                }
                catch(NumberFormatException e)
                {
                    JOptionPane.showMessageDialog(this, "Please input an integer");
                }
                        
            }
        }while(!isSet);
        
        QueueInit(number);
        QueueSize.setText("Queue Size: "+number);       
    }//GEN-LAST:event_formWindowOpened
    
    private void QueueInit(int value)
    {
        try
        {
            queueInstance = new Queue(value);
        }
        //shouldn't get here
        catch (InvalidQueueLengthException e )
        {
            JOptionPane.showMessageDialog(this,e.toString());
            return; 
        }
        catch(OutOfMemoryError e)
        {
            JOptionPane.showMessageDialog(this,e.toString());
            return; 
        }
    }
    /**
     * @param
     * args
     * the
     * command
     * line
     * arguments
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
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel QueueSize;
    private javax.swing.JLabel Title;
    private javax.swing.JTable VarTable;
    private javax.swing.JButton dequeueButton;
    private javax.swing.JButton enqueueButton;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
    private Queue queueInstance;
}

