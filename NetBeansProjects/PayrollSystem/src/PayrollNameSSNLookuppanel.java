/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.*;
import javax.swing.*;
import java.awt.*; 
import java.awt.event.*;
import payrollsystem.*;
/**
 *
 * @author strangequark
 */
public class PayrollNameSSNLookuppanel extends javax.swing.JPanel {
    public JPanel Cards;
    public PayrollNameSSNLookupResults prlookresults;
    final static String LOOKUPPANEL = "Lookup Card";
    final static String RESULTPANEL = "Result Card";
    /**
     * Creates new form PayrollNameSSNLookuppanel
     */
    public String[] tableColumnsName = {"empid","deptid",
                                 "lastname", "firstname", "minit", "ssn", "dob",
                                 "gender", "marital", "address1", "address2",
                                 "city", "state", "zipcode",
                                 "homephone", "officephone", "cellphone",
                                 "regularhours"};
    public enum States { AL, AK, AR, AZ, CA, CO, CT, DE, DC, FL, GA, HI, ID, IL, 
                    IN, IA, KS, 
                    KY, LA, ME, MD, MA, MI, MN, MS, MO, MT, NE, NV, NH, NJ, 
                    NM, NY,
                    NC, ND, OH, OK, OR, PA, RI, SC, SD, TN, TX, UT, VT, VA,
                    WA, WV, WI, WY;}
    public PayrollNameSSNLookuppanel() {
        initComponents();
        jComboBox1.setModel(new DefaultComboBoxModel(States.values()));
    }
    public String removelast(String str) {
        if (str != null && str.length() > 0 && str.charAt(str.length()-1)=='x') {
          str = str.substring(0, str.length()-1);
        }
        return str;
    }  
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField9 = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jTextField10 = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jTextField11 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jTextField6 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jTextField7 = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jTextField8 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();

        jTextField9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField9ActionPerformed(evt);
            }
        });

        jLabel11.setText("Email:");

        jLabel12.setText("EID:");

        jLabel5.setText("Date of Birth: ");

        jLabel6.setText("Street Address:");

        jLabel7.setText("City:");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        jLabel8.setText("State:");

        jLabel9.setText("Zip:");

        jLabel1.setText("First Name:");

        jLabel2.setText("Last Name:");

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jLabel4.setText("SSN:");

        jButton1.setText("Search");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jButton1MouseReleased(evt);
            }
        });
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel10.setText("Home Phone:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 729, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 141, Short.MAX_VALUE)
                        .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 141, Short.MAX_VALUE))
                    .addGap(18, 18, 18)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton1)
                            .addGap(52, 52, 52))
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jTextField7, javax.swing.GroupLayout.DEFAULT_SIZE, 273, Short.MAX_VALUE)
                                    .addComponent(jTextField6, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextField5, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextField1, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextField2, javax.swing.GroupLayout.Alignment.LEADING))
                                .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(18, 18, 18)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jTextField9)
                                .addComponent(jTextField10, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jTextField11, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addContainerGap()))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 317, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel1)
                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel2)
                                        .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel6)
                                        .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel10)
                                        .addComponent(jTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jTextField10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel7)
                                .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel9)
                                .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jButton1)))
                        .addComponent(jTextField11, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addContainerGap()))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField9ActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jButton1MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseReleased
        // TODO add your handling code here:
        ArrayList<String[]> pQueries = new ArrayList<String[]>();
        HashMap<String,String[]> pQsm = new HashMap<String,String[]>();
        String Qstring = "Select ";
        int i = 0;
        for (String tname : tableColumnsName){
            Qstring += tname;
            if (i != tableColumnsName.length -1){
                Qstring += ", ";
            }
            i++;
        }
        Qstring += " FROM Employee WHERE";
        boolean a1t = false;
        boolean ct = false;
        boolean st = false;
        boolean zt = false;
        boolean dbt = false;
       
        if (!jTextField1.getText().equals("")){
            String fname = jTextField1.getText();
            pQueries.add(new String[] {"s","firstname", "'%"+ fname + "%'"});
            pQsm.put("firstname", new String[] {"s", "'%"+ fname + "%',"});
            Qstring += " firstname LIKE " +  "'%"+ fname + "%'";

        }
        if (!jTextField2.getText().equals("")){
            String lname = jTextField2.getText();
            pQueries.add(new String[] {"s","lastname", "'%"+ lname + "%'"});
            pQsm.put("lastname", new String[] {"s", "'%"+ lname + "%'"});
            Qstring += " lastname LIKE " +  "'%"+ lname + "%',";

        }
        if (!jTextField3.getText().equals("")){
            String ssn = jTextField3.getText();
            pQueries.add(new String[] {"i","ssn",ssn});
            pQsm.put("ssn", new String[] {"s", ssn});
            Qstring += " ssn="+ssn+",";

        }
        if (!jTextField5.getText().equals("")){
            String address1 = jTextField5.getText();
            pQueries.add(new String[] {"s","address1", "'%"+ address1 + "%'"});
            pQsm.put("address1", new String[] {"s", "'%"+ address1 + "%',"});
            a1t = true;

        }
        if (!jTextField7.getText().equals("")){
            String city = jTextField7.getText();
            pQueries.add(new String[] {"s","city", "'%"+ city + "%'"});
            pQsm.put("city", new String[] {"s", "'%"+ city + "%',"});
            ct = true;

        }
        if (!jComboBox1.getSelectedItem().toString().equals("None")){
            String state = jComboBox1.getSelectedItem().toString();
            pQueries.add(new String[] {"s","state", "'%"+ state + "%'"});
            pQsm.put("state", new String[] {"s", "'%"+ state + "%',"});
            st = true;

        }
        if (!jTextField8.getText().equals("")){
            String zipcode = jTextField8.getText();
            pQueries.add(new String[] {"i","zipcode", zipcode});
            pQsm.put("zipcode", new String[] {"s", zipcode + ","});
            zt = true;

        }
        if (!jTextField4.getText().equals("")){
            String dob = jTextField4.getText();
            pQueries.add(new String[] {"i", dob});
            pQsm.put("dob", new String[] {"i", dob});
            Qstring += " dob = "+ dob + ",";
            dbt = true;

        }
        if (!jTextField9.getText().equals("")){
            String homephone = jTextField9.getText();
            pQueries.add(new String[] {"i", homephone});
            pQsm.put("homephone", new String[] {"i", homephone});
            Qstring += " homephone = " + homephone + ",";
            dbt = true;

        }
        if (!jTextField10.getText().equals("")){
            String email = jTextField10.getText();
            pQueries.add(new String[] {"i", email});
            pQsm.put("email", new String[] {"i", email});
            Qstring += " email = '" + email + "'";
            dbt = true;
        }
        if (Qstring.charAt(Qstring.length()-1)==','){
            Qstring = removelast(Qstring);
        }
        boolean invalidaddr = false;
        boolean noinput = false;
        if (pQsm.size()==1){
            JOptionPane.showMessageDialog(new JFrame(), "Need at least more than one entry!");
            noinput = true;
        }
        if (!(!a1t&&!ct&&!zt)){
            if(!(a1t&&ct&&st&&zt)){
                JOptionPane.showMessageDialog(new JFrame(), "Address, City, State, and Zip need to be filled out!");
                invalidaddr = true;
            }
            else{
                Qstring += " address1 LIKE " + pQsm.get("address1")[1];
                Qstring += " city LIKE " + pQsm.get("city")[1];
                Qstring += " state LIKE " + pQsm.get("state")[1];
                Qstring += " zipcode = " + pQsm.get("zipcode")[1];
            }
        }
        if (!(invalidaddr || noinput)){
            Qstring += ";";
            CardLayout cl = (CardLayout)(Cards.getLayout());
            GeneralQuery gprq = new GeneralQuery(Qstring);
            gprq.runQuery();
            
            prlookresults.setTable(gprq.getResultSet());
            cl.show(Cards, RESULTPANEL);
            
        }

    }//GEN-LAST:event_jButton1MouseReleased

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed
    
    public void addCards(JPanel cards){
        Cards = cards;
    }
    
    public void addPResults(PayrollNameSSNLookupResults prlook){
        prlookresults = prlook;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField11;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    // End of variables declaration//GEN-END:variables
}
