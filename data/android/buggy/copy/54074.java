@java.lang.Override
public void setTooltip(final dorkbox.systemTray.MenuItem menuItem) {
    dorkbox.util.SwingUtil.invokeLater(new java.lang.Runnable() {
        @java.lang.Override
        public void run() {
            _native.setLabel(menuItem.getTooltip());
        }
    });
}