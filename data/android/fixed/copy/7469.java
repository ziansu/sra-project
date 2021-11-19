@java.lang.Override
public boolean apply(@javax.annotation.Nullable
co.cask.cdap.proto.ProgramRecord record) {
    return programType.getCategoryName().equals(record.getType().getCategoryName());
}