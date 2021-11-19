@dagger.Provides
@javax.inject.Inject
public com.jianhui_zhu.simpleweatherwidget.viewmodel.ViewModelDetailActivity providesViewModelDetailActivity(com.jianhui_zhu.simpleweatherwidget.dataprovider.model.WeatherManager weatherManager) {
    return new com.jianhui_zhu.simpleweatherwidget.viewmodel.ViewModelDetailActivity(weatherManager);
}