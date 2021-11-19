public int getShellType() {
    if ((consoleProcess_) == null) {
        return shellType_;
    }
    return consoleProcess_.getProcessInfo().getShellType();
}