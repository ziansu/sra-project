@retrofit2.http.PATCH(value = "todos/{id}")
retrofit2.Call<hk.com.a4gtsstask.Note> updateNote(@retrofit2.http.Path(value = "id")
int id, @retrofit2.http.Field(value = "title")
java.lang.String title);