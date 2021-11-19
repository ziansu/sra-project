public void remove() {
    handlerRegistrationManager.removeHandler();
    for (final org.wirez.lienzo.toolbox.HoverToolboxButton button : buttons) {
        button.getShape().removeFromParent();
    }
}