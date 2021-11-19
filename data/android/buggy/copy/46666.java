@java.lang.Override
public void showHttpError(int code) {
    com.yxzandra.cornershopchallenge.api.WebService.handlerRequestError(getApplicationContext(), code);
}