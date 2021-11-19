public static net.neoremind.sshxcute.core.SSHExec getInstance(net.neoremind.sshxcute.core.ConnBean conn) {
    if ((net.neoremind.sshxcute.core.SSHExec.ssh) == null) {
        net.neoremind.sshxcute.core.SSHExec.ssh = new net.neoremind.sshxcute.core.SSHExec(conn);
    }
    return net.neoremind.sshxcute.core.SSHExec.ssh;
}