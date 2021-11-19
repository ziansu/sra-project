public void setOrientation(java.lang.String ori) {
    if (ori.equals("vertical_up")) {
        setOrientation(jmri.jmrit.display.PositionablePopupUtil.VERTICAL_UP);
    }else
        if (ori.equals("vertical_down")) {
            setOrientation(jmri.jmrit.display.PositionablePopupUtil.VERTICAL_DOWN);
        }else {
            setOrientation(jmri.jmrit.display.PositionablePopupUtil.HORIZONTAL);
        }
    
}