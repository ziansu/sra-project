@java.lang.Override
public void apply(final delight.async.callbacks.ValueCallback<delight.functional.Success> callback) {
    this.map.put("1", "Just a test Value", delight.async.AsyncCommon.<delight.functional.Success>asSimpleCallback(callback));
}