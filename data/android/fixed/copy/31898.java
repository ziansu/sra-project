@java.lang.Override
public void onComplete() {
    long p = produced;
    if (p != 0L) {
        produced = 0;
        reactivestreams.commons.publisher.PublisherRepeatWhen.PublisherRepeatWhenMainSubscriber.produced(p);
    }
    otherArbiter.request(1);
    signaller.onNext(p);
}