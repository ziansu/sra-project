private com.github.kubatatami.judonetworking.observers.ObservableWrapper<T> connect(com.github.kubatatami.judonetworking.observers.WrapperObserver<T> observer, com.github.kubatatami.judonetworking.observers.ObservableController controller) {
    return connect(observer, controller, false);
}