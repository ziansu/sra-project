@org.springframework.context.annotation.Bean
@org.springframework.cloud.client.loadbalancer.LoadBalanced
public org.springframework.web.client.RestTemplate zwitscherServiceRestTemplate(org.springframework.cloud.netflix.ribbon.SpringClientFactory clientFactory, org.springframework.cloud.client.loadbalancer.LoadBalancerClient loadBalancer) {
    org.springframework.cloud.netflix.ribbon.RibbonClientHttpRequestFactory requestFactory = new org.springframework.cloud.netflix.ribbon.RibbonClientHttpRequestFactory(clientFactory, loadBalancer);
    return new org.springframework.web.client.RestTemplate(requestFactory);
}