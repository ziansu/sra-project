public static void parseTextInput(java.lang.String params) {
    com.gojek.carparking.main.RequestHandler.handleRequest(params.split(" ")[0], params.split(" "));
}