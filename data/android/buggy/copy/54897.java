@java.lang.Override
public void failure(retrofit.RetrofitError error) {
    callback.onFailure(error);
}