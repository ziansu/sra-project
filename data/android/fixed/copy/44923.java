@com.oqs.controllers.RequestMapping(value = "/organizations-sort-by", method = RequestMethod.GET)
@com.oqs.controllers.ResponseBody
public java.util.List<com.oqs.model.User> organizationsBySort(@com.oqs.controllers.RequestParam(value = "typeId")
java.lang.String typeId) {
    java.util.List<com.oqs.model.User> organizationList = userDAO.getBsnListByType(typeId);
    return organizationList;
}