@org.domeos.framework.api.controller.image.ResponseBody
@org.domeos.framework.api.controller.image.RequestMapping(value = "/validate", method = RequestMethod.POST)
public org.domeos.basemodel.HttpResponseTemp<?> validation(@org.domeos.framework.api.controller.image.RequestParam
java.lang.String imageName, @org.domeos.framework.api.controller.image.RequestParam
java.lang.String imageTag) {
    return baseImageCustomService.validation(imageName, imageTag);
}