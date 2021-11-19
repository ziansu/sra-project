@org.springframework.web.bind.annotation.RequestMapping(value = "facilities", method = org.springframework.web.bind.annotation.RequestMethod.GET)
@org.springframework.security.access.prepost.PreAuthorize(value = "@permissionEvaluator.hasPermission(principal,'MANAGE_DEMOGRAPHIC_ESTIMATES')")
public org.springframework.http.ResponseEntity<org.openlmis.core.web.OpenLmisResponse> get(@org.springframework.web.bind.annotation.RequestParam(value = "year")
java.lang.Integer year, @org.springframework.web.bind.annotation.RequestParam(value = "programId")
java.lang.Long programId, javax.servlet.http.HttpServletRequest request) {
    return org.openlmis.core.web.OpenLmisResponse.response("estimates", service.getEstimateFor(loggedInUserId(request), programId, year));
}