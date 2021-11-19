@java.lang.Override
public void onNext(T t) {
    if ((downloadListener.get()) != null) {
        downloadListener.get().onNext(t);
    }
}