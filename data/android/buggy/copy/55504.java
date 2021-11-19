private void exit() {
    app.utils.ConsoleWorker.println(Log.CLOSING_APP);
    view.getEventListener().exit();
}