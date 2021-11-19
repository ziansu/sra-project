public java.lang.String parseSender(java.lang.String raw) {
    java.lang.System.out.println(("raw address: " + raw));
    return raw.split("<")[0];
}