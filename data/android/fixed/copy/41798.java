public org.nextprot.api.core.service.fluent.FluentEntryService.FluentEntry withSrmPeptideMappings() {
    java.lang.Long masterId = masterIdentifierService.findIdByUniqueName(entryName);
    entry.setSrmPeptideMappings(peptideMappingService.findSyntheticPeptideMappingByMasterId(masterId));
    return this;
}