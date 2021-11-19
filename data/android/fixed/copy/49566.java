public void overwriteList(int id, java.lang.String name, java.util.List<java.lang.String> contents) {
    addList(name, contents);
    deleteList(id);
}