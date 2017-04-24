package example.pkg1;

import java.awt.Color;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;

public class Calculator extends javax.swing.JFrame {

    public double leftNumber;
    public char operator;
    public boolean newNumber = true, firstNumber = true;
    String soundUrl = "./sound/finger snappnig.wav"; // relative addres to sound file (only .wav is supported)
    public Calculator() {
        this.setTitle("Beshkan"); // setting a name for JFrame
        // this.setUndecorated(true); // removing titlebar
        this.getContentPane().setBackground(new Color(100, 100, 100)); // changing background color
        
        initComponents();
    }

    private void playSound(String soundFile) {
        AudioInputStream audioIn = null;
        try {
            File f = new File(soundFile);
            audioIn = AudioSystem.getAudioInputStream(f);
            Clip clip = AudioSystem.getClip();
            clip.open(audioIn);
            clip.start();
        } catch (UnsupportedAudioFileException | IOException | LineUnavailableException ex) {
            Logger.getLogger(Calculator.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                audioIn.close();
            } catch (IOException ex) {
                Logger.getLogger(Calculator.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    public void numberFunction(int number){
        if (newNumber) exp.setText("");
        exp.setText(exp.getText() + String.valueOf(number));
        newNumber = false;
    }
    public void operatorFunction(char o){
        if (o == '=') {
            if(!firstNumber){
                double ans = 0;
                double rightNumber = Double.valueOf(exp.getText());
                if (operator == '+') ans = leftNumber + rightNumber;
                if (operator == '-') ans = leftNumber - rightNumber;
                if (operator == '*') ans = leftNumber * rightNumber;
                if (operator == '/') ans = leftNumber / rightNumber;
                leftNumber = ans;
                exp.setText(String.valueOf(ans));
                firstNumber = newNumber = true;
                playSound(soundUrl);
            }
        }else {
            if(firstNumber){
                operator = o;
                leftNumber = Double.parseDouble("0" + exp.getText());
                newNumber = true;
            }else if (newNumber){
                operator = o;
            }else {
                double ans = 0;
                double rightNumber = Double.valueOf(exp.getText());
                if (operator == '+') ans = leftNumber + rightNumber;
                if (operator == '-') ans = leftNumber - rightNumber;
                if (operator == '*') ans = leftNumber * rightNumber;
                if (operator == '/') ans = leftNumber / rightNumber;
                leftNumber = ans;
                operator = o;
                exp.setText(String.valueOf(ans));
                newNumber = true;
            }
            firstNumber = false;
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem1 = new javax.swing.JMenuItem();
        Number1 = new javax.swing.JButton();
        Number2 = new javax.swing.JButton();
        Number3 = new javax.swing.JButton();
        Number4 = new javax.swing.JButton();
        Number5 = new javax.swing.JButton();
        Number6 = new javax.swing.JButton();
        Number7 = new javax.swing.JButton();
        Number8 = new javax.swing.JButton();
        Number9 = new javax.swing.JButton();
        clearButtton = new javax.swing.JButton();
        Number0 = new javax.swing.JButton();
        answerButton = new javax.swing.JButton();
        plusButton = new javax.swing.JButton();
        multiplyButton = new javax.swing.JButton();
        divideButton = new javax.swing.JButton();
        minusButton = new javax.swing.JButton();
        exp = new javax.swing.JTextField();

        jMenuItem1.setMnemonic('\ufd3e');
        jMenuItem1.setText("545454");
        jMenuItem1.setToolTipText("455");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(102, 102, 255));
        setLocation(new java.awt.Point(500, 200));
        setResizable(false);

        Number1.setBackground(new java.awt.Color(153, 153, 255));
        Number1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        Number1.setText("1");
        Number1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Number1ActionPerformed(evt);
            }
        });

        Number2.setBackground(new java.awt.Color(153, 153, 255));
        Number2.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        Number2.setText("2");
        Number2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Number2ActionPerformed(evt);
            }
        });

        Number3.setBackground(new java.awt.Color(153, 153, 255));
        Number3.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        Number3.setText("3");
        Number3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Number3ActionPerformed(evt);
            }
        });

        Number4.setBackground(new java.awt.Color(153, 153, 255));
        Number4.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        Number4.setText("4");
        Number4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Number4ActionPerformed(evt);
            }
        });

        Number5.setBackground(new java.awt.Color(153, 153, 255));
        Number5.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        Number5.setText("5");
        Number5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Number5ActionPerformed(evt);
            }
        });

        Number6.setBackground(new java.awt.Color(153, 153, 255));
        Number6.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        Number6.setText("6");
        Number6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Number6ActionPerformed(evt);
            }
        });

        Number7.setBackground(new java.awt.Color(153, 153, 255));
        Number7.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        Number7.setText("7");
        Number7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Number7ActionPerformed(evt);
            }
        });

        Number8.setBackground(new java.awt.Color(153, 153, 255));
        Number8.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        Number8.setText("8");
        Number8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Number8ActionPerformed(evt);
            }
        });

        Number9.setBackground(new java.awt.Color(153, 153, 255));
        Number9.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        Number9.setText("9");
        Number9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Number9ActionPerformed(evt);
            }
        });

        clearButtton.setBackground(new java.awt.Color(153, 153, 255));
        clearButtton.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        clearButtton.setText("C");
        clearButtton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearButttonActionPerformed(evt);
            }
        });

        Number0.setBackground(new java.awt.Color(153, 153, 255));
        Number0.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        Number0.setText("0");
        Number0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Number0ActionPerformed(evt);
            }
        });

        answerButton.setBackground(new java.awt.Color(153, 153, 255));
        answerButton.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        answerButton.setText("=");
        answerButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                answerButtonActionPerformed(evt);
            }
        });

        plusButton.setBackground(new java.awt.Color(153, 153, 255));
        plusButton.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        plusButton.setText("+");
        plusButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                plusButtonActionPerformed(evt);
            }
        });

        multiplyButton.setBackground(new java.awt.Color(153, 153, 255));
        multiplyButton.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        multiplyButton.setText("*");
        multiplyButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                multiplyButtonActionPerformed(evt);
            }
        });

        divideButton.setBackground(new java.awt.Color(153, 153, 255));
        divideButton.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        divideButton.setText("/");
        divideButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                divideButtonActionPerformed(evt);
            }
        });

        minusButton.setBackground(new java.awt.Color(153, 153, 255));
        minusButton.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        minusButton.setText("-");
        minusButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                minusButtonActionPerformed(evt);
            }
        });

        exp.setEditable(false);
        exp.setBackground(new java.awt.Color(204, 204, 204));
        exp.setFont(new java.awt.Font("Courier New", 1, 28)); // NOI18N
        exp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                expActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Number7, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Number8, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(clearButtton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Number0, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(answerButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Number9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(divideButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(multiplyButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(exp)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Number4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Number5, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Number1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Number2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Number6, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Number3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(plusButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(minusButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(exp, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Number1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Number2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Number3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(plusButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Number4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Number5, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Number6, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(minusButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(multiplyButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(divideButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Number7, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Number8, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Number9, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(clearButtton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Number0, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(answerButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void minusButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_minusButtonActionPerformed
        operatorFunction('-');
    }//GEN-LAST:event_minusButtonActionPerformed

    private void expActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_expActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_expActionPerformed

    private void clearButttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearButttonActionPerformed
        exp.setText("");
        firstNumber = newNumber = true;
    }//GEN-LAST:event_clearButttonActionPerformed

    private void answerButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_answerButtonActionPerformed
        operatorFunction('=');
    }//GEN-LAST:event_answerButtonActionPerformed

    private void Number1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Number1ActionPerformed
        numberFunction(1);
    }//GEN-LAST:event_Number1ActionPerformed

    private void Number2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Number2ActionPerformed
        numberFunction(2);
    }//GEN-LAST:event_Number2ActionPerformed

    private void Number3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Number3ActionPerformed
        numberFunction(3);
    }//GEN-LAST:event_Number3ActionPerformed

    private void Number4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Number4ActionPerformed
        numberFunction(4);
    }//GEN-LAST:event_Number4ActionPerformed

    private void Number5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Number5ActionPerformed
        numberFunction(5);
    }//GEN-LAST:event_Number5ActionPerformed

    private void Number6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Number6ActionPerformed
        numberFunction(6);
    }//GEN-LAST:event_Number6ActionPerformed

    private void Number7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Number7ActionPerformed
        numberFunction(7);
    }//GEN-LAST:event_Number7ActionPerformed

    private void Number8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Number8ActionPerformed
        numberFunction(8);
    }//GEN-LAST:event_Number8ActionPerformed

    private void Number9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Number9ActionPerformed
        numberFunction(9);
    }//GEN-LAST:event_Number9ActionPerformed

    private void Number0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Number0ActionPerformed
        numberFunction(0);
    }//GEN-LAST:event_Number0ActionPerformed

    private void plusButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_plusButtonActionPerformed
        operatorFunction('+');
    }//GEN-LAST:event_plusButtonActionPerformed

    private void multiplyButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_multiplyButtonActionPerformed
        operatorFunction('*');
    }//GEN-LAST:event_multiplyButtonActionPerformed

    private void divideButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_divideButtonActionPerformed
        operatorFunction('/');
    }//GEN-LAST:event_divideButtonActionPerformed

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
            java.util.logging.Logger.getLogger(Calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Calculator().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Number0;
    private javax.swing.JButton Number1;
    private javax.swing.JButton Number2;
    private javax.swing.JButton Number3;
    private javax.swing.JButton Number4;
    private javax.swing.JButton Number5;
    private javax.swing.JButton Number6;
    private javax.swing.JButton Number7;
    private javax.swing.JButton Number8;
    private javax.swing.JButton Number9;
    private javax.swing.JButton answerButton;
    private javax.swing.JButton clearButtton;
    private javax.swing.JButton divideButton;
    private javax.swing.JTextField exp;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JButton minusButton;
    private javax.swing.JButton multiplyButton;
    private javax.swing.JButton plusButton;
    // End of variables declaration//GEN-END:variables
}
