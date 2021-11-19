public boolean updatePerformed(long dataTime) {
    android.util.Log.i(com.tpb.brainfuck_app.Storage.TAG, ((("updatePerformed: DataTime " + dataTime) + " LastUpdate ") + (com.tpb.brainfuck_app.Storage.lastUpdate)));
    return (com.tpb.brainfuck_app.Storage.lastUpdate) > dataTime;
}