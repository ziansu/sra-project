@java.lang.Override
public java.lang.String convertFrom(java.lang.String clearTextPassword) {
    if (clearTextPassword == null)
        return null;
    
    return org.apache.commons.codec.digest.DigestUtils.sha512Hex(clearTextPassword);
}