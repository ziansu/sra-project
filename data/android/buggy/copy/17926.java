public void switchToRepeatingPanel() {
    java.lang.System.out.println("swiiiiiiiiiiiiitch");
    parentDialog.getContainer().dispose();
    controller.switchPanels(problematicCheckbox.isSelected());
}