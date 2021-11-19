@java.lang.Override
public org.apache.kerby.kerberos.kerb.spec.base.AuthToken decodeFromBytes(byte[] content) throws java.io.IOException {
    java.lang.String tokenStr = java.lang.String.valueOf(content);
    return decodeFromString(tokenStr);
}