/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.text.Position;


/**
 *
 * @author Eakub
 */
public class studentinfo extends javax.swing.JFrame {

    /**
     * Creates new form studentinfo
     */
    public studentinfo() {
        initComponents();
        show_user();
    }
    public ArrayList<users> userList()
    {
        ArrayList<users> usersList=new ArrayList<>();
        try{
        //Class.forName("com.mysql.jdbc.Driver");
            Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/udms","root","1801029");
     
            String query1="select *from student1 order by ID asc";
            Statement st=conn.createStatement();
            ResultSet rs=st.executeQuery(query1);
            users User1;
            while(rs.next()){
              User1=new users(rs.getInt("ID"),rs.getString("Name"),rs.getString("DEPT"),rs.getInt("TOT_CRED"));
               usersList.add(User1);
            }
          
            
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        return usersList;
    }
public void show_user()
    {
        ArrayList<users> list=userList();
        DefaultTableModel model=(DefaultTableModel)show.getModel();
        Object []row=new Object[5];
        for (int i=0;i<list.size();i++) {
            row[0] = list.get(i).getid();
            row[1] = list.get(i).getname();
            row[2] = list.get(i).getdept();
            row[3] = list.get(i).getcredit();
            model.addRow(row);
        }
        
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        search = new javax.swing.JTextField();
        jlabel1 = new javax.swing.JLabel();
        id = new javax.swing.JTextField();
        Jlabel2 = new javax.swing.JLabel();
        name = new javax.swing.JTextField();
        Jlabel3 = new javax.swing.JLabel();
        dept = new javax.swing.JComboBox();
        Jlabel4 = new javax.swing.JLabel();
        credit = new javax.swing.JTextField();
        insert = new javax.swing.JButton();
        update = new javax.swing.JButton();
        reset = new javax.swing.JButton();
        delete = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        show = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 204, 204));

        jPanel1.setBackground(new java.awt.Color(0, 204, 204));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Search By ID");

        search.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchActionPerformed(evt);
            }
        });
        search.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                searchKeyReleased(evt);
            }
        });

        jlabel1.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jlabel1.setText("ID");

        id.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idActionPerformed(evt);
            }
        });

        Jlabel2.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        Jlabel2.setText("Name");

        name.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameActionPerformed(evt);
            }
        });

        Jlabel3.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        Jlabel3.setText("Dept");

        dept.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        dept.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "CSTE", "ICE", "ECO", "BANGLA", "BBA", "PHARMACY", " " }));

        Jlabel4.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        Jlabel4.setText("Credit");

        credit.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N

        insert.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        insert.setText("Insert");
        insert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                insertActionPerformed(evt);
            }
        });

        update.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        update.setText("Update");
        update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateActionPerformed(evt);
            }
        });

        reset.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        reset.setText("Reset");
        reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetActionPerformed(evt);
            }
        });

        delete.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        delete.setText("Delete");
        delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteActionPerformed(evt);
            }
        });

        show.setBackground(new java.awt.Color(204, 204, 204));
        show.setBorder(new javax.swing.border.MatteBorder(null));
        show.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        show.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Name", "Dept", "Credit"
            }
        ));
        show.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                showMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(show);

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jButton1.setText("To Search Bar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("STUDENT TABLE");

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jButton2.setText("GO TO MENU");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(49, 49, 49)
                .addComponent(search, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(55, 55, 55)
                .addComponent(jButton2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(58, 58, 58))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Jlabel3)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(insert)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(credit, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(id, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(dept, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(delete)
                                    .addComponent(update)))))
                    .addComponent(Jlabel2)
                    .addComponent(jlabel1)
                    .addComponent(Jlabel4)
                    .addComponent(reset))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 71, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(311, 311, 311)
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jLabel2)
                .addGap(40, 40, 40)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jlabel1)
                            .addComponent(id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(34, 34, 34)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Jlabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(name, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(40, 40, 40)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Jlabel3)
                            .addComponent(dept, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(38, 38, 38)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Jlabel4)
                            .addComponent(credit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(40, 40, 40)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(insert)
                            .addComponent(update))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(reset)
                            .addComponent(delete))
                        .addGap(47, 47, 47)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(search, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addGap(41, 41, 41))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addGap(49, 49, 49)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton1)
                            .addComponent(jButton2))
                        .addContainerGap())))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void idActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idActionPerformed

    private void nameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nameActionPerformed


    private void insertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_insertActionPerformed
      try{
        //Class.forName("com.mysql.jdbc.Driver");
            Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/udms","root","1801029");
     
            System.out.println("Connection loaded");
            Statement stmt=conn.createStatement();
            String query="insert into student1 (ID,Name,Dept,Tot_cred)values('"+id.getText()+"','"+name.getText()+"',"
                    + "'"+dept.getSelectedItem()+"','"+credit.getText()+"')";
            PreparedStatement pst=conn.prepareStatement(query);
            id.setText(null);
            name.setText(null);
            dept.setSelectedItem(0);
            credit.setText(null);
            pst.executeUpdate();
            DefaultTableModel model=(DefaultTableModel)show.getModel();
      model.setRowCount(0);
      show_user();
            JOptionPane.showMessageDialog(null, "Data inserted!"); 
      }
     
      catch(SQLException e)
      {  
           System.out.println(e);
           if(e.getMessage().contains("Duplicate"))
          {
              
            JOptionPane.showMessageDialog(null, "Data is not inserted for Duplicate ID"); 
          }
           
      }
    }//GEN-LAST:event_insertActionPerformed

    private void updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateActionPerformed
       try{
        
       //Class.forName("com.mysql.jdbc.Driver");
            Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/udms","root","1801029");
           
      //Connection conn=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1522:orcl", "project","project");
            System.out.println("Connection loaded");
   String query="Update  student1 set Name='"+name.getText()+"',Dept='"+dept.getSelectedItem()+"',Tot_cred='"+credit.getText()+"'"
               + " where ID='"+id.getText()+"'";
        PreparedStatement pst=conn.prepareStatement(query);
         pst.executeUpdate();  
        DefaultTableModel model1=(DefaultTableModel)show.getModel();
      model1.setRowCount(0);
      show_user();
      JOptionPane.showMessageDialog(null, "Data Updated!");
       }
       catch(SQLException e)
       {
             System.out.println(e);
       }
    }//GEN-LAST:event_updateActionPerformed

    private void deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteActionPerformed
       try{
        //Class.forName("com.mysql.jdbc.Driver");
            Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/udms","root","1801029");
       
            System.out.println("Connection loaded");
             //int row=show.getSelectedRow();
       //TableModel model=show.getModel();
    // String value=model.getValueAt(row, 0).toString();
     String query="delete from student1 where id='"+id.getText()+"'";
      PreparedStatement pst=conn.prepareStatement(query);
      pst.executeUpdate();
      DefaultTableModel model1=(DefaultTableModel)show.getModel();
      model1.setRowCount(0);
      show_user();
      JOptionPane.showMessageDialog(null, "Data Deleted!");
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }//GEN-LAST:event_deleteActionPerformed

    private void resetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetActionPerformed
        id.setText(null);
        name.setText(null);
        dept.setSelectedIndex(0);
        credit.setText(null);
        
    }//GEN-LAST:event_resetActionPerformed

    private void showMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_showMouseClicked
        int i=show.getSelectedRow();
     TableModel model=show.getModel();
     id.setText(model.getValueAt(i, 0).toString());
     name.setText(model.getValueAt(i, 1).toString());
     String dept1=model.getValueAt(i, 2).toString();
     switch(dept1)
     {
         case "CSTE":
             dept.setSelectedIndex(0);
             break;
          case "ICE":
             dept.setSelectedIndex(1);
             break;
           case "ECO":
             dept.setSelectedIndex(2);
             break;
               case "BANGLA":
             dept.setSelectedIndex(3);
             break;
              case "BBA":
             dept.setSelectedIndex(4);
             break;
                   case "PHARMACY":
             dept.setSelectedIndex(5);
             break;
             
     }
    credit.setText(model.getValueAt(i, 3).toString());
     
   
    }//GEN-LAST:event_showMouseClicked

    private void searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_searchActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
         Search frame2 = new Search();
       frame2.setVisible(true);
       dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void searchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searchKeyReleased
       try{
        //Class.forName("com.mysql.jdbc.Driver");
            Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/udms","root","1801029");
       
            System.out.println("Connection loaded");
             
     String query="select * from student1 where ID=?";
      PreparedStatement pst=conn.prepareStatement(query);
      
     pst.setString(1, search.getText());
     ResultSet rs= pst.executeQuery();
      if(rs.next()){
          String setid=rs.getString("id");
     id.setText(setid);
     String setname=rs.getString("Name");
     name.setText(setname);
       String dept1=rs.getString("Dept");
       switch(dept1)
     {
         case "CSTE":
             dept.setSelectedIndex(0);
             break;
          case "ICE":
             dept.setSelectedIndex(1);
             break;
           case "ECO":
             dept.setSelectedIndex(2);
             break;
               case "BANGLA":
             dept.setSelectedIndex(3);
             break;
             
             case "BBA":
             dept.setSelectedIndex(4);
             break;
                   case "PHARMACY":
             dept.setSelectedIndex(5);
             break;
     }
     
      String setcredit=rs.getString("Tot_cred");
     credit.setText(setcredit);
    
      }
      
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }//GEN-LAST:event_searchKeyReleased

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
      setVisible(false); 
        Aframe frame2 = new Aframe();
       frame2.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    /**
     * @param args the command line arguments
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
            java.util.logging.Logger.getLogger(studentinfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(studentinfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(studentinfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(studentinfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new studentinfo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Jlabel2;
    private javax.swing.JLabel Jlabel3;
    private javax.swing.JLabel Jlabel4;
    private javax.swing.JTextField credit;
    private javax.swing.JButton delete;
    private javax.swing.JComboBox dept;
    private javax.swing.JTextField id;
    private javax.swing.JButton insert;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel jlabel1;
    private javax.swing.JTextField name;
    private javax.swing.JButton reset;
    private javax.swing.JTextField search;
    private javax.swing.JTable show;
    private javax.swing.JButton update;
    // End of variables declaration//GEN-END:variables
}
