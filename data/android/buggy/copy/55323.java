@java.lang.Override
public int requestFusion(int requestedMode) {
    if ((requestedMode == (reactor.core.Fuseable.ANY)) || (requestedMode == (reactor.core.Fuseable.ASYNC))) {
        enableAsyncFusion = true;
        return reactor.core.Fuseable.ASYNC;
    }
    return reactor.core.Fuseable.NONE;
}