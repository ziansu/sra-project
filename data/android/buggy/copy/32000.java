void notify_exit(short exit_reason) {
    com.price.msg_cluster.MsgClusterCmnDef.format_debug("Notify the parent it's time to leave, exit reason: %s", com.price.msg_cluster.MsgClusterCmnDef.GetErrorDescription(exit_reason));
    synchronized(runtime_ret) {
        runtime_ret.set(exit_reason);
        notify();
    }
}