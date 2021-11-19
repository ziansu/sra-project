@java.lang.Override
protected void actionPerformed(net.minecraft.client.gui.GuiButton button) {
    if (!(button.enabled))
        return ;
    
    switch (button.id) {
        case 0 :
            {
                sendRedPacketToServer(true);
                player.closeScreen();
                break;
            }
        default :
            break;
    }
}