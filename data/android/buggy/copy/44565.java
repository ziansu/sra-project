@java.lang.Override
public void draw() {
    menu.draw();
    switch (menu.chooseItem()) {
        case START :
            delegate.onStartChosen();
            break;
        case RESUME :
            delegate.onResumeChosen();
        default :
    }
}