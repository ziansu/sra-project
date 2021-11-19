@java.lang.Override
public com.rare.server.apicaller.result.UserInformationResult callGoogleApiToGetPersonalInformation(com.rare.server.apicaller.input.UserInformationInput input) throws com.rare.server.apicaller.exception.ApiCallerException {
    java.net.URL url = generateUrl(input);
    java.net.HttpURLConnection conn = createConnection(url);
    java.io.BufferedReader br = getBufferedReader(conn);
    conn.disconnect();
    return generateUserInformationResult(br);
}