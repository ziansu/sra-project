@java.lang.Override
public rx.Observable<com.xiecc.seeWeather.modules.domain.Province> call() {
    provincesList = mWeatherDB.loadProvinces(mDBManager.getDatabase());
    dataList.clear();
    return rx.Observable.from(provincesList);
}