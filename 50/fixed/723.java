private org.springframework.web.servlet.ModelAndView internalSearch(java.lang.String MAVName, javax.servlet.http.HttpServletRequest request) {
    uk.ac.ebi.metabolights.search.service.SearchQuery query = getQuery(request);
    return internalSearch(MAVName, query, null);
}