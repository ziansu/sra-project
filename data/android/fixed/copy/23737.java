@java.lang.Override
public void resize(int width, int height) {
    clearAllMenus();
    super.resize(width, height);
    if ((activeState) != null)
        rebuildMenu();
    
}