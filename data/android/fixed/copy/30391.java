@retrofit2.http.FormUrlEncoded
@retrofit2.http.POST
rx.Observable<com.cidaassdk.LoginEntity> getAccessTokenByRefreshToken(@retrofit2.http.Url
java.lang.String url, @retrofit2.http.Header(value = "Content-Type")
java.lang.String content_type, @retrofit2.http.FieldMap(encoded = true)
java.util.Map<java.lang.String, java.lang.Object> params);