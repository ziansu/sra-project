public com.example.natis.hagana.Model.ClientUser getOneUser(java.lang.String uid) {
    android.util.Log.d("TEST", "1");
    return com.example.natis.hagana.Model.ClientUserSQL.getUser(modelSql.getReadableDatabase(), uid);
}