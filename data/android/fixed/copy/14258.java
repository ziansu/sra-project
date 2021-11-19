@java.lang.Override
public java.util.List<library.interfaces.entities.IBook> listBooks() {
    java.util.List<library.interfaces.entities.IBook> list = new java.util.ArrayList<library.interfaces.entities.IBook>(this.bookMap.values());
    return list;
}