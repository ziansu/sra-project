public models.MapInfo getMapById(java.lang.Long id) {
    models.MapInfo map = null;
    try {
        map = MapInfo.find.byId(id);
    } catch (java.lang.Throwable e) {
        play.Logger.error(("Exception at getting map by id: " + e));
    }
    return map;
}