@java.lang.Override
public void setInt(java.lang.String path, int value) {
    this.config.set(path, value);
    if (net.citizensnpcs.Settings.getBoolean("SaveOften")) {
        save();
    }
}