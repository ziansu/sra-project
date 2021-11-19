public boolean isHealthy() throws de.codecentric.recommendationService.impostor.ImpostorException {
    de.codecentric.recommendationService.impostor.ImpostorResponse response = get(healthUri);
    return (response.getStatus()) == (org.apache.http.HttpStatus.SC_OK);
}