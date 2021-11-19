public void setTooltipText(java.lang.String tooltipText) {
    if ((tooltipText != null) && (tooltipText != "")) {
        tooltipFigure.setMessage(tooltipText);
        setToolTip(tooltipFigure);
    }else {
        setToolTip(null);
    }
}