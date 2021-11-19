public static java.lang.String upDir(int count) {
    java.lang.StringBuilder builder = new java.lang.StringBuilder();
    for (int i = 0; i < count; ++i)
        builder.append("../");
    
    return builder.toString();
}