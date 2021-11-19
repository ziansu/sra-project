public void telaAngulada(float angulo) {
    printagemDbg("TELA ANGULADA INICIO");
    this.anguloNorte += angulo;
    this.anguloNorte = this.normatizador.normatizar(this.anguloNorte);
    resetAngulo();
    printagemDbg("TELA ANGULADA FIM");
    normatizarComponentes();
}