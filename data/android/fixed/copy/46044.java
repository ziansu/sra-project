public org.i3xx.util.client.io.Resource externResult(final java.lang.Object result) {
    this.result = new org.i3xx.util.client.io.ResultImpl(retCode) {
        @java.lang.Override
        public java.lang.Object getResult() {
            return result;
        }
    };
    return this;
}