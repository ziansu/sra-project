@org.springframework.context.annotation.Bean
io.fabric8.kubernetes.client.KubernetesClient kubernetesClient(@org.springframework.beans.factory.annotation.Value(value = "#{environment['KUBERNETES_MASTER']}")
java.lang.String masterUrl) {
    java.lang.System.out.println(("using KUBE_MASTER: " + masterUrl));
    io.fabric8.kubernetes.client.Config config = new io.fabric8.kubernetes.client.ConfigBuilder().withMasterUrl(masterUrl).build();
    return new io.fabric8.kubernetes.client.DefaultKubernetesClient(config);
}