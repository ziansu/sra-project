public void prepareScreen(int screenID) {
    switch (screenID) {
        case screens.ScreenGenerator.MAIN_MENU_SCREEN :
            prepareMainscreen();
        case screens.ScreenGenerator.QUIT_SCREEN :
        default :
            break;
    }
}