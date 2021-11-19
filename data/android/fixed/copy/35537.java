@java.lang.Override
public void refreshFile(java.io.File file) {
    T p = shtykh.util.Jsonable.fromJson(shtykh.util.catalogue.Catalogue.read(file), clazz);
    file.delete();
    add(p);
}