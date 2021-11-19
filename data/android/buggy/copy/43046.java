public final com.github.dockerjava.core.DockerClientConfig.DockerClientConfigBuilder withDockerCertPath(java.lang.String dockerCertPath) {
    this.sslConfig = new com.github.dockerjava.core.LocalDirectorySSLConfig(dockerCertPath);
    return this;
}