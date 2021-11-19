@org.domeos.framework.api.controller.image.ResponseBody
@org.domeos.framework.api.controller.image.RequestMapping(value = "", method = RequestMethod.PUT)
public org.domeos.basemodel.HttpResponseTemp<?> modifyBaseImageCustom(@org.domeos.framework.api.controller.image.RequestBody
org.domeos.framework.api.model.image.BaseImageCustom baseImageCustom) {
    return baseImageCustomService.modifyBaseImageCustom(baseImageCustom);
}