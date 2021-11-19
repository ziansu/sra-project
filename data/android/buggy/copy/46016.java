@java.lang.Override
public void clickedOnControl(java.lang.Object arg) {
    if ((_selectedButton) == arg)
        return ;
    
    selectButton(_view.getBuildStationButton());
    StationPlacingToolSelected.fireEvent();
}