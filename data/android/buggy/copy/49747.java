public static java.lang.String exec(java.lang.String strCommand, boolean bSu) {
    java.lang.String strCmd = strCommand;
    if (bSu) {
        strCmd = "su -c " + strCmd;
    }
    com.asksven.commandcenter.exec.ExecResult myRes = com.asksven.commandcenter.exec.Exec.execPrint(strCmd);
    return myRes.getResultLine();
}