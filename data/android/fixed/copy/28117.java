private void makePanels() {
    outputPanel = new Views.OutputPanel();
    Utils.OutputPanelProvider.setOutPutPanel(outputPanel);
    inputPanel = new Views.InputPanel();
    add(outputPanel, java.awt.BorderLayout.CENTER);
    add(inputPanel, java.awt.BorderLayout.SOUTH);
}