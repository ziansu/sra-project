public void apply(com.codename1.javascript.JSObject self, java.lang.Object[] args) {
    java.lang.System.out.println("Browser bridge in JS onReady callback");
    browserBridge.bridge = ((com.codename1.javascript.JSObject) (args[0]));
    java.lang.System.out.println(("Browser bridge pointer at 316 is " + (browserBridge.bridge.toJSPointer())));
}