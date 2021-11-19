public void removeAll() {
    while ((componentsArray.size) > 0) {
        removeInternal(componentsArray.get(0).getClass());
    } 
}