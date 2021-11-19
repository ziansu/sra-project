@java.lang.Override
public void run() {
    com.github.infosimulators.events.EventRegistry.fire(new com.github.infosimulators.events.Event(com.github.infosimulators.events.EventType.GUI_ELEMENT_RESET, new java.lang.String[]{ "SetupPanel" }));
    com.github.infosimulators.Main.mainMenu();
}