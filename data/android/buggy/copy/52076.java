public boolean removeLibrary(long targetId) {
    for (redlibrarian.music.Library lib : libraries)
        if ((lib.getId()) == targetId)
            return libraries.remove(lib);
        
    
    return false;
}