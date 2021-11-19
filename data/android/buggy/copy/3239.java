@java.lang.Override
public void windowClosing(java.awt.event.WindowEvent e) {
    try {
        game.ServiceLocator.instance().getGame().terminate();
    } catch (java.lang.Exception ex) {
    }
}