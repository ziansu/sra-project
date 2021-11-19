@java.lang.SuppressWarnings(value = "InfiniteLoopStatement")
@java.lang.Override
public void run() {
    try {
        while (true) {
            try {
                cleanUp(queue.remove());
            } catch (java.lang.InterruptedException e) {
            }
        } 
    } catch (jnr.ffi.util.ref.internal.Finalizer.ShutDown shutDown) {
    }
}