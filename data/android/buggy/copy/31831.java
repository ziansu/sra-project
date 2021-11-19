@retrofit2.http.GET(value = "/user/avatar")
rx.Observable<com.stockholm.api.profile.GetAvatarResp> getAvatar(@retrofit2.http.HeaderMap
java.util.Map<java.lang.String, java.lang.String> headerMap);