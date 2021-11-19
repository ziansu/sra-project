@java.lang.Override
public java.lang.String convertFrom(java.lang.String clearTextPassword) {
    return org.apache.commons.codec.digest.DigestUtils.sha512Hex(clearTextPassword);
}