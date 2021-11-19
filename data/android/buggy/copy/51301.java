public static int getBackgroundColorResource() {
    switch (cw.kop.autobackground.settings.AppSettings.getTheme()) {
        default :
        case cw.kop.autobackground.settings.AppSettings.APP_LIGHT_THEME :
            return R.color.LIGHT_THEME_BACKGROUND;
        case cw.kop.autobackground.settings.AppSettings.APP_DARK_THEME :
        case cw.kop.autobackground.settings.AppSettings.APP_TRANSPARENT_THEME :
            return R.color.DARK_THEME_BACKGROUND;
    }
}