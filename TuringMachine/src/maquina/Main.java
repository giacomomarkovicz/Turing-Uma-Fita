package maquina;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import java.util.Arrays;

public class Main extends javax.swing.JFrame {

    public Main() {
        initComponents();
    }

    String resultado = "";
    String string_estados;
    String[] estados;

    String string_estados_finais;
    String[] estadosfinais;

    String estado_inicial;

    String string_alfabeto;
    String[] alfabeto;

    String string_alfabeto_fita;
    String[] alfabeto_fita;

    String fita_saida = "";
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
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        txtEstadoIn = new javax.swing.JTextField();
        txtMostraEstadoIn = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(200, 20));
        setMinimumSize(new java.awt.Dimension(500, 350));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel1.setText("Conjunto de Estados ");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 130, 20));

        txtconjuntoEstados.setText("q1;q2;q3;q4");
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

        txtAlfabeto.setText("a;b;c");
        getContentPane().add(txtAlfabeto, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 90, 90, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel4.setText("Estados Finais");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, 130, 20));

        txtEstadosFinais.setText("q4");
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
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 260, 120, 20));

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel8.setText("δ ");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 260, 30, 20));

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
        getContentPane().add(btnMostraAjuda, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 260, 60, -1));

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel10.setText("Máquina de Turing");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 0, 310, 30));

        txtEstados.setEditable(false);
        txtEstados.setFocusable(false);
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
        getContentPane().add(btnAdicionarEstFinal, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 220, 140, 30));

        txtMostraAlfabeto.setEditable(false);
        txtMostraAlfabeto.setFocusable(false);
        getContentPane().add(txtMostraAlfabeto, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 90, 130, -1));

        txtMostraFinais.setEditable(false);
        txtMostraFinais.setFocusable(false);
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

        txtMostraAlfFita.setEditable(false);
        txtMostraAlfFita.setFocusable(false);
        txtMostraAlfFita.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMostraAlfFitaActionPerformed(evt);
            }
        });
        getContentPane().add(txtMostraAlfFita, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 120, 130, -1));

        txtMostraFuncao.setEditable(false);
        txtMostraFuncao.setColumns(20);
        txtMostraFuncao.setRows(5);
        txtMostraFuncao.setFocusable(false);
        txtMostraFuncao.setPreferredSize(new java.awt.Dimension(130, 120));
        jScrollPane1.setViewportView(txtMostraFuncao);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 60, 240, 150));

        txtEstAtual.setText("q1");
        txtEstAtual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEstAtualActionPerformed(evt);
            }
        });
        getContentPane().add(txtEstAtual, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 260, 30, -1));

        txtLeSimb.setText("a");
        txtLeSimb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtLeSimbActionPerformed(evt);
            }
        });
        getContentPane().add(txtLeSimb, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 260, 30, -1));

        txtProxEst.setText("q2");
        txtProxEst.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtProxEstActionPerformed(evt);
            }
        });
        getContentPane().add(txtProxEst, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 260, 30, -1));

        txtEscSimb.setText("b");
        txtEscSimb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEscSimbActionPerformed(evt);
            }
        });
        getContentPane().add(txtEscSimb, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 260, 30, -1));

        txtMovFita.setText("R");
        getContentPane().add(txtMovFita, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 260, 30, -1));

        addFunc.setText("Adicionar");
        addFunc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addFuncActionPerformed(evt);
            }
        });
        getContentPane().add(addFunc, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 260, -1, -1));

        txtFitaEntrada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFitaEntradaActionPerformed(evt);
            }
        });
        getContentPane().add(txtFitaEntrada, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 320, 300, -1));

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel12.setText("Fita de Entrada");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 320, -1, -1));

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel13.setText("Fita de Saída");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 360, -1, -1));
        getContentPane().add(txtFitaSaida, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 360, 300, -1));

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jButton1.setText("Testar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 310, 210, 90));

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel14.setText("(");
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 260, 20, 20));

        jLabel15.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel15.setText(",");
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 260, 20, 20));

        jLabel16.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel16.setText(") = (");
        getContentPane().add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 260, 50, 20));

        jLabel19.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel19.setText(",");
        getContentPane().add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 260, 20, 20));

        jLabel20.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel20.setText(",");
        getContentPane().add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 260, 20, 20));

        jLabel21.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel21.setText(")");
        getContentPane().add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 260, 20, 20));

        jLabel17.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel17.setText("Estado Inicial");
        getContentPane().add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, 130, 20));

        jLabel18.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel18.setText("Q0");
        getContentPane().add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 180, 30, 20));

        txtEstadoIn.setText("q1");
        getContentPane().add(txtEstadoIn, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 180, 90, -1));

        txtMostraEstadoIn.setEditable(false);
        txtMostraEstadoIn.setFocusable(false);
        txtMostraEstadoIn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMostraEstadoInActionPerformed(evt);
            }
        });
        getContentPane().add(txtMostraEstadoIn, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 180, 130, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtconjuntoEstadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtconjuntoEstadosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtconjuntoEstadosActionPerformed

    private void btnMostraAjudaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMostraAjudaActionPerformed
        // TODO add your handling code here:

        JOptionPane.showMessageDialog(null, "Exemplo: (q0,1)=(q1,0,R), sendo que,"
                + "\n q0: estado que está,"
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

        txtEstadosFinais.setText("");

        //ESTADOS
        string_estados = txtconjuntoEstados.getText();
        estados = string_estados.split(";");

        String estadoformatado = Arrays.toString(estados);

        estadoformatado = estadoformatado.replace("[", "(");

        estadoformatado = estadoformatado.replace("]", ")");

        txtEstados.setText(estadoformatado);

        txtconjuntoEstados.setText("");

        //ALFABETO
        string_alfabeto = txtAlfabeto.getText();
        alfabeto = string_alfabeto.split(";");

        String alfabetoformatado = Arrays.toString(alfabeto);

        alfabetoformatado = alfabetoformatado.replace("[", "(");

        alfabetoformatado = alfabetoformatado.replace("]", ")");

        txtMostraAlfabeto.setText(alfabetoformatado);

        txtAlfabeto.setText("");

        //ALFABETO FITA
        string_alfabeto_fita = txtAlfabetoFita.getText();
        alfabeto_fita = string_alfabeto_fita.split(";");

        String alfabetofitaformatado = Arrays.toString(alfabeto_fita);

        alfabetofitaformatado = alfabetofitaformatado.replace("[", "(");

        alfabetofitaformatado = alfabetofitaformatado.replace("]", ")");

        txtMostraAlfFita.setText(alfabetofitaformatado);

        txtAlfabetoFita.setText("");

        //ESTADO INICIAL
        estado_inicial = txtEstadoIn.getText();

        txtMostraEstadoIn.setText("(" + estado_inicial + ")");

        txtEstadoIn.setText("");

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
        for (Func f : funcs) {
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
        String estadoatual;
        int k = 0;
        Boolean finalizamaquina = false;

        string_fita_entrada = txtFitaEntrada.getText();

        //fita_entrada = string_fita_entrada.toCharArray();
        char charatual = string_fita_entrada.charAt(k);

        estadoatual = estado_inicial;

        while (finalizamaquina == false) {
            for (Func f : funcs) {

                JOptionPane.showMessageDialog(null, "estado atual" + estadoatual + "\n" + "estados f.getestAtual:" + f.getEstAtual());

                if (estadoatual.equals(f.getEstAtual())) { //compara estados

                    //COMPARA CARACTERE DA FITA COM ALFABETO
//                    for (int i = 0; i < string_fita_entrada.length(); i++) {
//                        for (int j = 0; j < alfabeto.length; j++) {
//                            if (!String.valueOf(string_fita_entrada.charAt(i)).equals(alfabeto[j])) {
//                                txtFitaSaida.setText("Caractere fora do alfabeto informado.");
//                                finalizamaquina = true;
//                                break;
//                            }                     
//                        }                  
//                    }

                    JOptionPane.showMessageDialog(null, "char atual" + String.valueOf(charatual) + "\n" + "estados f.getlesymbol:" + f.getLeSimb());

                    if (String.valueOf(charatual).equals(f.getLeSimb())) { //compara caracter atual da fita com os caracteres das funções de transição
                        fita_saida = fita_saida + f.getEscSimb();

                        for (int j = 0; j < estadosfinais.length; j++) {

                            JOptionPane.showMessageDialog(null, "estado atual" + estadoatual + "\n" + "estados finais:" + estadosfinais[j]);
                            if (f.getProxEst().equals(estadosfinais[j])) {

                                txtFitaSaida.setText(fita_saida);
                                finalizamaquina = true;
                                break;

                            } else {
                                estadoatual = f.getProxEst();
                            }

                        }

                        if ("R".equals(f.getMovFita())) { //se fita for pra direita
                            k++;
                            //charatual = string_fita_entrada.charAt(k);
                        } else if ("L".equals(f.getMovFita())) { //se fita for pra esquerda
                            k--;
                            //charatual = string_fita_entrada.charAt(k);
                        }// else if("S".equals(f.getMovFita())){ 
                        //charatual = string_fita_entrada.charAt(k);
                        //}
                        charatual = string_fita_entrada.charAt(k);
                    }
                }
            }
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void txtEscSimbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEscSimbActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEscSimbActionPerformed

    private void txtProxEstActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtProxEstActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtProxEstActionPerformed

    private void txtMostraEstadoInActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMostraEstadoInActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMostraEstadoInActionPerformed

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
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
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
    private javax.swing.JTextField txtEstadoIn;
    private javax.swing.JTextField txtEstados;
    private javax.swing.JTextField txtEstadosFinais;
    private javax.swing.JTextField txtFitaEntrada;
    private javax.swing.JTextField txtFitaSaida;
    private javax.swing.JTextField txtLeSimb;
    private javax.swing.JTextField txtMostraAlfFita;
    private javax.swing.JTextField txtMostraAlfabeto;
    private javax.swing.JTextField txtMostraEstadoIn;
    private javax.swing.JTextField txtMostraFinais;
    private javax.swing.JTextArea txtMostraFuncao;
    private javax.swing.JTextField txtMovFita;
    private javax.swing.JTextField txtProxEst;
    private javax.swing.JTextField txtconjuntoEstados;
    // End of variables declaration//GEN-END:variables
}
