public java.util.List<java.lang.Integer> getSortedTimeOffsets() {
    java.util.List<java.lang.Integer> r = new java.util.ArrayList<java.lang.Integer>(lyricsMap.keySet());
    java.util.Collections.sort(r);
    return r;
}