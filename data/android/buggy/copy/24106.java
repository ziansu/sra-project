@com.qmatic.qp.events.web.RequestMapping(value = "branch/{branchId}/device/{deviceUUID}", method = RequestMethod.GET)
@com.qmatic.qp.events.web.ResponseStatus(value = org.springframework.http.HttpStatus.OK)
public org.springframework.http.ResponseEntity<com.qmatic.qp.api.connectors.dto.Visit> getCurrentVisit(@com.qmatic.qp.events.web.PathVariable
java.lang.String branchId, @com.qmatic.qp.events.web.PathVariable
java.lang.String deviceUUID) {
    com.qmatic.qp.api.connectors.dto.Visit visit = visitService.getVisit(branchId, deviceUUID);
    return visit == null ? new org.springframework.http.ResponseEntity(visit, org.springframework.http.HttpStatus.OK) : new org.springframework.http.ResponseEntity(org.springframework.http.HttpStatus.NOT_FOUND);
}