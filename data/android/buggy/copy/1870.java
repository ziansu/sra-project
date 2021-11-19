private java.util.Map<java.lang.String, com.android.deskclock.data.City> getCityMap() {
    mCityMap = com.android.deskclock.data.CityDAO.getCities(mContext);
    return mCityMap;
}