@java.lang.Override
public void setTitle(java.lang.String argTitle) {
    if (((title) != null) && (title.equals(argTitle)))
        return ;
    
    title = argTitle;
    notifyPropertyChanged();
}