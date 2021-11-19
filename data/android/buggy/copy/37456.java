@java.lang.Override
public long getEntityOwnerId() {
    java.lang.Long accountId = _accountService.getActiveAccountByName(accountName, domainId).getAccountId();
    if (accountId == null) {
        return org.apache.cloudstack.context.CallContext.current().getCallingAccount().getId();
    }
    return com.cloud.user.Account.ACCOUNT_ID_SYSTEM;
}