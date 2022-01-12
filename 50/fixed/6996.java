protected void emphasisAsSelected(com.vaadin.ui.Button button) {
    if ((this.selectedButton) != null) {
        this.selectedButton.removeStyleName("selected");
    }
    button.addStyleName("selected");
    this.selectedButton = button;
}