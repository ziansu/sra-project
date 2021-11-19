public void overwriteList(int id, java.lang.String name, java.util.List<java.lang.String> contents) {
    deleteList(id);
    addList(name, contents);
}