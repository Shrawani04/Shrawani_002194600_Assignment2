/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;

import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;
import model.Car;
import model.CarFleet;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;

/**
 *
 * @author karpe.s@northeastern.edu
 */
public class CreateJPanel extends javax.swing.JPanel {

    /**
     * Creates new form CreateJPanel
     */
    CarFleet carFleetDetails;
    public boolean isValid = false;
    public boolean isFormValid = false;
            
    public CreateJPanel(CarFleet carFleetDetails) {
        initComponents();
        this.carFleetDetails = carFleetDetails;
        saveButton.setEnabled(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnTitle = new javax.swing.JLabel();
        modelNumLabel = new javax.swing.JLabel();
        serialNumLabel = new javax.swing.JLabel();
        madeByLabel = new javax.swing.JLabel();
        lblManufacturedDate = new javax.swing.JLabel();
        seatAvailLable = new javax.swing.JLabel();
        usedByLabel = new javax.swing.JLabel();
        cityLabel = new javax.swing.JLabel();
        certExpireLabel = new javax.swing.JLabel();
        modelNumText = new javax.swing.JTextField();
        serialNumText = new javax.swing.JTextField();
        manuDateText = new javax.swing.JTextField();
        txtSeatCapacity = new javax.swing.JTextField();
        cityText = new javax.swing.JTextField();
        certExpDateText = new javax.swing.JTextField();
        saveButton = new javax.swing.JButton();
        isAvailableLabel = new javax.swing.JLabel();
        availBox = new java.awt.Checkbox();
        appBox = new javax.swing.JComboBox<>();
        lblTitleSubHeading = new javax.swing.JLabel();
        carModelBox = new javax.swing.JComboBox<>();
        lblManuDateErrMsg = new javax.swing.JLabel();
        lblMaintDateExpErrMsg = new javax.swing.JLabel();
        lblModelNumErrMsg = new javax.swing.JLabel();
        lblSerialNumErrMsg = new javax.swing.JLabel();
        lblSeatCapacityErrMsg = new javax.swing.JLabel();

        setBackground(new java.awt.Color(214, 238, 255));

        btnTitle.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        btnTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnTitle.setText("Enter Car Details");
        btnTitle.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        modelNumLabel.setFont(new java.awt.Font("Times New Roman", 1, 13)); // NOI18N
        modelNumLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        modelNumLabel.setText("Model Number");
        modelNumLabel.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        serialNumLabel.setFont(new java.awt.Font("Times New Roman", 1, 13)); // NOI18N
        serialNumLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        serialNumLabel.setText("Serial Number");
        serialNumLabel.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        madeByLabel.setFont(new java.awt.Font("Times New Roman", 0, 13)); // NOI18N
        madeByLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        madeByLabel.setText("Car Model");
        madeByLabel.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        lblManufacturedDate.setFont(new java.awt.Font("Times New Roman", 0, 13)); // NOI18N
        lblManufacturedDate.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblManufacturedDate.setText("Manufactured On");
        lblManufacturedDate.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        seatAvailLable.setFont(new java.awt.Font("Times New Roman", 0, 13)); // NOI18N
        seatAvailLable.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        seatAvailLable.setText("Number of Seats Available");
        seatAvailLable.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        usedByLabel.setFont(new java.awt.Font("Times New Roman", 0, 13)); // NOI18N
        usedByLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        usedByLabel.setText("Available on App");
        usedByLabel.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        cityLabel.setFont(new java.awt.Font("Times New Roman", 0, 13)); // NOI18N
        cityLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        cityLabel.setText("City");
        cityLabel.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        certExpireLabel.setFont(new java.awt.Font("Times New Roman", 0, 13)); // NOI18N
        certExpireLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        certExpireLabel.setText("Certificate Expire Date");
        certExpireLabel.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        modelNumText.setToolTipText("Only accepts numeric value");
        modelNumText.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        modelNumText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modelNumTextActionPerformed(evt);
            }
        });
        modelNumText.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                modelNumTextKeyPressed(evt);
            }
        });

        serialNumText.setToolTipText("Only accepts numeric value");
        serialNumText.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        serialNumText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                serialNumTextActionPerformed(evt);
            }
        });
        serialNumText.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                serialNumTextKeyPressed(evt);
            }
        });

        manuDateText.setToolTipText("Enter Date as MM/dd/yyyy");
        manuDateText.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        manuDateText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manuDateTextActionPerformed(evt);
            }
        });
        manuDateText.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                manuDateTextKeyPressed(evt);
            }
        });

        txtSeatCapacity.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtSeatCapacity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSeatCapacityActionPerformed(evt);
            }
        });
        txtSeatCapacity.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtSeatCapacityKeyPressed(evt);
            }
        });

        cityText.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        cityText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cityTextActionPerformed(evt);
            }
        });
        cityText.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                cityTextKeyPressed(evt);
            }
        });

        certExpDateText.setToolTipText("Enter Date as MM/dd/yyyy");
        certExpDateText.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        certExpDateText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                certExpDateTextActionPerformed(evt);
            }
        });
        certExpDateText.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                certExpDateTextKeyPressed(evt);
            }
        });

        saveButton.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        saveButton.setText("OK");
        saveButton.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        saveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveButtonActionPerformed(evt);
            }
        });

        isAvailableLabel.setFont(new java.awt.Font("Times New Roman", 0, 13)); // NOI18N
        isAvailableLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        isAvailableLabel.setText("Car Availability");
        isAvailableLabel.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        availBox.setLabel("Is Available");

        appBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Uber", "Lyft", "Ola", "All" }));
        appBox.setSelectedIndex(-1);
        appBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                appBoxActionPerformed(evt);
            }
        });

        lblTitleSubHeading.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        lblTitleSubHeading.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitleSubHeading.setText("Fill all Mandatory fields (Marked Bold)");

        carModelBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Acura", "Audi", "Bentley", "Cadillac", "Dodge" }));
        carModelBox.setSelectedIndex(-1);
        carModelBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                carModelBoxActionPerformed(evt);
            }
        });

        lblManuDateErrMsg.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        lblMaintDateExpErrMsg.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        lblModelNumErrMsg.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        lblSerialNumErrMsg.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        lblSeatCapacityErrMsg.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblManufacturedDate)
                    .addComponent(serialNumLabel)
                    .addComponent(modelNumLabel)
                    .addComponent(madeByLabel)
                    .addComponent(seatAvailLable)
                    .addComponent(usedByLabel)
                    .addComponent(cityLabel)
                    .addComponent(certExpireLabel)
                    .addComponent(isAvailableLabel))
                .addGap(56, 56, 56)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(certExpDateText, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(lblMaintDateExpErrMsg, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(availBox, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(91, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(serialNumText)
                                .addGap(18, 18, 18)
                                .addComponent(lblSerialNumErrMsg, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(modelNumText)
                                .addGap(18, 18, 18)
                                .addComponent(lblModelNumErrMsg, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(appBox, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(cityText, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 187, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtSeatCapacity)
                                .addGap(18, 18, 18)
                                .addComponent(lblSeatCapacityErrMsg, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(manuDateText)
                                .addGap(18, 18, 18)
                                .addComponent(lblManuDateErrMsg, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(carModelBox, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 91, Short.MAX_VALUE))))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(177, 177, 177)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnTitle, javax.swing.GroupLayout.DEFAULT_SIZE, 236, Short.MAX_VALUE)
                            .addComponent(lblTitleSubHeading, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(141, 141, 141)
                        .addComponent(saveButton, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {cityText, manuDateText, modelNumText, serialNumText, txtSeatCapacity});

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {certExpireLabel, cityLabel, isAvailableLabel, lblManufacturedDate, madeByLabel, modelNumLabel, seatAvailLable, serialNumLabel, usedByLabel});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnTitle)
                        .addGap(3, 3, 3)
                        .addComponent(lblTitleSubHeading, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(modelNumLabel)
                            .addComponent(modelNumText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblModelNumErrMsg, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(serialNumLabel)
                            .addComponent(serialNumText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(lblSerialNumErrMsg, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(madeByLabel)
                    .addComponent(carModelBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblManufacturedDate)
                            .addComponent(manuDateText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblManuDateErrMsg, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(seatAvailLable)
                            .addComponent(txtSeatCapacity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(lblSeatCapacityErrMsg, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(usedByLabel)
                    .addComponent(appBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cityLabel)
                    .addComponent(cityText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(certExpireLabel)
                        .addComponent(certExpDateText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lblMaintDateExpErrMsg, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(availBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(isAvailableLabel))
                .addGap(29, 29, 29)
                .addComponent(saveButton)
                .addContainerGap(50, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {appBox, carModelBox, certExpDateText, certExpireLabel, cityLabel, cityText, isAvailableLabel, lblManufacturedDate, madeByLabel, manuDateText, modelNumLabel, modelNumText, seatAvailLable, serialNumLabel, serialNumText, txtSeatCapacity, usedByLabel});

    }// </editor-fold>//GEN-END:initComponents

    private void modelNumTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modelNumTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_modelNumTextActionPerformed

    private void saveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveButtonActionPerformed
        SimpleDateFormat formatter = new SimpleDateFormat("MM/dd/yyyy");
        if (!manuDateText.getText().isEmpty()) {
           try
            {
                formatter.parse(manuDateText.getText());
                lblManuDateErrMsg.setText("");
                isFormValid = true;
            }

            catch (Exception e)
            {
                lblManuDateErrMsg.setText("Date Format is Invalid");
                isFormValid = false;
            } 
        }
        if (!certExpDateText.getText().isEmpty()) {
           try
            {
                formatter.parse(certExpDateText.getText());
                lblMaintDateExpErrMsg.setText("");
                isFormValid = true;
            }

            catch (Exception e)
            {
                lblMaintDateExpErrMsg.setText("Date Format is Invalid");
                isFormValid = false;
            } 
        }
        if (isFormValid) {
          DateTimeFormatter dformatter = DateTimeFormatter.ofPattern("MM/dd/yyyy");
            LocalDate localDate = LocalDate.parse(manuDateText.getText(), dformatter);
            LocalDate localDateCertExpire = LocalDate.parse(certExpDateText.getText(), dformatter);
            LocalDate todaysDate = LocalDate.now();
            int modelNumber = Integer.parseInt(modelNumText.getText());
            int serialNumber = Integer.parseInt(serialNumText.getText());  
            Object createdManufacturer = carModelBox.getSelectedItem();
            String manufacturer = createdManufacturer.toString();
            LocalDate manufacturedDate = localDate;
            int seatCapacity = Integer.parseInt(txtSeatCapacity.getText());
            Object createdUsedByApp = appBox.getSelectedItem();
            String usedBy = createdUsedByApp.toString();
            LocalDate lastUpdated = todaysDate;
            String city = cityText.getText();
            LocalDate maintenanceCertExpDate = localDateCertExpire;
            Boolean IsAvailable = availBox.getState();

            Car c = carFleetDetails.addNewCar();

            c.setModelNumber(modelNumber);
            c.setSerialNumber(serialNumber);
            c.setManufacturer(manufacturer);
            c.setManufacturedDate(manufacturedDate);
            c.setSeatCapacity(seatCapacity);
            c.setUsedByApp(usedBy);
            c.setIsAvailable(IsAvailable);
            c.setLastUpdated(lastUpdated);
            c.setCity(city);
            c.setMaintenanceCertExpDate(maintenanceCertExpDate);

            JOptionPane.showMessageDialog(this, "New Car Record Added");

            modelNumText.setText("");
            serialNumText.setText("");
            carModelBox.setSelectedIndex(-1);
            manuDateText.setText("");
            txtSeatCapacity.setText("");
            appBox.setSelectedIndex(-1);
            cityText.setText("");
            certExpDateText.setText("");
            availBox.setState(false);  
        }
    }//GEN-LAST:event_saveButtonActionPerformed

    private void serialNumTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_serialNumTextActionPerformed

    }//GEN-LAST:event_serialNumTextActionPerformed

    private void manuDateTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manuDateTextActionPerformed
        
    }//GEN-LAST:event_manuDateTextActionPerformed

    private void txtSeatCapacityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSeatCapacityActionPerformed
        
    }//GEN-LAST:event_txtSeatCapacityActionPerformed

    private void appBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_appBoxActionPerformed
        validateMandatory();
    }//GEN-LAST:event_appBoxActionPerformed

    private void cityTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cityTextActionPerformed
        
    }//GEN-LAST:event_cityTextActionPerformed

    private void certExpDateTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_certExpDateTextActionPerformed
        
    }//GEN-LAST:event_certExpDateTextActionPerformed

    private void modelNumTextKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_modelNumTextKeyPressed
        // TODO add your handling code here:
        validateMandatory();
        char NumPressed = evt.getKeyChar();
        if(Character.isLetter(NumPressed)){
            isFormValid = false;
            modelNumText.setEditable(false);
            lblModelNumErrMsg.setText("Please enter number Only!");
            validateMandatory();
        }
        else
        {
            modelNumText.setEditable(true);
            isFormValid = true;
            lblModelNumErrMsg.setText("");
            validateMandatory();
        }
    }//GEN-LAST:event_modelNumTextKeyPressed

    private void serialNumTextKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_serialNumTextKeyPressed
        validateMandatory();
        char NumPressed = evt.getKeyChar();
        if(Character.isLetter(NumPressed)){
            isFormValid = false;
            serialNumText.setEditable(false);
            lblSerialNumErrMsg.setText("Please enter number Only!");
            validateMandatory();
        }
        else
        {
            serialNumText.setEditable(true);
            isFormValid = true;
            lblSerialNumErrMsg.setText("");
            validateMandatory();
        }
    }//GEN-LAST:event_serialNumTextKeyPressed

    private void carModelBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_carModelBoxActionPerformed
        // TODO add your handling code here:
        validateMandatory();
    }//GEN-LAST:event_carModelBoxActionPerformed

    private void txtSeatCapacityKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSeatCapacityKeyPressed
        validateMandatory();
        char NumPressed = evt.getKeyChar();
        if(Character.isLetter(NumPressed)){
            isFormValid = false;
            txtSeatCapacity.setEditable(false);
            lblSeatCapacityErrMsg.setText("Please enter number Only!");
            validateMandatory();
        }
        else
        {
            txtSeatCapacity.setEditable(true);
            isFormValid = true;
            lblSeatCapacityErrMsg.setText("");
            validateMandatory();
        }
    }//GEN-LAST:event_txtSeatCapacityKeyPressed

    private void manuDateTextKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_manuDateTextKeyPressed
        validateMandatory();
    }//GEN-LAST:event_manuDateTextKeyPressed

    private void cityTextKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cityTextKeyPressed
        validateMandatory();
    }//GEN-LAST:event_cityTextKeyPressed

    private void certExpDateTextKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_certExpDateTextKeyPressed
        validateMandatory();
    }//GEN-LAST:event_certExpDateTextKeyPressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> appBox;
    private java.awt.Checkbox availBox;
    private javax.swing.JLabel btnTitle;
    private javax.swing.JComboBox<String> carModelBox;
    private javax.swing.JTextField certExpDateText;
    private javax.swing.JLabel certExpireLabel;
    private javax.swing.JLabel cityLabel;
    private javax.swing.JTextField cityText;
    private javax.swing.JLabel isAvailableLabel;
    private javax.swing.JLabel lblMaintDateExpErrMsg;
    private javax.swing.JLabel lblManuDateErrMsg;
    private javax.swing.JLabel lblManufacturedDate;
    private javax.swing.JLabel lblModelNumErrMsg;
    private javax.swing.JLabel lblSeatCapacityErrMsg;
    private javax.swing.JLabel lblSerialNumErrMsg;
    private javax.swing.JLabel lblTitleSubHeading;
    private javax.swing.JLabel madeByLabel;
    private javax.swing.JTextField manuDateText;
    private javax.swing.JLabel modelNumLabel;
    private javax.swing.JTextField modelNumText;
    private javax.swing.JButton saveButton;
    private javax.swing.JLabel seatAvailLable;
    private javax.swing.JLabel serialNumLabel;
    private javax.swing.JTextField serialNumText;
    private javax.swing.JTextField txtSeatCapacity;
    private javax.swing.JLabel usedByLabel;
    // End of variables declaration//GEN-END:variables

    private void validateMandatory() {
        if (!modelNumText.getText().isEmpty() && !serialNumText.getText().isEmpty()) {
            isValid = true;
            saveButton.setEnabled(isValid);
            return;
        }
    }
}
