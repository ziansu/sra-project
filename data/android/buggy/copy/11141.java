@com.mpp.controller.RequestMapping(method = RequestMethod.POST, value = "/labDelete", produces = "application/json; charset=utf-8")
@com.mpp.controller.ResponseBody
public com.mpp.constants.CodeMessage labDelete(@com.mpp.controller.RequestBody
com.mpp.model.Lab lab) {
    labService.deleteLab(lab.getId());
    return com.mpp.constants.JsonReturn.getSuccess("success");
}