public nikita.model.noark5.v4.Fonds update(nikita.model.noark5.v4.Fonds fonds) {
    if ((fonds.getFondsStatus()) == (nikita.config.N5ResourceMappings.STATUS_CLOSED)) {
    }
    return fondsRepository.save(fonds);
}