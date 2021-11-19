@java.lang.Override
public void actionPerformed(java.awt.event.ActionEvent e) {
    closePanel();
    net.bither.qrcode.DisplayQRCodePanle displayQRCodePanle = new net.bither.qrcode.DisplayQRCodePanle(net.bither.Bither.getActionAddress().getAddress());
    displayQRCodePanle.showPanel();
}