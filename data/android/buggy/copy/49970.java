@java.lang.Override
public void call(xiaofei.library.shelly.util.TaskFunction.ResultWrapper<R2, U2> o) {
    o.setError(mFunc2.call(mInput, error));
}