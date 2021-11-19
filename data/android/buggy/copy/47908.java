@retrofit2.http.GET(value = "bill/export")
rx.Observable<com.giot.memo.data.entity.ResponseEntity<java.lang.String>> exportBill(@retrofit2.http.Query(value = com.giot.memo.util.SysConstants.EMAIL)
java.lang.String email, @retrofit2.http.Query(value = com.giot.memo.util.SysConstants.USER_ID)
java.lang.String userId, @retrofit2.http.Query(value = com.giot.memo.util.SysConstants.START_TIME)
java.lang.String startTime, @retrofit2.http.Query(value = com.giot.memo.util.SysConstants.END_TIME)
java.lang.String endTime);