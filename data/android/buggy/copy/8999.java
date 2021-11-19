@org.openbaton.nfvo.api.RequestMapping(value = "{id}/vnfrecords/{idVnf}/vdunits/{idVdu}/vnfcinstances", method = RequestMethod.DELETE)
@org.openbaton.nfvo.api.ResponseStatus(value = org.springframework.http.HttpStatus.NO_CONTENT)
public void deleteVNFCInstance(@org.openbaton.nfvo.api.PathVariable(value = "id")
java.lang.String id, @org.openbaton.nfvo.api.PathVariable(value = "idVnf")
java.lang.String idVnf, @org.openbaton.nfvo.api.PathVariable(value = "idVdu")
java.lang.String idVdu, @org.openbaton.nfvo.api.RequestHeader(value = "project-id")
java.lang.String projectId) throws java.lang.InterruptedException, java.util.concurrent.ExecutionException, org.openbaton.nfvo.api.BadFormatException, org.openbaton.nfvo.api.NotFoundException, org.openbaton.nfvo.api.PluginException, org.openbaton.nfvo.api.VimException, org.openbaton.nfvo.api.WrongStatusException {
    networkServiceRecordManagement.deleteVNFCInstance(id, idVnf, idVdu, projectId, projectId);
}