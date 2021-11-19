@java.lang.Override
public void onFailure(retrofit2.Call<com.desk.java.apiclient.model.ApiResponse<com.desk.java.apiclient.model.Article>> call, java.lang.Throwable throwable) {
    callbacks.onArticlesLoadError(new com.desk.android.sdk.error.ErrorResponse(throwable));
}