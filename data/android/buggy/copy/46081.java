@java.lang.Override
public void onError(java.lang.Throwable e) {
    com.netflix.eureka2.client.interest.AbstractInterestClient.logger.warn("OnError in one round of eviction due to a new interestChannel creation");
}