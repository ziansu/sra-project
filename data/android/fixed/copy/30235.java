public void criarJogadorPrincipal(int identificador, java.lang.String nome) {
    pbl.model.jogo.Peao p = new pbl.model.jogo.Peao();
    this.jogadorPrincipal = new pbl.model.jogo.Jogador(identificador, nome, p);
}