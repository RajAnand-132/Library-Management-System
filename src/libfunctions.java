
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class libfunctions extends javax.swing.JFrame {

    public libfunctions() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        menu = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel24 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));
        jPanel2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 102), 9, true));
        jPanel2.setForeground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(null);

        jButton1.setBackground(new java.awt.Color(204, 204, 255));
        jButton1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 0, 0));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/exit.png"))); // NOI18N
        jButton1.setText("LogOut");
        jButton1.setBorder(javax.swing.BorderFactory.createMatteBorder(5, 5, 5, 5, new java.awt.Color(0, 102, 102)));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1);
        jButton1.setBounds(1240, 680, 210, 60);

        jLabel1.setFont(new java.awt.Font("Bahnschrift", 1, 60)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 0, 0));
        jLabel1.setText("!!!!! LIBRARY  FUNCTIONS !!!!!");
        jPanel2.add(jLabel1);
        jLabel1.setBounds(290, 10, 830, 90);

        jLabel11.setForeground(new java.awt.Color(255, 255, 51));
        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lib images/about.png"))); // NOI18N
        jLabel11.setToolTipText("ABOUT");
        jLabel11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel11MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel11);
        jLabel11.setBounds(1280, 10, 128, 128);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lib images/books.png"))); // NOI18N
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel3);
        jLabel3.setBounds(60, 110, 130, 140);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lib images/issubook.png"))); // NOI18N
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel2);
        jLabel2.setBounds(70, 290, 130, 130);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lib images/returnbook.png"))); // NOI18N
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel4);
        jLabel4.setBounds(60, 490, 130, 130);

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lib images/addbooks.png"))); // NOI18N
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel5);
        jLabel5.setBounds(220, 110, 140, 130);

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lib images/addstd.png"))); // NOI18N
        jLabel12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel12MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel12);
        jLabel12.setBounds(230, 290, 130, 130);

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lib images/Update-icon.png"))); // NOI18N
        jLabel13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel13MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel13);
        jLabel13.setBounds(230, 490, 130, 130);
        jPanel2.add(jSeparator1);
        jSeparator1.setBounds(30, 670, 1800, 20);

        menu.setFont(new java.awt.Font("Berlin Sans FB Demi", 1, 24)); // NOI18N
        menu.setForeground(new java.awt.Color(255, 255, 255));
        menu.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        menu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gifs/fall.gif"))); // NOI18N
        menu.setText("Welcome to the home page of library system");
        jPanel2.add(menu);
        menu.setBounds(10, 670, 1020, 70);

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 204, 51));
        jLabel7.setText("UPDATE");
        jPanel2.add(jLabel7);
        jLabel7.setBounds(260, 620, 100, 30);

        jLabel16.setFont(new java.awt.Font("Times New Roman", 1, 19)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 204, 51));
        jLabel16.setText("RETURN BOOK ");
        jPanel2.add(jLabel16);
        jLabel16.setBounds(60, 620, 150, 40);

        jLabel17.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 204, 51));
        jLabel17.setText("BOOK DATA");
        jPanel2.add(jLabel17);
        jLabel17.setBounds(70, 260, 130, 30);

        jLabel18.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 204, 51));
        jLabel18.setText("ADD STUDENT");
        jPanel2.add(jLabel18);
        jLabel18.setBounds(220, 440, 150, 30);

        jLabel19.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 204, 51));
        jLabel19.setText("ISSUE BOOK ");
        jPanel2.add(jLabel19);
        jLabel19.setBounds(60, 440, 130, 30);

        jLabel20.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 204, 51));
        jLabel20.setText("ADD BOOK ");
        jPanel2.add(jLabel20);
        jLabel20.setBounds(230, 260, 120, 30);

        jLabel21.setBackground(new java.awt.Color(204, 204, 255));
        jLabel21.setFont(new java.awt.Font("Algerian", 1, 14)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(204, 255, 0));
        jLabel21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lib images/minimize-icon (1).png"))); // NOI18N
        jLabel21.setToolTipText("Minimize");
        jLabel21.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel21MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel21);
        jLabel21.setBounds(1390, 10, 72, 70);
        jPanel2.add(jSeparator2);
        jSeparator2.setBounds(40, 96, 1780, 20);

        jLabel24.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gifs/f621b606f99a3abec1c4f07e2532aba0.gif"))); // NOI18N
        jPanel2.add(jLabel24);
        jLabel24.setBounds(920, 390, 530, 280);

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gifs/fall.gif"))); // NOI18N
        jPanel2.add(jLabel15);
        jLabel15.setBounds(530, 670, 500, 70);

        jLabel23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gifs/resized.gif"))); // NOI18N
        jPanel2.add(jLabel23);
        jLabel23.setBounds(450, 10, 460, 90);

        jLabel25.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gifs/resized.gif"))); // NOI18N
        jPanel2.add(jLabel25);
        jLabel25.setBounds(890, 10, 460, 90);

        jLabel26.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gifs/resized.gif"))); // NOI18N
        jPanel2.add(jLabel26);
        jLabel26.setBounds(1280, 10, 170, 90);

        jLabel27.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gifs/resized.gif"))); // NOI18N
        jPanel2.add(jLabel27);
        jLabel27.setBounds(10, 10, 460, 90);

        jLabel28.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gifs/fall.gif"))); // NOI18N
        jPanel2.add(jLabel28);
        jLabel28.setBounds(1080, 670, 370, 70);

        jLabel29.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gifs/fall.gif"))); // NOI18N
        jPanel2.add(jLabel29);
        jLabel29.setBounds(1010, 670, 440, 70);

        jLabel30.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gifs/f621b606f99a3abec1c4f07e2532aba0.gif"))); // NOI18N
        jPanel2.add(jLabel30);
        jLabel30.setBounds(380, 390, 540, 280);

        jLabel31.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gifs/f621b606f99a3abec1c4f07e2532aba0.gif"))); // NOI18N
        jPanel2.add(jLabel31);
        jLabel31.setBounds(380, 110, 540, 280);

        jLabel32.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gifs/f621b606f99a3abec1c4f07e2532aba0.gif"))); // NOI18N
        jPanel2.add(jLabel32);
        jLabel32.setBounds(920, 110, 530, 280);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 1463, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 748, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        frame = new JFrame();
        if (JOptionPane.showConfirmDialog(frame, "Confirm if you want to logout", "Print System",
                JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION)
            System.exit(0);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jLabel11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel11MouseClicked
        //new about().setVisible(true);
        frame=new JFrame();
        JOptionPane.showMessageDialog(frame, "The Project Report on Library Management System contains Abstract, Documentations, and Source Codes needed in developing its software. Additionally, it reveals the important diagrams that will build the Library Management System’s Structures and behavioral aspects. These guidelines will serve as the basis in designing and creating the project.\n" +
"\n" +
"The project report presents the basic details of Library Management System from its abstract, up to its documentation and source codes. It also adds the blueprints and structure designs which were applied in developing the system. It includes the Project compositions, abstract, modules, proposal and many more.\n" +
"\n" +
"Each of the topic related to the Project Report for Library Management System were emphasized thoroughly. It not only ensures the project development procedure but also secure that you understand them. First to discuss is the Development Composition.\n" +
"\n" +
"Project Report for Library Management System: Development Composition\n" +
"Project Name:	Library Management System Project Report\n" +
"Abstract:	The System greatly lowers manual effort and allows for a seamless flow of library activities by eliminating the possibility of errors when doing its activities.\n" +
"Modules:	• Book Information Recording\n" +
"• Administrator Login\n" +
"• Users/Borrowers’ Login\n" +
"• Book Monitoring and Updates\n" +
"• View and Check Information\n" +
"• Borrowing Information\n" +
"• Borrowing Records\n" +
"Documentation Diagrams (UML):	Class Diagram, Sequence Diagram, Use Case Diagram, Data Flow Diagram, ER Diagram, Activity Diagram"); 
               
    }//GEN-LAST:event_jLabel11MouseClicked

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        try {
            new bookdata().setVisible(true);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(libfunctions.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jLabel3MouseClicked

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked
        new addbook().setVisible(true);
    }//GEN-LAST:event_jLabel5MouseClicked

    private void jLabel12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel12MouseClicked
        new addstd().setVisible(true);
    }//GEN-LAST:event_jLabel12MouseClicked

    private void jLabel21MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel21MouseClicked
        this.setState(JFrame.ICONIFIED);
    }//GEN-LAST:event_jLabel21MouseClicked

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        new issuebook().setVisible(true);
    }//GEN-LAST:event_jLabel2MouseClicked

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
        new returnbook().setVisible(true);
    }//GEN-LAST:event_jLabel4MouseClicked

    private void jLabel13MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel13MouseClicked
        new update().setVisible(true);
    }//GEN-LAST:event_jLabel13MouseClicked

    private JFrame frame;

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(libfunctions.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new libfunctions().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel menu;
    // End of variables declaration//GEN-END:variables
}
