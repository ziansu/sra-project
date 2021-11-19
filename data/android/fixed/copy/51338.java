public void setURL(java.lang.String argUrl) {
    if (((url) != null) && (url.equals(argUrl)))
        return ;
    
    url = argUrl.trim();
    notifyPropertyChanged();
}