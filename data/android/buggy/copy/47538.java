@java.lang.Override
public void alustaGUI() throws java.rmi.RemoteException {
    gui.setGame(ristinollaPalvelin.getPeli(peliID));
    gui.UpdateTextArea("Peli alustettu");
    gui.UpdateTextArea("----------------------");
}