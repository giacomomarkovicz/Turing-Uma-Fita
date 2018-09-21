
package maquina;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import java.util.Arrays;

public class Main extends javax.swing.JFrame {

    public Main() {
        initComponents();
    }
    
    String string_estados;
    String [] estados;
    
    String string_estados_finais;
    String [] estadosfinais;
    
    String string_alfabeto;
    String [] alfabeto;
    
    String string_alfabeto_fita;
    String [] alfabeto_fita; 
    
    char[] fita_saida = null;
    char[] fita_entrada = null;
    String string_fita_entrada;
    
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
        jLabel8 = new javax.swing.JLabel();
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
        txtFitaEntrada = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        txtFitaSaida = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(200, 20));
        setMinimumSize(new java.awt.Dimension(500, 350));
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

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel8.setText("δ ");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 230, 20, 20));

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
        getContentPane().add(btnMostraAjuda, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 230, 60, -1));

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

        txtEstAtual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEstAtualActionPerformed(evt);
            }
        });
        getContentPane().add(txtEstAtual, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 230, 30, -1));

        txtLeSimb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtLeSimbActionPerformed(evt);
            }
        });
        getContentPane().add(txtLeSimb, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 230, 30, -1));

        txtProxEst.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtProxEstActionPerformed(evt);
            }
        });
        getContentPane().add(txtProxEst, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 230, 30, -1));

        txtEscSimb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEscSimbActionPerformed(evt);
            }
        });
        getContentPane().add(txtEscSimb, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 230, 30, -1));
        getContentPane().add(txtMovFita, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 230, 30, -1));

        addFunc.setText("Adicionar");
        addFunc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addFuncActionPerformed(evt);
            }
        });
        getContentPane().add(addFunc, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 230, -1, -1));

        txtFitaEntrada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFitaEntradaActionPerformed(evt);
            }
        });
        getContentPane().add(txtFitaEntrada, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 290, 300, -1));

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel12.setText("Fita de Entrada");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 290, -1, -1));

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel13.setText("Fita de Saída");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 330, -1, -1));
        getContentPane().add(txtFitaSaida, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 330, 300, -1));

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jButton1.setText("Testar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 280, 210, 90));

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel14.setText("(");
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 230, 20, 20));

        jLabel15.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel15.setText(",");
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 230, 20, 20));

        jLabel16.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel16.setText(") = (");
        getContentPane().add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 230, 50, 20));

        jLabel19.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel19.setText(",");
        getContentPane().add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 230, 20, 20));

        jLabel20.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel20.setText(",");
        getContentPane().add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 230, 20, 20));

        jLabel21.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel21.setText(")");
        getContentPane().add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 230, 20, 20));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtconjuntoEstadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtconjuntoEstadosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtconjuntoEstadosActionPerformed

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

    private void txtAlfabetoFitaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAlfabetoFitaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAlfabetoFitaActionPerformed

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
            txtMostraFuncao.append(f.getFuncao());
            txtMostraFuncao.append(System.lineSeparator());
        }
        
    }//GEN-LAST:event_addFuncActionPerformed

    private void txtEstAtualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEstAtualActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEstAtualActionPerformed

    private void txtFitaEntradaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFitaEntradaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFitaEntradaActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        string_fita_entrada = txtFitaEntrada.getText();
        
        fita_entrada = string_fita_entrada.toCharArray();
        
        //String text = String.valueOf(fita_entrada);

        //txtFitaSaida.setText(text);
        
//        String estado_atual = estados[0];
//        for (Func f : funcs){
//           if(estado_atual.equals(f.getEstAtual())){
//               //txtFitaSaida.setText("UHUL");
//               for (int k = 0; k <= alfabeto_fita.length; k++) {
//                        if(alfabeto_fita[k].equals(f.getLeSimb())){
//                            estado_atual = f.getProxEst();
//                        }
//                    }
//           } 
//        }
        
        
//        for (int j = 0; j <= estados.length; j++) {
//            
//            for (Func f : funcs) {
//                if (estados[j].equals(f.getEstAtual())) {
//                    //txtFitaSaida.setText("UHUL");
//                    for (int k = 0; k <= alfabeto_fita.length; k++) {
//                        if(alfabeto_fita[k].equals(f.getLeSimb())){
//                            estado_atual = f.getProxEst();
//                        }
//                    }
//                }
//            }
//        }
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void txtEscSimbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEscSimbActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEscSimbActionPerformed

    private void txtProxEstActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtProxEstActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtProxEstActionPerformed

    public static void main(String args[]) {
        
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addFunc;
    private javax.swing.JButton btnAdicionarEstFinal;
    private javax.swing.JButton btnMostraAjuda;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtAlfabeto;
    private javax.swing.JTextField txtAlfabetoFita;
    private javax.swing.JTextField txtEscSimb;
    private javax.swing.JTextField txtEstAtual;
    private javax.swing.JTextField txtEstados;
    private javax.swing.JTextField txtEstadosFinais;
    private javax.swing.JTextField txtFitaEntrada;
    private javax.swing.JTextField txtFitaSaida;
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
