@org.springframework.transaction.annotation.Transactional
public com.google.common.base.Optional<se.inera.statistics.service.landsting.persistance.landstingenhet.LandstingEnhet> get(long id) {
    final se.inera.statistics.service.landsting.persistance.landstingenhet.LandstingEnhet landstingEnhet = manager.find(se.inera.statistics.service.landsting.persistance.landstingenhet.LandstingEnhet.class, id);
    return landstingEnhet == null ? com.google.common.base.Optional.<se.inera.statistics.service.landsting.persistance.landstingenhet.LandstingEnhet>absent() : com.google.common.base.Optional.of(landstingEnhet);
}