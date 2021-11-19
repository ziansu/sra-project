public void start() {
    if (hasUI) {
        UI.Dashboard demo = new UI.Dashboard();
    }else {
        main.Main.work(this);
    }
}