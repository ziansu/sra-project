@java.lang.Override
public java.lang.String update(eu.neclab.iotplatform.ngsi.api.datamodel.UpdateContextAvailabilitySubscriptionRequest request) throws eu.neclab.iotplatform.confman.commons.exceptions.NotExistingInDatabase, java.lang.IllegalArgumentException {
    return this.update(request.getSubscriptionId(), request, DocumentType.SUBSCRIBE_CONTEXT_AVAILABILITY);
}