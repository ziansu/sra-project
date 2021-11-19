void renderMenu() {
    app.utils.ConsoleWorker.print("\n--------------------\n");
    app.view.console.ConsoleMenu menu = new app.view.console.ConsoleMenu(this);
    menu.init();
    getEventListener().setCompleted(false);
}