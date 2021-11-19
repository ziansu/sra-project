public static void refrescarLog() {
    uuidRenamer.Ventana.log.update(uuidRenamer.Ventana.log.getGraphics());
    javax.swing.text.DefaultCaret caret = ((javax.swing.text.DefaultCaret) (uuidRenamer.Ventana.log.getCaret()));
    caret.setUpdatePolicy(javax.swing.text.DefaultCaret.ALWAYS_UPDATE);
}