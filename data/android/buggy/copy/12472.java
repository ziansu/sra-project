@java.lang.Override
public void apply(org.osgl.http.H.Request req, org.osgl.http.H.Response resp) {
    try {
        applyBeforeCommitHandler(req, resp);
        org.osgl.util.IO.close(resp.outputStream());
        applyAfterCommitHandler(req, resp);
    } finally {
        clearThreadLocals();
    }
}