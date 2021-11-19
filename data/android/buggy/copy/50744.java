private boolean lockToggle(boolean bool, org.nashua.tt151.lib.F310 arm) {
    while (arm.getButton(F310.Button.B)) {
        return !bool;
    } 
    return bool;
}