@java.lang.Override
void initView() {
    if ((provideContentRes()) == (R.layout.shock_activity_main_list)) {
        super.initView();
        return ;
    }
    configView();
}