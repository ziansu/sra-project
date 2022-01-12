@retrofit2.http.GET(value = "/repos/{owner}/{repo}/contents/{path}")
rx.Observable<java.lang.String> getFileContent(@retrofit2.http.Header(value = "Authorization")
java.lang.String auth, @android.support.annotation.Nullable
@retrofit2.http.Header(value = "Accept")
java.lang.String acc, @retrofit2.http.Path(value = "owner")
java.lang.String owner, @retrofit2.http.Path(value = "repo")
java.lang.String repo, @retrofit2.http.Path(value = "path")
java.lang.String path);