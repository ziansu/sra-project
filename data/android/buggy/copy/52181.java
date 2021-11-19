@java.lang.Override
public void onCreate() {
    super.onCreate();
    io.fabianterhorst.iron.Iron.init(getApplicationContext());
    io.fabianterhorst.iron.Iron.setLoaderExtension(new io.fabianterhorst.iron.retrofit.IronRetrofit());
    io.fabianterhorst.iron.Iron.setEncryptionExtension(new io.fabianterhorst.iron.encryption.IronEncryption());
}