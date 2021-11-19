@retrofit.http.PUT(value = "/repos/{owner}/{name}/notifications")
void markAsReadRepo(@retrofit.http.Path(value = "owner")
java.lang.String owner, @retrofit.http.Path(value = "name")
java.lang.String repo, retrofit.Callback<retrofit.client.Response> responseCallback);