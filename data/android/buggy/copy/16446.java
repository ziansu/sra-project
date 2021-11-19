public boolean podeReservar(java.lang.Integer numeroDeIngressos) {
    int sobraram = (getIngressosDisponiveis()) - numeroDeIngressos;
    boolean naoTemEspaco = sobraram <= 0;
    return !naoTemEspaco;
}