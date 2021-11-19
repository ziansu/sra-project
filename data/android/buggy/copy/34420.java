public void run() {
    try {
        it.cloud.utils.Ssh.exec(fip, fuser, fpassword, fkey, fcommand);
    } catch (java.lang.Exception e) {
        it.cloud.utils.Ssh.logger.error("Error while executing the command.", e);
    }
}