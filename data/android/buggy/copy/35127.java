@java.lang.Override
public void action() {
    boolean click = (robot.getPixelColor(target.x, target.y)) == (color);
    if (clickOnNotColor)
        click = !click;
    
    if (click) {
        super.action();
    }
}