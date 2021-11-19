@javax.annotation.Nonnull
public static sirius.kernel.async.CallContext getCurrent() {
    sirius.kernel.async.CallContext ctx = sirius.kernel.async.CallContext.getCurrentIfAvailable();
    if (ctx == null) {
        return sirius.kernel.async.CallContext.initialize();
    }
    return ctx;
}