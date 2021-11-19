protected org.osgl.mvc.result.Result.Payload payload() {
    if (null == (_payload)) {
        synchronized(this) {
            if (null == (_payload)) {
                _payload = org.osgl.mvc.result.Result.payload.get();
            }
        }
    }
    return _payload;
}