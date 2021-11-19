public static tigase.xmpp.Authorization getByCondition(java.lang.String condition) {
    if (condition == null)
        return null;
    
    return tigase.xmpp.Authorization.BY_CONDITION.get(condition);
}