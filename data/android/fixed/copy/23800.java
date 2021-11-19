public static ru.dmitriy.selectioncommittee.ui.manager.ScreenManager init(com.vaadin.navigator.Navigator navigator) {
    ru.dmitriy.selectioncommittee.ui.manager.ScreenManager.instance = new ru.dmitriy.selectioncommittee.ui.manager.ScreenManager(navigator);
    return ru.dmitriy.selectioncommittee.ui.manager.ScreenManager.instance;
}