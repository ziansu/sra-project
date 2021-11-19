public java.util.ArrayList<java.lang.String> toArray() {
    java.lang.String[] rightsArray = rightsString.split(",");
    return new java.util.ArrayList<java.lang.String>(java.util.Arrays.asList(rightsArray));
}