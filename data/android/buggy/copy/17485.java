public static short getQuotient(java.lang.Object obj) {
    java.lang.Integer hashcode = obj.hashCode();
    hashcode = hashcode >> 16;
    return hashcode.shortValue();
}