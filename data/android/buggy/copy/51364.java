public void getSelectUnderMenu() {
    this.showFeatureMenu();
    if ((getUserInput(1)) != 10)
        this.selectedMenu = getUserInput(1);
    else
        this.selectedMenu = 0;
    
}