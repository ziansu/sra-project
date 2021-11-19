@com.inva.hipstertest.freemarker.controllers.RequestMapping(value = "freemarker/teacher-mgmt/teacher-mgmt-edit", method = RequestMethod.POST)
@com.inva.hipstertest.freemarker.controllers.ResponseBody
public com.inva.hipstertest.service.dto.TeacherDTO editRequest(@com.inva.hipstertest.freemarker.controllers.RequestBody
java.lang.Long id) {
    log.debug("Create Ajax edit request");
    com.inva.hipstertest.service.dto.TeacherDTO teacherDTOToSend = teacherService.findOne(id);
    return teacherDTOToSend;
}