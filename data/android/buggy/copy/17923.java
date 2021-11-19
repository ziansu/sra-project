@webdoctor.controller.RequestMapping(path = "/EditDescription", method = RequestMethod.POST)
@webdoctor.controller.ResponseBody
public int EditDescription(@webdoctor.controller.RequestBody
webdoctor.jooq.tables.pojos.Disease disease) {
    disease.setDescription(disease.getDescription().substring(3, ((disease.getDescription().length()) - 4)));
    return DS.descriptionEdit(disease);
}