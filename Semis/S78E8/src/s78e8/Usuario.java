
package s78e8;



import java.util.ArrayList;
public class Usuario extends javax.swing.JFrame {


    public Usuario() {
        initComponents();
    }
private ArrayList<Carro> a = new ArrayList<>();

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        painel = new javax.swing.JTabbedPane();
        Menu = new javax.swing.JPanel();
        goCadastro = new javax.swing.JButton();
        goCalcualr = new javax.swing.JButton();
        goPesquisar = new javax.swing.JButton();
        goinf = new javax.swing.JButton();
        Cadastrar = new javax.swing.JPanel();
        Codigo = new javax.swing.JTextField();
        Nome = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        Preco = new javax.swing.JTextField();
        ValorDeLocacao = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        modelo = new javax.swing.JTextField();
        marca = new javax.swing.JTextField();
        Limpar = new javax.swing.JButton();
        cadastro = new javax.swing.JButton();
        Calcular = new javax.swing.JPanel();
        calcular = new javax.swing.JButton();
        Informacoes = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        pesquisacarros = new javax.swing.JList<>();
        verCArros = new javax.swing.JButton();
        Pesquisar = new javax.swing.JPanel();
        codigo = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        novoValor = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        infoCarro = new javax.swing.JTextArea();
        procuraCarro = new javax.swing.JButton();
        definir = new javax.swing.JButton();

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane2.setViewportView(jTextArea1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        goCadastro.setText("Cadastro");
        goCadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                goCadastroActionPerformed(evt);
            }
        });

        goCalcualr.setText("Calcular");
        goCalcualr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                goCalcualrActionPerformed(evt);
            }
        });

        goPesquisar.setText("Pesquisar");
        goPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                goPesquisarActionPerformed(evt);
            }
        });

        goinf.setText("Informações");
        goinf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                goinfActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout MenuLayout = new javax.swing.GroupLayout(Menu);
        Menu.setLayout(MenuLayout);
        MenuLayout.setHorizontalGroup(
            MenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MenuLayout.createSequentialGroup()
                .addGap(95, 95, 95)
                .addGroup(MenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(goinf, javax.swing.GroupLayout.DEFAULT_SIZE, 183, Short.MAX_VALUE)
                    .addComponent(goPesquisar, javax.swing.GroupLayout.DEFAULT_SIZE, 183, Short.MAX_VALUE)
                    .addComponent(goCalcualr, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(goCadastro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(114, Short.MAX_VALUE))
        );
        MenuLayout.setVerticalGroup(
            MenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MenuLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(goCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(goCalcualr, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(goPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(goinf, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        painel.addTab("Menu", Menu);

        jLabel1.setText("Código ");

        jLabel2.setText("Nome");

        jLabel3.setText("Preço");

        jLabel5.setText("Valor da Locação");

        jLabel4.setText("Modelo");

        jLabel6.setText("Marca");

        modelo.setText("Sedan");
        modelo.setEnabled(false);

        marca.setText("Fiat");
        marca.setEnabled(false);
        marca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                marcaActionPerformed(evt);
            }
        });

        Limpar.setText("Limpar");
        Limpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LimparActionPerformed(evt);
            }
        });

        cadastro.setText("Cadastrar");
        cadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadastroActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout CadastrarLayout = new javax.swing.GroupLayout(Cadastrar);
        Cadastrar.setLayout(CadastrarLayout);
        CadastrarLayout.setHorizontalGroup(
            CadastrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CadastrarLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(CadastrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(CadastrarLayout.createSequentialGroup()
                        .addGroup(CadastrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addGroup(CadastrarLayout.createSequentialGroup()
                                .addComponent(ValorDeLocacao, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 134, Short.MAX_VALUE)
                                .addComponent(cadastro)))
                        .addGap(18, 18, 18)
                        .addComponent(Limpar))
                    .addGroup(CadastrarLayout.createSequentialGroup()
                        .addGroup(CadastrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addGroup(CadastrarLayout.createSequentialGroup()
                                .addGroup(CadastrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(CadastrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(Preco, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 79, Short.MAX_VALUE)
                                        .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(Nome, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(Codigo, javax.swing.GroupLayout.Alignment.LEADING))
                                    .addComponent(jLabel3))
                                .addGap(54, 54, 54)
                                .addGroup(CadastrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel6)
                                    .addComponent(modelo)
                                    .addComponent(marca))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        CadastrarLayout.setVerticalGroup(
            CadastrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CadastrarLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(CadastrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(CadastrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Codigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(modelo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addGap(2, 2, 2)
                .addGroup(CadastrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Nome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(CadastrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(marca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Preco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ValorDeLocacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(67, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, CadastrarLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(CadastrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Limpar)
                    .addComponent(cadastro))
                .addContainerGap())
        );

        painel.addTab("Cadastrar", Cadastrar);

        calcular.setText("Calcular aluguel");
        calcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calcularActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout CalcularLayout = new javax.swing.GroupLayout(Calcular);
        Calcular.setLayout(CalcularLayout);
        CalcularLayout.setHorizontalGroup(
            CalcularLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CalcularLayout.createSequentialGroup()
                .addGap(89, 89, 89)
                .addComponent(calcular, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(107, Short.MAX_VALUE))
        );
        CalcularLayout.setVerticalGroup(
            CalcularLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CalcularLayout.createSequentialGroup()
                .addGap(81, 81, 81)
                .addComponent(calcular, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(119, Short.MAX_VALUE))
        );

        painel.addTab("Calcular", Calcular);

        pesquisacarros.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(pesquisacarros);

        verCArros.setText("Ver Carros");
        verCArros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                verCArrosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout InformacoesLayout = new javax.swing.GroupLayout(Informacoes);
        Informacoes.setLayout(InformacoesLayout);
        InformacoesLayout.setHorizontalGroup(
            InformacoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(InformacoesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(InformacoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(verCArros, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 353, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(27, Short.MAX_VALUE))
        );
        InformacoesLayout.setVerticalGroup(
            InformacoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(InformacoesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(verCArros, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)
                .addContainerGap())
        );

        painel.addTab("Info", Informacoes);

        codigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                codigoActionPerformed(evt);
            }
        });

        jLabel7.setText("Código");

        novoValor.setEditable(false);

        jLabel9.setText("Novo preço");

        infoCarro.setColumns(20);
        infoCarro.setRows(5);
        jScrollPane3.setViewportView(infoCarro);

        procuraCarro.setText("Pesquisar");
        procuraCarro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                procuraCarroActionPerformed(evt);
            }
        });

        definir.setText("Definir");
        definir.setEnabled(false);
        definir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                definirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PesquisarLayout = new javax.swing.GroupLayout(Pesquisar);
        Pesquisar.setLayout(PesquisarLayout);
        PesquisarLayout.setHorizontalGroup(
            PesquisarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PesquisarLayout.createSequentialGroup()
                .addGroup(PesquisarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PesquisarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(PesquisarLayout.createSequentialGroup()
                        .addGroup(PesquisarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(novoValor, javax.swing.GroupLayout.DEFAULT_SIZE, 161, Short.MAX_VALUE)
                            .addComponent(codigo))
                        .addGap(18, 18, 18)
                        .addGroup(PesquisarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(procuraCarro, javax.swing.GroupLayout.DEFAULT_SIZE, 101, Short.MAX_VALUE)
                            .addComponent(definir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        PesquisarLayout.setVerticalGroup(
            PesquisarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PesquisarLayout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(PesquisarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(codigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(procuraCarro))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(PesquisarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(PesquisarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(novoValor)
                        .addComponent(definir, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(27, 27, 27)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(38, Short.MAX_VALUE))
        );

        painel.addTab("Pesquisar", Pesquisar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(painel, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(painel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 300, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void marcaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_marcaActionPerformed

    }//GEN-LAST:event_marcaActionPerformed

    private void LimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LimparActionPerformed
        Codigo.setText("");
        Nome.setText("");
        Preco.setText("");
        ValorDeLocacao.setText("");
        
    }//GEN-LAST:event_LimparActionPerformed

    private void cadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadastroActionPerformed
       a.add(new Carro(Integer.parseInt(Codigo.getText()),Nome.getText(),marca.getText(),modelo.getText()
               ,Float.parseFloat(ValorDeLocacao.getText())));
    }//GEN-LAST:event_cadastroActionPerformed

    private void goCadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_goCadastroActionPerformed
        painel.setSelectedComponent(Cadastrar);
    }//GEN-LAST:event_goCadastroActionPerformed

    private void goinfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_goinfActionPerformed
        painel.setSelectedComponent(Informacoes);
    }//GEN-LAST:event_goinfActionPerformed

    private void goCalcualrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_goCalcualrActionPerformed
        painel.setSelectedComponent(Calcular);
    }//GEN-LAST:event_goCalcualrActionPerformed

    private void goPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_goPesquisarActionPerformed
        painel.setSelectedComponent(Pesquisar);
    }//GEN-LAST:event_goPesquisarActionPerformed

    private void calcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_calcularActionPerformed
        try{
            for(int i = 0;i<a.size();i++){
                a.get(i).calcValorTotal(0);
            }
        }catch(Exception e){
            
        }
    }//GEN-LAST:event_calcularActionPerformed

    private void verCArrosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_verCArrosActionPerformed
        String[] auxi = new String[a.size()];
        
        for(int i = 0;i<a.size();i++){
            auxi[i] = a.get(i).getInformacoes();
        }
        pesquisacarros.setListData(auxi);
    }//GEN-LAST:event_verCArrosActionPerformed

    private void codigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_codigoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_codigoActionPerformed

    private void procuraCarroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_procuraCarroActionPerformed
       for(int i = 0;i < a.size();i++){
           if(a.get(i).getCodigo().equals(codigo.getText())){
               novoValor.setEditable(true);
               infoCarro.setText(a.get(i).getInformacoes());
               definir.setEnabled(true);
               
           }else{
               infoCarro.setText("Carro não encontrado!");
           }
       }
    }//GEN-LAST:event_procuraCarroActionPerformed

    private void definirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_definirActionPerformed
        for(int i = 0;i < a.size();i++){
           if(a.get(i).getCodigo().equals(codigo.getText())){
               a.get(i).setValorLocacao(Integer.parseInt(novoValor.getText()));
               infoCarro.setText("Valor Alterado com sucesso!");
           }
           }
    }//GEN-LAST:event_definirActionPerformed

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
            java.util.logging.Logger.getLogger(Usuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Usuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Usuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Usuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Usuario().setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Cadastrar;
    private javax.swing.JPanel Calcular;
    private javax.swing.JTextField Codigo;
    private javax.swing.JPanel Informacoes;
    private javax.swing.JButton Limpar;
    private javax.swing.JPanel Menu;
    private javax.swing.JTextField Nome;
    private javax.swing.JPanel Pesquisar;
    private javax.swing.JTextField Preco;
    private javax.swing.JTextField ValorDeLocacao;
    private javax.swing.JButton cadastro;
    private javax.swing.JButton calcular;
    private javax.swing.JTextField codigo;
    private javax.swing.JButton definir;
    private javax.swing.JButton goCadastro;
    private javax.swing.JButton goCalcualr;
    private javax.swing.JButton goPesquisar;
    private javax.swing.JButton goinf;
    private javax.swing.JTextArea infoCarro;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField marca;
    private javax.swing.JTextField modelo;
    private javax.swing.JTextField novoValor;
    private javax.swing.JTabbedPane painel;
    private javax.swing.JList<String> pesquisacarros;
    private javax.swing.JButton procuraCarro;
    private javax.swing.JButton verCArros;
    // End of variables declaration//GEN-END:variables
}
