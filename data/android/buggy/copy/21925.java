static be.wegenenverkeer.rxhttp.aws.AwsSignature4Signer signer() {
    return new be.wegenenverkeer.rxhttp.aws.AwsSignature4Signer(AwsRegion.US_EAST, AwsService.HOST, be.wegenenverkeer.rxhttp.aws.Fixture.provider.getAwsCredentials());
}