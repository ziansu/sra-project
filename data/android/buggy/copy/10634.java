public boolean canResume() {
    if (isTerminated())
        return false;
    
    return isSuspended();
}