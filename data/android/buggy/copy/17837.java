public ua.org.ecity.entities.City getCity(java.lang.String name) {
    return cityRepository.getByName(name).get(0);
}