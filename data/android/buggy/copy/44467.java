@java.lang.Override
public void onComplete(com.goolla.http.callback.objects.ResultObject value) {
    latch.countDown();
    isComplete[0] = true;
}