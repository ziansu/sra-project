public synchronized boolean inLicense() {
    (count)++;
    if (((license) != 0) && ((count) <= (license))) {
        return true;
    }else
        return false;
    
}