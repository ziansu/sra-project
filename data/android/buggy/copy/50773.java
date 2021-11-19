@java.lang.Override
public java.util.List<com.unimer.cotizaciones.entities.Country> listAllCountries() {
    java.util.List<com.unimer.cotizaciones.entities.Country> country = countryJpaRepository.findAll();
    return country;
}