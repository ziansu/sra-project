@retrofit2.http.GET(value = "/api/activities")
retrofit2.Call<cuexpo.cuexpo2017.dao.ActivityItemCollectionDao> loadHighlightActivity(@retrofit2.http.Query(value = "highlight")
boolean highlight, @retrofit2.http.Query(value = "fields")
java.lang.String fields, @retrofit2.http.Query(value = "end")
org.json.JSONObject end, @retrofit2.http.Query(value = "limit")
int limit);