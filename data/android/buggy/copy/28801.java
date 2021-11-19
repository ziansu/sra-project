@java.lang.Override
@java.lang.SuppressWarnings(value = "unchecked")
public <C extends T> io.hekate.messaging.internal.DefaultMessagingChannel<C> withLoadBalancer(io.hekate.messaging.unicast.LoadBalancer<C> balancer) {
    return new io.hekate.messaging.internal.DefaultMessagingChannel(gateway, cluster, balancer, failover, timeout, affinityKey);
}