public void setTooltipText(java.lang.String tooltipText) {
    if ((tooltipText != null) && ("".equals(tooltipText))) {
        tooltipFigure.setMessage(tooltipText);
        setToolTip(tooltipFigure);
    }else {
        setToolTip(null);
    }
}