private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {
    enviarDatos();
    Controladores.IControlador control = factorycontrol.crearControlador();
    control.consultarAmortizacion(dtoAmortizacion, dtoCliente);
    java.lang.System.out.println(("hola" + (dtoAmortizacion.GetMoneda())));
}