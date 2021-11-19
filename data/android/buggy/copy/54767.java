@java.lang.Override
public void onError(java.lang.Throwable e) {
    if (e instanceof com.ede.wegapapplication.data.model.api.ResponseException) {
        onError(((com.ede.wegapapplication.data.model.api.ResponseException) (e)));
    }else {
        onError(com.ede.wegapapplication.data.model.api.ResponseException.toUnexpectedError(e));
    }
}