public void showView(java.util.function.Consumer<java.lang.Object> callback, ar.edu.ungs.business.dto.UsuarioDTO user) {
    this.callback = callback;
    if (user != null)
        loadUsuario(user);
    
    showView();
}