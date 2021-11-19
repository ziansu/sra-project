@java.lang.Override
protected rx.Observable buildUseCaseObservable(java.lang.Object... params) {
    java.lang.String[] arrays = new java.lang.String[]{ "peter" , "fojut" , "sam" };
    return rx.Observable.from(arrays);
}