private void salir() {
    int ret = ar.com.fwcommon.componentes.FWJOptionPane.showQuestionMessage(this, "�Est� seguro que desea salir?", ("Lector de " + (titulo)));
    if (ret == (ar.com.fwcommon.componentes.FWJOptionPane.YES_OPTION)) {
        java.lang.System.exit(1);
    }
}