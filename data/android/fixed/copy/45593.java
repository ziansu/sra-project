@java.lang.Override
public boolean onCreate() {
    myDB = new com.spydotechcorps.hwfar.database.Dbhandler(getContext());
    return true;
}