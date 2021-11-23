@java.lang.Override
public io.hekate.messaging.internal.DefaultMessagingChannel<T> withFailover(io.hekate.failover.FailoverPolicyBuilder policy) {
    return withFailover(policy.build());
}