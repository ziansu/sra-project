boolean isDaemonUnhealthy() {
    return (isEnabled()) && ((isTenuredSpaceExhausted()) || (isPermGenSpaceExhausted()));
}