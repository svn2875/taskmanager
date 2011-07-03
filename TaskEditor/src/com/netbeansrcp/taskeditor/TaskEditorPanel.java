/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * TaskEditorPanel.java
 *
 * Created on Jun 3, 2011, 5:09:21 PM
 */
package com.netbeansrcp.taskeditor;

import com.netbeansrcp.taskmodel.TaskImpl;
import com.netbeansrcp.taskmodel.api.Task;
import com.netbeansrcp.taskmodel.api.TaskManager;
import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.text.DateFormat;
import java.util.Date;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import org.openide.util.Lookup;

/**
 *
 * @author gperon
 */
public class TaskEditorPanel extends javax.swing.JPanel {

    public Task task = new TaskImpl();
    private boolean noUpdate = false;
    public static final String PROP_TASK = "TASK";
    private PropertyChangeSupport pcs;
    private DocumentListener docListener = new DocumentListener() {

        @Override
        public void insertUpdate(DocumentEvent e) {
            updateTask();
        }

        @Override
        public void removeUpdate(DocumentEvent e) {
            updateTask();
        }

        @Override
        public void changedUpdate(DocumentEvent e) {
            updateTask();
        }
    };

    /** Creates new form TaskEditorPanel */
    public TaskEditorPanel() {
        initComponents();
//        updateForm();
        pcs = new PropertyChangeSupport(this);
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jTextFieldId = new javax.swing.JTextField();
        jTextFieldParentId = new javax.swing.JTextField();
        jTextFieldName = new javax.swing.JTextField();
        jTextFieldDueDate = new javax.swing.JTextField();
        jSliderPriority = new javax.swing.JSlider();
        jSliderProgress = new javax.swing.JSlider();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextAreaDescription = new javax.swing.JTextArea();
        jButton1 = new javax.swing.JButton();

        jLabel1.setText(org.openide.util.NbBundle.getMessage(TaskEditorPanel.class, "TaskEditorPanel.jLabel1.text")); // NOI18N

        jLabel2.setText(org.openide.util.NbBundle.getMessage(TaskEditorPanel.class, "TaskEditorPanel.jLabel2.text")); // NOI18N

        jLabel3.setText(org.openide.util.NbBundle.getMessage(TaskEditorPanel.class, "TaskEditorPanel.jLabel3.text")); // NOI18N

        jLabel4.setText(org.openide.util.NbBundle.getMessage(TaskEditorPanel.class, "TaskEditorPanel.jLabel4.text")); // NOI18N

        jLabel5.setText(org.openide.util.NbBundle.getMessage(TaskEditorPanel.class, "TaskEditorPanel.jLabel5.text")); // NOI18N

        jLabel6.setText(org.openide.util.NbBundle.getMessage(TaskEditorPanel.class, "TaskEditorPanel.jLabel6.text")); // NOI18N

        jLabel7.setText(org.openide.util.NbBundle.getMessage(TaskEditorPanel.class, "TaskEditorPanel.jLabel7.text")); // NOI18N

        jTextFieldId.setEditable(false);
        jTextFieldId.setText(org.openide.util.NbBundle.getMessage(TaskEditorPanel.class, "TaskEditorPanel.jTextFieldId.text")); // NOI18N
        jTextFieldId.getDocument().addDocumentListener(docListener);

        jTextFieldParentId.setEditable(false);
        jTextFieldParentId.setText(org.openide.util.NbBundle.getMessage(TaskEditorPanel.class, "TaskEditorPanel.jTextFieldParentId.text")); // NOI18N
        jTextFieldParentId.getDocument().addDocumentListener(docListener);

        jTextFieldName.setText(org.openide.util.NbBundle.getMessage(TaskEditorPanel.class, "TaskEditorPanel.jTextFieldName.text")); // NOI18N
        jTextFieldName.getDocument().addDocumentListener(docListener);

        jTextFieldDueDate.setText(org.openide.util.NbBundle.getMessage(TaskEditorPanel.class, "TaskEditorPanel.jTextFieldDueDate.text")); // NOI18N
        jTextFieldDueDate.getDocument().addDocumentListener(docListener);

        jSliderPriority.setMajorTickSpacing(1);
        jSliderPriority.setMaximum(2);
        jSliderPriority.setPaintTicks(true);
        jSliderPriority.setSnapToTicks(true);
        jSliderPriority.setValue(0);
        jSliderPriority.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jSliderPriorityStateChanged(evt);
            }
        });

        jSliderProgress.setMajorTickSpacing(25);
        jSliderProgress.setMinorTickSpacing(5);
        jSliderProgress.setPaintLabels(true);
        jSliderProgress.setValue(0);
        jSliderProgress.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jSliderProgressStateChanged(evt);
            }
        });

        jTextAreaDescription.setColumns(20);
        jTextAreaDescription.setRows(5);
        jScrollPane1.setViewportView(jTextAreaDescription);

        jButton1.setText(org.openide.util.NbBundle.getMessage(TaskEditorPanel.class, "TaskEditorPanel.jButton1.text")); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton1)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel7)
                            .addComponent(jLabel6)
                            .addComponent(jLabel5)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 244, Short.MAX_VALUE)
                            .addComponent(jTextFieldName, javax.swing.GroupLayout.DEFAULT_SIZE, 244, Short.MAX_VALUE)
                            .addComponent(jTextFieldId, javax.swing.GroupLayout.DEFAULT_SIZE, 244, Short.MAX_VALUE)
                            .addComponent(jTextFieldParentId, javax.swing.GroupLayout.DEFAULT_SIZE, 244, Short.MAX_VALUE)
                            .addComponent(jTextFieldDueDate, javax.swing.GroupLayout.DEFAULT_SIZE, 244, Short.MAX_VALUE)
                            .addComponent(jSliderPriority, javax.swing.GroupLayout.DEFAULT_SIZE, 244, Short.MAX_VALUE)
                            .addComponent(jSliderProgress, javax.swing.GroupLayout.DEFAULT_SIZE, 244, Short.MAX_VALUE))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jTextFieldId, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jTextFieldParentId, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jTextFieldName, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jTextFieldDueDate, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jSliderPriority, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel6)
                    .addComponent(jSliderProgress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(7, 7, 7)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 138, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1)
                .addContainerGap())
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jSliderPriority, jSliderProgress});

    }// </editor-fold>//GEN-END:initComponents

    private void jSliderPriorityStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jSliderPriorityStateChanged
        updateTask();
    }//GEN-LAST:event_jSliderPriorityStateChanged

    private void jSliderProgressStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jSliderProgressStateChanged
        updateTask();
    }//GEN-LAST:event_jSliderProgressStateChanged

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Task oldTask = task;
        task = new TaskImpl();
        if (pcs == null) {
            pcs = new PropertyChangeSupport(this);
        }
        pcs.firePropertyChange(PROP_TASK, oldTask, task);
        updateForm();
    }//GEN-LAST:event_jButton1ActionPerformed
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSlider jSliderPriority;
    private javax.swing.JSlider jSliderProgress;
    private javax.swing.JTextArea jTextAreaDescription;
    private javax.swing.JTextField jTextFieldDueDate;
    private javax.swing.JTextField jTextFieldId;
    private javax.swing.JTextField jTextFieldName;
    private javax.swing.JTextField jTextFieldParentId;
    // End of variables declaration//GEN-END:variables

    private void updateTask() {
        if (noUpdate) {
            return;
        }
        this.task.setName(this.jTextFieldName.getText());
        Date due = null;
        try {
            due = DateFormat.getDateInstance().parse(this.jTextFieldDueDate.getText());
        } catch (Exception e) {
            due = new Date();
        }
        this.task.setDue(due);
        if (!this.jSliderPriority.getValueIsAdjusting()) {
            switch (this.jSliderPriority.getValue()) {
                case 0:
                    this.task.setPrio(Task.Priority.LOW);
                    break;
                case 1:
                    this.task.setPrio(Task.Priority.MEDIUM);
                    break;
                case 2:
                    this.task.setPrio(Task.Priority.HIGH);
                    break;
                default:
                    throw new AssertionError();
            }
        }
        this.task.setProgr(this.jSliderProgress.getValue());
        this.task.setDescr(this.jTextAreaDescription.getText());

    }

    public void updateTask(Task task) {
        Task oldTask = this.task;
        this.task = task;
        pcs.firePropertyChange(PROP_TASK, oldTask, task);
        updateForm();
    }

    private void updateForm() {
        noUpdate = true;
        jTextFieldId.setText(task.getId());
        jTextFieldParentId.setText(task.getParentId());
        jTextFieldName.setText(task.getName());
        jTextFieldDueDate.setText(DateFormat.getDateInstance().format(task.getDue()));
        jTextAreaDescription.setText(task.getDescr());
        if (Task.Priority.LOW.equals(task.getPrio())) {
            jSliderPriority.setValue(0);
        } else if (Task.Priority.MEDIUM.equals(task.getPrio())) {
            jSliderPriority.setValue(1);
        } else {
            jSliderPriority.setValue(2);

        }
        jSliderProgress.setValue(task.getProgr());
        noUpdate = false;
    }

    @Override
    public synchronized void addPropertyChangeListener(PropertyChangeListener listener) {
        if (pcs == null) {
            pcs = new PropertyChangeSupport(this);
        }
        pcs.addPropertyChangeListener(listener);
    }

    @Override
    public synchronized void removePropertyChangeListener(PropertyChangeListener listener) {
        if (pcs != null) {
            pcs.removePropertyChangeListener(listener);
        }
    }
}
