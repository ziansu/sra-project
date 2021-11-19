@java.lang.Override
public java.lang.Object getVariable(int index) {
    return ((clojure.lang.IPersistentVector) (variableTable.deref())).nth(index);
}