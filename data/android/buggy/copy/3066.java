@java.lang.Override
protected void actionPerformed(net.minecraft.client.gui.GuiButton button) {
    if (button.enabled) {
        if ((button.id) == 0) {
            player.closeScreen();
            sendRedPacketToServer(true);
        }
    }
}