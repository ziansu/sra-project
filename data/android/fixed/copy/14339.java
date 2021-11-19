@java.lang.Override
public java.lang.String extract(ninja.Context context) {
    java.lang.String uSessionStr = context.getSession().get(SecurityFilter.USER_SESSION);
    return uSessionStr;
}