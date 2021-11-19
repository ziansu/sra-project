@java.lang.Override
public void onRemoved() {
    super.onRemoved();
    lifecycleSubject.onNext(null);
}