/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dm.view;

import dm.biz.RepairsBiz;
import dm.biz.RepairsBizImpl;
import dm.biz.SDBiz;
import dm.biz.SDBizImpl;
import dm.biz.StuFixBiz;
import dm.biz.StuFixBizImpl;
import dm.po.User;
import dm.vo.Curfew;
import dm.vo.Repairs;
import dm.vo.StuFix;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author LIUYIYU
 */
public class SfixFrame extends javax.swing.JInternalFrame {
    public static User u;
    String sno = u.getUno();
    
    RepairsBiz rbiz = new RepairsBizImpl();
    SDBiz sd = new SDBizImpl();
    StuFixBiz fbiz = new StuFixBizImpl();
    String dno = sd.findById(sno).getDno();
    /**
     * Creates new form SfixFrame
     */
    public SfixFrame() {
        initComponents();
        this.txtDno.setText(sd.findById(sno).getDno());
        
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
        jScrollPane1 = new javax.swing.JScrollPane();
        tblFix = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        Ano = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        btnApply = new javax.swing.JButton();
        cobAname = new javax.swing.JComboBox();
        item = new javax.swing.JComboBox();
        jLabel4 = new javax.swing.JLabel();
        txtReportReason = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtDno = new javax.swing.JTextField();
        btnSearch = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);

        tblFix.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "财产号", "财产名", "报修时间", "报修原因", "解决时间"
            }
        ));
        jScrollPane1.setViewportView(tblFix);

        jLabel1.setForeground(new java.awt.Color(255, 51, 0));
        jLabel1.setText("财产号：");

        jLabel2.setText("财产名：");

        btnApply.setText("申请报修");
        btnApply.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnApplyActionPerformed(evt);
            }
        });

        cobAname.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "床", "桌子", "衣柜", "电灯", "玻璃", "门", "公共洗衣机", "公共吹风机" }));

        item.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "全部", "已解决", "未解决" }));

        jLabel4.setText("报修原因：");

        jLabel5.setForeground(new java.awt.Color(255, 51, 0));
        jLabel5.setText("注：红色字体处不可修改");

        jLabel6.setText("宿舍号：");

        btnSearch.setText("查询");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(Ano, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(40, 40, 40)
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(cobAname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtReportReason, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(63, 63, 63)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtDno, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(47, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 536, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnApply))
                        .addGap(46, 46, 46))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(item, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnSearch)
                        .addGap(28, 28, 28))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(item, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSearch))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(Ano, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(cobAname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(txtDno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtReportReason, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
                .addComponent(btnApply)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addGap(41, 41, 41))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        int index = this.item.getSelectedIndex();
        if(index==0){
            List<StuFix> list = (List<StuFix>) fbiz.findAll(dno);
            showOnTable(list);
        }
        else if(index==1){
            List<StuFix> list = (List<StuFix>) fbiz.findAllAc(dno);
            showOnTable(list);
        }
        else if(index==2){
            List<StuFix> list = (List<StuFix>) fbiz.findAllNot(dno);
            showOnTable(list);
        }
    }//GEN-LAST:event_btnSearchActionPerformed

    private void btnApplyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnApplyActionPerformed
        Date date = new Date();
        DateFormat format=new SimpleDateFormat("yyyy-MM-dd");
        String time = format.format(date);
        String reason = this.txtReportReason.getText();
        String dno = this.txtDno.getText();
        String ano = this.Ano.getText();
        //组合对象
        Repairs r = new Repairs(ano, dno, time, reason, null);
        //调用业务类
        boolean result = rbiz.add(r);
        if(result == true){
            JOptionPane.showMessageDialog(this, "添加成功");
             List<StuFix> list = fbiz.findAll(dno);
            //显示list的信息
            showOnTable(list);
        }
        else
            JOptionPane.showMessageDialog(this, "添加失败");
        //清面板信息
        clearInput();
    }//GEN-LAST:event_btnApplyActionPerformed

public void showOnTable(List<StuFix> list){
        //将制定的list数据显示到表上
        //将制定的list数据显示到表上
        //1.获取指定表格（tblProduct）模型
        DefaultTableModel dtm = (DefaultTableModel) this.tblFix.getModel();
        //2.清空表格信息
        while(dtm.getRowCount() > 0){
            dtm.removeRow(0);
        }
        
        int i = 1;
        //3.显示表格
        for(StuFix s : list){
            Vector vt = new Vector();
            vt.add(s.getAno());
            vt.add(s.getAname());
            vt.add(s.getReportTime());
            vt.add(s.getReportReason());
            vt.add(s.getFixTime());
            dtm.addRow(vt);
        }
    }
     //清空面板上的数据
    private void clearInput() {
        this.txtDno.setText("");
        this.txtReportReason.setText("");
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Ano;
    private javax.swing.JButton btnApply;
    private javax.swing.JButton btnSearch;
    private javax.swing.JComboBox cobAname;
    private javax.swing.JComboBox item;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblFix;
    private javax.swing.JTextField txtDno;
    private javax.swing.JTextField txtReportReason;
    // End of variables declaration//GEN-END:variables
}
