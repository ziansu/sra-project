@java.lang.Override
public void onSuccess(java.lang.Void info) {
    getState().name = name;
    super.onSuccess(info);
}