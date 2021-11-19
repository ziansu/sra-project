protected static boolean registrationTest(java.lang.String id) {
    arces.unibo.SEPA.commons.response.Response response;
    response = arces.unibo.SEPA.client.tools.SEPATest.client.register(id);
    return !(response.getClass().equals(arces.unibo.SEPA.commons.response.ErrorResponse.class));
}