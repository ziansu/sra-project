@org.springframework.web.bind.annotation.RequestMapping(value = "/search", method = org.springframework.web.bind.annotation.RequestMethod.GET, produces = { "application/json" })
public java.util.List<com.phantom.entity.ActivitiesDocument> searchReasults(@org.springframework.web.bind.annotation.RequestParam(value = "category")
java.lang.String category) {
    if (category.isEmpty()) {
        java.util.List<com.phantom.entity.ActivitiesDocument> activitiesDocumentList = activitiesDocumentDao.fetchAllDocuments();
        return activitiesDocumentList;
    }else {
        return activitiesDocumentDao.fetchActivitiesBasedOnCategory(category);
    }
}