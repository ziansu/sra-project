public java.lang.String sendURLWithToken(java.lang.String urlType, java.lang.String type) {
    return networkCom(urlType, (("{\"user-token\": " + (token)) + "}\n"), type);
}