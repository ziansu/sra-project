@java.lang.Override
public boolean onCreate() {
    context = getContext();
    mDbHelper = new com.ferg.awfulapp.provider.AwfulProvider.DatabaseHelper(context);
    return true;
}