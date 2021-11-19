public void remove() {
    for (final org.wirez.lienzo.toolbox.HoverToolboxButton button : buttons) {
        button.getShape().removeFromParent();
    }
    handlerRegistrationManager.removeHandler();
}