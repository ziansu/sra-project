@java.lang.Override
public void onResponse(retrofit2.Call<com.desk.java.apiclient.model.ApiResponse<com.desk.java.apiclient.model.Topic>> call, retrofit2.Response<com.desk.java.apiclient.model.ApiResponse<com.desk.java.apiclient.model.Topic>> response) {
    callbacks.onTopicsLoaded(response.body().getEntriesAsList());
}