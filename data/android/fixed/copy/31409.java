public void startSimulation() {
    init();
    com.kcl.keepitclean.main.session.SessionManager.getInstance().addObserver(this);
    com.kcl.keepitclean.main.session.SessionManager.getInstance().startSession();
    renderer.render();
    java.lang.System.out.println("<SimulatorEngine>Session Started");
}