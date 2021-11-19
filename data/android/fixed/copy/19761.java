@java.lang.Override
public boolean apply(@javax.annotation.Nullable
org.apache.jackrabbit.oak.spi.state.ChildNodeEntry input) {
    return (input != null) && (input.getNodeState().exists());
}