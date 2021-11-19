@org.springframework.web.bind.annotation.PostMapping(value = "/{itemId}/transaction")
public org.opentestsystem.ap.common.model.Item beginEditTransaction(@org.springframework.web.bind.annotation.PathVariable
final java.lang.String itemId, @org.springframework.web.bind.annotation.RequestBody
final org.opentestsystem.ap.ims.rest.BeginTransactionRequest request) {
    log.debug("begin editing item {}", itemId);
    itemService.beginEditTransaction(itemId, request.getMessage());
    return null;
}