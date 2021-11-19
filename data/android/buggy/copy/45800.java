public com.streetstat.model.Country getCountryById(long id) {
    com.streetstat.model.Country country = ((com.streetstat.model.Country) (countryDao.findById(id, "")));
    return country;
}