/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Telas;

import Classes.Campeonato;
import java.awt.Cursor;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Pedro
 */
public class Campeonatos extends javax.swing.JFrame {

    private ArrayList<Campeonato> campeonatos = new ArrayList<>();
    private String botao;
    
    /**
     * Creates new form Campeonatos
     */
    public Campeonatos() {
        initComponents();
        
        File arquivo = new File("src/Dados/dadosCampeonatos.txt");
                
        try {
            FileReader fr = new FileReader(arquivo);
            BufferedReader br = new BufferedReader(fr);
            
            while(br.ready()) {
                String[] linha = br.readLine().split(";");
                Campeonato campeonato = new Campeonato(linha[0], linha[1], linha[2], linha[3], linha[4], linha[5], linha[6]);
                campeonatos.add(campeonato);
            }
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "Não foi possível abrir o arquivo.", "Erro", JOptionPane.ERROR_MESSAGE);
            return;
        }       
        
        carregarTabelaCampeonatos();
    }
    
    public void carregarTabelaCampeonatos(){
        DefaultTableModel modelo = new DefaultTableModel(new Object[] {"Nome", "Início", "Término", "Sexo", "Caegoria", "Vencedor"}, 0) {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };
        
        for(int i=0; i < campeonatos.size(); i++){
            Object linha[] = new Object[] {campeonatos.get(i).getNomeCampeonato(),
                                           campeonatos.get(i).getDataInicio(),
                                           campeonatos.get(i).getDataFinal(),
                                           campeonatos.get(i).getSexo(),
                                           campeonatos.get(i).getCategoria(),
                                           campeonatos.get(i).getVencedor()};
            modelo.addRow(linha);
        }
        
        //Tabela recebe modelo
        tblCampeonatos.setModel(modelo);
        
        tblCampeonatos.getColumnModel().getColumn(0).setPreferredWidth(20);
        tblCampeonatos.getColumnModel().getColumn(1).setPreferredWidth(20);
        tblCampeonatos.getColumnModel().getColumn(2).setPreferredWidth(20);
        tblCampeonatos.getColumnModel().getColumn(3).setPreferredWidth(20);
        tblCampeonatos.getColumnModel().getColumn(4).setPreferredWidth(50);
        tblCampeonatos.getColumnModel().getColumn(5).setPreferredWidth(20);
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
        lblSexo = new javax.swing.JLabel();
        cbSexo = new javax.swing.JComboBox<>();
        lblCategoria = new javax.swing.JLabel();
        lblNome = new javax.swing.JLabel();
        cbCategoria = new javax.swing.JComboBox<>();
        txtNome = new javax.swing.JTextField();
        lblEndereco = new javax.swing.JLabel();
        txtEndereco = new javax.swing.JTextField();
        lblVencedor = new javax.swing.JLabel();
        lblDataInicio = new javax.swing.JLabel();
        lblDataTermino = new javax.swing.JLabel();
        cbVencedor = new javax.swing.JComboBox<>();
        spnDiaInicio = new javax.swing.JSpinner();
        spnMesInicio = new javax.swing.JSpinner();
        spnAnoInicio = new javax.swing.JSpinner();
        spnDiaFinal = new javax.swing.JSpinner();
        spnMesFinal = new javax.swing.JSpinner();
        spnAnoFinal = new javax.swing.JSpinner();
        btnNovo = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        btnSalvar = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        btnVisualizar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblCampeonatos = new javax.swing.JTable();
        btnSair = new javax.swing.JButton();

        setTitle("Campeonatos");
        setIconImage(new javax.swing.ImageIcon(getClass().getResource("/Images/Campeonato.png")).getImage());

        jPanel1.setBackground(new java.awt.Color(0, 153, 102));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Dados do campeonato"));

        lblSexo.setText("Sexo:");

        cbSexo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Escolha o sexo", "Feminino", "Masculino" }));
        cbSexo.setEnabled(false);

        lblCategoria.setText("Categoria:");

        lblNome.setText("Nome:");

        cbCategoria.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Escolha a categoria", "Mirim", "Infantil", "Infanto Juvenil", "Juvenil", "Júnior" }));
        cbCategoria.setEnabled(false);

        txtNome.setEnabled(false);

        lblEndereco.setText("Endereço:");

        txtEndereco.setEnabled(false);

        lblVencedor.setText("Vencedor:");

        lblDataInicio.setText("Data do início:");

        lblDataTermino.setText("Data do término:");

        cbVencedor.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cbVencedor.setEnabled(false);

        spnDiaInicio.setModel(new javax.swing.SpinnerNumberModel(1, 1, 31, 1));
        spnDiaInicio.setEnabled(false);

        spnMesInicio.setModel(new javax.swing.SpinnerNumberModel(1, 1, 12, 1));
        spnMesInicio.setEnabled(false);

        spnAnoInicio.setModel(new javax.swing.SpinnerNumberModel(2023, null, null, 1));
        spnAnoInicio.setEnabled(false);

        spnDiaFinal.setModel(new javax.swing.SpinnerNumberModel(1, 1, 31, 1));
        spnDiaFinal.setEnabled(false);

        spnMesFinal.setModel(new javax.swing.SpinnerNumberModel(1, 1, 12, 1));
        spnMesFinal.setEnabled(false);

        spnAnoFinal.setModel(new javax.swing.SpinnerNumberModel(2023, null, null, 1));
        spnAnoFinal.setEnabled(false);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblCategoria)
                    .addComponent(lblVencedor, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblEndereco)
                    .addComponent(lblNome, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblDataInicio)
                    .addComponent(lblDataTermino)
                    .addComponent(lblSexo, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(spnDiaInicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(spnMesInicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(spnAnoInicio))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(spnDiaFinal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(spnMesFinal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(spnAnoFinal))
                    .addComponent(txtEndereco, javax.swing.GroupLayout.DEFAULT_SIZE, 241, Short.MAX_VALUE)
                    .addComponent(cbSexo, 0, 241, Short.MAX_VALUE)
                    .addComponent(cbCategoria, 0, 241, Short.MAX_VALUE)
                    .addComponent(cbVencedor, 0, 241, Short.MAX_VALUE)
                    .addComponent(txtNome))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNome)
                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblEndereco)
                    .addComponent(txtEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDataInicio)
                    .addComponent(spnDiaInicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(spnMesInicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(spnAnoInicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDataTermino)
                    .addComponent(spnDiaFinal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(spnMesFinal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(spnAnoFinal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSexo)
                    .addComponent(cbSexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCategoria)
                    .addComponent(cbCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblVencedor)
                    .addComponent(cbVencedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

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

        btnVisualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Campeonato.png"))); // NOI18N
        btnVisualizar.setText("Visualizar campeonato");
        btnVisualizar.setEnabled(false);
        btnVisualizar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnVisualizarMouseEntered(evt);
            }
        });
        btnVisualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVisualizarActionPerformed(evt);
            }
        });

        tblCampeonatos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nome", "Início", "Término", "Sexo", "Categoria", "Vencedor"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, true, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblCampeonatos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblCampeonatosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblCampeonatos);

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
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
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
                        .addComponent(btnVisualizar)
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
                    .addComponent(btnNovo)
                    .addComponent(btnCancelar)
                    .addComponent(btnSalvar)
                    .addComponent(btnEditar)
                    .addComponent(btnVisualizar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnSair)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnNovoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnNovoMouseEntered
        btnNovo.setCursor(new Cursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_btnNovoMouseEntered

    private void btnSalvarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSalvarMouseEntered
        btnSalvar.setCursor(new Cursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_btnSalvarMouseEntered

    private void btnCancelarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCancelarMouseEntered
        btnCancelar.setCursor(new Cursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_btnCancelarMouseEntered

    private void btnEditarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEditarMouseEntered
        btnEditar.setCursor(new Cursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_btnEditarMouseEntered

    private void btnVisualizarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVisualizarMouseEntered
        btnVisualizar.setCursor(new Cursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_btnVisualizarMouseEntered

    private void btnSairMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSairMouseEntered
        btnSair.setCursor(new Cursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_btnSairMouseEntered

    private void btnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_btnSairActionPerformed

    private void btnVisualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVisualizarActionPerformed
        String nome = campeonatos.get(tblCampeonatos.getSelectedRow()).getNomeCampeonato();
        DadosCampeonato dadosCampeonato = new DadosCampeonato();
        
        File arquivo = new File("src/Dados/nomeEquipe.txt");
         try {
             FileWriter fw = new FileWriter(arquivo);
             BufferedWriter bw = new BufferedWriter(fw);
             
             bw.write(nome);
             
             bw.close();
         } catch(IOException e) {
             JOptionPane.showMessageDialog(null, "Não foi possível abrir o arquivo.", "Erro", JOptionPane.ERROR_MESSAGE);
         }
        
        dadosCampeonato.nomeCampeonato = nome;
        dadosCampeonato.setVisible(true);
    }//GEN-LAST:event_btnVisualizarActionPerformed

    private void btnNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovoActionPerformed
        btnNovo.setEnabled(false);
        btnSalvar.setEnabled(true);
        btnCancelar.setEnabled(true);
        btnEditar.setEnabled(false);
        btnVisualizar.setEnabled(false);
        
        txtNome.setEnabled(true);
        txtEndereco.setEnabled(true);
        spnDiaInicio.setEnabled(true);
        spnMesInicio.setEnabled(true);
        spnAnoInicio.setEnabled(true);
        spnDiaFinal.setEnabled(true);
        spnMesFinal.setEnabled(true);
        spnAnoFinal.setEnabled(true);
        cbSexo.setEnabled(true);
        cbCategoria.setEnabled(true);
        cbVencedor.setEnabled(true);
        
        txtNome.requestFocus();
        
        this.botao = "novo";
    }//GEN-LAST:event_btnNovoActionPerformed

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        if(txtNome.getText().equals("") || txtEndereco.getText().equals("") || cbSexo.getSelectedIndex() == 0 || cbCategoria.getSelectedIndex() == 0 || cbVencedor.getSelectedIndex() == 0){
            JOptionPane.showMessageDialog(null, "Todos os campos devem ser inseridos", "Mensagem", JOptionPane.PLAIN_MESSAGE);
        }
        else{
            String nome = txtNome.getText();
            String endereco = txtEndereco.getText();
            String diaInicio = String.valueOf(spnDiaInicio.getValue());
            String mesInicio = String.valueOf(spnMesInicio.getValue());
            String anoInicio = String.valueOf(spnAnoInicio.getValue());
            String diaFinal = String.valueOf(spnDiaFinal.getValue());
            String mesFinal = String.valueOf(spnMesFinal.getValue());
            String anoFinal = String.valueOf(spnAnoFinal.getValue());
            String sexo = String.valueOf(cbSexo.getSelectedItem());
            String categoria = String.valueOf(cbCategoria.getSelectedItem());
            String vencedor = String.valueOf(cbVencedor.getSelectedItem());
             
            if(Integer.parseInt(diaInicio) < 10){
                diaInicio = "0" + diaInicio;
            }
            if(Integer.parseInt(mesInicio) < 10){
                mesInicio = "0" + mesInicio;
            }
            if(Integer.parseInt(diaFinal) < 10){
                diaFinal = "0" + diaFinal;
            }
            if(Integer.parseInt(mesFinal) < 10){
                mesFinal = "0" + mesFinal;
            } 
             
            String dataInicio = diaInicio + "/" + mesInicio + "/" + anoInicio;
            String dataFinal = diaFinal + "/" + mesFinal + "/" + anoFinal;
            
            if(botao.equals("novo")){
                Campeonato campeonato = new Campeonato(nome, endereco, vencedor, sexo, dataInicio, dataFinal, categoria);
                campeonatos.add(campeonato);
                
                File arquivo = new File("src/Dados/dadosCampeonatos.txt");
                
                try {
                    FileWriter fw = new FileWriter(arquivo, true);
                    BufferedWriter bw = new BufferedWriter(fw);

                    bw.write(nome + ";" + endereco + ";" + vencedor + ";" + sexo +
                            ";" + dataInicio + ";" + dataFinal + ";" + categoria);
                    bw.newLine();
                    
                    bw.close();
                } catch (IOException ex) {
                    JOptionPane.showMessageDialog(null, "Não foi possível abrir o arquivo.", "Erro", JOptionPane.ERROR_MESSAGE);
                    return;
                }
                
                JOptionPane.showMessageDialog(null, "Campeonato cadastrado com sucesso", "Mensagem", JOptionPane.INFORMATION_MESSAGE);
            }
            else if(botao.equals("editar")){
                int index = tblCampeonatos.getSelectedRow();
                 
                File arquivo = new File("src/Dados/dadosCampeonatos.txt");
            
            try { 
                ArrayList<String> temp = new ArrayList<>();
                
                FileReader fr = new FileReader(arquivo);
                BufferedReader br = new BufferedReader(fr);
                
                for(int j = 0; br.ready(); j++) {
                    if(j != index) {
                        String linha = br.readLine();
                        temp.add(linha);
                    } else {
                        br.readLine();
                        temp.add(nome + ";" + endereco + ";" + vencedor + ";" + sexo +
                            ";" + dataInicio + ";" + dataFinal + ";" + categoria);
                    }
                }
                br.close();
                
                FileWriter fw = new FileWriter(arquivo);
                BufferedWriter bw = new BufferedWriter(fw);
                
                for(String linha : temp) {
                    bw.write(linha);
                    bw.newLine();
                }
                
                bw.close();
                
            } catch (IOException ex) {
                JOptionPane.showMessageDialog(null, "Não foi posssível abrir o arquivo.", "Erro", 0);
                return;
            }
                campeonatos.get(index).setNomeCampeonato(nome);
                campeonatos.get(index).setEndereco(endereco);
                campeonatos.get(index).setCategoria(categoria);
                campeonatos.get(index).setSexo(sexo);
                campeonatos.get(index).setDataInicio(dataInicio);
                campeonatos.get(index).setDataFinal(dataFinal);
                campeonatos.get(index).setVencedor(vencedor);
            }

            //Carregar os dados do gerente na tabela
            carregarTabelaCampeonatos();
             
            //Limpar os campos
            txtNome.setText("");
            txtEndereco.setText("");
            spnDiaInicio.setValue(1);
            spnMesInicio.setValue(1);
            spnAnoInicio.setValue(2023);
            spnDiaFinal.setValue(1);
            spnAnoFinal.setValue(1);
            spnAnoFinal.setValue(2023);
            cbSexo.setSelectedIndex(0);
            cbCategoria.setSelectedIndex(0);
            cbVencedor.setSelectedIndex(0);


            //Habilitar ou desabiltiar botões
            btnNovo.setEnabled(true);
            btnSalvar.setEnabled(false);
            btnCancelar.setEnabled(false);
            btnEditar.setEnabled(false);
            btnVisualizar.setEnabled(false);

            //Habilitar ou desabilitar campos de texto
            txtNome.setEnabled(false);
            txtEndereco.setEnabled(false);
            spnDiaInicio.setEnabled(false);
            spnMesInicio.setEnabled(false);
            spnAnoInicio.setEnabled(false);
            spnDiaFinal.setEnabled(false);
            spnMesFinal.setEnabled(false);
            spnAnoFinal.setEnabled(false);
            cbSexo.setEnabled(false);
            cbCategoria.setEnabled(false);
            cbVencedor.setEnabled(false);
        }
    }//GEN-LAST:event_btnSalvarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        tblCampeonatos.clearSelection();
        
        txtNome.setText("");
        txtEndereco.setText("");
        spnDiaInicio.setValue(1);
        spnMesInicio.setValue(1);
        spnAnoInicio.setValue(2023);
        spnDiaFinal.setValue(1);
        spnAnoFinal.setValue(1);
        spnAnoFinal.setValue(2023);
        cbSexo.setSelectedIndex(0);
        cbCategoria.setSelectedIndex(0);
        cbVencedor.setSelectedIndex(0);
        
        txtNome.setEnabled(false);
        txtEndereco.setEnabled(false);
        spnDiaInicio.setEnabled(false);
        spnMesInicio.setEnabled(false);
        spnAnoInicio.setEnabled(false);
        spnDiaFinal.setEnabled(false);
        spnMesFinal.setEnabled(false);
        spnAnoFinal.setEnabled(false);
        cbSexo.setEnabled(false);
        cbCategoria.setEnabled(false);
        cbVencedor.setEnabled(false);
        
        btnNovo.setEnabled(true);
        btnSalvar.setEnabled(false);
        btnCancelar.setEnabled(false);
        btnEditar.setEnabled(false);
        btnVisualizar.setEnabled(false);
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        botao = "editar";
        
        btnNovo.setEnabled(false);
        btnSalvar.setEnabled(true);
        btnCancelar.setEnabled(true);
        btnEditar.setEnabled(false);
        btnVisualizar.setEnabled(false);
        
        txtNome.setEnabled(false);
        txtEndereco.setEnabled(true);
        spnDiaInicio.setEnabled(true);
        spnMesInicio.setEnabled(true);
        spnAnoInicio.setEnabled(true);
        spnDiaFinal.setEnabled(true);
        spnMesFinal.setEnabled(true);
        spnAnoFinal.setEnabled(true);
        cbSexo.setEnabled(true);
        cbCategoria.setEnabled(true);
        cbVencedor.setEnabled(true);
    }//GEN-LAST:event_btnEditarActionPerformed

    private void tblCampeonatosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblCampeonatosMouseClicked
        int i = tblCampeonatos.getSelectedRow();
        Campeonato campeonato = campeonatos.get(i);
        String[] dataInicio = campeonato.getDataInicio().split("/");
        String[] dataFinal = campeonato.getDataFinal().split("/");
        
        txtNome.setText(campeonato.getNomeCampeonato());
        txtEndereco.setText(campeonato.getEndereco());
        spnDiaInicio.setValue(Integer.parseInt(dataInicio[0]));
        spnMesInicio.setValue(Integer.parseInt(dataInicio[1]));
        spnAnoInicio.setValue(Integer.parseInt(dataInicio[2]));
        spnDiaFinal.setValue(Integer.parseInt(dataFinal[0]));
        spnMesFinal.setValue(Integer.parseInt(dataFinal[1]));
        spnAnoFinal.setValue(Integer.parseInt(dataFinal[2]));
        cbSexo.setSelectedItem(campeonato.getSexo());
        cbCategoria.setSelectedItem(campeonato.getCategoria());
        cbVencedor.setSelectedItem(campeonato.getVencedor());
        
        btnNovo.setEnabled(false);
        btnSalvar.setEnabled(true);
        btnCancelar.setEnabled(true);
        btnEditar.setEnabled(true);
        btnVisualizar.setEnabled(true);
    }//GEN-LAST:event_tblCampeonatosMouseClicked

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
            java.util.logging.Logger.getLogger(Campeonatos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Campeonatos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Campeonatos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Campeonatos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Campeonatos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnNovo;
    private javax.swing.JButton btnSair;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JButton btnVisualizar;
    private javax.swing.JComboBox<String> cbCategoria;
    private javax.swing.JComboBox<String> cbSexo;
    private javax.swing.JComboBox<String> cbVencedor;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblCategoria;
    private javax.swing.JLabel lblDataInicio;
    private javax.swing.JLabel lblDataTermino;
    private javax.swing.JLabel lblEndereco;
    private javax.swing.JLabel lblNome;
    private javax.swing.JLabel lblSexo;
    private javax.swing.JLabel lblVencedor;
    private javax.swing.JSpinner spnAnoFinal;
    private javax.swing.JSpinner spnAnoInicio;
    private javax.swing.JSpinner spnDiaFinal;
    private javax.swing.JSpinner spnDiaInicio;
    private javax.swing.JSpinner spnMesFinal;
    private javax.swing.JSpinner spnMesInicio;
    private javax.swing.JTable tblCampeonatos;
    private javax.swing.JTextField txtEndereco;
    private javax.swing.JTextField txtNome;
    // End of variables declaration//GEN-END:variables
}
