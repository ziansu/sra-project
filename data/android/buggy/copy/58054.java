private boolean isEmpty() {
    for (hudson.tools.JDKInstaller.JDKFamily f : data) {
        if ((f.releases.length) > 0)
            return false;
        
    }
    return true;
}