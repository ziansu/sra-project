@java.lang.Override
public void mouseWheelMoved(int newValue) {
    if ((itdelatrisu.opsu.Options.isMouseWheelDisabled()) || (itdelatrisu.opsu.Options.isMouseDisabled()))
        return ;
    
    itdelatrisu.opsu.ui.UI.changeVolume((newValue < 0 ? -1 : 1));
}