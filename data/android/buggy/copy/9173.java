@cz.mzk.recordmanager.webapp.controller.RequestMapping(method = RequestMethod.POST, value = "/{libraryId}/configuration/{configId}")
@cz.mzk.recordmanager.webapp.controller.ResponseBody
public cz.mzk.recordmanager.api.model.OaiHarvestConfigurationDto deleteConfiguration(@cz.mzk.recordmanager.webapp.controller.RequestBody
cz.mzk.recordmanager.api.model.OaiHarvestConfigurationDto configurationDto, @cz.mzk.recordmanager.webapp.controller.PathVariable
java.lang.Long libraryId, @cz.mzk.recordmanager.webapp.controller.PathVariable
java.lang.Long configId) {
    configurationDto.setId(configId);
    return libraryService.updateOrCreateConfig(configurationDto, libraryId);
}