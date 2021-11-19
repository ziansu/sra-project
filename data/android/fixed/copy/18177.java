@java.lang.Override
public void onSuccess(java.util.List<java.lang.String> result) {
    getView().updateSocketBindings(result);
    loadServerConfigurations(null);
}