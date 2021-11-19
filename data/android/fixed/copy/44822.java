public static java.lang.String getReturnType(java.lang.String signature) {
    java.lang.System.out.println(signature);
    return edu.rose_hulman.csse374.visitors.impl.SignatureParser.parseSignature(signature.replaceAll("\\(.*\\)", "")).get(0);
}