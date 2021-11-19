public final void response(net.sf.json.JSONArray arr) {
    if (arr == null) {
        responseJson("[]");
    }else {
        responseJson(arr.toString());
    }
}