@retrofit.http.Multipart
@retrofit.http.POST(value = org.esn.mobilit.utils.ApplicationConstants.API_REGIDS)
void registerId(@retrofit.http.Part(value = "regId")
java.lang.String regId, @retrofit.http.Part(value = "section")
java.lang.String section, @retrofit.http.Query(value = "token")
java.lang.String token, retrofit.Callback<retrofit.client.Response> callback);