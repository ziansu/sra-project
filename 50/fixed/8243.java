protected com.cloud.user.Account getOwner(org.apache.cloudstack.api.command.user.ssh.RegisterSSHKeyPairCmd cmd) {
    com.cloud.user.Account caller = getCaller();
    com.cloud.user.Account owner = _accountMgr.finalizeOwner(caller, cmd.getAccountName(), cmd.getDomainId(), cmd.getProjectId());
    return owner;
}