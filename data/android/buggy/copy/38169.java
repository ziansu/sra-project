@java.lang.Override
public void onNext(T args) {
    if (!(isSelected())) {
        return ;
    }
    subscriber.onNext(args);
}