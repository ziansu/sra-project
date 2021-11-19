public model.Photo getPhoto(int index) {
    if (((collection.size()) - 1) > index) {
        java.lang.System.err.println("Stop doing shit : the index is to large ");
        return null;
    }else {
        return collection.get(index);
    }
}