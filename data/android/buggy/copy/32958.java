@java.lang.Override
public void onCompleted(boolean result) {
    tv.append(makeLog(("\n" + "Import completed--->")));
    showDbMsg(databasePath1);
}