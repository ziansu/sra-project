@org.springframework.web.bind.annotation.RequestMapping(method = org.springframework.web.bind.annotation.RequestMethod.GET)
de.intrafind.sitesearch.dto.Hits search(@org.springframework.web.bind.annotation.RequestParam(value = "sSearchTerm")
java.lang.String sSearchTerm, @org.springframework.web.bind.annotation.RequestParam(value = "query", required = false)
java.lang.String query) {
    query = sSearchTerm;
    de.intrafind.sitesearch.controller.HitController.LOG.info(("query = " + query));
    return service.search(query);
}