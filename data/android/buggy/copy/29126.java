public boolean getZombie() {
    if ((consoleProcess_) == null) {
        return zombie_;
    }
    zombie_ = consoleProcess_.getProcessInfo().getZombie();
    return zombie_;
}