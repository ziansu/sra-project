@java.lang.Override
public void onSuccess(net.dorokhov.pony.web.shared.UserDto aUser) {
    getView().setEnabled(true);
    getView().setErrors(null);
    currentRequest = null;
}