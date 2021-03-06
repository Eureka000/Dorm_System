/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dm.view;

import dm.biz.tFixInfoBiz;
import dm.biz.tFixInfoBizImpl;
import dm.util.LocationUtil;
import dm.util.StringUtil;

import dm.vo.tFixInfo;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author 28104
 */
public class TfixInfoFrame extends javax.swing.JInternalFrame {
    tFixInfoBiz tbiz = new tFixInfoBizImpl();
    /**
     * Creates new form TfixInfoFrame
     */
    public TfixInfoFrame() {
        initComponents();
        //初始化修改按钮
        this.btnSave.setEnabled(false);
        LocationUtil.setScreenCenter(this);
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
        tblFixInfo = new javax.swing.JTable();
        txtCondition = new javax.swing.JTextField();
        btnSearch = new javax.swing.JButton();
        cobCondition = new javax.swing.JComboBox();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtAno = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtDno = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtReportReason = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtFixTime = new javax.swing.JTextField();
        txtReportTime = new javax.swing.JTextField();
        btnLoad = new javax.swing.JButton();
        btnAdd = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnSave = new javax.swing.JButton();
        btnCancel = new javax.swing.JButton();
        btnQuit = new javax.swing.JButton();
        txtAname = new javax.swing.JTextField();
        chart = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);

        tblFixInfo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "财产号", "财产名", "宿舍号", "报修时间", "报修原因", "解决时间"
            }
        ));
        tblFixInfo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblFixInfoMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblFixInfo);

        btnSearch.setText("查询");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        cobCondition.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "按财产号", "按财产名", "按宿舍号", "模糊查询" }));

        jLabel1.setForeground(new java.awt.Color(255, 0, 0));
        jLabel1.setText("财产号：");

        jLabel2.setForeground(new java.awt.Color(255, 0, 0));
        jLabel2.setText("财产名：");

        txtAno.setEditable(false);

        jLabel3.setForeground(new java.awt.Color(255, 0, 0));
        jLabel3.setText("注：红色字体不可编辑");

        txtDno.setEditable(false);

        jLabel4.setForeground(new java.awt.Color(255, 0, 0));
        jLabel4.setText("报修时间：");

        jLabel5.setForeground(new java.awt.Color(255, 0, 0));
        jLabel5.setText("宿舍号：");

        jLabel6.setForeground(new java.awt.Color(255, 0, 0));
        jLabel6.setText("报修原因：");

        txtReportReason.setEditable(false);

        jLabel7.setText("解决时间：");

        txtReportTime.setEditable(false);

        btnLoad.setText("全部载入");
        btnLoad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoadActionPerformed(evt);
            }
        });

        btnAdd.setText("已解决");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        btnDelete.setText("未解决");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        btnSave.setText("修改/保存");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        btnCancel.setText("重置");
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });

        btnQuit.setText("退出");
        btnQuit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQuitActionPerformed(evt);
            }
        });

        txtAname.setEditable(false);

        chart.setText("生成图表");
        chart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chartActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 830, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addGap(18, 18, 18)
                                .addComponent(txtReportReason, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(35, 35, 35))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(45, 45, 45)
                                        .addComponent(chart)
                                        .addGap(26, 26, 26)
                                        .addComponent(btnLoad))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                        .addGap(20, 20, 20)
                                        .addComponent(jLabel1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtAno, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(33, 33, 33)
                                        .addComponent(jLabel2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txtAname)))
                                .addGap(18, 18, 18)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btnAdd)
                                .addGap(18, 18, 18)
                                .addComponent(btnDelete)
                                .addGap(18, 18, 18)
                                .addComponent(btnSave)
                                .addGap(28, 28, 28)
                                .addComponent(btnCancel)
                                .addGap(18, 18, 18)
                                .addComponent(btnQuit))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(37, 37, 37)
                                        .addComponent(jLabel7)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txtFixTime, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(txtDno, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(55, 55, 55)
                                        .addComponent(jLabel4)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtReportTime, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addContainerGap(26, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(cobCondition, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(txtCondition, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addComponent(btnSearch)
                        .addGap(33, 33, 33))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCondition, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSearch)
                    .addComponent(cobCondition, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(txtAno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(txtReportTime, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(txtAname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtReportReason, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(txtFixTime, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(66, 66, 66)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(btnLoad)
                    .addComponent(btnAdd)
                    .addComponent(btnDelete)
                    .addComponent(btnSave)
                    .addComponent(btnCancel)
                    .addComponent(btnQuit)
                    .addComponent(chart))
                .addContainerGap(25, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    // 重置
    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
        this.txtFixTime.setText("");
    }//GEN-LAST:event_btnCancelActionPerformed
    //查询
    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        switch(this.cobCondition.getSelectedIndex()){
            case 0:
                clearInput();
                if(StringUtil.checkLength(this.txtCondition.getText().trim()) == false){
                    JOptionPane.showMessageDialog(this, "查询信息不能为空！");
                }
                List<tFixInfo> list0 = tbiz.findByAno(this.txtCondition.getText().trim());
                showOnTable(list0);
                this.txtCondition.setText("");
                break;
            case 1:
                clearInput();
                if(StringUtil.checkLength(this.txtCondition.getText().trim()) == false){
                    JOptionPane.showMessageDialog(this, "查询信息不能为空！");
                }
                List<tFixInfo> list1 = tbiz.findByAname(this.txtCondition.getText().trim());
                showOnTable(list1);
                this.txtCondition.setText("");
                break;
            case 2:
                clearInput();
                if(StringUtil.checkLength(this.txtCondition.getText().trim()) == false){
                    JOptionPane.showMessageDialog(this, "查询信息不能为空！");
                }
                List<tFixInfo> list2 = tbiz.findByDno(this.txtCondition.getText().trim());
                showOnTable(list2);
                this.txtCondition.setText("");
                break;
            case 3:
                clearInput();
                if(StringUtil.checkLength(this.txtCondition.getText().trim()) == false){
                    JOptionPane.showMessageDialog(this, "查询信息不能为空！");
                }
                List<tFixInfo> list3 = tbiz.findByCondition(this.txtCondition.getText().trim());
                showOnTable(list3);
                this.txtCondition.setText("");
                break;
            default:
                JOptionPane.showMessageDialog(this, "错误！");
        }
        
        
    }//GEN-LAST:event_btnSearchActionPerformed
    //载入
    private void btnLoadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoadActionPerformed
        //查询数据库，将数据显示到表格上
        List<tFixInfo> list = tbiz.findAll();
        //显示list的信息
        showOnTable(list);     
    }//GEN-LAST:event_btnLoadActionPerformed
    //查询已解决
    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        //查询数据库，将数据显示到表格上
        List<tFixInfo> list = tbiz.findBySolve();
        //显示list的信息
        showOnTable(list); 
    }//GEN-LAST:event_btnAddActionPerformed
    //查询未解决
    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        //查询数据库，将数据显示到表格上
        List<tFixInfo> list = tbiz.findByUnsolve();
        //显示list的信息
        showOnTable(list);  
    }//GEN-LAST:event_btnDeleteActionPerformed
    //鼠标点击表中某一行
    private void tblFixInfoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblFixInfoMouseClicked
        // 鼠标选中某行，该行信息显示到输入面板
        int row = this.tblFixInfo.getSelectedRow();//表示被选中的那一行
        //获取每一列的值
        this.txtAno.setText(this.tblFixInfo.getValueAt(row, 0)+"");
        this.txtAname.setText(this.tblFixInfo.getValueAt(row, 1)+"");
        this.txtDno.setText(this.tblFixInfo.getValueAt(row, 2)+"");
        this.txtReportTime.setText(this.tblFixInfo.getValueAt(row, 3)+"");
        this.txtReportReason.setText(this.tblFixInfo.getValueAt(row, 4)+"");
        this.txtFixTime.setText(this.tblFixInfo.getValueAt(row, 5)+"");
        //修改按钮可用
        this.btnSave.setEnabled(true); 
    }//GEN-LAST:event_tblFixInfoMouseClicked
    //修改解决时间
    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        String Ano = this.txtAno.getText().trim();
        String Aname = this.txtAname.getText().trim();
        String Dno = this.txtDno.getText().trim();
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd"); 
        Date ReportTime = null;
        try {
            ReportTime = sdf.parse(this.txtReportTime.getText().trim());
        } catch (ParseException ex) {
            Logger.getLogger(TstuCurfewFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
        String ReportReason = this.txtReportReason.getText().trim();
        Date FixTime = null;
        try {
            FixTime = sdf.parse(this.txtFixTime.getText().trim());
        } catch (ParseException ex) {
            Logger.getLogger(TfixInfoFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
        if(FixTime == null){
            JOptionPane.showMessageDialog(this, "报修未解决！");
            return;
        }


       
        //组合对象
        tFixInfo c = new tFixInfo(Ano,Aname,Dno,ReportTime,ReportReason,FixTime);
        //调用业务类
        boolean result = tbiz.update(c);
        if(result == true){
            JOptionPane.showMessageDialog(this, "报修解决成功！");
            List<tFixInfo> list = tbiz.findAll();
            //显示list的信息
            showOnTable(list);
        }
        else
            JOptionPane.showMessageDialog(this, "报修解决失败！");
        //清空面板信息
        clearInput();
    }//GEN-LAST:event_btnSaveActionPerformed
    // 退出
    private void btnQuitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQuitActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnQuitActionPerformed

    private void chartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chartActionPerformed
        List<tFixInfo> list = tbiz.findAll();
        HashMap<String, Integer> map = generateChart(list);
        
        FixChartBuilder chart = new FixChartBuilder("宿舍易损物品统计", map);
        chart.pack();
        chart.setVisible(true);
    }//GEN-LAST:event_chartActionPerformed

    //将指定的list数据显示到表上
    public void showOnTable(List<tFixInfo> list){
        //将指定的list数据显示到表上
        //1.获取指定表格（tblProduct）模型
        DefaultTableModel dtm = (DefaultTableModel) this.tblFixInfo.getModel();
        //2.清空表格信息
        while(dtm.getRowCount() > 0){
            dtm.removeRow(0);
        }
        //3.显示表格
        for(tFixInfo f : list){
            Vector vt = new Vector();
            vt.add(f.getAno());
            vt.add(f.getAname());
            vt.add(f.getDno()); 
            vt.add(f.getReportTime());
            vt.add(f.getReportReason()); 
            vt.add(f.getFixTime());
            dtm.addRow(vt);
        }
    }
    
    //清空面板上的数据
    private void clearInput() {
        this.txtAno.setText("");
        this.txtAname.setText("");
        this.txtDno.setText("");
        this.txtReportTime.setText("");
        this.txtReportReason.setText(""); 
        this.txtFixTime.setText("");
    }
    
    public HashMap<String, Integer> generateChart(List<tFixInfo> list){
        HashMap<String, Integer> map = new HashMap<String, Integer>();
        for(tFixInfo t : list){
            String ano = t.getAno();
            if(map.containsKey(t.getAno())){
                Integer newint = map.get(ano)+1;
                map.remove(ano);
                map.put(ano, newint);
            }
            else {
                map.put(ano, 1);
            }
        }
        return map;
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnLoad;
    private javax.swing.JButton btnQuit;
    private javax.swing.JButton btnSave;
    private javax.swing.JButton btnSearch;
    private javax.swing.JButton chart;
    private javax.swing.JComboBox cobCondition;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblFixInfo;
    private javax.swing.JTextField txtAname;
    private javax.swing.JTextField txtAno;
    private javax.swing.JTextField txtCondition;
    private javax.swing.JTextField txtDno;
    private javax.swing.JTextField txtFixTime;
    private javax.swing.JTextField txtReportReason;
    private javax.swing.JTextField txtReportTime;
    // End of variables declaration//GEN-END:variables
}
