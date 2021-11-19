public void telaAngulada(float angulo) {
    this.anguloNorte += angulo;
    this.anguloNorte = this.normatizador.normatizar(this.anguloNorte);
    resetAngulo();
    normatizarComponentes();
}