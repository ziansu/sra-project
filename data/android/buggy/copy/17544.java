@org.jeffklein.turfwars.codes.backend.controller.RequestMapping(value = "/codes/{game}/temp/all", produces = "application/json", method = RequestMethod.GET)
public java.util.Map<java.lang.String, java.lang.Object> allTemps(@org.jeffklein.turfwars.codes.backend.controller.PathVariable(value = "game")
java.lang.String game) {
    java.util.Map<java.lang.String, java.lang.Object> model = this.createModelFromTempCodeList(tempCodeService.findAllTempCodes());
    model.put("game".game);
    return model;
}