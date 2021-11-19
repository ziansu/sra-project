public void openTools() {
    org.geogebra.web.html5.gui.tooltip.ToolTipManagerW.hideAllToolTips();
    header.selectTools();
    open();
    main.removeStyleName("algebra");
    main.addStyleName("tools");
}