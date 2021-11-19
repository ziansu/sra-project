public void handleEvent(org.eclipse.swt.widgets.Event event) {
    stageModelWrapped.moveStageUp(selectedStage, currentSelectedDate);
    updateStageList();
}