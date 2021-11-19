@java.lang.Override
public void run() {
    dwarfVisualCenter = new main.java.gui.DwarfVisualCenter(this, dwarfDatabase.getMapLocations().length, dwarfDatabase.getMapLocations()[0].length);
    main.java.gui.DwarfVisualCenter.showOnScreen(1, dwarfVisualCenter);
}