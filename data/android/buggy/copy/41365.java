@java.lang.Override
public void select() {
    if ((currentItem) == 7) {
        menuBack();
    }
    setCurrentButtons(currentItem, "...");
    changeMode = true;
}