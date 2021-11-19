@java.lang.Override
public void call(final rx.Subscriber<? super T> child) {
    rx.Subscriber<T> parent = com.github.davidmoten.rx.internal.operators.OnSubscribeDoOnEmpty.createSubscriber(child, onEmpty);
    observable.unsafeSubscribe(parent);
}