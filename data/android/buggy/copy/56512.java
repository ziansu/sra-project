public void actionPerformed(java.awt.event.ActionEvent e) {
    if ((cadastrarNovaTransacao) == null) {
        cadastrarNovaTransacao = new view.CadastroTransacao("Cadastrar", null);
    }
    cadastrarNovaTransacao.setVisible(true);
}