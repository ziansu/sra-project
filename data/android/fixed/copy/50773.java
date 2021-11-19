@java.lang.Override
public java.util.List<com.unimer.cotizaciones.entities.Country> listAllCountries() {
    return countryJpaRepository.findAll();
}