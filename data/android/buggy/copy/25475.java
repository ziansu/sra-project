@retrofit2.http.POST(value = "/user")
retrofit2.Call<com.example.redi.MyFirstAndroidApp.models.entities.User> createUser(@retrofit2.http.Body
com.example.redi.MyFirstAndroidApp.models.entities.User user);