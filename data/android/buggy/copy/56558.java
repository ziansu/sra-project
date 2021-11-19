@org.junit.After
public void tearDown() throws java.lang.Exception {
    de.mxro.async.jre.Async.waitFor(new de.mxro.async.Operation<de.mxro.fn.Success>() {
        @java.lang.Override
        public void apply(de.mxro.async.callbacks.ValueCallback<de.mxro.fn.Success> callback) {
            map.stop(de.mxro.async.AsyncCommon.wrap(callback));
        }
    });
}