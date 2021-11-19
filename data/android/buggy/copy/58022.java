public java.lang.String getHandle() {
    if ((consoleProcess_) == null) {
        return terminalHandle_;
    }
    terminalHandle_ = consoleProcess_.getProcessInfo().getHandle();
    return terminalHandle_;
}