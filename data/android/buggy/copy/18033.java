public void actionPerformed(java.awt.event.ActionEvent e) {
    if ((cadastrarNovaCategoria) == null) {
        cadastrarNovaCategoria = new view.CadastroCategoria();
    }
    cadastrarNovaCategoria.setVisible(true);
}