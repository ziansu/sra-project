@retrofit.http.FormUrlEncoded
@retrofit.http.POST(value = org.esn.mobilit.utils.ApplicationConstants.API_REGIDS)
void registerId(@retrofit.http.Field(value = "token")
java.lang.String token, @retrofit.http.Field(value = "regId")
java.lang.String regId, @retrofit.http.Field(value = "section")
java.lang.String section, retrofit.Callback<retrofit.client.Response> callback);