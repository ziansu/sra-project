@java.lang.Override
public void drawRectangle(int x, int y, int width, int height) {
    component.getGraphics().drawRect(x, y, (width - 1), (height - 1));
}