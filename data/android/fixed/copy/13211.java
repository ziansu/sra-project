private com.jeremydeanlakey.json.Json getJson() {
    if ((src) == null)
        return null;
    
    com.jeremydeanlakey.json.Json item = getItem();
    allowWhiteSpaceAndComments();
    requireDone();
    return item;
}