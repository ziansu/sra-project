public boolean isProviderAvailable() {
    if (org.qtproject.qt5.crypt.ZofenProvider.zofen.equals(""))
        doServiceConnect();
    
    if (org.qtproject.qt5.crypt.ZofenProvider.zofen.equals(""))
        doServiceConnect();
    
    if (org.qtproject.qt5.crypt.ZofenProvider.zofen.equals(""))
        return false;
    
    return true;
}