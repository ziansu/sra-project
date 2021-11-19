public void potentiallyPendingTest(org.reactivestreams.Publisher<T> pub, org.reactivestreams.tck.PublisherVerification.PublisherTestRun<T> body) throws java.lang.Throwable {
    if (pub != null) {
        body.run(pub);
    }else {
        throw new org.testng.SkipException("Skipping, because no Publisher was provided for this type of test");
    }
}