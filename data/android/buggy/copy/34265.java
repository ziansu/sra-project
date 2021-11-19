@retrofit.http.POST(value = "/dashboards/{dashboardUId}/items/content")
retrofit.client.Response postDashboardItem(@retrofit.http.Path(value = "dashboardUId")
java.lang.String dashboardUId, @retrofit.http.Query(value = "type")
java.lang.String type, @retrofit.http.Query(value = "id")
java.lang.String uid, @retrofit.http.Body
java.lang.String emptyBody);