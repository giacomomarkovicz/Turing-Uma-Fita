
package turing;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import java.util.Arrays;

public class NewJFrame extends javax.swing.JFrame {

    public NewJFrame() {
        initComponents();
    }
    
    //ArrayList<String> estados = new ArrayList();
    String string_estados;
    String [] estados;
    
    String string_estados_finais;
    String [] estadosfinais;
    
    String string_alfabeto;
    String [] alfabeto;
    
    String string_alfabeto_fita;
    String [] alfabeto_fita;
    
    ArrayList<Funcao> funcoes = new ArrayList();
    
    ArrayList<Func> funcs = new ArrayList();
  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txtconjuntoEstados = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtAlfabeto = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtEstadosFinais = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtFuncao = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        btnAdicionaFuncao = new javax.swing.JButton();
        btnMostraAjuda = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        txtEstados = new javax.swing.JTextField();
        btnAdicionarEstFinal = new javax.swing.JButton();
        txtMostraAlfabeto = new javax.swing.JTextField();
        txtMostraFinais = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        txtAlfabetoFita = new javax.swing.JTextField();
        txtMostraAlfFita = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtMostraFuncao = new javax.swing.JTextArea();
        txtEstAtual = new javax.swing.JTextField();
        txtLeSimb = new javax.swing.JTextField();
        txtProxEst = new javax.swing.JTextField();
        txtEscSimb = new javax.swing.JTextField();
        txtMovFita = new javax.swing.JTextField();
        addFunc = new javax.swing.JButton();
        jTextField6 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(200, 20));
        setMinimumSize(new java.awt.Dimension(500, 350));
        setPreferredSize(new java.awt.Dimension(670, 250));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel1.setText("Conjunto de Estados ");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 130, 20));

        txtconjuntoEstados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtconjuntoEstadosActionPerformed(evt);
            }
        });
        txtconjuntoEstados.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtconjuntoEstadosKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtconjuntoEstadosKeyReleased(evt);
            }
        });
        getContentPane().add(txtconjuntoEstados, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 60, 90, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel2.setText("Alfabeto de Entrada");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 130, 20));
        getContentPane().add(txtAlfabeto, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 90, 90, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel4.setText("Estados Finais");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, 130, 20));
        getContentPane().add(txtEstadosFinais, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 150, 90, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setText("Q ");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 60, 30, 20));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setText("Σ");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 90, 30, 20));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("F");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 150, 30, 20));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel7.setText("Funções de Transição");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 230, 120, 20));

        txtFuncao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFuncaoActionPerformed(evt);
            }
        });
        getContentPane().add(txtFuncao, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 230, 170, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel8.setText("δ ");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 230, 20, 20));

        btnAdicionaFuncao.setText("Adicionar");
        btnAdicionaFuncao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdicionaFuncaoActionPerformed(evt);
            }
        });
        getContentPane().add(btnAdicionaFuncao, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 230, -1, -1));

        btnMostraAjuda.setText("Ajuda");
        btnMostraAjuda.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnMostraAjudaMouseEntered(evt);
            }
        });
        btnMostraAjuda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMostraAjudaActionPerformed(evt);
            }
        });
        getContentPane().add(btnMostraAjuda, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 230, 60, -1));

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel10.setText("Máquina de Turing");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 0, 310, 30));

        txtEstados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEstadosActionPerformed(evt);
            }
        });
        getContentPane().add(txtEstados, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 60, 130, -1));

        btnAdicionarEstFinal.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnAdicionarEstFinal.setText("Adicionar Dados");
        btnAdicionarEstFinal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdicionarEstFinalActionPerformed(evt);
            }
        });
        getContentPane().add(btnAdicionarEstFinal, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, 140, 30));
        getContentPane().add(txtMostraAlfabeto, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 90, 130, -1));
        getContentPane().add(txtMostraFinais, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 150, 130, -1));

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel9.setText("Alfabeto da Fita");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, 110, 20));

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel11.setText("Γ");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 120, 30, -1));

        txtAlfabetoFita.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAlfabetoFitaActionPerformed(evt);
            }
        });
        getContentPane().add(txtAlfabetoFita, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 120, 90, -1));

        txtMostraAlfFita.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMostraAlfFitaActionPerformed(evt);
            }
        });
        getContentPane().add(txtMostraAlfFita, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 120, 130, -1));

        txtMostraFuncao.setColumns(20);
        txtMostraFuncao.setRows(5);
        txtMostraFuncao.setPreferredSize(new java.awt.Dimension(130, 120));
        jScrollPane1.setViewportView(txtMostraFuncao);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 60, 240, 150));
        getContentPane().add(txtEstAtual, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 290, 40, -1));

        txtLeSimb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtLeSimbActionPerformed(evt);
            }
        });
        getContentPane().add(txtLeSimb, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 290, 40, -1));
        getContentPane().add(txtProxEst, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 290, 40, -1));
        getContentPane().add(txtEscSimb, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 290, 40, -1));
        getContentPane().add(txtMovFita, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 290, 40, -1));

        addFunc.setText("add");
        addFunc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addFuncActionPerformed(evt);
            }
        });
        getContentPane().add(addFunc, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 290, -1, -1));

        jTextField6.setText("E. Atual   Simb Lê   Vai p/      Simb Esc.");
        jTextField6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField6ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField6, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 260, 240, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtconjuntoEstadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtconjuntoEstadosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtconjuntoEstadosActionPerformed

    private void btnAdicionaFuncaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdicionaFuncaoActionPerformed
        
        String fun = txtFuncao.getText();            
        
        Funcao funcao = new Funcao(fun);
        
        funcoes.add(funcao);
        
        txtMostraFuncao.selectAll();
        txtMostraFuncao.replaceSelection("");
        for (Funcao f : funcoes){
            txtMostraFuncao.append(f.getFuncao());
            txtMostraFuncao.append(System.lineSeparator());
        }
        
    }//GEN-LAST:event_btnAdicionaFuncaoActionPerformed

    private void btnMostraAjudaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMostraAjudaActionPerformed
        // TODO add your handling code here:
        
        JOptionPane.showMessageDialog(null, "Exemplo: (q0,1)=(q1,0,R), sendo que, q0: estado que está,"
                                          + " \n 1: o que irá ler,"
                                          + " \n q1: estado que irá,"
                                          + " \n 0: irá escrever na fita,"
                                          + " \n R: cabeça de leitura irá para (R direita, L esquerda.");
        
        
    }//GEN-LAST:event_btnMostraAjudaActionPerformed

    private void txtconjuntoEstadosKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtconjuntoEstadosKeyPressed
        // TODO add your handling code here:   
    }//GEN-LAST:event_txtconjuntoEstadosKeyPressed

    private void txtconjuntoEstadosKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtconjuntoEstadosKeyReleased
        // TODO add your handling code here:
        
        
    }//GEN-LAST:event_txtconjuntoEstadosKeyReleased

    private void btnMostraAjudaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMostraAjudaMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_btnMostraAjudaMouseEntered

    private void txtEstadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEstadosActionPerformed

    }//GEN-LAST:event_txtEstadosActionPerformed

    private void btnAdicionarEstFinalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdicionarEstFinalActionPerformed
        //ESTADOSFINAIS
        string_estados_finais = txtEstadosFinais.getText();
        estadosfinais = string_estados_finais.split(";");

        String finaisformatado = Arrays.toString(estadosfinais);

        finaisformatado = finaisformatado.replace("[", "(");

        finaisformatado = finaisformatado.replace("]", ")");

        txtMostraFinais.setText(finaisformatado);

        
        
        //ESTADOS
        string_estados = txtconjuntoEstados.getText();
        estados = string_estados.split(";");

        String estadoformatado = Arrays.toString(estados);

        estadoformatado = estadoformatado.replace("[", "(");

        estadoformatado = estadoformatado.replace("]", ")");

        txtEstados.setText(estadoformatado);
        
        
        
        //ALFABETO
        string_alfabeto = txtAlfabeto.getText();
        alfabeto = string_alfabeto.split(";");

        String alfabetoformatado = Arrays.toString(alfabeto);

        alfabetoformatado = alfabetoformatado.replace("[", "(");

        alfabetoformatado = alfabetoformatado.replace("]", ")");

        txtMostraAlfabeto.setText(alfabetoformatado);
        
        
        
        //ALFABETO FITA
        string_alfabeto_fita = txtAlfabetoFita.getText();
        alfabeto_fita = string_alfabeto_fita.split(";");

        String alfabetofitaformatado = Arrays.toString(alfabeto_fita);

        alfabetofitaformatado = alfabetofitaformatado.replace("[", "(");

        alfabetofitaformatado = alfabetofitaformatado.replace("]", ")");

        txtMostraAlfFita.setText(alfabetofitaformatado);
        
    }//GEN-LAST:event_btnAdicionarEstFinalActionPerformed

    private void txtMostraAlfFitaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMostraAlfFitaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMostraAlfFitaActionPerformed

    private void txtFuncaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFuncaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFuncaoActionPerformed

    private void txtAlfabetoFitaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAlfabetoFitaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAlfabetoFitaActionPerformed

    private void jTextField6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField6ActionPerformed

    private void txtLeSimbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtLeSimbActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtLeSimbActionPerformed

    private void addFuncActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addFuncActionPerformed
        String estAtual = txtEstAtual.getText();
        String leSimb = txtLeSimb.getText();
        String proxEst = txtProxEst.getText();
        String escSimb = txtEscSimb.getText();
        String movFita = txtMovFita.getText();
        
        Func func = new Func(estAtual, leSimb, proxEst, escSimb, movFita);
        
        funcs.add(func);
        
        txtMostraFuncao.selectAll();
        txtMostraFuncao.replaceSelection("");
        for (Func f : funcs){
          //  txtMostraFuncao.append(f.getFunc());
            txtMostraFuncao.append(System.lineSeparator());
        }
        
    }//GEN-LAST:event_addFuncActionPerformed

    public static void main(String args[]) {
        
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addFunc;
    private javax.swing.JButton btnAdicionaFuncao;
    private javax.swing.JButton btnAdicionarEstFinal;
    private javax.swing.JButton btnMostraAjuda;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField txtAlfabeto;
    private javax.swing.JTextField txtAlfabetoFita;
    private javax.swing.JTextField txtEscSimb;
    private javax.swing.JTextField txtEstAtual;
    private javax.swing.JTextField txtEstados;
    private javax.swing.JTextField txtEstadosFinais;
    private javax.swing.JTextField txtFuncao;
    private javax.swing.JTextField txtLeSimb;
    private javax.swing.JTextField txtMostraAlfFita;
    private javax.swing.JTextField txtMostraAlfabeto;
    private javax.swing.JTextField txtMostraFinais;
    private javax.swing.JTextArea txtMostraFuncao;
    private javax.swing.JTextField txtMovFita;
    private javax.swing.JTextField txtProxEst;
    private javax.swing.JTextField txtconjuntoEstados;
    // End of variables declaration//GEN-END:variables
}
