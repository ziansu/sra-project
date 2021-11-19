public void queueLineBreakpointDescriptor(com.perl5.lang.perl.idea.run.debugger.breakpoints.PerlLineBreakPointDescriptor descriptor) {
    if (descriptor != null) {
        breakpointsDescriptorsQueue.add(descriptor);
        if ((isReady) && (mySession.isPaused())) {
            sendQueuedBreakpoints();
        }
    }
}