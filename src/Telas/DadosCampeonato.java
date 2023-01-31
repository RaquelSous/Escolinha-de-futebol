/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Telas;

import java.awt.Cursor;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Pedro
 */
public class DadosCampeonato extends javax.swing.JFrame {

    public String nomeCampeonato;
    private ArrayList<ArrayList<String>> equipesCampeonato = new ArrayList<>();
    /**
     * Creates new form Dados
     */
    public DadosCampeonato() {
        initComponents();
        
        File nomeArquivo = new File("src/Dados/nomeEquipe.txt");
        String nome = "";
        
        try {
            FileReader fr = new FileReader(nomeArquivo);
            BufferedReader br = new BufferedReader(fr);
            
            nome = br.readLine();
            
        } catch(IOException e) {
            JOptionPane.showMessageDialog(null, "Não foi possível abrir o arquivo.", "Erro", JOptionPane.ERROR_MESSAGE);
        }
        
        nome = nome + ".txt";
        File arquivo = new File("src/Dados/Campeonatos/" + nome);
        
        try{
            FileReader fr = new FileReader(arquivo);
            BufferedReader br = new BufferedReader(fr);
        
            while(br.ready()) {
                String[] linha = br.readLine().split(";");
                ArrayList<String> listLinha = new ArrayList<>();
                listLinha.add(linha[0]);
                listLinha.add(linha[1]);
                listLinha.add(linha[2]);
                listLinha.add(linha[3]);
                
                equipesCampeonato.add(listLinha);            
            } 
            
            br.close();
            carregarTabelaEquipesCampeonato();
            
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Não foi possível abrir o arquivo.", "Erro", JOptionPane.ERROR_MESSAGE);
            this.setVisible(false);
            return;
        }
        
    }
    public void carregarTabelaEquipesCampeonato(){
        DefaultTableModel modelo = new DefaultTableModel(new Object[] {"Nome", "Sexo", "Categoria", "Técnico"}, 0) {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };
        
        for(int i=0; i < equipesCampeonato.size(); i++){
            Object linha[] = new Object[] {equipesCampeonato.get(i).get(0),
                                           equipesCampeonato.get(i).get(1),
                                           equipesCampeonato.get(i).get(2),
                                           equipesCampeonato.get(i).get(3)};
            modelo.addRow(linha);
        }
        
        //Tabela recebe modelo
        tblEquipesCampeonato.setModel(modelo);
        
        tblEquipesCampeonato.getColumnModel().getColumn(0).setPreferredWidth(20);
        tblEquipesCampeonato.getColumnModel().getColumn(1).setPreferredWidth(20);
        tblEquipesCampeonato.getColumnModel().getColumn(2).setPreferredWidth(20);
        tblEquipesCampeonato.getColumnModel().getColumn(3).setPreferredWidth(20);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSlider1 = new javax.swing.JSlider();
        jPanel1 = new javax.swing.JPanel();
        lblNome = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        lblSexo = new javax.swing.JLabel();
        txtSexo = new javax.swing.JTextField();
        lblCategoria = new javax.swing.JLabel();
        txtCategoria = new javax.swing.JTextField();
        lblTecnico = new javax.swing.JLabel();
        txtTecnico = new javax.swing.JTextField();
        btnPesquisar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblEquipesCampeonato = new javax.swing.JTable();
        btnAdicionarEquipe = new javax.swing.JButton();
        btnRemoverEquipe = new javax.swing.JButton();
        btnSair = new javax.swing.JButton();
        btnSalvar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Equipe");
        setIconImage(new javax.swing.ImageIcon(getClass().getResource("/Images/jogadores.png")).getImage());

        jPanel1.setBackground(new java.awt.Color(0, 153, 102));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Dados da equipe"));
        jPanel1.setToolTipText("");

        lblNome.setText("Nome:");

        lblSexo.setText("Sexo:");

        txtSexo.setEnabled(false);

        lblCategoria.setText("Categoria:");

        txtCategoria.setEnabled(false);

        lblTecnico.setText("Técnico:");

        txtTecnico.setEnabled(false);

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

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblCategoria)
                    .addComponent(lblSexo, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblNome, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblTecnico))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtTecnico, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                    .addComponent(txtCategoria)
                    .addComponent(txtNome)
                    .addComponent(txtSexo))
                .addGap(18, 18, 18)
                .addComponent(btnPesquisar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNome)
                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPesquisar))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSexo)
                    .addComponent(txtSexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCategoria)
                    .addComponent(txtCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTecnico)
                    .addComponent(txtTecnico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        tblEquipesCampeonato.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nome", "Técnico", "Categoria"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblEquipesCampeonato.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblEquipesCampeonatoMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblEquipesCampeonato);

        btnAdicionarEquipe.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Novo.png"))); // NOI18N
        btnAdicionarEquipe.setText("Adicionar equipe");
        btnAdicionarEquipe.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnAdicionarEquipeMouseEntered(evt);
            }
        });
        btnAdicionarEquipe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdicionarEquipeActionPerformed(evt);
            }
        });

        btnRemoverEquipe.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Excluir.png"))); // NOI18N
        btnRemoverEquipe.setText("Remover equipe");
        btnRemoverEquipe.setEnabled(false);
        btnRemoverEquipe.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnRemoverEquipeMouseEntered(evt);
            }
        });
        btnRemoverEquipe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoverEquipeActionPerformed(evt);
            }
        });

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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnSair)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 671, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnAdicionarEquipe)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnSalvar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnCancelar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnRemoverEquipe, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)))
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
                    .addComponent(btnRemoverEquipe)
                    .addComponent(btnAdicionarEquipe)
                    .addComponent(btnCancelar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnSair)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAdicionarEquipeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAdicionarEquipeMouseEntered
        btnAdicionarEquipe.setCursor(new Cursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_btnAdicionarEquipeMouseEntered

    private void btnRemoverEquipeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRemoverEquipeMouseEntered
        btnRemoverEquipe.setCursor(new Cursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_btnRemoverEquipeMouseEntered

    private void btnPesquisarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPesquisarMouseEntered
        btnPesquisar.setCursor(new Cursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_btnPesquisarMouseEntered

    private void btnSairMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSairMouseEntered
        btnSair.setCursor(new Cursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_btnSairMouseEntered

    private void btnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_btnSairActionPerformed

    private void btnAdicionarEquipeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdicionarEquipeActionPerformed
        btnSalvar.setEnabled(true);
        btnCancelar.setEnabled(true);
        btnPesquisar.setEnabled(true);
        btnAdicionarEquipe.setEnabled(false);
        
        txtSexo.setEnabled(true);
        txtCategoria.setEnabled(true);
        txtTecnico.setEnabled(true);
        
        txtNome.requestFocus();
    }//GEN-LAST:event_btnAdicionarEquipeActionPerformed

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        if(txtNome.getText().equals("") || txtSexo.getText().equals("") || txtCategoria.getText().equals("") || txtTecnico.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Todos os campos devem ser inseridos", "Mensagem", JOptionPane.PLAIN_MESSAGE);
        }
        else{
            String nome = txtNome.getText();
            String sexo = txtSexo.getText();
            String categoria = txtCategoria.getText();
            String tecnico = txtTecnico.getText();
            
            ArrayList<String> dados = new ArrayList<>();
            dados.add(nome);
            dados.add(sexo);
            dados.add(categoria);
            dados.add(tecnico);
            equipesCampeonato.add(dados);
             
            String nomeArquivo = this.nomeCampeonato + ".txt";
            File arquivo = new File("src/Dados/Campeonatos/" + nomeArquivo);
            
            try {
                if(!arquivo.exists()) {
                    arquivo.createNewFile();
                }
                
                FileWriter fw = new FileWriter(arquivo, true);
                BufferedWriter bw = new BufferedWriter(fw);

                bw.write(nome + ";" + sexo + ";" + categoria + ";" + tecnico);
                bw.newLine();
                
                bw.close();
            } catch (IOException ex) {
                JOptionPane.showMessageDialog(null, "Não foi posssível abrir o arquivo.", "Erro", 0);
                return;
            }
            JOptionPane.showMessageDialog(null, "Equipe cadastrada com sucesso", "Mensagem", JOptionPane.INFORMATION_MESSAGE);
            

            //Carregar os dados do gerente na tabela
            carregarTabelaEquipesCampeonato();
             
            //Limpar os campos
            txtNome.setText("");
            txtSexo.setText("");
            txtCategoria.setText("");
            txtTecnico.setText("");

            //Habilitar ou desabiltiar botões
            btnAdicionarEquipe.setEnabled(true);
            btnSalvar.setEnabled(false);
            btnRemoverEquipe.setEnabled(false);

            //Habilitar ou desabilitar campos de texto
            txtSexo.setEnabled(false);
            txtCategoria.setEnabled(false);
            txtTecnico.setEnabled(false);            
        }
    }//GEN-LAST:event_btnSalvarActionPerformed

    private void btnRemoverEquipeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoverEquipeActionPerformed
        int i = JOptionPane.showConfirmDialog(null, "Tem certeza que deseja excluir essa equipe?", "Atenção!", JOptionPane.WARNING_MESSAGE);
        
        if (i == 0) {
            i = tblEquipesCampeonato.getSelectedRow();
            
            File arquivo = new File("src/Dados/Campeonatos/" + this.nomeCampeonato + ".txt");
            
            try { 
                ArrayList<String> temp = new ArrayList<>();
                
                FileReader fr = new FileReader(arquivo);
                BufferedReader br = new BufferedReader(fr);
                
                for(int j = 0; br.ready(); j++) {
                    if(j != i) {
                        String linha = br.readLine();
                        temp.add(linha);
                    } else {
                        br.readLine();
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
            
            equipesCampeonato.remove(i);
            carregarTabelaEquipesCampeonato();
            
            txtNome.setText("");
            txtSexo.setText("");
            txtCategoria.setText("");
            txtTecnico.setText("");
            
            tblEquipesCampeonato.clearSelection();
            
            btnAdicionarEquipe.setEnabled(true);
            btnSalvar.setEnabled(false);
            btnRemoverEquipe.setEnabled(false);
            btnCancelar.setEnabled(false);
            
        }
    }//GEN-LAST:event_btnRemoverEquipeActionPerformed

    private void tblEquipesCampeonatoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblEquipesCampeonatoMouseClicked
        btnAdicionarEquipe.setEnabled(false);
        btnSalvar.setEnabled(false);
        btnRemoverEquipe.setEnabled(true);
        btnCancelar.setEnabled(true);
        
        txtNome.setText(equipesCampeonato.get(tblEquipesCampeonato.getSelectedRow()).get(0));
        txtSexo.setText(equipesCampeonato.get(tblEquipesCampeonato.getSelectedRow()).get(1));
        txtCategoria.setText(equipesCampeonato.get(tblEquipesCampeonato.getSelectedRow()).get(2));
        txtTecnico.setText(equipesCampeonato.get(tblEquipesCampeonato.getSelectedRow()).get(3));
    }//GEN-LAST:event_tblEquipesCampeonatoMouseClicked

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        tblEquipesCampeonato.clearSelection();
        
        txtNome.setText("");
        txtSexo.setText("");
        txtCategoria.setText("");
        txtTecnico.setText(""); 
        
        txtSexo.setEnabled(false);
        txtCategoria.setEnabled(false);
        txtTecnico.setEnabled(false);
        
        btnAdicionarEquipe.setEnabled(true);
        btnSalvar.setEnabled(false);
        btnRemoverEquipe.setEnabled(false);
        btnCancelar.setEnabled(false);
        btnPesquisar.setEnabled(true);
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnSalvarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSalvarMouseEntered
        btnSalvar.setCursor(new Cursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_btnSalvarMouseEntered

    private void btnCancelarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCancelarMouseEntered
        btnCancelar.setCursor(new Cursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_btnCancelarMouseEntered

    private void btnPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisarActionPerformed
        String nome = txtNome.getText();
        boolean achou = false;
        int i = 0;
        
        for(ArrayList<String> equipe : equipesCampeonato) {
            if(equipe.get(0).equals(nome)) {
                txtSexo.setText(equipe.get(1));
                txtCategoria.setText(equipe.get(2));
                txtTecnico.setText(equipe.get(3));
                
                achou = true;
                i = equipesCampeonato.indexOf(equipe);
            }
        }
        
        if (achou) {
            btnAdicionarEquipe.setEnabled(false);
            btnSalvar.setEnabled(false);
            btnRemoverEquipe.setEnabled(true);
            btnCancelar.setEnabled(true);
            btnPesquisar.setEnabled(false);
            
            tblEquipesCampeonato.setRowSelectionInterval(i, i);
        } else {
            JOptionPane.showMessageDialog(null, "Não foi possível encontrar a equipe '" + nome + "'.", "Erro", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_btnPesquisarActionPerformed

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
            java.util.logging.Logger.getLogger(DadosCampeonato.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DadosCampeonato.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DadosCampeonato.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DadosCampeonato.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DadosCampeonato().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdicionarEquipe;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnPesquisar;
    private javax.swing.JButton btnRemoverEquipe;
    private javax.swing.JButton btnSair;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSlider jSlider1;
    private javax.swing.JLabel lblCategoria;
    private javax.swing.JLabel lblNome;
    private javax.swing.JLabel lblSexo;
    private javax.swing.JLabel lblTecnico;
    private javax.swing.JTable tblEquipesCampeonato;
    private javax.swing.JTextField txtCategoria;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtSexo;
    private javax.swing.JTextField txtTecnico;
    // End of variables declaration//GEN-END:variables
}
