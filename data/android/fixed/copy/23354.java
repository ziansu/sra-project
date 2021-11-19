private boolean verificarMesmoId(java.lang.String id) {
    for (main.Processo p : controlador.listaProcessos) {
        if (p.getId().equals(id))
            return true;
        
    }
    return false;
}