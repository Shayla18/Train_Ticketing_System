package TrainTicket1;

import java.awt.Color;
import java.awt.print.Printable;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.awt.print.PrinterJob;

import javax.swing.ImageIcon;
import javax.swing.JApplet;
import javax.swing.JLabel;
 
import java.awt.print.PrinterException;

import java.awt.*;
import java.awt.print.*;
import javax.swing.JOptionPane;

/**
 *
 * @author shayla
 */
public class TrainsTickets extends javax.swing.JFrame {
    
   private String class_name;
    /**
     * Creates new form TrainsTickets
     */
    public TrainsTickets() {
        initComponents();
        jPanel1.setVisible(false);
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        std = new javax.swing.JRadioButton();
        economic = new javax.swing.JRadioButton();
        fstClass = new javax.swing.JRadioButton();
        clsLblLeft = new javax.swing.JLabel();
        tktleft = new javax.swing.JLabel();
        adltleft = new javax.swing.JLabel();
        cldleft = new javax.swing.JLabel();
        single = new javax.swing.JRadioButton();
        rtn = new javax.swing.JRadioButton();
        adultYes = new javax.swing.JRadioButton();
        cldYes = new javax.swing.JRadioButton();
        destination = new javax.swing.JComboBox<>();
        jPanel4 = new javax.swing.JPanel();
        clslblRight = new javax.swing.JLabel();
        tktright = new javax.swing.JLabel();
        adltright = new javax.swing.JLabel();
        cldright = new javax.swing.JLabel();
        tktlblRight1 = new javax.swing.JLabel();
        clsright1 = new javax.swing.JLabel();
        adltright1 = new javax.swing.JLabel();
        cldright1 = new javax.swing.JLabel();
        fromLBL = new javax.swing.JLabel();
        toLBL = new javax.swing.JLabel();
        dateLBL = new javax.swing.JLabel();
        frmlblGET = new javax.swing.JLabel();
        dateGatelbl1 = new javax.swing.JLabel();
        toLBLGet = new javax.swing.JLabel();
        tktNOLBL = new javax.swing.JLabel();
        tktNOGet = new javax.swing.JLabel();
        priceLBL = new javax.swing.JLabel();
        priceGETLBL = new javax.swing.JLabel();
        priceLBL1 = new javax.swing.JLabel();
        routeGetLBL = new javax.swing.JLabel();
        timeLBL = new javax.swing.JLabel();
        timeGetlbl = new javax.swing.JLabel();
        printerBtn = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        subTotalLbl = new javax.swing.JLabel();
        taxLbl = new javax.swing.JLabel();
        totalLbl = new javax.swing.JLabel();
        totalBtn = new javax.swing.JButton();
        resetBtn = new javax.swing.JButton();
        Exit = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        printText = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setBackground(new java.awt.Color(102, 102, 255));
        jLabel1.setFont(new java.awt.Font("Tempus Sans ITC", 3, 78)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 102, 102));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel1.setText("Train Ticketing System");

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/TrainTicket1/train.jpg"))); // NOI18N
        jLabel4.setText("jLabel4");

        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 4));

        std.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        std.setText("Standard");

        economic.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        economic.setText("Economy");

        fstClass.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        fstClass.setText("First Class");
        fstClass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fstClassActionPerformed(evt);
            }
        });

        clsLblLeft.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        clsLblLeft.setText("Class");

        tktleft.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        tktleft.setText("Ticket Type");

        adltleft.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        adltleft.setText("Adult");

        cldleft.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        cldleft.setText("Child");

        single.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        single.setText("Single");

        rtn.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        rtn.setText("Return");

        adultYes.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        adultYes.setText("Yes");
        adultYes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adultYesActionPerformed(evt);
            }
        });

        cldYes.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        cldYes.setText("Yes");
        cldYes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cldYesActionPerformed(evt);
            }
        });

        destination.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        destination.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Destination", "komlapur", "Airport", "Joydebpur", "Tangail" }));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(std)
                            .addComponent(economic)
                            .addComponent(clsLblLeft, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tktleft, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(28, 28, 28)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(rtn)
                                    .addComponent(single)))))
                    .addComponent(fstClass))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(adltleft, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(adultYes))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cldYes)
                            .addComponent(cldleft, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(destination, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(clsLblLeft, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(tktleft, javax.swing.GroupLayout.DEFAULT_SIZE, 73, Short.MAX_VALUE)
                    .addComponent(adltleft, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cldleft, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(adultYes)
                    .addComponent(single)
                    .addComponent(cldYes)
                    .addComponent(std))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(rtn)
                            .addComponent(economic))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(fstClass))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(destination, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(28, 28, 28))
        );

        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 4));

        clslblRight.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        clslblRight.setText("Class");

        tktright.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        tktright.setText("Ticket Type");

        adltright.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        adltright.setText("Adult");

        cldright.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        cldright.setText("Child");

        tktlblRight1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        tktlblRight1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 4));

        clsright1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        clsright1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 4));

        adltright1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        adltright1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 4));

        cldright1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        cldright1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 4));

        fromLBL.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        fromLBL.setText("From");

        toLBL.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        toLBL.setText("To");

        dateLBL.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        dateLBL.setText("Date");

        frmlblGET.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        frmlblGET.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 4));

        dateGatelbl1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        dateGatelbl1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 4));

        toLBLGet.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        toLBLGet.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 4));

        tktNOLBL.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        tktNOLBL.setText("Ticket No.");

        tktNOGet.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        tktNOGet.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 4));

        priceLBL.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        priceLBL.setText("Price");

        priceGETLBL.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        priceGETLBL.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 4));

        priceLBL1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        priceLBL1.setText("Route");

        routeGetLBL.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        routeGetLBL.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 4));

        timeLBL.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        timeLBL.setText("Time");

        timeGetlbl.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        timeGetlbl.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 4));

        printerBtn.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        printerBtn.setText("Print Using printer");
        printerBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                printerBtnMouseClicked(evt);
            }
        });
        printerBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                printerBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(fromLBL, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(clslblRight, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(toLBL, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(timeLBL, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(dateLBL, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(32, 32, 32)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(jPanel4Layout.createSequentialGroup()
                                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(toLBLGet, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(dateGatelbl1, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(timeGetlbl, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGap(18, 18, 18)
                                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(tktNOGet, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(priceGETLBL, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(priceLBL1, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(routeGetLBL, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(priceLBL)))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel4Layout.createSequentialGroup()
                                            .addComponent(tktright)
                                            .addGap(27, 27, 27))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                                            .addGap(0, 0, Short.MAX_VALUE)
                                            .addComponent(tktlblRight1, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(18, 18, 18)))
                                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(adltright1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(adltright, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(34, 34, 34)
                                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(cldright1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                                            .addComponent(cldright, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(11, 11, 11)))))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(frmlblGET, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(tktNOLBL))))
                    .addComponent(clsright1, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(printerBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(103, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(clslblRight)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(cldright, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(adltright, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(tktright, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(adltright1, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(clsright1, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cldright1, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(9, 9, 9))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addComponent(tktlblRight1, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(fromLBL, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(frmlblGET, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tktNOLBL, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(tktNOGet, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(priceLBL, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(priceGETLBL, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(priceLBL1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(routeGetLBL, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(toLBLGet, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(toLBL, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(dateLBL)
                            .addComponent(dateGatelbl1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(timeGetlbl, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(timeLBL))))
                .addGap(19, 19, 19)
                .addComponent(printerBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 4));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel7.setText("Sub Total ");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel8.setText("Tax");

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel9.setText("Total");

        subTotalLbl.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        subTotalLbl.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 4));

        taxLbl.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        taxLbl.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 4));

        totalLbl.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        totalLbl.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 4));

        totalBtn.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        totalBtn.setText("Total");
        totalBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                totalBtnMouseClicked(evt);
            }
        });
        totalBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                totalBtnActionPerformed(evt);
            }
        });

        resetBtn.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        resetBtn.setText("Reset");
        resetBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetBtnActionPerformed(evt);
            }
        });

        Exit.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        Exit.setText("Exit");
        Exit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ExitMouseClicked(evt);
            }
        });
        Exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8)
                            .addComponent(jLabel9))
                        .addGap(87, 87, 87)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(subTotalLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(taxLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(totalLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(139, 139, 139)
                        .addComponent(totalBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addComponent(resetBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(Exit, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel7)
                    .addComponent(subTotalLbl, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addComponent(taxLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(totalLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(totalBtn)
                    .addComponent(resetBtn)
                    .addComponent(Exit))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 4));

        printText.setColumns(20);
        printText.setRows(5);
        jScrollPane1.setViewportView(printText);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 78, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(552, 552, 552))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void fstClassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fstClassActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fstClassActionPerformed

    private void adultYesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adultYesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_adultYesActionPerformed

    private void cldYesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cldYesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cldYesActionPerformed

 
    
    
   /* public void printComponenet(){

  PrinterJob pj = PrinterJob.getPrinterJob();
  pj.setJobName(" Print Component ");

  pj.setPrintable (new Printable() {    
    public int print(Graphics pg, PageFormat pf, int pageNum){
      if (pageNum > 0){
      return Printable.NO_SUCH_PAGE;
      }

      Graphics2D g2 = (Graphics2D) pg;
      g2.translate(pf.getImageableX(), pf.getImageableY());
      //componenet_name.paint(g2);
      return Printable.PAGE_EXISTS;
    }
  });
  if (pj.printDialog() == false)
  return;

  try {
        pj.print();
       // printText.print("hello");
  } catch (PrinterException ex) {
        // handle exception
  }
  
         String Class_name  = clsright1.getText();
         String Ticket_type = tktlblRight1.getText();
          String Adult  = adltright1.getText();
           String Child  = cldright1.getText();
           String from  = frmlblGET.getText();
           String to  = toLBLGet.getText();
           String ticket_no = tktNOGet.getText();
           String date = dateGatelbl1.getText();
             String price = priceGETLBL.getText();
              String time = timeGetlbl.getText();
           String route = routeGetLBL.getText();
           
           
          
        
     printText.append("class\t Ticket Type\tAdult\tChild"
                + "\n-----------------------------------------------------------------------\n"
                +Class_name+"  "+Ticket_type+"\t"+Adult+"\t"+Child+"\n\n\nFrom\t"+from+"\tTicket no: "+"\nTo\t"+to+"\t"+ticket_no+"\n\nDate:\t"+date+"\tPrice: "+price+"\n\nTime\t"+time+"\tRoute: "+route+"\n\n\n");
        
 
}
    */
    
    
    private void printerBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_printerBtnActionPerformed
        // TODO add your handling code here:
        
      //  printComponenet();
        
         try{
      boolean complete = printText.print();
         if (complete) {
             JOptionPane.showMessageDialog(null,"Done Printing","information",JOptionPane.INFORMATION_MESSAGE);
             
         }
         else{
             JOptionPane.showMessageDialog(null,"Printing","printer",JOptionPane.ERROR_MESSAGE);
             
         
         }
     }
     catch(PrinterException e){
         JOptionPane.showMessageDialog(null, e);
         
         
     }
         String Class_name  = clsright1.getText();
         String Ticket_type = tktlblRight1.getText();
          String Adult  = adltright1.getText();
           String Child  = cldright1.getText();
           String from  = frmlblGET.getText();
           String to  = toLBLGet.getText();
           String ticket_no = tktNOGet.getText();
           String date = dateGatelbl1.getText();
             String price = priceGETLBL.getText();
              String time = timeGetlbl.getText();
           String route = routeGetLBL.getText();
           
           
          
        
     printText.append("class\t Ticket Type\tAdult\tChild"
                + "\n-----------------------------------------------------------------------\n"
                +Class_name+"  "+Ticket_type+"\t"+Adult+"\t"+Child+"\n\n\nFrom\t"+from+"\tTicket no: "+"\nTo\t"+to+"\t"+ticket_no+"\n\nDate:\t"+date+"\tPrice: "+price+"\n\nTime\t"+time+"\tRoute: "+route+"\n\n\n");
        
        
    
    
    
       // printText.append("class\t Ticket Type\tAdult\tChild"
         //       + "\n-----------------------------------------------------------------------\n"
           //     +"bjkdsbnnb");
        
    }//GEN-LAST:event_printerBtnActionPerformed

    private void totalBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_totalBtnMouseClicked
        double tax = 19.50;
        double MilesK8=25.78;
        double MilesK12=25.10;
        double MilesK20=45.23;
        double MilesK30=55.98;
        double totalCost,eco=3.85,fClass=5.60;

        if((std.isSelected()) && (single.isSelected()) && (adultYes.isSelected()) && (destination.getSelectedItem().equals("komlapur"))){

            totalCost=(tax*MilesK8)/100;
            String stax=String.format("%.2f tk ", totalCost);
            taxLbl.setText(stax);

            String subtotal = String.format("%.2f tk", MilesK8);
            subTotalLbl.setText(subtotal);

            String total = String.format("%.2f tk", MilesK8+totalCost);
            totalLbl.setText(total);

            priceGETLBL.setText(total);

            clsright1.setText("STD");
            tktlblRight1.setText("Single");
            adltright1.setText("ONE");
            cldright1.setText("NIL");

        }
        else if((std.isSelected()) &&(rtn.isSelected()) && (adultYes.isSelected()) && (destination.getSelectedItem().equals("komlapur"))){

            totalCost=(tax*(MilesK8*2))/100;
            String stax=String.format("%.2f tk ", totalCost);
            taxLbl.setText(stax);

            String subtotal = String.format("%.2f tk", MilesK8*2);
            subTotalLbl.setText(subtotal);

            String total = String.format("%.2f tk", (MilesK8+totalCost)*2);
            totalLbl.setText(total);

            priceGETLBL.setText(total);

            clsright1.setText("STD");
            tktlblRight1.setText("RETURN");
            adltright1.setText("ONE");
            cldright1.setText("NIL");

        }
        else if((std.isSelected()) && (single.isSelected()) && (cldYes.isSelected()) && (destination.getSelectedItem().equals("komlapur"))){

            totalCost=(tax*MilesK8)/100;
            String stax=String.format("%.2f tk ", totalCost-10);
            taxLbl.setText(stax);

            String subtotal = String.format("%.2f tk", MilesK8);
            subTotalLbl.setText(subtotal);

            String total = String.format("%.2f tk", MilesK8+totalCost-10);
            totalLbl.setText(total);

            priceGETLBL.setText(total);

            clsright1.setText("STD");
            tktlblRight1.setText("Single");
            adltright1.setText("NIL");
            cldright1.setText("ONE");

        }
        else if((std.isSelected()) && (rtn.isSelected()) && (cldYes.isSelected()) && (destination.getSelectedItem().equals("komlapur"))){

            totalCost=(tax*(MilesK8*2))/100;
            String stax=String.format("%.2f tk ", totalCost-10);
            taxLbl.setText(stax);

            String subtotal = String.format("%.2f tk", MilesK8*2);
            subTotalLbl.setText(subtotal);

            String total = String.format("%.2f tk", ((MilesK8+totalCost)*2)-10);
            totalLbl.setText(total);

            priceGETLBL.setText(total);

            clsright1.setText("STD");
            tktlblRight1.setText("RETURN");
            adltright1.setText("NIL");
            cldright1.setText("ONE");

        }

        if((economic.isSelected()) && (single.isSelected()) && (adultYes.isSelected()) && (destination.getSelectedItem().equals("komlapur"))){

            totalCost=(tax*MilesK8+eco)/100;
            String stax=String.format("%.2f tk ", totalCost);
            taxLbl.setText(stax);

            String subtotal = String.format("%.2f tk", MilesK8+eco);
            subTotalLbl.setText(subtotal);

            String total = String.format("%.2f tk", MilesK8+eco+totalCost);
            totalLbl.setText(total);

            priceGETLBL.setText(total);

            clsright1.setText("ECONOMIC");
            tktlblRight1.setText("Single");
            adltright1.setText("ONE");
            cldright1.setText("NIL");

        }
        else if((economic.isSelected()) &&(rtn.isSelected()) && (adultYes.isSelected()) && (destination.getSelectedItem().equals("komlapur"))){

            totalCost=(tax*((MilesK8+eco)*2))/100;
            String stax=String.format("%.2f tk ", totalCost);
            taxLbl.setText(stax);

            String subtotal = String.format("%.2f tk", (MilesK8+eco)*2);
            subTotalLbl.setText(subtotal);

            String total = String.format("%.2f tk", (MilesK8+totalCost+eco)*2);
            totalLbl.setText(total);

            priceGETLBL.setText(total);

            clsright1.setText("ECONOMIC");
            tktlblRight1.setText("RETURN");
            adltright1.setText("ONE");
            cldright1.setText("NIL");

        }
        else if((economic.isSelected()) && (single.isSelected()) && (cldYes.isSelected()) && (destination.getSelectedItem().equals("komlapur"))){

            totalCost=(tax*(MilesK8+eco))/100;
            String stax=String.format("%.2f tk ", totalCost-10);
            taxLbl.setText(stax);

            String subtotal = String.format("%.2f tk", MilesK8+eco);
            subTotalLbl.setText(subtotal);

            String total = String.format("%.2f tk", MilesK8+totalCost+eco-10);
            totalLbl.setText(total);

            priceGETLBL.setText(total);

            clsright1.setText("ECONOMIC");
            tktlblRight1.setText("Single");
            adltright1.setText("NIL");
            cldright1.setText("ONE");

        }
        else if((economic.isSelected()) && (rtn.isSelected()) && (cldYes.isSelected()) && (destination.getSelectedItem().equals("komlapur"))){

            totalCost=(tax*((MilesK8+eco)*2))/100;
            String stax=String.format("%.2f tk ", totalCost-10);
            taxLbl.setText(stax);

            String subtotal = String.format("%.2f tk", (MilesK8+eco)*2);
            subTotalLbl.setText(subtotal);

            String total = String.format("%.2f tk", ((MilesK8+totalCost+eco)*2)-10);
            totalLbl.setText(total);

            priceGETLBL.setText(total);

            clsright1.setText("ECONOMIC");
            tktlblRight1.setText("RETURN");
            adltright1.setText("NIL");
            cldright1.setText("ONE");

        }

        else if((fstClass.isSelected()) && (single.isSelected()) && (adultYes.isSelected()) && (destination.getSelectedItem().equals("komlapur"))){

            totalCost=(tax*MilesK8+fClass)/100;
            String stax=String.format("%.2f tk ", totalCost);
            taxLbl.setText(stax);

            String subtotal = String.format("%.2f tk", MilesK8+fClass);
            subTotalLbl.setText(subtotal);

            String total = String.format("%.2f tk", MilesK8+fClass+totalCost);
            totalLbl.setText(total);

            priceGETLBL.setText(total);

            clsright1.setText("FIRST_CLASS");
            tktlblRight1.setText("Single");
            adltright1.setText("ONE");
            cldright1.setText("NIL");

        }
        else if((fstClass.isSelected()) &&(rtn.isSelected()) && (adultYes.isSelected()) && (destination.getSelectedItem().equals("komlapur"))){

            totalCost=(tax*((MilesK8+fClass)*2))/100;
            String stax=String.format("%.2f tk ", totalCost);
            taxLbl.setText(stax);

            String subtotal = String.format("%.2f tk", (MilesK8+fClass)*2);
            subTotalLbl.setText(subtotal);

            String total = String.format("%.2f tk", (MilesK8+totalCost+fClass)*2);
            totalLbl.setText(total);

            priceGETLBL.setText(total);

            clsright1.setText("FIRST_CLASS");
            tktlblRight1.setText("RETURN");
            adltright1.setText("ONE");
            cldright1.setText("NIL");

        }
        else if((fstClass.isSelected()) && (single.isSelected()) && (cldYes.isSelected()) && (destination.getSelectedItem().equals("komlapur"))){

            totalCost=(tax*(MilesK8+fClass))/100;
            String stax=String.format("%.2f tk ", totalCost-10);
            taxLbl.setText(stax);

            String subtotal = String.format("%.2f tk", MilesK8+fClass);
            subTotalLbl.setText(subtotal);

            String total = String.format("%.2f tk", MilesK8+totalCost+fClass-10);
            totalLbl.setText(total);

            priceGETLBL.setText(total);

            clsright1.setText("FIRST_CLASS");
            tktlblRight1.setText("Single");
            adltright1.setText("NIL");
            cldright1.setText("ONE");

        }
        else if((fstClass.isSelected()) && (rtn.isSelected()) && (cldYes.isSelected()) && (destination.getSelectedItem().equals("komlapur"))){

            totalCost=(tax*((MilesK8+fClass)*2))/100;
            String stax=String.format("%.2f tk ", totalCost-10);
            taxLbl.setText(stax);

            String subtotal = String.format("%.2f tk", (MilesK8+fClass)*2);
            subTotalLbl.setText(subtotal);

            String total = String.format("%.2f tk", ((MilesK8+totalCost+fClass)*2)-10);
            totalLbl.setText(total);

            priceGETLBL.setText(total);

            clsright1.setText("FIRST_CLASS");
            tktlblRight1.setText("RETURN");
            adltright1.setText("NIL");
            cldright1.setText("ONE");

        }

        ////

        ////
        else if((std.isSelected()) && (single.isSelected()) && (adultYes.isSelected()) && (destination.getSelectedItem().equals("Airport"))){

            totalCost=(tax*MilesK12)/100;
            String stax=String.format("%.2f tk ", totalCost);
            taxLbl.setText(stax);

            String subtotal = String.format("%.2f tk", MilesK8);
            subTotalLbl.setText(subtotal);

            String total = String.format("%.2f tk", MilesK8+totalCost);
            totalLbl.setText(total);

            priceGETLBL.setText(total);

            clsright1.setText("STD");
            tktlblRight1.setText("Single");
            adltright1.setText("ONE");
            cldright1.setText("NIL");

        }
        else if((std.isSelected()) && (rtn.isSelected()) && (adultYes.isSelected()) && (destination.getSelectedItem().equals("Airport"))){

            totalCost=(tax*(MilesK12*2))/100;
            String stax=String.format("%.2f tk ", totalCost);
            taxLbl.setText(stax);

            String subtotal = String.format("%.2f tk", MilesK12*2);
            subTotalLbl.setText(subtotal);

            String total = String.format("%.2f tk", (MilesK12+totalCost)*2);
            totalLbl.setText(total);

            priceGETLBL.setText(total);

            clsright1.setText("STD");
            tktlblRight1.setText("RETURN");
            adltright1.setText("ONE");
            cldright1.setText("NIL");

        }
        else if((std.isSelected()) && (single.isSelected()) && (cldYes.isSelected()) && (destination.getSelectedItem().equals("Airport"))){

            totalCost=(tax*MilesK12)/100;
            String stax=String.format("%.2f tk ", totalCost-10);
            taxLbl.setText(stax);

            String subtotal = String.format("%.2f tk", MilesK12);
            subTotalLbl.setText(subtotal);

            String total = String.format("%.2f tk", MilesK12+totalCost-10);
            totalLbl.setText(total);

            priceGETLBL.setText(total);

            clsright1.setText("STD");
            tktlblRight1.setText("Single");
            adltright1.setText("NIL");
            cldright1.setText("ONE");

        }
        else if((std.isSelected()) && (rtn.isSelected()) && (cldYes.isSelected()) && (destination.getSelectedItem().equals("Airport"))){

            totalCost=(tax*(MilesK12*2))/100;
            String stax=String.format("%.2f tk ", totalCost-10);
            taxLbl.setText(stax);

            String subtotal = String.format("%.2f tk", MilesK12*2);
            subTotalLbl.setText(subtotal);

            String total = String.format("%.2f tk", ((MilesK12+totalCost)*2)-10);
            totalLbl.setText(total);

            priceGETLBL.setText(total);

            clsright1.setText("STD");
            tktlblRight1.setText("RETURN");
            adltright1.setText("NIL");
            cldright1.setText("ONE");

        }

        /////

        else if((economic.isSelected()) && (single.isSelected()) && (adultYes.isSelected()) && (destination.getSelectedItem().equals("Airport"))){

            totalCost=(tax*(MilesK12+eco))/100;
            String stax=String.format("%.2f tk ", totalCost);
            taxLbl.setText(stax);

            String subtotal = String.format("%.2f tk", MilesK12+eco);
            subTotalLbl.setText(subtotal);

            String total = String.format("%.2f tk", MilesK12+eco+totalCost);
            totalLbl.setText(total);

            priceGETLBL.setText(total);

            clsright1.setText("ECONOMIC");
            tktlblRight1.setText("Single");
            adltright1.setText("ONE");
            cldright1.setText("NIL");

        }
        else if((economic.isSelected()) && (rtn.isSelected()) && (adultYes.isSelected()) && (destination.getSelectedItem().equals("Airport"))){

            totalCost=((tax*(MilesK12+eco)*2))/100;
            String stax=String.format("%.2f tk ", totalCost);
            taxLbl.setText(stax);

            String subtotal = String.format("%.2f tk", (MilesK12+eco)*2);
            subTotalLbl.setText(subtotal);

            String total = String.format("%.2f tk", (MilesK12+eco+totalCost)*2);
            totalLbl.setText(total);

            priceGETLBL.setText(total);

            clsright1.setText("ECONOMIC");
            tktlblRight1.setText("RETURN");
            adltright1.setText("ONE");
            cldright1.setText("NIL");

        }
        else if((economic.isSelected()) && (single.isSelected()) && (cldYes.isSelected()) && (destination.getSelectedItem().equals("Airport"))){

            totalCost=(tax*(MilesK12+eco))/100;
            String stax=String.format("%.2f tk ", totalCost+eco-10);
            taxLbl.setText(stax);

            String subtotal = String.format("%.2f tk", MilesK12);
            subTotalLbl.setText(subtotal);

            String total = String.format("%.2f tk", MilesK12+eco+totalCost-10);
            totalLbl.setText(total);

            priceGETLBL.setText(total);

            clsright1.setText("ECONOMIC");
            tktlblRight1.setText("Single");
            adltright1.setText("NIL");
            cldright1.setText("ONE");

        }
        else if((economic.isSelected()) && (rtn.isSelected()) && (cldYes.isSelected()) && (destination.getSelectedItem().equals("Airport"))){

            totalCost=((tax*(MilesK12+eco)*2))/100;
            String stax=String.format("%.2f tk ", totalCost-10);
            taxLbl.setText(stax);

            String subtotal = String.format("%.2f tk", (MilesK12+eco)*2);
            subTotalLbl.setText(subtotal);

            String total = String.format("%.2f tk", ((MilesK12+eco+totalCost)*2)-10);
            totalLbl.setText(total);

            priceGETLBL.setText(total);

            clsright1.setText("ECONOMIC");
            tktlblRight1.setText("RETURN");
            adltright1.setText("NIL");
            cldright1.setText("ONE");

        }

        else if((fstClass.isSelected()) && (single.isSelected()) && (adultYes.isSelected()) && (destination.getSelectedItem().equals("Airport"))){

            totalCost=(tax*(MilesK12+fClass))/100;
            String stax=String.format("%.2f tk ", totalCost);
            taxLbl.setText(stax);

            String subtotal = String.format("%.2f tk", MilesK12+fClass);
            subTotalLbl.setText(subtotal);

            String total = String.format("%.2f tk", MilesK12+fClass+totalCost);
            totalLbl.setText(total);

            priceGETLBL.setText(total);

            clsright1.setText("FIRST_CLASS");
            tktlblRight1.setText("Single");
            adltright1.setText("ONE");
            cldright1.setText("NIL");

        }
        else if((fstClass.isSelected()) && (rtn.isSelected()) && (adultYes.isSelected()) && (destination.getSelectedItem().equals("Airport"))){

            totalCost=((tax*(MilesK12+fClass)*2))/100;
            String stax=String.format("%.2f tk ", totalCost);
            taxLbl.setText(stax);

            String subtotal = String.format("%.2f tk", (MilesK12+fClass)*2);
            subTotalLbl.setText(subtotal);

            String total = String.format("%.2f tk", (MilesK12+fClass+totalCost)*2);
            totalLbl.setText(total);

            priceGETLBL.setText(total);

            clsright1.setText("FIRST_CLASS");
            tktlblRight1.setText("RETURN");
            adltright1.setText("ONE");
            cldright1.setText("NIL");

        }
        else if((fstClass.isSelected()) && (single.isSelected()) && (cldYes.isSelected()) && (destination.getSelectedItem().equals("Airport"))){

            totalCost=(tax*(MilesK12+fClass))/100;
            String stax=String.format("%.2f tk ", totalCost+fClass-10);
            taxLbl.setText(stax);

            String subtotal = String.format("%.2f tk", MilesK12);
            subTotalLbl.setText(subtotal);

            String total = String.format("%.2f tk", MilesK12+fClass+totalCost-10);
            totalLbl.setText(total);

            priceGETLBL.setText(total);

            clsright1.setText("FIRST_CLASS");
            tktlblRight1.setText("Single");
            adltright1.setText("NIL");
            cldright1.setText("ONE");

        }
        else if((fstClass.isSelected()) && (rtn.isSelected()) && (cldYes.isSelected()) && (destination.getSelectedItem().equals("Airport"))){

            totalCost=((tax*(MilesK12+fClass)*2))/100;
            String stax=String.format("%.2f tk ", totalCost-10);
            taxLbl.setText(stax);

            String subtotal = String.format("%.2f tk", (MilesK12+fClass)*2);
            subTotalLbl.setText(subtotal);

            String total = String.format("%.2f tk", ((MilesK12+fClass+totalCost)*2)-10);
            totalLbl.setText(total);

            priceGETLBL.setText(total);

            clsright1.setText("FIRST_CLASS");
            tktlblRight1.setText("RETURN");
            adltright1.setText("NIL");
            cldright1.setText("ONE");

        }

        else if((std.isSelected()) && (single.isSelected()) && (adultYes.isSelected()) && (destination.getSelectedItem().equals("Joydebpur"))){

            totalCost=(tax*MilesK20)/100;
            String stax=String.format("%.2f tk ", totalCost);
            taxLbl.setText(stax);

            String subtotal = String.format("%.2f tk", MilesK8);
            subTotalLbl.setText(subtotal);

            String total = String.format("%.2f tk", MilesK8+totalCost);
            totalLbl.setText(total);

            priceGETLBL.setText(total);

            clsright1.setText("STD");
            tktlblRight1.setText("Single");
            adltright1.setText("ONE");
            cldright1.setText("NIL");

        }
        else if((std.isSelected()) && (rtn.isSelected()) && (adultYes.isSelected()) && (destination.getSelectedItem().equals("Joydebpur"))){

            totalCost=(tax*(MilesK20*2))/100;
            String stax=String.format("%.2f tk ", totalCost);
            taxLbl.setText(stax);

            String subtotal = String.format("%.2f tk", MilesK20*2);
            subTotalLbl.setText(subtotal);

            String total = String.format("%.2f tk", (MilesK20+totalCost)*2);
            totalLbl.setText(total);

            priceGETLBL.setText(total);

            clsright1.setText("STD");
            tktlblRight1.setText("RETURN");
            adltright1.setText("ONE");
            cldright1.setText("NIL");

        }
        else if((std.isSelected()) && (single.isSelected()) && (cldYes.isSelected()) && (destination.getSelectedItem().equals("Joydebpur"))){

            totalCost=(tax*MilesK20)/100;
            String stax=String.format("%.2f tk ", totalCost-10);
            taxLbl.setText(stax);

            String subtotal = String.format("%.2f tk", MilesK20);
            subTotalLbl.setText(subtotal);

            String total = String.format("%.2f tk", MilesK20+totalCost-10);
            totalLbl.setText(total);

            priceGETLBL.setText(total);

            clsright1.setText("STD");
            tktlblRight1.setText("Single");
            adltright1.setText("NIL");
            cldright1.setText("ONE");

        }

        else if((std.isSelected()) && (rtn.isSelected()) && (cldYes.isSelected()) && (destination.getSelectedItem().equals("Joydebpur"))){

            totalCost=(tax*(MilesK20*2))/100;
            String stax=String.format("%.2f tk ", totalCost-10);
            taxLbl.setText(stax);

            String subtotal = String.format("%.2f tk", MilesK20*2);
            subTotalLbl.setText(subtotal);

            String total = String.format("%.2f tk", ((MilesK20+totalCost)*2)-10);
            totalLbl.setText(total);

            priceGETLBL.setText(total);

            clsright1.setText("STD");
            tktlblRight1.setText("RETURN");
            adltright1.setText("NIL");
            cldright1.setText("ONE");

        }

        ///////
        else if((economic.isSelected()) && (single.isSelected()) && (adultYes.isSelected()) && (destination.getSelectedItem().equals("Joydebpur"))){

            totalCost=(tax*(MilesK20+eco))/100;
            String stax=String.format("%.2f tk ", totalCost);
            taxLbl.setText(stax);

            String subtotal = String.format("%.2f tk", MilesK20+eco);
            subTotalLbl.setText(subtotal);

            String total = String.format("%.2f tk", MilesK20+eco+totalCost);
            totalLbl.setText(total);

            priceGETLBL.setText(total);

            clsright1.setText("ECONOMIC");
            tktlblRight1.setText("Single");
            adltright1.setText("ONE");
            cldright1.setText("NIL");

        }
        else if((economic.isSelected()) && (rtn.isSelected()) && (adultYes.isSelected()) && (destination.getSelectedItem().equals("Joydebpur"))){

            totalCost=((tax*(MilesK20+eco)*2))/100;
            String stax=String.format("%.2f tk ", totalCost);
            taxLbl.setText(stax);

            String subtotal = String.format("%.2f tk", (MilesK20+eco)*2);
            subTotalLbl.setText(subtotal);

            String total = String.format("%.2f tk", (MilesK20+eco+totalCost)*2);
            totalLbl.setText(total);

            priceGETLBL.setText(total);

            clsright1.setText("ECONOMIC");
            tktlblRight1.setText("RETURN");
            adltright1.setText("ONE");
            cldright1.setText("NIL");

        }
        else if((economic.isSelected()) && (single.isSelected()) && (cldYes.isSelected()) && (destination.getSelectedItem().equals("Joydebpur"))){

            totalCost=(tax*(MilesK20+eco))/100;
            String stax=String.format("%.2f tk ", totalCost-10);
            taxLbl.setText(stax);

            String subtotal = String.format("%.2f tk", MilesK20+eco);
            subTotalLbl.setText(subtotal);

            String total = String.format("%.2f tk", MilesK20+eco+totalCost-10);
            totalLbl.setText(total);

            priceGETLBL.setText(total);

            clsright1.setText("ECONOMIC");
            tktlblRight1.setText("Single");
            adltright1.setText("NIL");
            cldright1.setText("ONE");

        }

        else if((economic.isSelected()) && (rtn.isSelected()) && (cldYes.isSelected()) && (destination.getSelectedItem().equals("Joydebpur"))){

            totalCost=(tax*(MilesK20+eco)*2)/100;
            String stax=String.format("%.2f tk ", totalCost-10);
            taxLbl.setText(stax);

            String subtotal = String.format("%.2f tk", (MilesK20+eco)*2);
            subTotalLbl.setText(subtotal);

            String total = String.format("%.2f tk", ((MilesK20+eco+totalCost)*2)-10);
            totalLbl.setText(total);

            priceGETLBL.setText(total);

            clsright1.setText("ECONOMIC");
            tktlblRight1.setText("RETURN");
            adltright1.setText("NIL");
            cldright1.setText("ONE");

        }

        else if((fstClass.isSelected()) && (single.isSelected()) && (adultYes.isSelected()) && (destination.getSelectedItem().equals("Joydebpur"))){

            totalCost=(tax*(MilesK20+fClass))/100;
            String stax=String.format("%.2f tk ", totalCost);
            taxLbl.setText(stax);

            String subtotal = String.format("%.2f tk", MilesK20+fClass);
            subTotalLbl.setText(subtotal);

            String total = String.format("%.2f tk", MilesK20+fClass+totalCost);
            totalLbl.setText(total);

            priceGETLBL.setText(total);

            clsright1.setText("FIRST_CLASS");
            tktlblRight1.setText("Single");
            adltright1.setText("ONE");
            cldright1.setText("NIL");

        }
        else if((fstClass.isSelected()) && (rtn.isSelected()) && (adultYes.isSelected()) && (destination.getSelectedItem().equals("Joydebpur"))){

            totalCost=((tax*(MilesK20+fClass)*2))/100;
            String stax=String.format("%.2f tk ", totalCost);
            taxLbl.setText(stax);

            String subtotal = String.format("%.2f tk", (MilesK20+fClass)*2);
            subTotalLbl.setText(subtotal);

            String total = String.format("%.2f tk", (MilesK20+fClass+totalCost)*2);
            totalLbl.setText(total);

            priceGETLBL.setText(total);

            clsright1.setText("FIRST_CLASS");
            tktlblRight1.setText("RETURN");
            adltright1.setText("ONE");
            cldright1.setText("NIL");

        }
        else if((fstClass.isSelected()) && (single.isSelected()) && (cldYes.isSelected()) && (destination.getSelectedItem().equals("Joydebpur"))){

            totalCost=(tax*(MilesK20+fClass))/100;
            String stax=String.format("%.2f tk ", totalCost-10);
            taxLbl.setText(stax);

            String subtotal = String.format("%.2f tk", MilesK20+fClass);
            subTotalLbl.setText(subtotal);

            String total = String.format("%.2f tk", MilesK20+fClass+totalCost-10);
            totalLbl.setText(total);

            priceGETLBL.setText(total);

            clsright1.setText("FIRST_CLASS");
            tktlblRight1.setText("Single");
            adltright1.setText("NIL");
            cldright1.setText("ONE");

        }

        else if((fstClass.isSelected()) && (rtn.isSelected()) && (cldYes.isSelected()) && (destination.getSelectedItem().equals("Joydebpur"))){

            totalCost=(tax*(MilesK20+fClass)*2)/100;
            String stax=String.format("%.2f tk ", totalCost-10);
            taxLbl.setText(stax);

            String subtotal = String.format("%.2f tk", (MilesK20+fClass)*2);
            subTotalLbl.setText(subtotal);

            String total = String.format("%.2f tk", ((MilesK20+fClass+totalCost)*2)-10);
            totalLbl.setText(total);

            priceGETLBL.setText(total);

            clsright1.setText("FIRST_CLASS");
            tktlblRight1.setText("RETURN");
            adltright1.setText("NIL");
            cldright1.setText("ONE");

        }

        else if((std.isSelected()) && (single.isSelected()) && (adultYes.isSelected()) && (destination.getSelectedItem().equals("Tangail"))){

            totalCost=(tax*MilesK30)/100;
            String stax=String.format("%.2f tk ", totalCost);
            taxLbl.setText(stax);

            String subtotal = String.format("%.2f tk", MilesK8);
            subTotalLbl.setText(subtotal);

            String total = String.format("%.2f tk", MilesK8+totalCost);
            totalLbl.setText(total);

            priceGETLBL.setText(total);

            clsright1.setText("STD");
            tktlblRight1.setText("Single");
            adltright1.setText("ONE");
            cldright1.setText("NIL");

        }

        else if((std.isSelected()) && (rtn.isSelected()) && (adultYes.isSelected()) && (destination.getSelectedItem().equals("Tangail"))){

            totalCost=(tax*(MilesK30*2))/100;
            String stax=String.format("%.2f tk ", totalCost);
            taxLbl.setText(stax);

            String subtotal = String.format("%.2f tk", MilesK30*2);
            subTotalLbl.setText(subtotal);

            String total = String.format("%.2f tk", (MilesK30+totalCost)*2);
            totalLbl.setText(total);

            priceGETLBL.setText(total);

            clsright1.setText("STD");
            tktlblRight1.setText("RETURN");
            adltright1.setText("ONE");
            cldright1.setText("NIL");

        }

        else if((std.isSelected()) && (single.isSelected()) && (cldYes.isSelected()) && (destination.getSelectedItem().equals("Tangail"))){

            totalCost=(tax*MilesK30)/100;
            String stax=String.format("%.2f tk ", totalCost-10);
            taxLbl.setText(stax);

            String subtotal = String.format("%.2f tk", MilesK30);
            subTotalLbl.setText(subtotal);

            String total = String.format("%.2f tk", MilesK30+totalCost-10);
            totalLbl.setText(total);

            priceGETLBL.setText(total);

            clsright1.setText("STD");
            tktlblRight1.setText("Single");
            adltright1.setText("NIL");
            cldright1.setText("ONE");

        }
        else if((std.isSelected()) && (rtn.isSelected()) && (cldYes.isSelected()) && (destination.getSelectedItem().equals("Tangail"))){

            totalCost=(tax*(MilesK30*2))/100;
            String stax=String.format("%.2f tk ", totalCost-10);
            taxLbl.setText(stax);

            String subtotal = String.format("%.2f tk", MilesK30*2);
            subTotalLbl.setText(subtotal);

            String total = String.format("%.2f tk", ((MilesK30+totalCost)*2)-10);
            totalLbl.setText(total);

            priceGETLBL.setText(total);

            clsright1.setText("STD");
            tktlblRight1.setText("RETURN");
            adltright1.setText("NIL");
            cldright1.setText("ONE");

        }

        ///////

        else if((economic.isSelected()) && (single.isSelected()) && (adultYes.isSelected()) && (destination.getSelectedItem().equals("Tangail"))){

            totalCost=(tax*(MilesK30+eco))/100;
            String stax=String.format("%.2f tk ", totalCost);
            taxLbl.setText(stax);

            String subtotal = String.format("%.2f tk", MilesK30+eco);
            subTotalLbl.setText(subtotal);

            String total = String.format("%.2f tk", MilesK30+eco+totalCost);
            totalLbl.setText(total);

            priceGETLBL.setText(total);

            clsright1.setText("ECONOMIC");
            tktlblRight1.setText("Single");
            adltright1.setText("ONE");
            cldright1.setText("NIL");

        }

        else if((economic.isSelected()) && (rtn.isSelected()) && (adultYes.isSelected()) && (destination.getSelectedItem().equals("Tangail"))){

            totalCost=(tax*(MilesK30+eco)*2)/100;
            String stax=String.format("%.2f tk ", totalCost);
            taxLbl.setText(stax);

            String subtotal = String.format("%.2f tk", (MilesK30+eco)*2);
            subTotalLbl.setText(subtotal);

            String total = String.format("%.2f tk", (MilesK30+eco+totalCost)*2);
            totalLbl.setText(total);

            priceGETLBL.setText(total);

            clsright1.setText("ECONOMIC");
            tktlblRight1.setText("RETURN");
            adltright1.setText("ONE");
            cldright1.setText("NIL");

        }

        else if((economic.isSelected()) && (single.isSelected()) && (cldYes.isSelected()) && (destination.getSelectedItem().equals("Tangail"))){

            totalCost=(tax*(MilesK30+eco))/100;
            String stax=String.format("%.2f tk ", totalCost-10);
            taxLbl.setText(stax);

            String subtotal = String.format("%.2f tk", MilesK30+eco);
            subTotalLbl.setText(subtotal);

            String total = String.format("%.2f tk", MilesK30+eco+totalCost-10);
            totalLbl.setText(total);

            priceGETLBL.setText(total);

            clsright1.setText("ECONOMIC");
            tktlblRight1.setText("Single");
            adltright1.setText("NIL");
            cldright1.setText("ONE");

        }
        else if((economic.isSelected()) && (rtn.isSelected()) && (cldYes.isSelected()) && (destination.getSelectedItem().equals("Tangail"))){

            totalCost=(tax*(MilesK30+eco)*2)/100;
            String stax=String.format("%.2f tk ", totalCost-10);
            taxLbl.setText(stax);

            String subtotal = String.format("%.2f tk", (MilesK30+eco)*2);
            subTotalLbl.setText(subtotal);

            String total = String.format("%.2f tk", ((MilesK30+eco+totalCost)*2)-10);
            totalLbl.setText(total);

            priceGETLBL.setText(total);

            clsright1.setText("ECONOMIC");
            tktlblRight1.setText("RETURN");
            adltright1.setText("NIL");
            cldright1.setText("ONE");

        }

        ///////

        else if((fstClass.isSelected()) && (single.isSelected()) && (adultYes.isSelected()) && (destination.getSelectedItem().equals("Tangail"))){

            totalCost=(tax*(MilesK30+fClass))/100;
            String stax=String.format("%.2f tk ", totalCost);
            taxLbl.setText(stax);

            String subtotal = String.format("%.2f tk", MilesK30+fClass);
            subTotalLbl.setText(subtotal);

            String total = String.format("%.2f tk", MilesK30+fClass+totalCost);
            totalLbl.setText(total);

            priceGETLBL.setText(total);

            clsright1.setText("FIRST_CLASS");
            tktlblRight1.setText("Single");
            adltright1.setText("ONE");
            cldright1.setText("NIL");

        }

        else if((fstClass.isSelected()) && (rtn.isSelected()) && (adultYes.isSelected()) && (destination.getSelectedItem().equals("Tangail"))){

            totalCost=(tax*(MilesK30+fClass)*2)/100;
            String stax=String.format("%.2f tk ", totalCost);
            taxLbl.setText(stax);

            String subtotal = String.format("%.2f tk", (MilesK30+fClass)*2);
            subTotalLbl.setText(subtotal);

            String total = String.format("%.2f tk", (MilesK30+fClass+totalCost)*2);
            totalLbl.setText(total);

            priceGETLBL.setText(total);

            clsright1.setText("FIRST_CLASS");
            tktlblRight1.setText("RETURN");
            adltright1.setText("ONE");
            cldright1.setText("NIL");

        }

        else if((fstClass.isSelected()) && (single.isSelected()) && (cldYes.isSelected()) && (destination.getSelectedItem().equals("Tangail"))){

            totalCost=(tax*(MilesK30+fClass))/100;
            String stax=String.format("%.2f tk ", totalCost-10);
            taxLbl.setText(stax);

            String subtotal = String.format("%.2f tk", MilesK30+fClass);
            subTotalLbl.setText(subtotal);

            String total = String.format("%.2f tk", MilesK30+fClass+totalCost-10);
            totalLbl.setText(total);

            priceGETLBL.setText(total);

            clsright1.setText("FIRST_CLASS");
            tktlblRight1.setText("Single");
            adltright1.setText("NIL");
            cldright1.setText("ONE");

        }
        else if((fstClass.isSelected()) && (rtn.isSelected()) && (cldYes.isSelected()) && (destination.getSelectedItem().equals("Tangail"))){

            totalCost=(tax*(MilesK30+fClass)*2)/100;
            String stax=String.format("%.2f tk ", totalCost-10);
            taxLbl.setText(stax);

            String subtotal = String.format("%.2f tk", (MilesK30+fClass)*2);
            subTotalLbl.setText(subtotal);

            String total = String.format("%.2f tk", ((MilesK30+fClass+totalCost)*2)-10);
            totalLbl.setText(total);

            priceGETLBL.setText(total);

            clsright1.setText("FIRST_CLASS");
            tktlblRight1.setText("RETURN");
            adltright1.setText("NIL");
            cldright1.setText("ONE");

        }

        ///////

    }//GEN-LAST:event_totalBtnMouseClicked

    private void totalBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_totalBtnActionPerformed

        Calendar timer = Calendar.getInstance();
        timer.getTime();
        SimpleDateFormat tTime = new SimpleDateFormat("HH:mm:ss");
        timeGetlbl.setText(tTime.format(timer.getTime()));

        SimpleDateFormat Tdate = new SimpleDateFormat("dd-MMM-YYYY");
        dateGatelbl1.setText(Tdate.format(timer.getTime()));

        frmlblGET.setText("Cantonment * ");
        toLBLGet.setText((String)destination.getSelectedItem()+" * ");

        int num1;
        String q1="";
        num1= 1325+ (int) (Math.random()*4238);
        q1+=num1+1325;
        tktNOGet.setText(q1);

        routeGetLBL.setText("ANY");

    }//GEN-LAST:event_totalBtnActionPerformed

    private void resetBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetBtnActionPerformed
        subTotalLbl.setText(null);
        taxLbl.setText(null);
        totalLbl.setText(null);
        clsright1.setText(null);
        tktlblRight1.setText(null);
        adltright1.setText(null);
        cldright1.setText(null);
        frmlblGET.setText(null);
        toLBLGet.setText(null);
        dateGatelbl1.setText(null);
        timeGetlbl.setText(null);
        tktNOGet.setText(null);
        priceGETLBL.setText(null);
        routeGetLBL.setText(null);

        //radio button uncheck
        std.setSelected(false);
        economic.setSelected(false);
        fstClass.setSelected(false);
        single.setSelected(false);
        rtn.setSelected(false);
        adultYes.setSelected(false);
        cldYes.setSelected(false);

    }//GEN-LAST:event_resetBtnActionPerformed

    private void ExitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ExitMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_ExitMouseClicked

    private void ExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_ExitActionPerformed

    private void printerBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_printerBtnMouseClicked
        // TODO add your handling code here:
      /*  try{
      boolean complete = printText.print();
         if (complete) {
             JOptionPane.showMessageDialog(null,"Done Printing","information",JOptionPane.INFORMATION_MESSAGE);
             
         }
         else{
             JOptionPane.showMessageDialog(null,"Printing","printer",JOptionPane.ERROR_MESSAGE);
             
         
         }
     }
     catch(PrinterException e){
         JOptionPane.showMessageDialog(null, e);
         
         
     }
        */
      /*   String Class_name  = clsright1.getText();
         String Ticket_type = tktlblRight1.getText();
          String Adult  = adltright1.getText();
           String Child  = cldright1.getText();
           String from  = frmlblGET.getText();
           String to  = toLBLGet.getText();
           String ticket_no = tktNOGet.getText();
           String date = dateGatelbl1.getText();
             String price = priceGETLBL.getText();
              String time = timeGetlbl.getText();
           String route = routeGetLBL.getText();
           
           
          
        
     printText.append("class\t Ticket Type\tAdult\tChild"
                + "\n-----------------------------------------------------------------------\n"
                +Class_name+"  "+Ticket_type+"\t"+Adult+"\t"+Child+"\n\n\nFrom\t"+from+"\tTicket no: "+"\nTo\t"+to+"\t"+ticket_no+"\n\nDate:\t"+date+"\tPrice: "+price+"\n\nTime\t"+time+"\tRoute: "+route+"\n\n\n");
        
     */
    }//GEN-LAST:event_printerBtnMouseClicked


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
            java.util.logging.Logger.getLogger(TrainsTickets.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TrainsTickets.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TrainsTickets.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TrainsTickets.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TrainsTickets().setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Exit;
    private javax.swing.JLabel adltleft;
    private javax.swing.JLabel adltright;
    private javax.swing.JLabel adltright1;
    private javax.swing.JRadioButton adultYes;
    private javax.swing.JRadioButton cldYes;
    private javax.swing.JLabel cldleft;
    private javax.swing.JLabel cldright;
    private javax.swing.JLabel cldright1;
    private javax.swing.JLabel clsLblLeft;
    private javax.swing.JLabel clslblRight;
    private javax.swing.JLabel clsright1;
    private javax.swing.JLabel dateGatelbl1;
    private javax.swing.JLabel dateLBL;
    private javax.swing.JComboBox<String> destination;
    private javax.swing.JRadioButton economic;
    private javax.swing.JLabel frmlblGET;
    private javax.swing.JLabel fromLBL;
    private javax.swing.JRadioButton fstClass;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel priceGETLBL;
    private javax.swing.JLabel priceLBL;
    private javax.swing.JLabel priceLBL1;
    private javax.swing.JTextArea printText;
    private javax.swing.JButton printerBtn;
    private javax.swing.JButton resetBtn;
    private javax.swing.JLabel routeGetLBL;
    private javax.swing.JRadioButton rtn;
    private javax.swing.JRadioButton single;
    private javax.swing.JRadioButton std;
    private javax.swing.JLabel subTotalLbl;
    private javax.swing.JLabel taxLbl;
    private javax.swing.JLabel timeGetlbl;
    private javax.swing.JLabel timeLBL;
    private javax.swing.JLabel tktNOGet;
    private javax.swing.JLabel tktNOLBL;
    private javax.swing.JLabel tktlblRight1;
    private javax.swing.JLabel tktleft;
    private javax.swing.JLabel tktright;
    private javax.swing.JLabel toLBL;
    private javax.swing.JLabel toLBLGet;
    private javax.swing.JButton totalBtn;
    private javax.swing.JLabel totalLbl;
    // End of variables declaration//GEN-END:variables

    
}
