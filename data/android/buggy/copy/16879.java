@java.lang.Override
public model.data.DataTable export(java.lang.String name) {
    model.data.DataTable res = copy();
    res.name = name;
    return res;
}