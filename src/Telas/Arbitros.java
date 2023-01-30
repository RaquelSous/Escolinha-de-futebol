/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Telas;

import Classes.Arbitro;
import java.awt.Cursor;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Pedro
 */
public class Arbitros extends javax.swing.JFrame {

    private ArrayList<Arbitro> arbitros = new ArrayList<>();
    private String botao;
    /**
     * Creates new form Arbitros
     */
    public Arbitros() {
        initComponents();
    }
    
    public void carregarTabelaArbitros(){
        DefaultTableModel modelo = new DefaultTableModel(new Object[] {"Nome", "Sobrenome", "CPF", "Idade", "Sexo","Data Nascimento"}, 0) {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };
        
        for(int i=0; i < arbitros.size(); i++){
            Object linha[] = new Object[] {arbitros.get(i).getNome(),
                                           arbitros.get(i).getSobrenome(),
                                           arbitros.get(i).getCpf(),
                                           arbitros.get(i).getIdade(),
                                           arbitros.get(i).getSexo(),
                                           arbitros.get(i).getDataNascimento()};
            modelo.addRow(linha);
        }
        
        //Tabela recebe modelo
        tblArbitros.setModel(modelo);
        
        tblArbitros.getColumnModel().getColumn(0).setPreferredWidth(5);
        tblArbitros.getColumnModel().getColumn(1).setPreferredWidth(20);
        tblArbitros.getColumnModel().getColumn(2).setPreferredWidth(100);
        tblArbitros.getColumnModel().getColumn(3).setPreferredWidth(50);
        tblArbitros.getColumnModel().getColumn(4).setPreferredWidth(50);
        tblArbitros.getColumnModel().getColumn(5).setPreferredWidth(50);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        btnSalvar = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        btnPesquisar = new javax.swing.JButton();
        btnNovo = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        spnAno = new javax.swing.JSpinner();
        btnOkPesquisar = new javax.swing.JButton();
        lblNome = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        lblSobrenome = new javax.swing.JLabel();
        txtSobrenome = new javax.swing.JTextField();
        lblCpf = new javax.swing.JLabel();
        txtCpf = new javax.swing.JTextField();
        lblData = new javax.swing.JLabel();
        spnDia = new javax.swing.JSpinner();
        spnMes = new javax.swing.JSpinner();
        lblSexo = new javax.swing.JLabel();
        txtSexo = new javax.swing.JTextField();
        btnEditar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblArbitros = new javax.swing.JTable();
        btnSair = new javax.swing.JButton();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Árbitros");
        setBackground(new java.awt.Color(0, 153, 102));
        setIconImage(new javax.swing.ImageIcon(getClass().getResource("/Images/Árbitro.png")).getImage());
        setName(""); // NOI18N

        btnSalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Salvar.png"))); // NOI18N
        btnSalvar.setText("Salvar");
        btnSalvar.setEnabled(false);
        btnSalvar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnSalvarMouseEntered(evt);
            }
        });
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });

        btnExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Excluir.png"))); // NOI18N
        btnExcluir.setText("Excluir");
        btnExcluir.setEnabled(false);
        btnExcluir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnExcluirMouseEntered(evt);
            }
        });
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });

        btnPesquisar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Pesquisar.png"))); // NOI18N
        btnPesquisar.setText("Pesquisar");
        btnPesquisar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnPesquisarMouseEntered(evt);
            }
        });
        btnPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisarActionPerformed(evt);
            }
        });

        btnNovo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Novo.png"))); // NOI18N
        btnNovo.setText("Novo");
        btnNovo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnNovoMouseEntered(evt);
            }
        });
        btnNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNovoActionPerformed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(0, 153, 102));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Dados do árbitro"));

        spnAno.setModel(new javax.swing.SpinnerNumberModel(2023, null, null, 1));
        spnAno.setEnabled(false);

        btnOkPesquisar.setText("Pesquisar");
        btnOkPesquisar.setEnabled(false);
        btnOkPesquisar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnOkPesquisarMouseEntered(evt);
            }
        });
        btnOkPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOkPesquisarActionPerformed(evt);
            }
        });

        lblNome.setText("Nome:");

        txtNome.setEnabled(false);

        lblSobrenome.setText("Sobrenome:");

        txtSobrenome.setEnabled(false);

        lblCpf.setText("CPF:");

        txtCpf.setEnabled(false);

        lblData.setText("Data de nascimento:");

        spnDia.setModel(new javax.swing.SpinnerNumberModel(1, 1, 31, 1));
        spnDia.setEnabled(false);

        spnMes.setModel(new javax.swing.SpinnerNumberModel(1, 1, 12, 1));
        spnMes.setEnabled(false);

        lblSexo.setText("Sexo:");

        txtSexo.setEnabled(false);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblNome, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(45, 45, 45)
                        .addComponent(txtNome))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblSobrenome)
                        .addGap(18, 18, 18)
                        .addComponent(txtSobrenome))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(45, 45, 45)
                        .addComponent(txtCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnOkPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblData)
                        .addGap(18, 18, 18)
                        .addComponent(spnDia, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(spnMes, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(spnAno))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblSexo, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtSexo, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNome)
                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSobrenome)
                    .addComponent(txtSobrenome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCpf)
                    .addComponent(txtCpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnOkPesquisar))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblData)
                    .addComponent(spnDia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(spnMes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(spnAno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSexo)
                    .addComponent(txtSexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        btnEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Editar.png"))); // NOI18N
        btnEditar.setText("Editar");
        btnEditar.setEnabled(false);
        btnEditar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnEditarMouseEntered(evt);
            }
        });
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

        btnCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Cancelar.png"))); // NOI18N
        btnCancelar.setText("Cancelar");
        btnCancelar.setEnabled(false);
        btnCancelar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnCancelarMouseEntered(evt);
            }
        });
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        tblArbitros.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nome", "Sobrenome", "CPF", "Idade", "Sexo", "Data de nascimento"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblArbitros.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblArbitrosMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tblArbitros);

        btnSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Sair.png"))); // NOI18N
        btnSair.setText("Sair");
        btnSair.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnSairMouseEntered(evt);
            }
        });
        btnSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSairActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnNovo)
                        .addGap(18, 18, 18)
                        .addComponent(btnSalvar)
                        .addGap(18, 18, 18)
                        .addComponent(btnCancelar)
                        .addGap(18, 18, 18)
                        .addComponent(btnEditar)
                        .addGap(18, 18, 18)
                        .addComponent(btnExcluir)
                        .addGap(18, 18, 18)
                        .addComponent(btnPesquisar)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnSair)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSalvar)
                    .addComponent(btnNovo)
                    .addComponent(btnEditar)
                    .addComponent(btnCancelar)
                    .addComponent(btnExcluir)
                    .addComponent(btnPesquisar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnSair)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalvarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSalvarMouseEntered
        btnSalvar.setCursor(new Cursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_btnSalvarMouseEntered

    private void btnExcluirMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnExcluirMouseEntered
        btnExcluir.setCursor(new Cursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_btnExcluirMouseEntered

    private void btnPesquisarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPesquisarMouseEntered
        btnPesquisar.setCursor(new Cursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_btnPesquisarMouseEntered

    private void btnOkPesquisarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnOkPesquisarMouseEntered
        btnOkPesquisar.setCursor(new Cursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_btnOkPesquisarMouseEntered

    private void btnNovoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnNovoMouseEntered
        btnNovo.setCursor(new Cursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_btnNovoMouseEntered

    private void btnCancelarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCancelarMouseEntered
        btnCancelar.setCursor(new Cursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_btnCancelarMouseEntered

    private void btnEditarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEditarMouseEntered
        btnEditar.setCursor(new Cursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_btnEditarMouseEntered

    private void btnSairMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSairMouseEntered
        btnSair.setCursor(new Cursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_btnSairMouseEntered

    private void btnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_btnSairActionPerformed

    private void btnNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovoActionPerformed
        btnNovo.setEnabled(false);
        btnSalvar.setEnabled(true);
        btnCancelar.setEnabled(true);
        btnEditar.setEnabled(false);
        btnExcluir.setEnabled(false);
        btnPesquisar.setEnabled(false);
        btnOkPesquisar.setEnabled(false);
        
        txtNome.setEnabled(true);
        txtSobrenome.setEnabled(true);
        txtCpf.setEnabled(true);
        txtSexo.setEnabled(true);
        spnDia.setEnabled(true);
        spnMes.setEnabled(true);
        spnAno.setEnabled(true);
        
        txtNome.requestFocus();
        
        this.botao = "novo";
    }//GEN-LAST:event_btnNovoActionPerformed

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        if(txtNome.getText().equals("") || txtSobrenome.getText().equals("") || txtCpf.getText().equals("") || txtSexo.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Todos os campos devem ser inseridos", "Mensagem", JOptionPane.PLAIN_MESSAGE);
        }
        else{
             String nome = txtNome.getText();
             String sobrenome = txtSobrenome.getText();
             String cpf = txtCpf.getText();
             String sexo = txtSexo.getText();
             String diaTecnico = String.valueOf(spnDia.getValue());
             String mesTecnico = String.valueOf(spnMes.getValue());
             String anoTecnico = String.valueOf(spnAno.getValue());
             if(Integer.parseInt(diaTecnico)<10){
                 diaTecnico="0"+diaTecnico;
             }
             if(Integer.parseInt(mesTecnico)<10){
                 mesTecnico="0"+mesTecnico;
             }
             String dataNascimento = diaTecnico+"/"+mesTecnico+"/"+anoTecnico;
             
             DateTimeFormatter date =  DateTimeFormatter.ofPattern("dd/MM/yyyy");
             LocalDate dataNascimentoTecnico = LocalDate.parse(dataNascimento,date);
             LocalDate dataAtual = LocalDate.now();
             Period periodo = Period.between(dataNascimentoTecnico,dataAtual);
             int idade = periodo.getYears();
             

             if(botao.equals("novo")){
                 Arbitro arbitro = new Arbitro(nome, sobrenome, cpf, sexo, idade, dataNascimento);
                 arbitros.add(arbitro);
                 JOptionPane.showMessageDialog(null, "Árbitro cadastrado com sucesso", "Mensagem", JOptionPane.INFORMATION_MESSAGE);
             }
             else if(botao.equals("editar")){
                 int index = tblArbitros.getSelectedRow();
                 
                 arbitros.get(index).setNome(nome);
                 arbitros.get(index).setSobrenome(sobrenome);
                 arbitros.get(index).setCpf(cpf);
                 arbitros.get(index).setSexo(sexo);
                 arbitros.get(index).setIdade(idade);
                 arbitros.get(index).setDataNascimento(dataNascimento);
             }

             //Carregar os dados do gerente na tabela
             carregarTabelaArbitros();
             
             //Limpar os campos
             txtNome.setText("");
             txtSobrenome.setText("");
             txtCpf.setText("");
             txtSexo.setText("");
             spnDia.setValue(1);
             spnMes.setValue(1);
             spnAno.setValue(2023);


             //Habilitar ou desabiltiar botões
             btnNovo.setEnabled(true);
             btnSalvar.setEnabled(false);
             btnCancelar.setEnabled(false);
             btnEditar.setEnabled(false);
             btnExcluir.setEnabled(false);
             btnPesquisar.setEnabled(true);
             btnOkPesquisar.setEnabled(false);

             //Habilitar ou desabilitar campos de texto
             txtNome.setEnabled(false);
             txtSobrenome.setEnabled(false);
             txtCpf.setEnabled(false);
             txtSexo.setEnabled(false);
             spnDia.setEnabled(false);
             spnMes.setEnabled(false);
             spnAno.setEnabled(false);
        }
    }//GEN-LAST:event_btnSalvarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        tblArbitros.clearSelection();
        
        txtNome.setText("");
        txtSobrenome.setText("");
        txtCpf.setText("");
        txtSexo.setText("");
        spnDia.setValue(1);
        spnMes.setValue(1);
        spnAno.setValue(2023);
        
        txtNome.setEnabled(false);
        txtSobrenome.setEnabled(false);
        txtCpf.setEnabled(false);
        txtSexo.setEnabled(false);
        spnDia.setEnabled(false);
        spnMes.setEnabled(false);
        spnAno.setEnabled(false);
        
        btnNovo.setEnabled(true);
        btnSalvar.setEnabled(false);
        btnCancelar.setEnabled(false);
        btnEditar.setEnabled(false);
        btnExcluir.setEnabled(false);
        btnPesquisar.setEnabled(true);
        btnOkPesquisar.setEnabled(false);
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void tblArbitrosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblArbitrosMouseClicked
        int i = tblArbitros.getSelectedRow();
        Arbitro arbitro = arbitros.get(i);
        String[] data = arbitro.getDataNascimento().split("/");
        
        txtNome.setText(arbitro.getNome());
        txtSobrenome.setText(arbitro.getSobrenome());
        txtCpf.setText(arbitro.getCpf());
        txtSexo.setText(arbitro.getSexo());
        spnDia.setValue(Integer.parseInt(data[0]));
        spnMes.setValue(Integer.parseInt(data[1]));
        spnAno.setValue(Integer.parseInt(data[2]));
        
        btnNovo.setEnabled(false);
        btnSalvar.setEnabled(false);
        btnCancelar.setEnabled(true);
        btnEditar.setEnabled(true);
        btnExcluir.setEnabled(true);
        btnPesquisar.setEnabled(false);
        btnOkPesquisar.setEnabled(false);
    }//GEN-LAST:event_tblArbitrosMouseClicked

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        botao = "editar";
        
        btnNovo.setEnabled(false);
        btnSalvar.setEnabled(true);
        btnCancelar.setEnabled(true);
        btnEditar.setEnabled(false);
        btnExcluir.setEnabled(false);
        btnPesquisar.setEnabled(false);
        btnOkPesquisar.setEnabled(false);
        
        txtNome.setEnabled(true);
        txtSobrenome.setEnabled(true);
        txtCpf.setEnabled(true);
        txtSexo.setEnabled(true);
        spnDia.setEnabled(true);
        spnMes.setEnabled(true);
        spnAno.setEnabled(true);
    }//GEN-LAST:event_btnEditarActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        int i = JOptionPane.showConfirmDialog(null, "Tem certeza que deseja excluir esse árbitro?", "Atenção!", JOptionPane.WARNING_MESSAGE);
        
        if (i == 0) {
            arbitros.remove(tblArbitros.getSelectedRow());
            carregarTabelaArbitros();
            
            txtNome.setText("");
            txtSobrenome.setText("");
            txtCpf.setText("");
            txtSexo.setText("");
            spnDia.setValue(1);
            spnMes.setValue(1);
            spnAno.setValue(2023);
        }
        
        tblArbitros.clearSelection();
        
        btnNovo.setEnabled(true);
        btnSalvar.setEnabled(false);
        btnCancelar.setEnabled(false);
        btnExcluir.setEnabled(false);
        btnEditar.setEnabled(false);
        btnPesquisar.setEnabled(true);
        btnOkPesquisar.setEnabled(false);
    }//GEN-LAST:event_btnExcluirActionPerformed

    private void btnPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisarActionPerformed
        btnNovo.setEnabled(false);
        btnSalvar.setEnabled(false);
        btnCancelar.setEnabled(true);
        btnEditar.setEnabled(false);
        btnExcluir.setEnabled(false);
        btnPesquisar.setEnabled(false);
        btnOkPesquisar.setEnabled(true);
        
        txtCpf.setEnabled(true);       
        txtCpf.requestFocus();
    }//GEN-LAST:event_btnPesquisarActionPerformed

    private void btnOkPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOkPesquisarActionPerformed
        tblArbitros.clearSelection();
        
        if (txtCpf.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "É necessário inserir o CPF do árbitro.", "Informações insuficientes", JOptionPane.INFORMATION_MESSAGE);
        } else {
            boolean achou = false;
            String cpf = txtCpf.getText();
            
            for (int i = 0; i < arbitros.size(); i++) {
                Arbitro arbitro = arbitros.get(i);
                
                if (arbitro.getCpf().equals(cpf)) {
                    achou = true;
                    String[] data = arbitro.getDataNascimento().split("/");
                    
                    txtNome.setEnabled(true);
                    txtSobrenome.setEnabled(true);
                    txtCpf.setEnabled(true);
                    txtSexo.setEnabled(true);
                    spnDia.setEnabled(true);
                    spnMes.setEnabled(true);
                    spnAno.setEnabled(true);    
                    
                    txtNome.setText(arbitro.getNome());
                    txtSobrenome.setText(arbitro.getSobrenome());
                    txtCpf.setText(arbitro.getCpf());
                    txtSexo.setText(arbitro.getSexo());
                    spnDia.setValue(Integer.parseInt(data[0]));
                    spnMes.setValue(Integer.parseInt(data[1]));
                    spnAno.setValue(Integer.parseInt(data[2]));
                    
                    btnNovo.setEnabled(false);
                    btnSalvar.setEnabled(false);
                    btnCancelar.setEnabled(true);
                    btnEditar.setEnabled(true);
                    btnExcluir.setEnabled(true);
                    btnPesquisar.setEnabled(false);
                    btnOkPesquisar.setEnabled(false);
                    
                    tblArbitros.changeSelection(i, ICONIFIED, false, false);
                }
            }
            
            if (!achou) {
                JOptionPane.showMessageDialog(null, "Árbitro não encontrado.", "Mensagem", JOptionPane.INFORMATION_MESSAGE);
            }
        }
    }//GEN-LAST:event_btnOkPesquisarActionPerformed

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
            java.util.logging.Logger.getLogger(Arbitros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Arbitros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Arbitros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Arbitros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Arbitros().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnNovo;
    private javax.swing.JButton btnOkPesquisar;
    private javax.swing.JButton btnPesquisar;
    private javax.swing.JButton btnSair;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel lblCpf;
    private javax.swing.JLabel lblData;
    private javax.swing.JLabel lblNome;
    private javax.swing.JLabel lblSexo;
    private javax.swing.JLabel lblSobrenome;
    private javax.swing.JSpinner spnAno;
    private javax.swing.JSpinner spnDia;
    private javax.swing.JSpinner spnMes;
    private javax.swing.JTable tblArbitros;
    private javax.swing.JTextField txtCpf;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtSexo;
    private javax.swing.JTextField txtSobrenome;
    // End of variables declaration//GEN-END:variables
}
