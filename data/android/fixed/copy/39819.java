@java.lang.Override
public void onRemoved() {
    super.onRemoved();
    if ((lifecycleSubject) == null) {
        return ;
    }
    lifecycleSubject.onNext(null);
    lifecycleSubject = null;
}