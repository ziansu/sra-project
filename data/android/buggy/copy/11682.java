private au.id.deejay.webserver.request.RequestLine readRequestLine(java.io.BufferedReader inputReader) throws java.io.IOException {
    return new au.id.deejay.webserver.request.RequestLine(inputReader.readLine());
}