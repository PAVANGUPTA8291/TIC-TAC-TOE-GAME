
import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


public class four extends javax.swing.JFrame {
    
       private String startGame = "X";
            private int xCount = 0;
            private int oCount = 0;

    /**
     * Creates new form four
     */
    public four() {
        initComponents();
    }
    
    
    private void choose_a_Player()
    {
    if(startGame.equalsIgnoreCase("X"))
    {
        startGame = "O";
    }
    else
    {
    startGame = "X";
    }
    }
    
    private void WinningGame()
    {
    String b1 = txtbtn1.getText();
    String b2 = txtbtn2.getText();
    String b3 = txtbtn3.getText();
    String b4 = txtbtn4.getText();
    
    String b5 = txtbtn5.getText();
    String b6 = txtbtn6.getText();
    String b7 = txtbtn7.getText();
    String b8 = txtbtn8.getText();
    
    String b9 = txtbtn9.getText();
    String b10 = txtbtn10.getText();
    String b11 = txtbtn11.getText();
    String b12 = txtbtn12.getText();
    
    String b13 = txtbtn13.getText();
    String b14 = txtbtn14.getText();
    String b15 = txtbtn15.getText();
    String b16 = txtbtn16.getText();
    
    //for player X
    
    if(b1 == ("X") && b2 == ("X") && b3 == ("X") && b4 == ("X"))
{
JOptionPane.showMessageDialog(this,"player X wins","TIC TAC TOE",JOptionPane.INFORMATION_MESSAGE);
xCount++;

txtbtn1.setBackground(Color.ORANGE);
txtbtn2.setBackground(Color.ORANGE);
txtbtn3.setBackground(Color.ORANGE);
txtbtn4.setBackground(Color.ORANGE);
}
    if(b5 == ("X") && b6 == ("X") && b7 == ("X") && b8 == ("X"))
{
JOptionPane.showMessageDialog(this,"player X wins","TIC TAC TOE",JOptionPane.INFORMATION_MESSAGE);
xCount++;

txtbtn5.setBackground(Color.ORANGE);
txtbtn6.setBackground(Color.ORANGE);
txtbtn7.setBackground(Color.ORANGE);
txtbtn8.setBackground(Color.ORANGE);
}
    if(b9 == ("X") && b10 == ("X") && b11 == ("X") && b12 == ("X"))
{
JOptionPane.showMessageDialog(this,"player X wins","TIC TAC TOE",JOptionPane.INFORMATION_MESSAGE);
xCount++;

txtbtn9.setBackground(Color.ORANGE);
txtbtn10.setBackground(Color.ORANGE);
txtbtn11.setBackground(Color.ORANGE);
txtbtn12.setBackground(Color.ORANGE);
}
    if(b13 == ("X") && b14 == ("X") && b15 == ("X") && b16 == ("X"))
{
JOptionPane.showMessageDialog(this,"player X wins","TIC TAC TOE",JOptionPane.INFORMATION_MESSAGE);
xCount++;

txtbtn13.setBackground(Color.ORANGE);
txtbtn14.setBackground(Color.ORANGE);
txtbtn15.setBackground(Color.ORANGE);
txtbtn16.setBackground(Color.ORANGE);
}
    if(b1 == ("X") && b5 == ("X") && b9 == ("X") && b13 == ("X"))
{
JOptionPane.showMessageDialog(this,"player X wins","TIC TAC TOE",JOptionPane.INFORMATION_MESSAGE);
xCount++;

txtbtn1.setBackground(Color.ORANGE);
txtbtn5.setBackground(Color.ORANGE);
txtbtn9.setBackground(Color.ORANGE);
txtbtn13.setBackground(Color.ORANGE);
}
    if(b2 == ("X") && b6 == ("X") && b10 == ("X") && b14 == ("X"))
{
JOptionPane.showMessageDialog(this,"player X wins","TIC TAC TOE",JOptionPane.INFORMATION_MESSAGE);
xCount++;

txtbtn2.setBackground(Color.ORANGE);
txtbtn6.setBackground(Color.ORANGE);
txtbtn10.setBackground(Color.ORANGE);
txtbtn14.setBackground(Color.ORANGE);
}
    if(b3 == ("X") && b7 == ("X") && b11 == ("X") && b15 == ("X"))
{
JOptionPane.showMessageDialog(this,"player X wins","TIC TAC TOE",JOptionPane.INFORMATION_MESSAGE);
xCount++;

txtbtn3.setBackground(Color.ORANGE);
txtbtn7.setBackground(Color.ORANGE);
txtbtn11.setBackground(Color.ORANGE);
txtbtn15.setBackground(Color.ORANGE);
}
    if(b4 == ("X") && b8 == ("X") && b12 == ("X") && b16 == ("X"))
{
JOptionPane.showMessageDialog(this,"player X wins","TIC TAC TOE",JOptionPane.INFORMATION_MESSAGE);
xCount++;

txtbtn4.setBackground(Color.ORANGE);
txtbtn8.setBackground(Color.ORANGE);
txtbtn12.setBackground(Color.ORANGE);
txtbtn16.setBackground(Color.ORANGE);
}
    if(b1 == ("X") && b6 == ("X") && b11 == ("X") && b16 == ("X"))
{
JOptionPane.showMessageDialog(this,"player X wins","TIC TAC TOE",JOptionPane.INFORMATION_MESSAGE);
xCount++;

txtbtn1.setBackground(Color.ORANGE);
txtbtn6.setBackground(Color.ORANGE);
txtbtn11.setBackground(Color.ORANGE);
txtbtn16.setBackground(Color.ORANGE);
}
    if(b4 == ("X") && b7 == ("X") && b10 == ("X") && b13 == ("X"))
{
JOptionPane.showMessageDialog(this,"player X wins","TIC TAC TOE",JOptionPane.INFORMATION_MESSAGE);
xCount++;

txtbtn4.setBackground(Color.ORANGE);
txtbtn7.setBackground(Color.ORANGE);
txtbtn10.setBackground(Color.ORANGE);
txtbtn13.setBackground(Color.ORANGE);
}
    
    if(b1 == ("O") && b2 == ("O") && b3 == ("O") && b4 == ("O"))
{
JOptionPane.showMessageDialog(this,"player O wins","TIC TAC TOE",JOptionPane.INFORMATION_MESSAGE);
oCount++;

txtbtn1.setBackground(Color.ORANGE);
txtbtn2.setBackground(Color.ORANGE);
txtbtn3.setBackground(Color.ORANGE);
txtbtn4.setBackground(Color.ORANGE);
}
    if(b5 == ("O") && b6 == ("O") && b7 == ("O") && b8 == ("O"))
{
JOptionPane.showMessageDialog(this,"player O wins","TIC TAC TOE",JOptionPane.INFORMATION_MESSAGE);
oCount++;

txtbtn5.setBackground(Color.ORANGE);
txtbtn6.setBackground(Color.ORANGE);
txtbtn7.setBackground(Color.ORANGE);
txtbtn8.setBackground(Color.ORANGE);
}
    if(b9 == ("O") && b10 == ("O") && b11 == ("O") && b12 == ("O"))
{
JOptionPane.showMessageDialog(this,"player O wins","TIC TAC TOE",JOptionPane.INFORMATION_MESSAGE);
xCount++;

txtbtn9.setBackground(Color.ORANGE);
txtbtn10.setBackground(Color.ORANGE);
txtbtn11.setBackground(Color.ORANGE);
txtbtn12.setBackground(Color.ORANGE);
}
if(b13 == ("O") && b14 == ("O") && b15 == ("O") && b16 == ("O"))
{
JOptionPane.showMessageDialog(this,"player O wins","TIC TAC TOE",JOptionPane.INFORMATION_MESSAGE);
xCount++;

txtbtn13.setBackground(Color.ORANGE);
txtbtn14.setBackground(Color.ORANGE);
txtbtn15.setBackground(Color.ORANGE);
txtbtn16.setBackground(Color.ORANGE);
}
    if(b1 == ("O") && b5 == ("O") && b9 == ("O") && b13 == ("O"))
{
JOptionPane.showMessageDialog(this,"player O wins","TIC TAC TOE",JOptionPane.INFORMATION_MESSAGE);
xCount++;

txtbtn1.setBackground(Color.ORANGE);
txtbtn5.setBackground(Color.ORANGE);
txtbtn9.setBackground(Color.ORANGE);
txtbtn13.setBackground(Color.ORANGE);
}
      if(b2 == ("O") && b6 == ("O") && b10 == ("O") && b14 == ("O"))
{
JOptionPane.showMessageDialog(this,"player O wins","TIC TAC TOE",JOptionPane.INFORMATION_MESSAGE);
xCount++;

txtbtn2.setBackground(Color.ORANGE);
txtbtn6.setBackground(Color.ORANGE);
txtbtn10.setBackground(Color.ORANGE);
txtbtn14.setBackground(Color.ORANGE);
}
       if(b3 == ("O") && b7 == ("O") && b11 == ("O") && b15 == ("O"))
{
JOptionPane.showMessageDialog(this,"player O wins","TIC TAC TOE",JOptionPane.INFORMATION_MESSAGE);
xCount++;

txtbtn3.setBackground(Color.ORANGE);
txtbtn7.setBackground(Color.ORANGE);
txtbtn11.setBackground(Color.ORANGE);
txtbtn15.setBackground(Color.ORANGE);
}
       if(b4 == ("O") && b8 == ("O") && b12 == ("O") && b16 == ("O"))
{
JOptionPane.showMessageDialog(this,"player O wins","TIC TAC TOE",JOptionPane.INFORMATION_MESSAGE);
xCount++;

txtbtn4.setBackground(Color.ORANGE);
txtbtn8.setBackground(Color.ORANGE);
txtbtn12.setBackground(Color.ORANGE);
txtbtn16.setBackground(Color.ORANGE);
}
       if(b1 == ("O") && b6 == ("O") && b11 == ("O") && b16 == ("O"))
{
JOptionPane.showMessageDialog(this,"player O wins","TIC TAC TOE",JOptionPane.INFORMATION_MESSAGE);
xCount++;

txtbtn1.setBackground(Color.ORANGE);
txtbtn6.setBackground(Color.ORANGE);
txtbtn11.setBackground(Color.ORANGE);
txtbtn16.setBackground(Color.ORANGE);
}
        if(b4 == ("O") && b7 == ("O") && b10 == ("O") && b13 == ("O"))
{
JOptionPane.showMessageDialog(this,"player O wins","TIC TAC TOE",JOptionPane.INFORMATION_MESSAGE);
xCount++;

txtbtn4.setBackground(Color.ORANGE);
txtbtn7.setBackground(Color.ORANGE);
txtbtn10.setBackground(Color.ORANGE);
txtbtn13.setBackground(Color.ORANGE);
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
        txtbtn1 = new javax.swing.JButton();
        txtbtn2 = new javax.swing.JButton();
        txtbtn3 = new javax.swing.JButton();
        txtbtn4 = new javax.swing.JButton();
        txtbtn5 = new javax.swing.JButton();
        txtbtn6 = new javax.swing.JButton();
        txtbtn7 = new javax.swing.JButton();
        txtbtn8 = new javax.swing.JButton();
        txtbtn9 = new javax.swing.JButton();
        txtbtn10 = new javax.swing.JButton();
        txtbtn11 = new javax.swing.JButton();
        txtbtn12 = new javax.swing.JButton();
        txtbtn13 = new javax.swing.JButton();
        txtbtn14 = new javax.swing.JButton();
        txtbtn15 = new javax.swing.JButton();
        txtbtn16 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        txtbtn1.setFont(new java.awt.Font("Ubuntu", 3, 36)); // NOI18N
        txtbtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbtn1ActionPerformed(evt);
            }
        });

        txtbtn2.setFont(new java.awt.Font("Ubuntu", 3, 36)); // NOI18N
        txtbtn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbtn2ActionPerformed(evt);
            }
        });

        txtbtn3.setFont(new java.awt.Font("Ubuntu", 3, 36)); // NOI18N
        txtbtn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbtn3ActionPerformed(evt);
            }
        });

        txtbtn4.setFont(new java.awt.Font("Ubuntu", 3, 36)); // NOI18N
        txtbtn4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbtn4ActionPerformed(evt);
            }
        });

        txtbtn5.setFont(new java.awt.Font("Ubuntu", 3, 36)); // NOI18N
        txtbtn5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbtn5ActionPerformed(evt);
            }
        });

        txtbtn6.setFont(new java.awt.Font("Ubuntu", 3, 36)); // NOI18N
        txtbtn6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbtn6ActionPerformed(evt);
            }
        });

        txtbtn7.setFont(new java.awt.Font("Ubuntu", 3, 36)); // NOI18N
        txtbtn7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbtn7ActionPerformed(evt);
            }
        });

        txtbtn8.setFont(new java.awt.Font("Ubuntu", 3, 36)); // NOI18N
        txtbtn8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbtn8ActionPerformed(evt);
            }
        });

        txtbtn9.setFont(new java.awt.Font("Ubuntu", 3, 36)); // NOI18N
        txtbtn9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbtn9ActionPerformed(evt);
            }
        });

        txtbtn10.setFont(new java.awt.Font("Ubuntu", 3, 36)); // NOI18N
        txtbtn10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbtn10ActionPerformed(evt);
            }
        });

        txtbtn11.setFont(new java.awt.Font("Ubuntu", 3, 36)); // NOI18N
        txtbtn11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbtn11ActionPerformed(evt);
            }
        });

        txtbtn12.setFont(new java.awt.Font("Ubuntu", 3, 36)); // NOI18N
        txtbtn12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbtn12ActionPerformed(evt);
            }
        });

        txtbtn13.setFont(new java.awt.Font("Ubuntu", 3, 36)); // NOI18N
        txtbtn13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbtn13ActionPerformed(evt);
            }
        });

        txtbtn14.setFont(new java.awt.Font("Ubuntu", 3, 36)); // NOI18N
        txtbtn14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbtn14ActionPerformed(evt);
            }
        });

        txtbtn15.setFont(new java.awt.Font("Ubuntu", 3, 36)); // NOI18N
        txtbtn15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbtn15ActionPerformed(evt);
            }
        });

        txtbtn16.setFont(new java.awt.Font("Ubuntu", 3, 36)); // NOI18N
        txtbtn16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbtn16ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 24, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txtbtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtbtn2, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtbtn3, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtbtn4, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txtbtn5, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtbtn6, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtbtn7, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtbtn8, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txtbtn9, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtbtn10, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtbtn11, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtbtn12, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txtbtn13, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtbtn14, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtbtn15, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtbtn16, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtbtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtbtn2, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtbtn3, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtbtn4, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtbtn5, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtbtn6, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtbtn7, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtbtn8, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtbtn9, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtbtn10, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtbtn11, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtbtn12, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtbtn13, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtbtn14, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtbtn15, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtbtn16, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(32, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(145, 199, 253));
        jPanel2.setForeground(new java.awt.Color(253, 161, 161));

        jLabel1.setFont(new java.awt.Font("Ubuntu Condensed", 1, 48)); // NOI18N
        jLabel1.setText("4x4");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(80, 80, 80)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(80, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(27, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38))
        );

        jButton1.setBackground(new java.awt.Color(255, 125, 37));
        jButton1.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        jButton1.setText("EXIT");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(103, 103, 103)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(102, 102, 102))
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
JFrame frame = new JFrame("Exit");

if(JOptionPane.showConfirmDialog(frame,"confirm if you want to exit !",
        "TIC TAC TOE",JOptionPane.YES_NO_OPTION)== JOptionPane.YES_NO_OPTION)
{
System.exit(0);
}        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void txtbtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbtn1ActionPerformed
txtbtn1.setText(startGame);
        if(startGame.equalsIgnoreCase("X"))
    {
        txtbtn1.setForeground(Color.RED);
    }
    else
    {
    txtbtn1.setForeground(Color.MAGENTA);
    }  
        choose_a_Player();
        WinningGame();
        // TODO add your handling code here:
    }//GEN-LAST:event_txtbtn1ActionPerformed

    private void txtbtn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbtn2ActionPerformed
txtbtn2.setText(startGame);
        if(startGame.equalsIgnoreCase("X"))
    {
        txtbtn2.setForeground(Color.RED);
    }
    else
    {
    txtbtn2.setForeground(Color.MAGENTA);
    }  
        choose_a_Player();
        WinningGame();        // TODO add your handling code here:
    }//GEN-LAST:event_txtbtn2ActionPerformed

    private void txtbtn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbtn3ActionPerformed
txtbtn3.setText(startGame);
        if(startGame.equalsIgnoreCase("X"))
    {
        txtbtn3.setForeground(Color.RED);
    }
    else
    {
    txtbtn3.setForeground(Color.MAGENTA);
    }  
        choose_a_Player();
        WinningGame();
        // TODO add your handling code here:
    }//GEN-LAST:event_txtbtn3ActionPerformed

    private void txtbtn4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbtn4ActionPerformed
txtbtn4.setText(startGame);
        if(startGame.equalsIgnoreCase("X"))
    {
        txtbtn4.setForeground(Color.RED);
    }
    else
    {
    txtbtn4.setForeground(Color.MAGENTA);
    }  
        choose_a_Player();
        WinningGame();
        // TODO add your handling code here:
    }//GEN-LAST:event_txtbtn4ActionPerformed

    private void txtbtn5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbtn5ActionPerformed
txtbtn5.setText(startGame);
        if(startGame.equalsIgnoreCase("X"))
    {
        txtbtn5.setForeground(Color.RED);
    }
    else
    {
    txtbtn5.setForeground(Color.MAGENTA);
    }  
        choose_a_Player();
        WinningGame();        // TODO add your handling code here:
    }//GEN-LAST:event_txtbtn5ActionPerformed

    private void txtbtn6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbtn6ActionPerformed
txtbtn6.setText(startGame);
        if(startGame.equalsIgnoreCase("X"))
    {
        txtbtn6.setForeground(Color.RED);
    }
    else
    {
    txtbtn6.setForeground(Color.MAGENTA);
    }  
        choose_a_Player();
        WinningGame();        // TODO add your handling code here:
    }//GEN-LAST:event_txtbtn6ActionPerformed

    private void txtbtn7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbtn7ActionPerformed
txtbtn7.setText(startGame);
        if(startGame.equalsIgnoreCase("X"))
    {
        txtbtn7.setForeground(Color.RED);
    }
    else
    {
    txtbtn7.setForeground(Color.MAGENTA);
    }  
        choose_a_Player();
        WinningGame();        // TODO add your handling code here:
    }//GEN-LAST:event_txtbtn7ActionPerformed

    private void txtbtn8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbtn8ActionPerformed
txtbtn8.setText(startGame);
        if(startGame.equalsIgnoreCase("X"))
    {
        txtbtn8.setForeground(Color.RED);
    }
    else
    {
    txtbtn8.setForeground(Color.MAGENTA);
    }  
        choose_a_Player();
        WinningGame();        // TODO add your handling code here:
    }//GEN-LAST:event_txtbtn8ActionPerformed

    private void txtbtn9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbtn9ActionPerformed
txtbtn9.setText(startGame);
        if(startGame.equalsIgnoreCase("X"))
    {
        txtbtn9.setForeground(Color.RED);
    }
    else
    {
    txtbtn9.setForeground(Color.MAGENTA);
    }  
        choose_a_Player();
        WinningGame();        // TODO add your handling code here:
    }//GEN-LAST:event_txtbtn9ActionPerformed

    private void txtbtn10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbtn10ActionPerformed
txtbtn10.setText(startGame);
        if(startGame.equalsIgnoreCase("X"))
    {
        txtbtn10.setForeground(Color.RED);
    }
    else
    {
    txtbtn10.setForeground(Color.MAGENTA);
    }  
        choose_a_Player();
        WinningGame();        // TODO add your handling code here:
    }//GEN-LAST:event_txtbtn10ActionPerformed

    private void txtbtn11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbtn11ActionPerformed
txtbtn11.setText(startGame);
        if(startGame.equalsIgnoreCase("X"))
    {
        txtbtn11.setForeground(Color.RED);
    }
    else
    {
    txtbtn11.setForeground(Color.MAGENTA);
    }  
        choose_a_Player();
        WinningGame();        // TODO add your handling code here:
    }//GEN-LAST:event_txtbtn11ActionPerformed

    private void txtbtn12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbtn12ActionPerformed
txtbtn12.setText(startGame);
        if(startGame.equalsIgnoreCase("X"))
    {
        txtbtn12.setForeground(Color.RED);
    }
    else
    {
    txtbtn12.setForeground(Color.MAGENTA);
    }  
        choose_a_Player();
        WinningGame();        // TODO add your handling code here:
    }//GEN-LAST:event_txtbtn12ActionPerformed

    private void txtbtn13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbtn13ActionPerformed
txtbtn13.setText(startGame);
        if(startGame.equalsIgnoreCase("X"))
    {
        txtbtn13.setForeground(Color.RED);
    }
    else
    {
    txtbtn13.setForeground(Color.MAGENTA);
    }  
        choose_a_Player();
        WinningGame();        // TODO add your handling code here:
    }//GEN-LAST:event_txtbtn13ActionPerformed

    private void txtbtn14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbtn14ActionPerformed
txtbtn14.setText(startGame);
        if(startGame.equalsIgnoreCase("X"))
    {
        txtbtn14.setForeground(Color.RED);
    }
    else
    {
    txtbtn14.setForeground(Color.MAGENTA);
    }  
        choose_a_Player();
        WinningGame();        // TODO add your handling code here:
    }//GEN-LAST:event_txtbtn14ActionPerformed

    private void txtbtn15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbtn15ActionPerformed
txtbtn15.setText(startGame);
        if(startGame.equalsIgnoreCase("X"))
    {
        txtbtn15.setForeground(Color.RED);
    }
    else
    {
    txtbtn15.setForeground(Color.MAGENTA);
    }  
        choose_a_Player();
        WinningGame();        // TODO add your handling code here:
    }//GEN-LAST:event_txtbtn15ActionPerformed

    private void txtbtn16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbtn16ActionPerformed
txtbtn16.setText(startGame);
        if(startGame.equalsIgnoreCase("X"))
    {
        txtbtn16.setForeground(Color.RED);
    }
    else
    {
    txtbtn16.setForeground(Color.MAGENTA);
    }  
        choose_a_Player();
        WinningGame();        // TODO add your handling code here:
    }//GEN-LAST:event_txtbtn16ActionPerformed

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
            java.util.logging.Logger.getLogger(four.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(four.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(four.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(four.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new four().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton txtbtn1;
    private javax.swing.JButton txtbtn10;
    private javax.swing.JButton txtbtn11;
    private javax.swing.JButton txtbtn12;
    private javax.swing.JButton txtbtn13;
    private javax.swing.JButton txtbtn14;
    private javax.swing.JButton txtbtn15;
    private javax.swing.JButton txtbtn16;
    private javax.swing.JButton txtbtn2;
    private javax.swing.JButton txtbtn3;
    private javax.swing.JButton txtbtn4;
    private javax.swing.JButton txtbtn5;
    private javax.swing.JButton txtbtn6;
    private javax.swing.JButton txtbtn7;
    private javax.swing.JButton txtbtn8;
    private javax.swing.JButton txtbtn9;
    // End of variables declaration//GEN-END:variables
}
