@retrofit2.http.Headers(value = { "Accept: application/json" })
@retrofit2.http.FormUrlEncoded
@retrofit2.http.PUT(value = scs71.com.scscws.ui.utils.Constant.FINISH_WORK)
retrofit2.Call<java.lang.String> finishWork(@retrofit2.http.Header(value = "API-TOKEN")
java.lang.String token, @retrofit2.http.Field(value = "id")
long serverWorkId);