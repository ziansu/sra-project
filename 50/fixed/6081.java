private void setBase() {
    setContentView(ru.velkonost.lume.activity.BoardColumnsActivity.LAYOUT);
    setTheme(R.style.AppTheme_Cursor);
    butterknife.ButterKnife.bind(this);
    ru.velkonost.lume.Managers.TypefaceUtil.overrideFont(getApplicationContext(), "SERIF", "fonts/Roboto-Regular.ttf");
}