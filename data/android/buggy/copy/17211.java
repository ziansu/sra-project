@java.lang.Override
public void notifyOnBuild(io.grpc.Server server) {
    com.google.common.base.Preconditions.checkState(((serverReflectionIndex) == null));
    serverReflectionIndex = new io.grpc.protobuf.service.ProtoReflectionService.ServerReflectionIndex(com.google.common.base.Preconditions.checkNotNull(server, "server"));
}