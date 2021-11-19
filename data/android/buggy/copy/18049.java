protected void morir() {
    this.servidor.eliminarHiloConexion(this);
    this.servidor = null;
    try {
        this.finalize();
    } catch (java.lang.Throwable e) {
    }
}