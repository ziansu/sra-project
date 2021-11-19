@java.lang.Override
public void windowClosing(java.awt.event.WindowEvent arg0) {
    main.Main.closeRequested = true;
    main.Main.ui.CONSOLE.out.close();
    main.Main.ui.CONSOLE.err.close();
}