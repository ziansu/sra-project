@java.lang.Override
public void select() {
    if ((currentItem) == 7) {
        menuBack();
    }
    changeMode = true;
    setCurrentButtons(currentItem, "...");
}