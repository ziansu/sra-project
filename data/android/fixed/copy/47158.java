public static lin.comm.http.HttpCommunicateResult<lin.comm.http.FileInfo> download(java.lang.String file, lin.comm.http.ResultListener listener) {
    return lin.comm.http.HttpCommunicate.global().download(file, listener, null);
}