@java.lang.Override
public void onNext(T t) {
    if ((downloadListener) != null) {
        downloadListener.onNext(t);
    }
}