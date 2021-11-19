private void updateState() {
    if (isActive()) {
        setText(net.wbz.moba.controlcenter.web.client.util.BitStateToggleButton.STATE_ON);
    }else {
        setText(net.wbz.moba.controlcenter.web.client.util.BitStateToggleButton.STATE_OFF);
    }
}