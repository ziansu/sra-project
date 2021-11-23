@java.lang.Override
public java.lang.Void caseInstStore(com.synflow.models.ir.InstStore store) {
    stored.add(store.getTarget().getVariable());
    return com.synflow.models.util.SwitchUtil.DONE;
}