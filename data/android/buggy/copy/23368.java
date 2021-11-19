private static io.searchbox.client.JestClient createJestClient() {
    return io.apiman.gateway.engine.es.ESClientFactory.createJestClient("http", "localhost", 6500, "apiman_metrics", true);
}