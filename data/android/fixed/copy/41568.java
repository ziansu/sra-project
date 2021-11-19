@java.lang.Override
public boolean equals(java.lang.Object otherFolder) {
    if (!(otherFolder instanceof com.newsblur.domain.Folder))
        return false;
    
    return android.text.TextUtils.equals(((com.newsblur.domain.Folder) (otherFolder)).name, name);
}