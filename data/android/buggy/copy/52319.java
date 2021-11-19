@retrofit2.http.GET(value = "vehicles/{vehicleId}/codes")
rx.Observable<li.vin.net.TimeSeries<li.vin.net.Dtc>> codes(@android.support.annotation.NonNull
@retrofit2.http.Path(value = "vehicleId")
java.lang.String vehicleId, @android.support.annotation.Nullable
@retrofit2.http.Query(value = "since")
java.lang.Long since, @android.support.annotation.Nullable
@retrofit2.http.Query(value = "until")
java.lang.Long until, @android.support.annotation.Nullable
@retrofit2.http.Query(value = "limit")
java.lang.Integer limit, @android.support.annotation.Nullable
@retrofit2.http.Query(value = "sortDir")
java.lang.String sortDir);