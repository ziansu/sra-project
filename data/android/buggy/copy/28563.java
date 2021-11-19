@javax.annotation.Nonnull
public static sirius.kernel.async.CallContext getCurrent() {
    java.util.Optional<sirius.kernel.async.CallContext> ctx = sirius.kernel.async.CallContext.getCurrentIfAvailable();
    if (!(ctx.isPresent())) {
        return sirius.kernel.async.CallContext.initialize();
    }
    return ctx.get();
}