@fr.croixrouge.rdp.services.dwr.homepage.PUT
@fr.croixrouge.rdp.services.dwr.homepage.Path(value = "/{idEquipier}/enable")
@com.wordnik.swagger.annotations.ApiOperation(value = "enable or disable one equipier (equipier can't be deleted)")
public int enableEquipier(@com.wordnik.swagger.annotations.ApiParam(value = "idEquipier", required = true)
@fr.croixrouge.rdp.services.dwr.homepage.PathParam(value = "idEquipier")
int idEquipier, @com.wordnik.swagger.annotations.ApiParam(value = "enable", required = true)
@fr.croixrouge.rdp.services.dwr.homepage.QueryParam(value = "enable")
boolean enable) throws java.lang.Exception {
    try {
        this.equipierService.setEnableDisableEquipier(idEquipier, enable);
    } catch (java.lang.Exception e) {
        fr.croixrouge.rdp.services.dwr.homepage.EquipiersGestion.logger.error("Erreur lors de la récupération de la liste des équipiers", e);
        throw e;
    }
    return 1;
}