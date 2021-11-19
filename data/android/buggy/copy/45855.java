@java.lang.Override
public final void request(long n) {
    if (n < 0)
        throw reactor.core.support.SpecificationExceptions.spec_3_09_exception(n);
    
    try {
        doRequest(n);
    } catch (java.lang.Throwable throwable) {
        doError(throwable);
    }
}