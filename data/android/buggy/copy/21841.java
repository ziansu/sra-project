@java.lang.Override
public com.streetstat.model.City getCityById(long id) {
    return ((com.streetstat.model.City) (cityDao.findById(id, "")));
}