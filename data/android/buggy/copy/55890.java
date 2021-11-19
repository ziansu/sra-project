private static boolean requestAccessTokenTest() {
    arces.unibo.SEPA.commons.response.Response response;
    response = arces.unibo.SEPA.client.tools.SEPATest.client.requestToken();
    arces.unibo.SEPA.client.tools.SEPATest.logger.debug(response.toString());
    return !(response.getClass().equals(arces.unibo.SEPA.commons.response.ErrorResponse.class));
}