public void getSelectMainMenu() {
    this.showMainMenu();
    if ((getUserInput(1)) != 10)
        this.selectedMenu = getUserInput(0);
    else
        this.selectedMenu = 0;
    
}