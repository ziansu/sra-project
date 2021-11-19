@java.lang.Override
public void apply(org.osgl.http.H.Request req, org.osgl.http.H.Response resp) {
    try {
        applyBeforeCommitHandler(req, resp);
        resp.commit();
        applyAfterCommitHandler(req, resp);
    } finally {
        clearThreadLocals();
    }
}