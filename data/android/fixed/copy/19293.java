private void setAmazonClient(com.amazonaws.auth.CognitoCachingCredentialsProvider credentialsProvider) {
    com.amazonaws.services.dynamodbv2.AmazonDynamoDBClient ddbClient = com.amazonaws.regions.Region.getRegion(Regions.AP_NORTHEAST_2).createClient(com.amazonaws.services.dynamodbv2.AmazonDynamoDBClient.class, credentialsProvider, new com.amazonaws.ClientConfiguration());
    mapper = new com.amazonaws.mobileconnectors.dynamodbv2.dynamodbmapper.DynamoDBMapper(ddbClient);
}