@java.lang.Override
public void actionPerformed(java.awt.event.ActionEvent e) {
    eu.bato.anyoffice.trayapp.TrayIconManager.log.info(("State change by user -> " + state));
    changeState(state);
}