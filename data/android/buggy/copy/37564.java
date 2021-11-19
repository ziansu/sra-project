@org.junit.Test(expected = me.zeph.relations.exception.AlleleNotFoundException.class)
public void shouldThrowAlleleNotFoundException() {
    me.zeph.relations.model.entity.KitEntity kitEntity = getKitEntity(getAlleleEntity(1L, "name"), 1L, "name");
    when(kitRepository.findOne(1L)).thenReturn(kitEntity);
    alleleService.getAllele(1L, 2L);
}