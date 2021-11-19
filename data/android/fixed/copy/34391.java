@java.lang.Override
protected void onDone(org.netbeans.modules.cnd.debugger.gdb2.mi.MIRecord record) {
    super.onDone(record);
    deleteWatch(variable, spreading);
}