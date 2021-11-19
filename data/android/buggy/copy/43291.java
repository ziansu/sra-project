@java.lang.Override
protected com.google.gwt.user.client.ui.Widget createMainWidget() {
    terminalSessionsPanel_ = new com.google.gwt.user.client.ui.DeckLayoutPanel();
    terminalSessionsPanel_.setStyleName(ConsoleResources.INSTANCE.consoleStyles().console());
    terminalSessionsPanel_.getElement().addClassName("ace_editor");
    return terminalSessionsPanel_;
}