@retrofit2.http.GET(value = "/users/{user}/repos")
retrofit2.Call<io.caly.calyandroid.Model.Response.BasicResponse> test(@retrofit2.http.Path(value = "user")
java.lang.String user);