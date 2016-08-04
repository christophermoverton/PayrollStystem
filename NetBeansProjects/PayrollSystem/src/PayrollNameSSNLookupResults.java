/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//import static PayrollNameSSNLookuppanel.RESULTPANEL;
import java.awt.CardLayout;
import java.sql.*;
import javax.swing.*;
import java.util.*;
import payrollsystem.*;
/**
 *
 * @author strangequark
 */
public class PayrollNameSSNLookupResults extends javax.swing.JPanel {
    JTable tblResults;
    final static String LOOKUPPANEL = "Lookup Card";
    final static String RESULTPANEL = "Result Card";
    final static String VIEWPANEL = "View Card";
    private Object[][] Tabledat;
    private JPanel Cards;
    PayrollNameSSNViewPanel Viewpanel;
    public String[] tableColumnsName = {"empid","deptid",
                                 "lastname", "firstname", "minit", "ssn", "dob",
                                 "gender", "marital", "address1", "address2",
                                 "city", "state", "zipcode",
                                 "homephone", "officephone", "cellphone",
                                 "regularhours"};
     /* "empid", 
                           "INTEGER not NULL", 
                           "deptid", "INTEGER not NULL", "jobid", "INTEGER not NULL", 
                           "typeid","INTEGER not NULL", "catid", "INTEGER not NULL", 
			   "lastname","VARCHAR(255)", "firstname",
			   "VARCHAR(255)","minit","VARCHAR(1)",
			   "ssn","INTEGER", "dob","DATE", "gender",
			   "VARCHAR(1)", "marital","BOOLEAN",
                           "address1","VARCHAR(255)",
			   "address2","VARCHAR(255)",
			   "city","VARCHAR(255)", "state","VARCHAR(2)",
			   "zipcode","SMALLINT", "country","VARCHAR(255)",
                           "email","VARCHAR(255)", "webpage","VARCHAR(255)",
			   "homephone","SMALLINT", "officephone","SMALLINT",
			   "cellphone","SMALLINT", "regularhours","SMALLINT",
			   "login","VARCHAR(255)", "password","VARCHAR(255)",
			   "admin","BOOLEAN", "superadmin","BOOLEAN",
			   "numlogins","INTEGER", "lastlogindate", "DATE",
			   "loginip", "VARCHAR(255)", "datesignup","DATE",
			   "dateupdated","DATE", "active", "BOOLEAN"},
    /**
     * Creates new form PayrollNameSSNLookupResults
     */
    public PayrollNameSSNLookupResults() {
        
        /*
        tblResults = new JTable(){
        public boolean isCellEditable(int roxIndex, int colIndex){
            return false;
        }
        };*/

    }
    
    public void addCards(JPanel cards){
        Cards = cards;
    }
    
    public void addViewPanel(PayrollNameSSNViewPanel viewpanel){
        Viewpanel = viewpanel;
    }
    /*
              jTable1.setModel(new javax.swing.table.DefaultTableModel(
                tabledat,tableColumnsName));
    */
    public void setTable(Object[][] tabledat){
        this.removeAll();
        Tabledat = tabledat;
          jScrollPane1 = new javax.swing.JScrollPane();
          jTable1 = new javax.swing.JTable();
          //initComponents();
          jTable1.setModel(new javax.swing.table.DefaultTableModel(
                tabledat,tableColumnsName));   
        jScrollPane1.setViewportView(jTable1);
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        jButton1.setText("Back To Search");
        jButton1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jButton1KeyPressed(evt);
            }
        });
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        jButton2.setText("Select Record");
        /*
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        */
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
        });
        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 706, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton2)
                    .addComponent(jButton1))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 353, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16)
                .addComponent(jButton2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton1)
                .addContainerGap(68, Short.MAX_VALUE))
        );
    
        
        revalidate();
        repaint();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jButton1.setText("Back To Search");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        jButton1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jButton1KeyPressed(evt);
            }
        });

        jButton2.setText("Select Record");
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 706, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton2)
                    .addComponent(jButton1))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 353, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16)
                .addComponent(jButton2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton1)
                .addContainerGap(68, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jButton1KeyPressed
        // TODO add your handling code here:
        CardLayout cl = (CardLayout)(Cards.getLayout());
        cl.show(Cards, LOOKUPPANEL);
    }//GEN-LAST:event_jButton1KeyPressed

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        // TODO add your handling code here:
        CardLayout cl = (CardLayout)(Cards.getLayout());
        cl.show(Cards, LOOKUPPANEL);
    }//GEN-LAST:event_jButton1MouseClicked

    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked
        // TODO add your handling code here:
        System.out.println("Checking value!");
        
        int rowval = jTable1.getSelectedRow();
        
        System.out.println(rowval);
        if (rowval == -1){
            JOptionPane.showMessageDialog(new JFrame(), "Need at least one entry!");
        }
        else{
            CardLayout cl = (CardLayout)(Cards.getLayout());
            Object empid = Tabledat[rowval][0];
            String QString = "";
            QString += "Select * FROM Employee WHERE empid = ";
            QString +=  empid.toString() + ";";
            
            GeneralQuery gq = new GeneralQuery(QString);
            gq.runQuery();
            Object[][] gqresults = gq.getResultSet();
            Viewpanel.setViewData(gqresults[0]);
            cl.show(Cards, VIEWPANEL);
        }
        //*/
    }//GEN-LAST:event_jButton2MouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
