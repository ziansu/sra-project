private com.fh.entity.UserEntity getUserFromCache() {
    java.lang.String token = this.getToken();
    java.lang.System.out.println(("thisdfdsfdf token is " + token));
    if (org.apache.commons.lang.StringUtils.isEmpty(token)) {
        return null;
    }
    return this.getUserFromCache(token);
}