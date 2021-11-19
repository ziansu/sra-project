@java.lang.Override
public void request(long n) {
    s.onNext(0);
    if (!(completed)) {
        s.onComplete();
    }
}