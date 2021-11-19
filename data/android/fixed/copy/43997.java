public org.edx.mobile.model.api.PathModel getChapter() {
    for (int i = 0; i < (path.length); i++) {
        if (path[i].isChapter())
            return path[i];
        
    }
    return null;
}