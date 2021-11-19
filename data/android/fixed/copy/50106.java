@java.lang.Override
public void errorPrint(java.lang.Object msg) {
    if (isLoggingTimestamps()) {
        printErrorTimestamp();
    }else {
        java.lang.System.err.print(generateCode());
    }
    java.lang.System.err.print(msg);
}