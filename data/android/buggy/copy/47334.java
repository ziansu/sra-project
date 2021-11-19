public void updateHeight() {
    height = 0;
    for (net.yawk.client.gui.AbstractComponent component : components) {
        height += component.getHeight();
        component.setY(height);
    }
}