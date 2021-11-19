@retrofit.http.PUT(value = "/repos/{owner}/{repoInfo}/notifications")
void markAsReadRepo(@retrofit.http.Path(value = "owner")
java.lang.String owner, @retrofit.http.Path(value = "repoInfo")
java.lang.String repo, @retrofit.http.Body
com.alorma.github.sdk.bean.dto.request.LastDate body, retrofit.Callback<retrofit.client.Response> responseCallback);