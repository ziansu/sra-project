public void actionPerformed(java.awt.event.ActionEvent e) {
    panelRetBruger();
    sletTabel(modelRet);
    guilayer.UserGUI.FillTableRet ftr = new guilayer.UserGUI.FillTableRet();
    ftr.worker.execute();
}