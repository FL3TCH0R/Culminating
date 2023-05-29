
import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author fletc
 */
public class Java_Game extends javax.swing.JFrame {
    
    private String startGame = "X";
    private int xCount = 0;
    private int oCount = 0;

    /**
     * Creates new form Java_Game
     */
    public Java_Game() {
        initComponents();
    }
    
    private void gameScore()
    {
      playerxxx.setText(String.valueOf(xCount));
      playerooo.setText(String.valueOf(oCount));
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

       if(b1 == ("X") && b2 == ("X")&& b3 == ("X")){
        JOptionPane.showMessageDialog(this, "Player X win","Tic Tac Toe",
                JOptionPane.INFORMATION_MESSAGE);
        xCount++;
        gameScore();
        txtbtn1.setBackground(Color.ORANGE);
        txtbtn2.setBackground(Color.ORANGE);
        txtbtn3.setBackground(Color.ORANGE);
        
       }
       
         if(b4 == ("X") && b5 == ("X")&& b6 == ("X")){
        JOptionPane.showMessageDialog(this, "Player X win","Tic Tac Toe",
                JOptionPane.INFORMATION_MESSAGE);
        xCount++;
        gameScore();
        txtbtn4.setBackground(Color.ORANGE);
        txtbtn5.setBackground(Color.ORANGE);
        txtbtn6.setBackground(Color.ORANGE);
        
       }
         
         if(b7 == ("X") && b8 == ("X")&& b9 == ("X")){
        JOptionPane.showMessageDialog(this, "Player X win","Tic Tac Toe",
                JOptionPane.INFORMATION_MESSAGE);
        xCount++;
        gameScore();
        txtbtn7.setBackground(Color.ORANGE);
        txtbtn8.setBackground(Color.ORANGE);
        txtbtn9.setBackground(Color.ORANGE);
        
       }
       
        
         if(b1 == ("X") && b4 == ("X")&& b7 == ("X")){
        JOptionPane.showMessageDialog(this, "Player X win","Tic Tac Toe",
                JOptionPane.INFORMATION_MESSAGE);
        xCount++;
        gameScore();
        txtbtn1.setBackground(Color.ORANGE);
        txtbtn4.setBackground(Color.ORANGE);
        txtbtn7.setBackground(Color.ORANGE);
        
       }
       
        
         if(b2 == ("X") && b5 == ("X")&& b8 == ("X")){
        JOptionPane.showMessageDialog(this, "Player X win","Tic Tac Toe",
                JOptionPane.INFORMATION_MESSAGE);
        xCount++;
        gameScore();
        txtbtn2.setBackground(Color.ORANGE);
        txtbtn5.setBackground(Color.ORANGE);
        txtbtn8.setBackground(Color.ORANGE);
        
       }
         
        
         if(b3 == ("X") && b6 == ("X")&& b9 == ("X")){
        JOptionPane.showMessageDialog(this, "Player X win","Tic Tac Toe",
                JOptionPane.INFORMATION_MESSAGE);
        xCount++;
        gameScore();
        txtbtn3.setBackground(Color.ORANGE);
        txtbtn6.setBackground(Color.ORANGE);
        txtbtn9.setBackground(Color.ORANGE);
        
       }
       
         if(b1 == ("X") && b5 == ("X")&& b9 == ("X")){
        JOptionPane.showMessageDialog(this, "Player X win","Tic Tac Toe",
                JOptionPane.INFORMATION_MESSAGE);
        xCount++;
        gameScore();
        txtbtn1.setBackground(Color.ORANGE);
        txtbtn5.setBackground(Color.ORANGE);
        txtbtn9.setBackground(Color.ORANGE);
        
       }
         
         if(b3 == ("X") && b5 == ("X")&& b7 == ("X")){
        JOptionPane.showMessageDialog(this, "Player X win","Tic Tac Toe",
                JOptionPane.INFORMATION_MESSAGE);
        xCount++;
        gameScore();
        txtbtn3.setBackground(Color.ORANGE);
        txtbtn5.setBackground(Color.ORANGE);
        txtbtn7.setBackground(Color.ORANGE);
        
       }
      
      if(b1 == ("O") && b2 == ("O")&& b3 == ("O")){
        JOptionPane.showMessageDialog(this, "Player O win","Tic Tac Toe",
                JOptionPane.INFORMATION_MESSAGE);
        oCount++;
        gameScore();
        txtbtn1.setBackground(Color.ORANGE);
        txtbtn2.setBackground(Color.ORANGE);
        txtbtn3.setBackground(Color.ORANGE);
        
       }
       
         if(b4 == ("O") && b5 == ("O")&& b6 == ("O")){
        JOptionPane.showMessageDialog(this, "Player O win","Tic Tac Toe",
                JOptionPane.INFORMATION_MESSAGE);
        oCount++;
        gameScore();
        txtbtn4.setBackground(Color.ORANGE);
        txtbtn5.setBackground(Color.ORANGE);
        txtbtn6.setBackground(Color.ORANGE);
        
       }
         
         if(b7 == ("O") && b8 == ("O")&& b9 == ("O")){
        JOptionPane.showMessageDialog(this, "Player O win","Tic Tac Toe",
                JOptionPane.INFORMATION_MESSAGE);
        oCount++;
        gameScore();
        txtbtn7.setBackground(Color.ORANGE);
        txtbtn8.setBackground(Color.ORANGE);
        txtbtn9.setBackground(Color.ORANGE);
        
       }
       
        
         if(b1 == ("O") && b4 == ("O")&& b7 == ("O")){
        JOptionPane.showMessageDialog(this, "Player O win","Tic Tac Toe",
                JOptionPane.INFORMATION_MESSAGE);
        oCount++;
        gameScore();
        txtbtn1.setBackground(Color.ORANGE);
        txtbtn4.setBackground(Color.ORANGE);
        txtbtn7.setBackground(Color.ORANGE);
        
       }
       
        
         if(b2 == ("O") && b5 == ("O")&& b8 == ("O")){
        JOptionPane.showMessageDialog(this, "Player O win","Tic Tac Toe",
                JOptionPane.INFORMATION_MESSAGE);
        oCount++;
        gameScore();
        txtbtn2.setBackground(Color.ORANGE);
        txtbtn5.setBackground(Color.ORANGE);
        txtbtn8.setBackground(Color.ORANGE);
        
       }
         
        
         if(b3 == ("O") && b6 == ("O")&& b9 == ("O")){
        JOptionPane.showMessageDialog(this, "Player O win","Tic Tac Toe",
                JOptionPane.INFORMATION_MESSAGE);
        oCount++;
        gameScore();
        txtbtn3.setBackground(Color.ORANGE);
        txtbtn6.setBackground(Color.ORANGE);
        txtbtn9.setBackground(Color.ORANGE);
        
       }
       
         if(b1 == ("O") && b5 == ("O")&& b9 == ("O")){
        JOptionPane.showMessageDialog(this, "Player O win","Tic Tac Toe",
                JOptionPane.INFORMATION_MESSAGE);
        oCount++;
        gameScore();
        txtbtn1.setBackground(Color.ORANGE);
        txtbtn5.setBackground(Color.ORANGE);
        txtbtn9.setBackground(Color.ORANGE);
        
       }
         
         if(b3 == ("O") && b5 == ("O")&& b7 == ("O")){
        JOptionPane.showMessageDialog(this, "Player O win","Tic Tac Toe",
                JOptionPane.INFORMATION_MESSAGE);
        oCount++;
        gameScore();
        txtbtn3.setBackground(Color.ORANGE);
        txtbtn5.setBackground(Color.ORANGE);
        txtbtn7.setBackground(Color.ORANGE);
        
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

        label1 = new java.awt.Label();
        jPanel1 = new javax.swing.JPanel();
        label2 = new java.awt.Label();
        txtbtn1 = new javax.swing.JButton();
        txtbtn2 = new javax.swing.JButton();
        txtbtn3 = new javax.swing.JButton();
        txtbtn5 = new javax.swing.JButton();
        txtbtn6 = new javax.swing.JButton();
        txtbtn4 = new javax.swing.JButton();
        txtbtn9 = new javax.swing.JButton();
        txtbtn7 = new javax.swing.JButton();
        txtbtn8 = new javax.swing.JButton();
        jpanel2 = new javax.swing.JPanel();
        label3 = new java.awt.Label();
        label4 = new java.awt.Label();
        playerxxx = new java.awt.Label();
        playerooo = new java.awt.Label();
        txtclose = new javax.swing.JButton();
        txtreset = new javax.swing.JButton();

        label1.setText("label1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("TIC TAC TOE");
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(102, 255, 51));

        label2.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        label2.setText("TIC TAC TOE");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(467, 467, 467)
                .addComponent(label2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(27, Short.MAX_VALUE)
                .addComponent(label2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
        );

        txtbtn1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        txtbtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbtn1ActionPerformed(evt);
            }
        });

        txtbtn2.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        txtbtn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbtn2ActionPerformed(evt);
            }
        });

        txtbtn3.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        txtbtn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbtn3ActionPerformed(evt);
            }
        });

        txtbtn5.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        txtbtn5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbtn5ActionPerformed(evt);
            }
        });

        txtbtn6.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        txtbtn6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbtn6ActionPerformed(evt);
            }
        });

        txtbtn4.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        txtbtn4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbtn4ActionPerformed(evt);
            }
        });

        txtbtn9.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        txtbtn9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbtn9ActionPerformed(evt);
            }
        });

        txtbtn7.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        txtbtn7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbtn7ActionPerformed(evt);
            }
        });

        txtbtn8.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        txtbtn8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbtn8ActionPerformed(evt);
            }
        });

        jpanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.lightGray, java.awt.Color.black));

        label3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        label3.setText("Player X:");

        label4.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        label4.setText("Player O:");

        playerxxx.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        playerxxx.setText("xxxxxxxxxxx");

        playerooo.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        playerooo.setText("ooooooooooo");

        javax.swing.GroupLayout jpanel2Layout = new javax.swing.GroupLayout(jpanel2);
        jpanel2.setLayout(jpanel2Layout);
        jpanel2Layout.setHorizontalGroup(
            jpanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpanel2Layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(jpanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(playerooo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jpanel2Layout.createSequentialGroup()
                        .addGroup(jpanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(label4, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(label3, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(33, 33, 33)
                        .addComponent(playerxxx, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(292, Short.MAX_VALUE))
        );
        jpanel2Layout.setVerticalGroup(
            jpanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpanel2Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(jpanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(label3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(playerxxx, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 57, Short.MAX_VALUE)
                .addGroup(jpanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(playerooo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(label4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(97, 97, 97))
        );

        label3.getAccessibleContext().setAccessibleName("jlabel3");
        label3.getAccessibleContext().setAccessibleDescription("");

        txtclose.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        txtclose.setText("Close");
        txtclose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtcloseActionPerformed(evt);
            }
        });

        txtreset.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        txtreset.setText("Reset");
        txtreset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtresetActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtbtn4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtbtn1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtbtn2, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtbtn3, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtbtn5, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(24, 24, 24)
                                .addComponent(txtbtn6, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtbtn7, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtbtn8, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(24, 24, 24)
                        .addComponent(txtbtn9, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addComponent(jpanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(118, 118, 118)
                        .addComponent(txtreset, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(104, 104, 104)
                        .addComponent(txtclose, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(99, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtbtn2, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtbtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtbtn3, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtbtn4, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtbtn5, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtbtn6, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtbtn9, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtbtn8, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtbtn7, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(21, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(jpanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtreset, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtclose, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(68, 68, 68))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtcloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcloseActionPerformed
        JFrame frame = new JFrame("Exit");
        if(JOptionPane.showConfirmDialog(frame,"Confirm if you want to exit","Tic Tac Toe",
        JOptionPane.YES_NO_OPTION)== JOptionPane.YES_NO_OPTION) 
        {
          System.exit(0);
        }
    }//GEN-LAST:event_txtcloseActionPerformed

    private void txtresetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtresetActionPerformed
        
        txtbtn1.setText(null);
        txtbtn2.setText(null);
        txtbtn3.setText(null);
        txtbtn4.setText(null);
        txtbtn5.setText(null); 
        txtbtn6.setText(null); 
        txtbtn7.setText(null);
        txtbtn8.setText(null);
        txtbtn9.setText(null);
        
        txtbtn1.setBackground(Color.LIGHT_GRAY);
        txtbtn2.setBackground(Color.LIGHT_GRAY);
        txtbtn3.setBackground(Color.LIGHT_GRAY);
        txtbtn4.setBackground(Color.LIGHT_GRAY);
        txtbtn5.setBackground(Color.LIGHT_GRAY);
        txtbtn6.setBackground(Color.LIGHT_GRAY);
        txtbtn7.setBackground(Color.LIGHT_GRAY);
        txtbtn8.setBackground(Color.LIGHT_GRAY);
        txtbtn9.setBackground(Color.LIGHT_GRAY);
            
            
            
            
    }//GEN-LAST:event_txtresetActionPerformed

    private void txtbtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbtn1ActionPerformed
        txtbtn1.setText(startGame);
        
         if(startGame.equalsIgnoreCase("X"))
       {
          txtbtn1.setForeground(Color.RED);
       }
       else
       {
          txtbtn1.setForeground(Color.YELLOW);
       }
       choose_a_Player();
       WinningGame();
    }//GEN-LAST:event_txtbtn1ActionPerformed

    private void txtbtn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbtn2ActionPerformed
         txtbtn2.setText(startGame);
        
         if(startGame.equalsIgnoreCase("X"))
       {
         txtbtn2.setForeground(Color.RED);
       }
       else
       {
         txtbtn2.setForeground(Color.YELLOW);
       }
       choose_a_Player();
       WinningGame();
    }//GEN-LAST:event_txtbtn2ActionPerformed

    private void txtbtn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbtn3ActionPerformed
        txtbtn3.setText(startGame);
        
         if(startGame.equalsIgnoreCase("X"))
       {
         txtbtn3.setForeground(Color.RED);
       }
       else
       {
         txtbtn3.setForeground(Color.YELLOW);
       }
       choose_a_Player();
       WinningGame();
    }//GEN-LAST:event_txtbtn3ActionPerformed

    private void txtbtn4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbtn4ActionPerformed
        txtbtn4.setText(startGame);
        
         if(startGame.equalsIgnoreCase("X"))
       {
         txtbtn4.setForeground(Color.RED);
       }
       else
       {
         txtbtn4.setForeground(Color.YELLOW);
       }
       choose_a_Player();
       WinningGame();
    }//GEN-LAST:event_txtbtn4ActionPerformed

    private void txtbtn5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbtn5ActionPerformed
        // TODO add your handling code here:
        txtbtn5.setText(startGame);
        
         if(startGame.equalsIgnoreCase("X"))
       {
         txtbtn5.setForeground(Color.RED);
       }
       else
       {
         txtbtn5.setForeground(Color.YELLOW);
       }
       choose_a_Player();
       WinningGame();
    }//GEN-LAST:event_txtbtn5ActionPerformed

    private void txtbtn6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbtn6ActionPerformed
        // TODO add your handling code here:
        txtbtn6.setText(startGame);
        
         if(startGame.equalsIgnoreCase("X"))
       {
         txtbtn6.setForeground(Color.RED);
       }
       else
       {
         txtbtn6.setForeground(Color.YELLOW);
       }
       choose_a_Player();
       WinningGame();
    }//GEN-LAST:event_txtbtn6ActionPerformed

    private void txtbtn7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbtn7ActionPerformed
        // TODO add your handling code here:
        txtbtn7.setText(startGame);
        
         if(startGame.equalsIgnoreCase("X"))
       {
         txtbtn7.setForeground(Color.RED);
       }
       else
       {
         txtbtn7.setForeground(Color.YELLOW);
       }
       choose_a_Player();
       WinningGame();
    }//GEN-LAST:event_txtbtn7ActionPerformed

    private void txtbtn8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbtn8ActionPerformed
        // TODO add your handling code here:
        txtbtn8.setText(startGame);
        
         if(startGame.equalsIgnoreCase("X"))
       {
         txtbtn8.setForeground(Color.RED);
       }
       else
       {
         txtbtn8.setForeground(Color.YELLOW);
       }
       choose_a_Player();
       WinningGame();
    }//GEN-LAST:event_txtbtn8ActionPerformed

    private void txtbtn9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbtn9ActionPerformed
        // TODO add your handling code here:
        txtbtn9.setText(startGame);
        
         if(startGame.equalsIgnoreCase("X"))
       {
         txtbtn9.setForeground(Color.RED);
       }
       else
       {
         txtbtn9.setForeground(Color.YELLOW);
       }
       choose_a_Player();
       WinningGame();
    }//GEN-LAST:event_txtbtn9ActionPerformed

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
            java.util.logging.Logger.getLogger(Java_Game.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Java_Game.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Java_Game.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Java_Game.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Java_Game().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jpanel2;
    private java.awt.Label label1;
    private java.awt.Label label2;
    private java.awt.Label label3;
    private java.awt.Label label4;
    private java.awt.Label playerooo;
    private java.awt.Label playerxxx;
    private javax.swing.JButton txtbtn1;
    private javax.swing.JButton txtbtn2;
    private javax.swing.JButton txtbtn3;
    private javax.swing.JButton txtbtn4;
    private javax.swing.JButton txtbtn5;
    private javax.swing.JButton txtbtn6;
    private javax.swing.JButton txtbtn7;
    private javax.swing.JButton txtbtn8;
    private javax.swing.JButton txtbtn9;
    private javax.swing.JButton txtclose;
    private javax.swing.JButton txtreset;
    // End of variables declaration//GEN-END:variables
}
