@cz.mzk.recordmanager.webapp.controller.RequestMapping(method = RequestMethod.PUT, value = "/{libraryId}/configuration")
@cz.mzk.recordmanager.webapp.controller.ResponseBody
public cz.mzk.recordmanager.api.model.OaiHarvestConfigurationDto createHarvestConfiguration(@cz.mzk.recordmanager.webapp.controller.RequestBody
cz.mzk.recordmanager.api.model.OaiHarvestConfigurationDto configurationDto, @cz.mzk.recordmanager.webapp.controller.PathVariable
java.lang.Long libraryId) {
    libraryService.updateOrCreateConfig(configurationDto, libraryId);
    return configurationDto;
}