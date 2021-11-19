public int compareTo(LibraryBook bk) {
    return java.lang.Integer.compare(java.lang.Integer.parseInt(callNumber), java.lang.Integer.parseInt(bk.callNumber));
}