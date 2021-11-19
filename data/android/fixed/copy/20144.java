@retrofit2.http.POST(value = (ir.asparsa.common.net.path.UserServicePath.SERVICE) + (ir.asparsa.common.net.path.UserServicePath.USERNAME))
rx.Observable<ir.asparsa.common.net.dto.AuthenticateDto> changeUsername(@retrofit2.http.Path(value = "hashCode")
long hashCode, @retrofit2.http.Query(value = "new")
java.lang.String username);