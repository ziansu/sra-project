public synchronized void push(org.eclipse.equinox.http.servlet.internal.context.DispatchTargets toPush) {
    if ((dispatchTargets.size()) > 0) {
        toPush.addRequestParameters(request);
    }
    this.dispatchTargets.push(toPush);
}