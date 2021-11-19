@java.lang.Override
public void setNextRow(io.crate.core.collections.Row row) {
    rowCount = ((long) (row.get(0)));
}