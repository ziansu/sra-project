@java.lang.Override
public void resize(int width, int height) {
    clearAllMenus();
    if ((activeState) != null)
        rebuildMenu();
    
}