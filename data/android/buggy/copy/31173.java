private com.vip.saturn.job.console.service.impl.ServerStatus getServerStatus(final java.lang.String jobName, final java.lang.String serverIp) {
    com.vip.saturn.job.console.repository.zookeeper.CuratorRepository.CuratorFrameworkOp curatorFrameworkOp = curatorRepository.inSessionClient();
    java.lang.String ip = curatorFrameworkOp.getData(com.vip.saturn.job.console.service.impl.ExecutorNodePath.getExecutorNodePath(serverIp, "ip"));
    return com.vip.saturn.job.console.service.impl.ServerStatus.getServerStatus(ip);
}