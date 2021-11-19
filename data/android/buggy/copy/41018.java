@com.zimbra.common.account.ZAttr(id = 2118)
public boolean isNetworkMobileNGEnabled() {
    return getBooleanAttr(Provisioning.A_zimbraNetworkMobileNGEnabled, true, true);
}