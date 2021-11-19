private static boolean redirectCountExceeded(final com.ning.http.client.providers.grizzly.HttpTransactionContext context) {
    return (context.redirectCount.get()) > (context.maxRedirectCount);
}