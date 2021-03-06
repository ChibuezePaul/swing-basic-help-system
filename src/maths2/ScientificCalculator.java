/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package maths2;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author ISoft
 */
public class ScientificCalculator extends javax.swing.JFrame {

    /**
     * Creates new form ScientificCalculator
     */
    public ScientificCalculator() {
        initComponents();
        setLocationRelativeTo(getRootPane());
        setIconImage(new ImageIcon(getClass().getResource("icons8_Calculator_20px.png")).getImage());
//      setIconImage(new ImageIcon(getClass().getResource("icons8_Student_Center_20px_4.png")).getImage());
        Calendar timer = Calendar.getInstance();

        SimpleDateFormat myHour = new SimpleDateFormat("hh:");
        String myTimeH = (myHour.format(timer.getTime()));
        SimpleDateFormat myMinuite = new SimpleDateFormat("mm");
        String myTimeM = (myMinuite.format(timer.getTime()));

        SimpleDateFormat myDay = new SimpleDateFormat("dd ");
        String myDateD = (myDay.format(timer.getTime()));

        SimpleDateFormat myMonth = new SimpleDateFormat("- MM");
        String myDateM = (myMonth.format(timer.getTime()));

        txtHour.setText(myTimeH);
        txtMiniute.setText(myTimeM);
        txtDay.setText(myDateD);
        txtMonth.setText(myDateM);

        txtDispL.setText("0");
        btn0.addMouseListener(new MyMouseAdapter());
        btn1.addMouseListener(new MyMouseAdapter());
        btn1.addMouseListener(new MyMouseAdapter());
        btn2.addMouseListener(new MyMouseAdapter());
        btn3.addMouseListener(new MyMouseAdapter());
        btn4.addMouseListener(new MyMouseAdapter());
        btn5.addMouseListener(new MyMouseAdapter());
        btn6.addMouseListener(new MyMouseAdapter());
        btn7.addMouseListener(new MyMouseAdapter());
        btn8.addMouseListener(new MyMouseAdapter());
        btn9.addMouseListener(new MyMouseAdapter());
    }

    /**
     * This method is called from within the constructor to initialize the form. WARNING: Do NOT modify this code. The
     * content of this method is always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtHour = new javax.swing.JTextField();
        txtMiniute = new javax.swing.JTextField();
        txtDay = new javax.swing.JTextField();
        txtMonth = new javax.swing.JTextField();
        btn7 = new javax.swing.JButton();
        btn8 = new javax.swing.JButton();
        btn9 = new javax.swing.JButton();
        btnClear = new javax.swing.JButton();
        btnCA = new javax.swing.JButton();
        btn5 = new javax.swing.JButton();
        btn6 = new javax.swing.JButton();
        btnMultiply = new javax.swing.JButton();
        btnDivide = new javax.swing.JButton();
        btn4 = new javax.swing.JButton();
        btn2 = new javax.swing.JButton();
        btn3 = new javax.swing.JButton();
        btnPlus = new javax.swing.JButton();
        btnSubtract = new javax.swing.JButton();
        btn1 = new javax.swing.JButton();
        btnDot = new javax.swing.JButton();
        btnSquareRoot = new javax.swing.JButton();
        btnEXP = new javax.swing.JButton();
        btnEqual = new javax.swing.JButton();
        btn0 = new javax.swing.JButton();
        txtDispU = new javax.swing.JTextField();
        txtDispL = new javax.swing.JFormattedTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(204, 0, 0));

        jLabel4.setFont(new java.awt.Font("Gabriola", 0, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("#SFT001");

        jLabel5.setFont(new java.awt.Font("Gabriola", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/maths/icons8_Info_20px.png"))); // NOI18N
        jLabel5.setText("ISoft");

        txtHour.setEditable(false);
        txtHour.setBackground(new java.awt.Color(204, 0, 0));
        txtHour.setFont(new java.awt.Font("Comic Sans MS", 0, 13)); // NOI18N
        txtHour.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtHour.setText("08");
        txtHour.setBorder(null);
        txtHour.setFocusable(false);

        txtMiniute.setEditable(false);
        txtMiniute.setBackground(new java.awt.Color(204, 0, 0));
        txtMiniute.setFont(new java.awt.Font("Comic Sans MS", 0, 13)); // NOI18N
        txtMiniute.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtMiniute.setText("02");
        txtMiniute.setBorder(null);
        txtMiniute.setFocusable(false);

        txtDay.setEditable(false);
        txtDay.setBackground(new java.awt.Color(204, 0, 0));
        txtDay.setFont(new java.awt.Font("Comic Sans MS", 0, 13)); // NOI18N
        txtDay.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtDay.setText("24");
        txtDay.setBorder(null);
        txtDay.setFocusable(false);

        txtMonth.setEditable(false);
        txtMonth.setBackground(new java.awt.Color(204, 0, 0));
        txtMonth.setFont(new java.awt.Font("Comic Sans MS", 0, 13)); // NOI18N
        txtMonth.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtMonth.setText("01");
        txtMonth.setBorder(null);
        txtMonth.setFocusable(false);

        btn7.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btn7.setText("7");
        btn7.setBorderPainted(false);
        btn7.setContentAreaFilled(false);
        btn7.setFocusable(false);
        btn7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn7ActionPerformed(evt);
            }
        });

        btn8.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btn8.setText("8");
        btn8.setBorderPainted(false);
        btn8.setContentAreaFilled(false);
        btn8.setFocusable(false);
        btn8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn8ActionPerformed(evt);
            }
        });

        btn9.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btn9.setText("9");
        btn9.setBorderPainted(false);
        btn9.setContentAreaFilled(false);
        btn9.setFocusable(false);
        btn9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn9ActionPerformed(evt);
            }
        });

        btnClear.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        btnClear.setIcon(new javax.swing.ImageIcon(getClass().getResource("/maths2/icons8_Clear_Symbol_20px_2.png"))); // NOI18N
        btnClear.setActionCommand("DEL");
        btnClear.setBorderPainted(false);
        btnClear.setContentAreaFilled(false);
        btnClear.setFocusable(false);
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });

        btnCA.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnCA.setText("CA");
        btnCA.setBorderPainted(false);
        btnCA.setContentAreaFilled(false);
        btnCA.setFocusable(false);
        btnCA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCAActionPerformed(evt);
            }
        });

        btn5.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btn5.setText("5");
        btn5.setBorderPainted(false);
        btn5.setContentAreaFilled(false);
        btn5.setFocusable(false);
        btn5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn5ActionPerformed(evt);
            }
        });

        btn6.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btn6.setText("6");
        btn6.setBorderPainted(false);
        btn6.setContentAreaFilled(false);
        btn6.setFocusable(false);
        btn6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn6ActionPerformed(evt);
            }
        });

        btnMultiply.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        btnMultiply.setIcon(new javax.swing.ImageIcon(getClass().getResource("/maths2/icons8_Multiply_20px_1.png"))); // NOI18N
        btnMultiply.setActionCommand("x");
        btnMultiply.setBorderPainted(false);
        btnMultiply.setContentAreaFilled(false);
        btnMultiply.setFocusable(false);

        btnDivide.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        btnDivide.setIcon(new javax.swing.ImageIcon(getClass().getResource("/maths2/icons8_Divide_20px.png"))); // NOI18N
        btnDivide.setActionCommand("/");
        btnDivide.setBorderPainted(false);
        btnDivide.setContentAreaFilled(false);
        btnDivide.setFocusable(false);

        btn4.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btn4.setText("4");
        btn4.setBorderPainted(false);
        btn4.setContentAreaFilled(false);
        btn4.setFocusable(false);
        btn4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn4ActionPerformed(evt);
            }
        });

        btn2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btn2.setText("2");
        btn2.setBorderPainted(false);
        btn2.setContentAreaFilled(false);
        btn2.setFocusable(false);
        btn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn2ActionPerformed(evt);
            }
        });

        btn3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btn3.setText("3");
        btn3.setBorderPainted(false);
        btn3.setContentAreaFilled(false);
        btn3.setFocusable(false);
        btn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn3ActionPerformed(evt);
            }
        });

        btnPlus.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        btnPlus.setIcon(new javax.swing.ImageIcon(getClass().getResource("/maths2/icons8_Plus_Math_20px_1.png"))); // NOI18N
        btnPlus.setActionCommand("+");
        btnPlus.setBorderPainted(false);
        btnPlus.setContentAreaFilled(false);
        btnPlus.setFocusable(false);
        btnPlus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPlusActionPerformed(evt);
            }
        });

        btnSubtract.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        btnSubtract.setIcon(new javax.swing.ImageIcon(getClass().getResource("/maths2/icons8_Subtract_20px.png"))); // NOI18N
        btnSubtract.setActionCommand("-");
        btnSubtract.setBorderPainted(false);
        btnSubtract.setContentAreaFilled(false);
        btnSubtract.setFocusable(false);

        btn1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btn1.setText("1");
        btn1.setBorderPainted(false);
        btn1.setContentAreaFilled(false);
        btn1.setFocusable(false);
        btn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn1ActionPerformed(evt);
            }
        });

        btnDot.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        btnDot.setIcon(new javax.swing.ImageIcon(getClass().getResource("/maths2/icons8_Full_Stop_5px.png"))); // NOI18N
        btnDot.setActionCommand(".");
        btnDot.setBorderPainted(false);
        btnDot.setContentAreaFilled(false);
        btnDot.setFocusable(false);
        btnDot.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDotActionPerformed(evt);
            }
        });

        btnSquareRoot.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnSquareRoot.setIcon(new javax.swing.ImageIcon(getClass().getResource("/maths2/icons8_Square_Root_20px.png"))); // NOI18N
        btnSquareRoot.setBorderPainted(false);
        btnSquareRoot.setContentAreaFilled(false);
        btnSquareRoot.setFocusable(false);

        btnEXP.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnEXP.setText("EX");
        btnEXP.setBorderPainted(false);
        btnEXP.setContentAreaFilled(false);
        btnEXP.setFocusable(false);

        btnEqual.setIcon(new javax.swing.ImageIcon(getClass().getResource("/maths2/icons8_Equal_Sign_20px.png"))); // NOI18N
        btnEqual.setActionCommand("=");
        btnEqual.setBorderPainted(false);
        btnEqual.setContentAreaFilled(false);
        btnEqual.setFocusable(false);

        btn0.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btn0.setText("0");
        btn0.setBorderPainted(false);
        btn0.setContentAreaFilled(false);
        btn0.setFocusable(false);
        btn0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn0ActionPerformed(evt);
            }
        });

        txtDispU.setEditable(false);
        txtDispU.setBackground(new java.awt.Color(204, 0, 0));
        txtDispU.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        txtDispU.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtDispU.setBorder(null);
        txtDispU.setFocusable(false);

        txtDispL.setEditable(false);
        txtDispL.setBackground(new java.awt.Color(204, 0, 0));
        txtDispL.setBorder(null);
        txtDispL.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter()));
        txtDispL.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtDispL.setFocusable(false);
        txtDispL.setFont(new java.awt.Font("Dialog", 1, 32)); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtDispL)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(btn0, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(6, 6, 6)
                                    .addComponent(btnDot, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(6, 6, 6)
                                    .addComponent(btnSquareRoot, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(6, 6, 6)
                                    .addComponent(btnEXP, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(6, 6, 6)
                                    .addComponent(btnEqual, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(btn4, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(6, 6, 6)
                                        .addComponent(btn5, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(6, 6, 6)
                                        .addComponent(btn6, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(6, 6, 6)
                                        .addComponent(btnMultiply, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(6, 6, 6)
                                        .addComponent(btnDivide, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(btn7, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(6, 6, 6)
                                        .addComponent(btn8, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(6, 6, 6)
                                        .addComponent(btn9, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(6, 6, 6)
                                        .addComponent(btnClear, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(6, 6, 6)
                                        .addComponent(btnCA, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(btn1, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(6, 6, 6)
                                        .addComponent(btn2, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(6, 6, 6)
                                        .addComponent(btn3, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(6, 6, 6)
                                        .addComponent(btnPlus, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(6, 6, 6)
                                        .addComponent(btnSubtract, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addComponent(txtDispU))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(33, 33, 33))
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtHour, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(txtMiniute, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(txtDay, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(txtMonth, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txtDay, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE)
                            .addComponent(txtMiniute, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtHour, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtMonth))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap(67, Short.MAX_VALUE)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(1, 1, 1)
                        .addComponent(jLabel4)
                        .addGap(18, 18, 18)))
                .addComponent(txtDispU, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(txtDispL, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(152, 152, 152)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(btn8, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn9, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnClear, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCA, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn7, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(btn5, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn6, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnMultiply, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDivide, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn4, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(btn2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn3, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPlus, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSubtract, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(btnDot, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSquareRoot, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEXP, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEqual, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn0, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        if (JOptionPane.showConfirmDialog(null, "Exit Scientific Calculator", "Student Companion",
                JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
            this.dispose();
            CompanionApp.main(null);
        }
    }//GEN-LAST:event_formWindowClosing

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        txtDispL.setText(txtDispL.getText().substring(0, txtDispL.getText().length() - 1));
        if (txtDispL.getText().length() < 1) {
            txtDispL.setText("0");
        }
    }//GEN-LAST:event_btnClearActionPerformed

    private void btn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn2ActionPerformed
        if (txtDispL.getText().equals("0")) {
            txtDispL.setText(btn2.getText());
        } else {
            txtDispL.setText(txtDispL.getText() + btn2.getText());
        }
    }//GEN-LAST:event_btn2ActionPerformed

    private void btn7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn7ActionPerformed
        if (txtDispL.getText().equals("0")) {
            txtDispL.setText(btn7.getText());
        } else {
            txtDispL.setText(txtDispL.getText() + btn7.getText());
        }
    }//GEN-LAST:event_btn7ActionPerformed

    private void btn8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn8ActionPerformed
        if (txtDispL.getText().equals("0")) {
            txtDispL.setText(btn8.getText());
        } else {
            txtDispL.setText(txtDispL.getText() + btn8.getText());
        }
    }//GEN-LAST:event_btn8ActionPerformed

    private void btn9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn9ActionPerformed
        if (txtDispL.getText().equals("0")) {
            txtDispL.setText(btn9.getText());
        } else {
            txtDispL.setText(txtDispL.getText() + btn9.getText());
        }
    }//GEN-LAST:event_btn9ActionPerformed

    private void btn4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn4ActionPerformed
        if (txtDispL.getText().equals("0")) {
            txtDispL.setText(btn4.getText());
        } else {
            txtDispL.setText(txtDispL.getText() + btn4.getText());
        }
    }//GEN-LAST:event_btn4ActionPerformed

    private void btn5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn5ActionPerformed
        if (txtDispL.getText().equals("0")) {
            txtDispL.setText(btn5.getText());
        } else {
            txtDispL.setText(txtDispL.getText() + btn5.getText());
        }
    }//GEN-LAST:event_btn5ActionPerformed

    private void btn6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn6ActionPerformed
        if (txtDispL.getText().equals("0")) {
            txtDispL.setText(btn6.getText());
        } else {
            txtDispL.setText(txtDispL.getText() + btn6.getText());
        }
    }//GEN-LAST:event_btn6ActionPerformed

    private void btn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn1ActionPerformed
        if (txtDispL.getText().equals("0")) {
            txtDispL.setText(btn1.getText());
        } else {
            txtDispL.setText(txtDispL.getText() + btn1.getText());
        }
    }//GEN-LAST:event_btn1ActionPerformed

    private void btn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn3ActionPerformed
        if (txtDispL.getText().equals("0")) {
            txtDispL.setText(btn3.getText());
        } else {
            txtDispL.setText(txtDispL.getText() + btn3.getText());
        }
    }//GEN-LAST:event_btn3ActionPerformed

    private void btn0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn0ActionPerformed
        if (txtDispL.getText().equals("0")) {

            txtDispL.setText("0");
        } else {
            txtDispL.setText(txtDispL.getText() + btn0.getText());
        }
    }//GEN-LAST:event_btn0ActionPerformed

    private void btnDotActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDotActionPerformed
        if (txtDispL.getText().contains(".")) {
            txtDispL.setText(txtDispL.getText() + "");
        } else {
            txtDispL.setText(txtDispL.getText() + btnDot.getActionCommand());
        }
    }//GEN-LAST:event_btnDotActionPerformed

    private void btnCAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCAActionPerformed
        txtDispL.setText("0");
    }//GEN-LAST:event_btnCAActionPerformed

    private void btnPlusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPlusActionPerformed
        if(txtDispU.getText().isEmpty() ){
            txtDispU.setText(txtDispL.getText() + btnPlus.getActionCommand().toString());
            
        }
        else if(!txtDispU.getText().isEmpty()){
            txtDispU.setText(txtDispU.getText() + txtDispL.getText() + btnPlus.getActionCommand());
            Double plus = Double.parseDouble(txtDispU.getText());
            txtDispL.setText("0");
        }
    }//GEN-LAST:event_btnPlusActionPerformed

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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;

                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ScientificCalculator.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ScientificCalculator.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ScientificCalculator.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ScientificCalculator.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ScientificCalculator().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn0;
    private javax.swing.JButton btn1;
    private javax.swing.JButton btn2;
    private javax.swing.JButton btn3;
    private javax.swing.JButton btn4;
    private javax.swing.JButton btn5;
    private javax.swing.JButton btn6;
    private javax.swing.JButton btn7;
    private javax.swing.JButton btn8;
    private javax.swing.JButton btn9;
    private javax.swing.JButton btnCA;
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnDivide;
    private javax.swing.JButton btnDot;
    private javax.swing.JButton btnEXP;
    private javax.swing.JButton btnEqual;
    private javax.swing.JButton btnMultiply;
    private javax.swing.JButton btnPlus;
    private javax.swing.JButton btnSquareRoot;
    private javax.swing.JButton btnSubtract;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtDay;
    public static javax.swing.JFormattedTextField txtDispL;
    private javax.swing.JTextField txtDispU;
    private javax.swing.JTextField txtHour;
    private javax.swing.JTextField txtMiniute;
    private javax.swing.JTextField txtMonth;
    // End of variables declaration//GEN-END:variables
}

class MyMouseAdapter extends MouseAdapter {

    public void mouseClicked(MouseEvent me) {
        if (ScientificCalculator.txtDispL.getText().length() >= 16) {
            ScientificCalculator.txtDispL.setText("0");

        }
    }
}
