public static void main(java.lang.String[] args) throws java.io.IOException, org.codehaus.jackson.JsonGenerationException, org.codehaus.jackson.map.JsonMappingException {
    com.lnt.test.UserTest.loginUser();
    com.lnt.test.UserTest.createGateway(com.lnt.test.UserTest.token);
}