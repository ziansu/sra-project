public org.edx.mobile.model.api.PathModel getSection() {
    for (int i = 0; i < (path.length); i++) {
        if (path[i].isSequential())
            return path[i];
        
    }
    return null;
}