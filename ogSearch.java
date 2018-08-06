package p1;

import java.awt.Color;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class ogSearch extends javax.swing.JFrame {
    public ogSearch() {
        initComponents();
        tab1.getColumnModel().getColumn(0).setMaxWidth(50);
        Color c=new Color(0,102,153);
        this.getContentPane().setBackground(c);
        btnhide.setVisible(false);
        btnhide.doClick();
        cmb1.setSelectedIndex(0);
        l2.setVisible(false);
        l3.setVisible(false);
        l4.setVisible(false);
        t2.setVisible(false);
        t3.setVisible(false);
        t4.setVisible(false);
        b2.setVisible(false);
        b3.setVisible(false); 
        b4.setVisible(false);
    }
    
    String sql;	   
    static Connection conn = null;
    Statement stmt = null;
    
    @SuppressWarnings("unchecked")

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tab1 = new javax.swing.JTable();
        t2 = new javax.swing.JComboBox();
        b1 = new javax.swing.JButton();
        l1 = new javax.swing.JLabel();
        btnhide = new javax.swing.JButton();
        t3 = new javax.swing.JComboBox();
        cmb1 = new javax.swing.JComboBox();
        b3 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        l2 = new javax.swing.JLabel();
        l3 = new javax.swing.JLabel();
        d1 = new com.toedter.calendar.JDateChooser();
        b2 = new javax.swing.JButton();
        b4 = new javax.swing.JButton();
        l4 = new javax.swing.JLabel();
        t4 = new javax.swing.JComboBox();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        tab1.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        tab1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "SNo.", "Letter No.", "Subject", "Recvd. From", "Group", "Approved ", "WM Remarks", "Cmdt Remarks", "Scanned Image"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tab1.setToolTipText("");
        tab1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tab1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tab1);

        t2.setEditable(true);

        b1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        b1.setText("Search");
        b1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b1ActionPerformed(evt);
            }
        });

        l1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        l1.setForeground(new java.awt.Color(255, 255, 255));
        l1.setText("Date");

        btnhide.setText("hide");
        btnhide.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnhideActionPerformed(evt);
            }
        });

        t3.setEditable(true);

        cmb1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "DATE", "RECV FROM", "LETTER NO.", "GROUP", "ALL" }));
        cmb1.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmb1ItemStateChanged(evt);
            }
        });
        cmb1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmb1ActionPerformed(evt);
            }
        });

        b3.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        b3.setText("Search");
        b3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b3ActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Selection Criterion");

        l2.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        l2.setForeground(new java.awt.Color(255, 255, 255));
        l2.setText("Recv. from");

        l3.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        l3.setForeground(new java.awt.Color(255, 255, 255));
        l3.setText("Letterno");

        d1.setDateFormatString("yyyy-MM-dd");
        d1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        d1.setMaximumSize(new java.awt.Dimension(2147483000, 2147483647));

        b2.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        b2.setText("Search");
        b2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b2ActionPerformed(evt);
            }
        });

        b4.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        b4.setText("Search");
        b4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b4ActionPerformed(evt);
            }
        });

        l4.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        l4.setForeground(new java.awt.Color(255, 255, 255));
        l4.setText("Group");

        t4.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "MCO", "GEG", "TT CELL", "QA", "WSG" }));

        jButton3.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButton3.setText("BACK");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(177, 177, 177)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cmb1, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(l3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(t3, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(l1, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(8, 8, 8))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(l2, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(t2, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(l4, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(d1, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(t4, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(68, 68, 68)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(b3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnhide)
                        .addGap(43, 43, 43)
                        .addComponent(b1, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(b2, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(b4, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(94, 94, 94))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jButton3)
                        .addContainerGap())))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(b2)
                            .addComponent(b1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(b3)
                            .addComponent(b4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnhide)
                        .addGap(9, 9, 9)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(l1)
                                        .addComponent(d1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(l2)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(l4)
                                            .addComponent(t4, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(t3, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(l3))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(t2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cmb1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 596, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void tab1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tab1MouseClicked
        int row=tab1.rowAtPoint(evt.getPoint());
     int x=2;
      int col=tab1.columnAtPoint(evt.getPoint());
        if(col==8)
        { 
            String s=(String)tab1.getValueAt(row,8);
            if(s.equals("See Image")){
            try {
                String lno=(String)tab1.getValueAt(row,1);
                scan ob1 =new scan(lno,x);
                ob1.setVisible(true);
            } catch (SQLException | ClassNotFoundException | IOException ex) {
                Logger.getLogger(ogSearch.class.getName()).log(Level.SEVERE, null, ex);
            }
            }
            else{
                JOptionPane.showMessageDialog(this,"Oops!! Nothing to show");
            }
        }
        else{
        String lno=(String)tab1.getValueAt(row,1);
       ogAdd ob=new ogAdd(lno);
       ob.setVisible(true);
       this.setVisible(false);
        }
       
    }//GEN-LAST:event_tab1MouseClicked

    private void b1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b1ActionPerformed
        DefaultTableModel dm=(DefaultTableModel)tab1.getModel();
        dm.setRowCount(0);
        tab1.setModel(dm);
        String date=(((JTextField)d1.getDateEditor().getUiComponent()).getText());
        try
        {
            String JDBC_DRIVER = "com.mysql.jdbc.Driver";
            String DB_URL = "jdbc:mysql://localhost/dak";
            String USER = "root";
            String PASS = "root";
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection(DB_URL,USER,PASS);
            stmt=conn.createStatement();
            sql="select * from other where date = '"+date+"' and c='N';";
            ResultSet rs=stmt.executeQuery(sql);
            int i=0;
            while(rs.next()){
                DefaultTableModel tm=(DefaultTableModel)tab1.getModel();
                if(rs.getBlob("image")!=null){
                Object[] row={++i,rs.getString("letterno"),rs.getString("subject"),rs.getString("recv_from"),rs.getString("grp"),rs.getString("approved_by"),rs.getString("wm_rem"),rs.getString("cmdt_rem"),"See Image"};
                tm.addRow(row);
                }
                else{
                Object[] row={++i,rs.getString("letterno"),rs.getString("subject"),rs.getString("recv_from"),rs.getString("grp"),rs.getString("approved_by"),rs.getString("wm_rem"),rs.getString("cmdt_rem"),"No Image"};
                tm.addRow(row);
                }
            }

        }
        catch(ClassNotFoundException | SQLException e){
            JOptionPane.showMessageDialog(this,e.getMessage());
        }
    }//GEN-LAST:event_b1ActionPerformed

    private void btnhideActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnhideActionPerformed
        try
        {
            String JDBC_DRIVER = "com.mysql.jdbc.Driver";
            String DB_URL = "jdbc:mysql://localhost/dak";
            String USER = "root";
            String PASS = "root";
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection(DB_URL,USER,PASS);
            stmt=conn.createStatement();
            sql="select distinct(recv_from) from other where c='N';";
            ResultSet rs=stmt.executeQuery(sql);
            while(rs.next()){
                t2.addItem(rs.getString("recv_from"));
            }
            String sql1="select letterno from other where c='N';";
            ResultSet rs1=stmt.executeQuery(sql1);
            while(rs1.next()){
                t3.addItem(rs1.getString("letterno"));
            }

        }
        catch(ClassNotFoundException | SQLException e){
            JOptionPane.showMessageDialog(this,e.getMessage());
        }
    }//GEN-LAST:event_btnhideActionPerformed

    private void cmb1ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmb1ItemStateChanged

    }//GEN-LAST:event_cmb1ItemStateChanged

    private void cmb1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmb1ActionPerformed
        int i=cmb1.getSelectedIndex();
        if(i==0){
            DefaultTableModel dm=(DefaultTableModel)tab1.getModel();
            dm.setRowCount(0);
            tab1.setModel(dm);
            l1.setVisible(true);
            d1.setVisible(true);
            b1.setVisible(true);
            l2.setVisible(false);
            t2.setVisible(false);
            b2.setVisible(false);
            l3.setVisible(false);
            t3.setVisible(false);
            b3.setVisible(false);
            l4.setVisible(false);
            t4.setVisible(false);
            b4.setVisible(false);
        }
        if(i==1){
            DefaultTableModel dm=(DefaultTableModel)tab1.getModel();
            dm.setRowCount(0);
            tab1.setModel(dm);
            l1.setVisible(false);
            d1.setVisible(false);
            b1.setVisible(false);
            l2.setVisible(true);
            t2.setVisible(true);
            b2.setVisible(true);
            l3.setVisible(false);
            t3.setVisible(false);
            b3.setVisible(false);
            l4.setVisible(false);
            t4.setVisible(false);
            b4.setVisible(false);
        }
        if(i==2){
            DefaultTableModel dm=(DefaultTableModel)tab1.getModel();
            dm.setRowCount(0);
            tab1.setModel(dm);
            l1.setVisible(false);
            d1.setVisible(false);
            b1.setVisible(false);
            l2.setVisible(false);
            t2.setVisible(false);
            b2.setVisible(false);
            l3.setVisible(true);
            t3.setVisible(true);
            b3.setVisible(true);
            l4.setVisible(false);
            t4.setVisible(false);
            b4.setVisible(false);
        }
        if(i==3){
            DefaultTableModel dm=(DefaultTableModel)tab1.getModel();
            dm.setRowCount(0);
            tab1.setModel(dm);
            l1.setVisible(false);
            d1.setVisible(false);
            b1.setVisible(false);
            l2.setVisible(false);
            t2.setVisible(false);
            b2.setVisible(false);
            l3.setVisible(false);
            t3.setVisible(false);
            b3.setVisible(false);
            l4.setVisible(true);
            t4.setVisible(true);
            b4.setVisible(true);
        }
        if(i==4){
        DefaultTableModel dm=(DefaultTableModel)tab1.getModel();
        dm.setRowCount(0);
        tab1.setModel(dm);
        l1.setVisible(false);
            d1.setVisible(false);
            b1.setVisible(false);
            l2.setVisible(false);
            t2.setVisible(false);
            b2.setVisible(false);
            l3.setVisible(false);
            t3.setVisible(false);
            b3.setVisible(false);
            l4.setVisible(false);
            t4.setVisible(false);
            b4.setVisible(false);
        try
        {
            String JDBC_DRIVER = "com.mysql.jdbc.Driver";
            String DB_URL = "jdbc:mysql://localhost/dak";
            String USER = "root";
            String PASS = "root";
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection(DB_URL,USER,PASS);
            stmt=conn.createStatement();
            sql="select * from other where c='N';";
            ResultSet rs=stmt.executeQuery(sql);
            int k=0;
            while(rs.next()){
                DefaultTableModel tm=(DefaultTableModel)tab1.getModel();
                if(rs.getBlob("image")!=null){
                Object[] row={++k,rs.getString("letterno"),rs.getString("subject"),rs.getString("recv_from"),rs.getString("grp"),rs.getString("approved_by"),rs.getString("wm_rem"),rs.getString("cmdt_rem"),"See Image"};
                tm.addRow(row);
                }
                else{
                Object[] row={++k,rs.getString("letterno"),rs.getString("subject"),rs.getString("recv_from"),rs.getString("grp"),rs.getString("approved_by"),rs.getString("wm_rem"),rs.getString("cmdt_rem"),"No Image"};
                tm.addRow(row);
                }
            }

        }
        catch(ClassNotFoundException | SQLException e){
            JOptionPane.showMessageDialog(this,e.getMessage());
        }  
        }
    }//GEN-LAST:event_cmb1ActionPerformed

    private void b3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b3ActionPerformed
        DefaultTableModel dm=(DefaultTableModel)tab1.getModel();
        dm.setRowCount(0);
        tab1.setModel(dm);
        String lno=(String)t3.getSelectedItem();
        try
        {
            String JDBC_DRIVER = "com.mysql.jdbc.Driver";
            String DB_URL = "jdbc:mysql://localhost/dak";
            String USER = "root";
            String PASS = "root";
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection(DB_URL,USER,PASS);
            stmt=conn.createStatement();
            sql="select * from other where letterno = '"+lno+"' and c='N';";
            ResultSet rs=stmt.executeQuery(sql);
            int i=0;
            while(rs.next()){
                DefaultTableModel tm=(DefaultTableModel)tab1.getModel();
                if(rs.getBlob("image")!=null){
                Object[] row={++i,rs.getString("letterno"),rs.getString("subject"),rs.getString("recv_from"),rs.getString("grp"),rs.getString("approved_by"),rs.getString("wm_rem"),rs.getString("cmdt_rem"),"See Image"};
                tm.addRow(row);
                }
                else{
                Object[] row={++i,rs.getString("letterno"),rs.getString("subject"),rs.getString("recv_from"),rs.getString("grp"),rs.getString("approved_by"),rs.getString("wm_rem"),rs.getString("cmdt_rem"),"No Image"};
                tm.addRow(row);
                }
            }

        }
        catch(ClassNotFoundException | SQLException e){
            JOptionPane.showMessageDialog(this,e.getMessage());
        }
    }//GEN-LAST:event_b3ActionPerformed

    private void b2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b2ActionPerformed
        DefaultTableModel dm=(DefaultTableModel)tab1.getModel();
        dm.setRowCount(0);
        tab1.setModel(dm);
        String recv=(String)t2.getSelectedItem();
        try
        {
            String JDBC_DRIVER = "com.mysql.jdbc.Driver";
            String DB_URL = "jdbc:mysql://localhost/dak";
            String USER = "root";
            String PASS = "root";
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection(DB_URL,USER,PASS);
            stmt=conn.createStatement();
            sql="select * from other where recv_from = '"+recv+"' and c='N';";
            ResultSet rs=stmt.executeQuery(sql);
            int i=0;
            while(rs.next()){
                DefaultTableModel tm=(DefaultTableModel)tab1.getModel();
                if(rs.getBlob("image")!=null){
                Object[] row={++i,rs.getString("letterno"),rs.getString("subject"),rs.getString("recv_from"),rs.getString("grp"),rs.getString("approved_by"),rs.getString("wm_rem"),rs.getString("cmdt_rem"),"See Image"};
                tm.addRow(row);
                }
                else{
                Object[] row={++i,rs.getString("letterno"),rs.getString("subject"),rs.getString("recv_from"),rs.getString("grp"),rs.getString("approved_by"),rs.getString("wm_rem"),rs.getString("cmdt_rem"),"No Image"};
                tm.addRow(row);
                }
            }

        }
        catch(ClassNotFoundException | SQLException e){
            JOptionPane.showMessageDialog(this,e.getMessage());
        }

    }//GEN-LAST:event_b2ActionPerformed

    private void b4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b4ActionPerformed
        DefaultTableModel dm=(DefaultTableModel)tab1.getModel();
        dm.setRowCount(0);
        tab1.setModel(dm);
        String grp=(String)t4.getSelectedItem();
        try
        {
            String JDBC_DRIVER = "com.mysql.jdbc.Driver";
            String DB_URL = "jdbc:mysql://localhost/dak";
            String USER = "root";
            String PASS = "root";
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection(DB_URL,USER,PASS);
            stmt=conn.createStatement();
            sql="select * from other where grp = '"+grp+"' and c='N';";
            ResultSet rs=stmt.executeQuery(sql);
            int i=0;
            while(rs.next()){
                DefaultTableModel tm=(DefaultTableModel)tab1.getModel();
                if(rs.getBlob("image")!=null){
                Object[] row={++i,rs.getString("letterno"),rs.getString("subject"),rs.getString("recv_from"),rs.getString("grp"),rs.getString("approved_by"),rs.getString("wm_rem"),rs.getString("cmdt_rem"),"See Image"};
                tm.addRow(row);
                }
                else{
                Object[] row={++i,rs.getString("letterno"),rs.getString("subject"),rs.getString("recv_from"),rs.getString("grp"),rs.getString("approved_by"),rs.getString("wm_rem"),rs.getString("cmdt_rem"),"No Image"};
                tm.addRow(row);
                }
            }

        }
        catch(ClassNotFoundException | SQLException e){
            JOptionPane.showMessageDialog(this,e.getMessage());
        }  
    }//GEN-LAST:event_b4ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed

        this.dispose();
    }//GEN-LAST:event_jButton3ActionPerformed

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
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ogSearch.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new ogSearch().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton b1;
    private javax.swing.JButton b2;
    private javax.swing.JButton b3;
    private javax.swing.JButton b4;
    private javax.swing.JButton btnhide;
    private javax.swing.JComboBox cmb1;
    private com.toedter.calendar.JDateChooser d1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel l1;
    private javax.swing.JLabel l2;
    private javax.swing.JLabel l3;
    private javax.swing.JLabel l4;
    private javax.swing.JComboBox t2;
    private javax.swing.JComboBox t3;
    private javax.swing.JComboBox t4;
    private javax.swing.JTable tab1;
    // End of variables declaration//GEN-END:variables
}
