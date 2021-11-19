private void rb_producto_nuevoActionPerformed(java.awt.event.ActionEvent evt) {
    if (rb_producto_nuevo.isSelected()) {
        productoNuevo(true);
        limpiarCamposProducto();
    }else {
        productoNuevo(false);
    }
}