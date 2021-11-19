@java.lang.Override
public void deliverResult(TModel result) {
    this.mResult = result;
    if (this.isStarted()) {
        super.deliverResult(result);
    }
}