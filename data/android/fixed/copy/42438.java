public int getMinRange(java.lang.String minMatch, java.lang.String maxMatch, int dataContentLength) {
    if (minMatch != null) {
        return java.lang.Integer.parseInt(minMatch);
    }else {
        return dataContentLength - (java.lang.Integer.parseInt(maxMatch));
    }
}