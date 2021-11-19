void renderMenu() {
    app.utils.ConsoleWorker.print("\n--------------------\n");
    getEventListener().setCompleted(false);
    app.view.console.ConsoleMenu menu = new app.view.console.ConsoleMenu(this);
    menu.init();
}