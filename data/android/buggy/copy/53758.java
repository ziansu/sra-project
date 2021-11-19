@java.lang.Override
public void apply(final delight.async.callbacks.ValueCallback<delight.functional.Success> callback) {
    delight.async.callbacks.SimpleCallback _asSimpleCallback = delight.async.AsyncCommon.<delight.functional.Success>asSimpleCallback(callback);
    this.map.put("1", "Just a test Value", _asSimpleCallback);
}