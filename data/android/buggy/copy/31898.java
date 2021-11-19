@java.lang.Override
public void onComplete() {
    long p = produced;
    produced = 0;
    reactivestreams.commons.publisher.PublisherRepeatWhen.PublisherRepeatWhenMainSubscriber.produced(p);
    otherArbiter.request(1);
    signaller.onNext(p);
}