@java.lang.Override
public int getCount() {
    if ((model) == null) {
        return 0;
    }
    return (model.getData().getStudents().size()) + 1;
}