public static com.innopolis.al_dente.MainView getInstance(javafx.scene.Parent p, com.innopolis.al_dente.models.IAlertListner listner) {
    if ((com.innopolis.al_dente.MainView.instance) == null) {
        com.innopolis.al_dente.MainView.instance = new com.innopolis.al_dente.MainView();
    }
    com.innopolis.al_dente.MainView.parent = p;
    if (listner != null) {
        com.innopolis.al_dente.MainView.alertListner = listner;
    }
    return com.innopolis.al_dente.MainView.instance;
}