/* ***** BEGIN LICENSE BLOCK *****
 * Version: MPL 1.1
 *
 * The contents of this file are subject to the Mozilla Public License Version
 * 1.1 (the "License"); you may not use this file except in compliance with
 * the License. You may obtain a copy of the License at
 * http://www.mozilla.org/MPL/
 *
 * Software distributed under the License is distributed on an "AS IS" basis,
 * WITHOUT WARRANTY OF ANY KIND, either express or implied. See the License
 * for the specific language governing rights and limitations under the
 * License.
 *
 * The Original Code is Mirth.
 *
 * The Initial Developer of the Original Code is
 * WebReach, Inc.
 * Portions created by the Initial Developer are Copyright (C) 2006
 * the Initial Developer. All Rights Reserved.
 *
 * Contributor(s):
 *   Gerald Bortis <geraldb@webreachinc.com>
 *
 * ***** END LICENSE BLOCK ***** */


package com.webreach.mirth.client.ui.connectors;

import com.webreach.mirth.client.ui.UIConstants;
import com.webreach.mirth.client.ui.components.MirthFieldConstraints;
import java.util.Properties;

import com.webreach.mirth.client.ui.Frame;
import com.webreach.mirth.client.ui.PlatformUI;

/**
 * A form that extends from ConnectorClass.  All methods implemented
 * are described in ConnectorClass.
 */
public class SFTPWriter extends ConnectorClass
{
    Frame parent;

    /** Creates new form FTPReader */
    public final String DATATYPE = "DataType";
    public final String SFTP_ADDRESS = "host";
    public final String SFTP_USERNAME = "username";
    public final String SFTP_PASSWORD = "password";
    public final String SFTP_POLLING_FREQUENCY = "pollingFrequency";
    public final String SFTP_FILENAME_PARSER = "filenameParser ";
    public final String SFTP_OUTPUT_PATTERN = "outputPattern";
    public final String SFTP_CONTENTS = "template";
    
    public SFTPWriter()
    {
        this.parent = PlatformUI.MIRTH_FRAME;
        name = "SFTP Writer";
        initComponents();
        pollingFrequencyField.setDocument(new MirthFieldConstraints(0, false, true));
    }

    public Properties getProperties()
    {
        Properties properties = new Properties();
        properties.put(DATATYPE, name);
        properties.put(SFTP_ADDRESS, FTPURLField.getText());        
        properties.put(SFTP_USERNAME, FTPUsernameField.getText());
        properties.put(SFTP_PASSWORD, new String(FTPPasswordField.getPassword()));
        properties.put(SFTP_POLLING_FREQUENCY, pollingFrequencyField.getText());
        properties.put(SFTP_FILENAME_PARSER, filenameParserField.getText());
        properties.put(SFTP_OUTPUT_PATTERN, outputPatternField.getText());
        properties.put(SFTP_CONTENTS, ftpContentsTextPane.getText());
        return properties;
    }

    public void setProperties(Properties props)
    {
        FTPURLField.setText((String)props.get(SFTP_ADDRESS));        
        FTPUsernameField.setText((String)props.get(SFTP_USERNAME));
        FTPPasswordField.setText((String)props.get(SFTP_PASSWORD));
        pollingFrequencyField.setText((String)props.get(SFTP_POLLING_FREQUENCY));
        filenameParserField.setText((String)props.get(SFTP_FILENAME_PARSER));
        outputPatternField.setText((String)props.get(SFTP_OUTPUT_PATTERN));
        ftpContentsTextPane.setText((String)props.get(SFTP_CONTENTS));
    }
    
    public Properties getDefaults()
    {
        Properties properties = new Properties();
        properties.put(DATATYPE, name);
        properties.put(SFTP_ADDRESS, "");
        properties.put(SFTP_USERNAME, "");
        properties.put(SFTP_PASSWORD, "");
        properties.put(SFTP_POLLING_FREQUENCY, "1000");
        properties.put(SFTP_FILENAME_PARSER, "");
        properties.put(SFTP_OUTPUT_PATTERN, "");
        properties.put(SFTP_CONTENTS, "");
        return properties;
    }
    
    public boolean checkProperties(Properties props)
    {
        if(((String)props.get(SFTP_ADDRESS)).length() > 0 && ((String)props.get(SFTP_USERNAME)).length() > 0 && 
           ((String)props.get(SFTP_PASSWORD)).length() > 0 && ((String)props.get(SFTP_POLLING_FREQUENCY)).length() > 0 && 
           ((String)props.get(SFTP_FILENAME_PARSER)).length() > 0 && ((String)props.get(SFTP_OUTPUT_PATTERN)).length() > 0 && 
            ((String)props.get(SFTP_CONTENTS)).length() > 0)
            return true;
        return false;
    }

    
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc=" Generated Code ">//GEN-BEGIN:initComponents
    private void initComponents()
    {
        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        buttonGroup4 = new javax.swing.ButtonGroup();
        URL = new javax.swing.JLabel();
        FTPURLField = new com.webreach.mirth.client.ui.components.MirthTextField();
        jLabel4 = new javax.swing.JLabel();
        filenameParserField = new com.webreach.mirth.client.ui.components.MirthTextField();
        outputPatternField = new com.webreach.mirth.client.ui.components.MirthTextField();
        jLabel5 = new javax.swing.JLabel();
        FTPUsernameLabel = new javax.swing.JLabel();
        FTPUsernameField = new com.webreach.mirth.client.ui.components.MirthTextField();
        FTPPasswordField = new com.webreach.mirth.client.ui.components.MirthPasswordField();
        FTPPasswordLabel = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        pollingFrequencyField = new com.webreach.mirth.client.ui.components.MirthTextField();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        ftpContentsTextPane = new com.webreach.mirth.client.ui.components.MirthTextPane();

        setBackground(new java.awt.Color(255, 255, 255));
        setBorder(javax.swing.BorderFactory.createTitledBorder(null, "SFTP Writer", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 11), new java.awt.Color(0, 0, 0)));
        URL.setText("Host:");

        jLabel4.setText("Filename Parser:");

        jLabel5.setText("Output Pattern:");

        FTPUsernameLabel.setText("Username:");

        FTPPasswordField.setFont(new java.awt.Font("Tahoma", 0, 11));

        FTPPasswordLabel.setText("Password:");

        jLabel9.setText("Polling Frequency (ms):");

        jLabel3.setText("Template:");

        jScrollPane1.setViewportView(ftpContentsTextPane);

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .addContainerGap()
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
                    .add(jLabel3)
                    .add(jLabel5)
                    .add(jLabel4)
                    .add(jLabel9)
                    .add(FTPPasswordLabel)
                    .add(FTPUsernameLabel)
                    .add(URL))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(FTPUsernameField, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 125, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(FTPURLField, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 250, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(FTPPasswordField, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 125, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(pollingFrequencyField, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 75, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(filenameParserField, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 200, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(outputPatternField, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 200, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(jScrollPane1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 313, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(URL)
                    .add(FTPURLField, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(layout.createSequentialGroup()
                        .add(107, 107, 107)
                        .add(jLabel5))
                    .add(layout.createSequentialGroup()
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                            .add(FTPUsernameField, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(FTPUsernameLabel))
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                            .add(FTPPasswordField, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(FTPPasswordLabel))
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                            .add(pollingFrequencyField, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(jLabel9))
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                            .add(filenameParserField, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(jLabel4))
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(outputPatternField, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(jLabel3)
                    .add(jScrollPane1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 246, Short.MAX_VALUE))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.webreach.mirth.client.ui.components.MirthPasswordField FTPPasswordField;
    private javax.swing.JLabel FTPPasswordLabel;
    private com.webreach.mirth.client.ui.components.MirthTextField FTPURLField;
    private com.webreach.mirth.client.ui.components.MirthTextField FTPUsernameField;
    private javax.swing.JLabel FTPUsernameLabel;
    private javax.swing.JLabel URL;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.ButtonGroup buttonGroup4;
    private com.webreach.mirth.client.ui.components.MirthTextField filenameParserField;
    private com.webreach.mirth.client.ui.components.MirthTextPane ftpContentsTextPane;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private com.webreach.mirth.client.ui.components.MirthTextField outputPatternField;
    private com.webreach.mirth.client.ui.components.MirthTextField pollingFrequencyField;
    // End of variables declaration//GEN-END:variables

}