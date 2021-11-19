@retrofit2.http.GET(value = "get/users/{id}")
retrofit2.Call<com.bukantkpd.bukabareng.api.model.UserDetailModel> getUserDetail(@retrofit2.http.Path(value = "id")
java.lang.String userId);