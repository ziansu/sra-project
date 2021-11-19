@retrofit2.http.PUT(value = "/user/username")
rx.Observable<com.stockholm.api.profile.UpdateProfileResp> updateUserName(@retrofit2.http.Body
com.stockholm.api.profile.UpdateUserNameReq req);