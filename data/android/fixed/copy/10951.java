public void run() {
    if ((file) != null) {
        Controler.TelaController tela = new Controler.TelaController(file);
        tela.run();
    }else {
        Controler.TelaController tela = new Controler.TelaController();
        tela.run();
    }
}