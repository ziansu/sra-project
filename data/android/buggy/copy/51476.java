public boolean isProviderAvailable() {
    if (org.qtproject.qt5.crypt.ZofenProvider.zofen.equals(""))
        doServiceConnect();
    
    return true;
}