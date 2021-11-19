private void LoadGui() throws java.lang.Exception {
    dpfmanager.MainApp.gui = new dpfmanager.shell.modules.interfaces.Gui();
    dpfmanager.MainApp.gui.LoadConformanceChecker();
    if (FirstTime()) {
        ShowDisclaimer();
    }else {
        ShowMain();
    }
}