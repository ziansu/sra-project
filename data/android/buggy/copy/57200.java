@javax.persistence.Transient
public boolean isAllowRefresh() {
    if ((grantTypes) != null) {
        return getAuthorizedGrantTypes().contains("refresh_token");
    }else {
        return false;
    }
}