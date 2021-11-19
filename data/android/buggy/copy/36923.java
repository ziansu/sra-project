@com.inva.hipstertest.freemarker.controllers.RequestMapping(value = "freemarker/teacher-mgmt/teacher-mgmt-get-av-forms", method = RequestMethod.GET)
@com.inva.hipstertest.freemarker.controllers.ResponseBody
public java.util.List<com.inva.hipstertest.service.dto.FormDTO> getAvailableForms() {
    log.debug("Create Ajax request for available forms");
    java.util.List<com.inva.hipstertest.service.dto.FormDTO> forms = formService.findAllUnassignedFormsByCurrentSchool();
    return forms;
}