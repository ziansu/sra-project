public int getStatus() {
    try {
        java.lang.String s = responseMap.get("status");
        return java.lang.Integer.parseInt(s);
    } catch (java.lang.Exception ex) {
        return -1;
    }
}