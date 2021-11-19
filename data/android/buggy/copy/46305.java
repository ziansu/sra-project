@org.junit.Test
public void toggleWindowFocus() {
    assertMainGuiOpen(mainGui.toggleMainGuiUsingCtrlAltDAccelerator());
    assertMainGuiOpen(mainGui.toggleMainGuiUsingCtrlQAccelerator());
    assertMainGuiHidden(mainGui.toggleMainGuiUsingCtrlAltDAccelerator());
    assertMainGuiOpen(mainGui.toggleMainGuiUsingCtrlAltDAccelerator());
}