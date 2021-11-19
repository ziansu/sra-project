@java.lang.Override
public void action() {
    boolean click = robot.getPixelColor(target.x, target.y).equals(color);
    if (clickOnNotColor)
        click = !click;
    
    if (click) {
        super.action();
    }
}