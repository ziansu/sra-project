public void actionPerformed(java.awt.event.ActionEvent e) {
    sletTabel(modelRet);
    panelRetBruger();
    guilayer.UserGUI.FillTableRet ftr = new guilayer.UserGUI.FillTableRet();
    ftr.worker.execute();
}