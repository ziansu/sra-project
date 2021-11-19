@org.junit.Test
public void testMakeMultipartRequestInput_AGGREGATE() throws java.lang.Exception {
    org.opendaylight.yang.gen.v1.urn.opendaylight.openflow.common.types.rev130731.MultipartType mpType = org.opendaylight.yang.gen.v1.urn.opendaylight.openflow.common.types.rev130731.MultipartType.OFPMPAGGREGATE;
    final org.opendaylight.yang.gen.v1.urn.opendaylight.openflow.protocol.rev130731.MultipartRequestInput mpRqInput = org.opendaylight.openflowplugin.impl.common.MultipartRequestInputFactory.makeMultipartRequestInput(xid, ofVersion, mpType);
    checkHeader(mpRqInput, mpType, ofVersion);
    checkEmptyBody(mpRqInput.getMultipartRequestBody(), org.opendaylight.yang.gen.v1.urn.opendaylight.openflow.protocol.rev130731.multipart.request.multipart.request.body.MultipartRequestAggregateCase.class);
}