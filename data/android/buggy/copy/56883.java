private void action_warning(java.lang.String msg) {
    getDefaultToolbar().message().show(IconFont.base_icon_circle_warning, (" " + msg), com.liangmayong.base.support.theme.ThemeManager.getTheme().getWarningTextColor(), com.liangmayong.base.support.theme.ThemeManager.getTheme().getWarningColor(), 1500);
}