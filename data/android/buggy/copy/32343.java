void closeJSch() {
    sftp.exit();
    sshSession.disconnect();
}