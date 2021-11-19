@java.lang.Override
public void setLong(java.lang.String path, long value) {
    this.config.set(path, java.lang.String.valueOf(value));
    if (net.citizensnpcs.Settings.getBoolean("SaveOften")) {
        save();
    }
}