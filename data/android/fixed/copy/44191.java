protected int getNextFreeFileID() {
    for (int i = 0; i < (list.storage.length); i++) {
        if ((list.storage[i]) == null)
            return i;
        
    }
    return list.storage.length;
}