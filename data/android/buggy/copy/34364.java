private void loadLibros(java.awt.event.ActionEvent evt) {
    GUI.Loading load = new GUI.Loading(controlador);
    panelprincipal.removeAll();
    panelprincipal.add(load);
    panelprincipal.updateUI();
    load.getControladorListener().actionPerformed(evt);
}