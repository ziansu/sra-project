public void showMenu() {
    if (!(isMenuShown)) {
        this.smoothScrollTo(mMenuWidth, 0);
        isMenuShown = true;
    }
}