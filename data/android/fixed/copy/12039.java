@java.lang.Override
public void onSuccess(net.dorokhov.pony.web.shared.UserDto aUser) {
    getView().setErrors(null);
    currentRequest = null;
}