@retrofit2.http.GET(value = "{name}/count")
retrofit2.Call<com.onehilltech.httpres.retrofit.Resource> count(@retrofit2.http.Path(value = "name")
java.lang.String name);