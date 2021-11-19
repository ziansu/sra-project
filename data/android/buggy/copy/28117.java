private void makePanels() {
    inputPanel = new Views.InputPanel();
    outputPanel = new Views.OutputPanel();
    Utils.OutputPanelProvider.setOutPutPanel(outputPanel);
    add(outputPanel, java.awt.BorderLayout.CENTER);
    add(inputPanel, java.awt.BorderLayout.SOUTH);
}