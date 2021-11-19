@java.lang.Override
public void actionPerformed(pneumaticCraft.client.gui.widget.IGuiWidget widget) {
    if ((widget.getID()) == 1) {
        sendPacketToServer(1);
    }
    super.actionPerformed(widget);
}