public void createBucket(java.lang.String bucketName, java.lang.String region) {
    s3.createBucket(new com.amazonaws.services.s3.model.CreateBucketRequest(bucketName, region));
}