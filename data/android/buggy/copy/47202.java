public java.lang.String next() {
    java.lang.String returnString = ((java.lang.String) (itr.next()));
    next = null;
    bytesSent += (returnString.length()) + 1;
    return returnString;
}