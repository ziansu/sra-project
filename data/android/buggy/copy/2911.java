@java.lang.Override
public void timeUpdate() {
    o_statusLabel.setText(gui.StatusPanel.s_dateFormat.format(new java.util.Date()));
    o_lastUpdate = java.lang.System.currentTimeMillis();
}