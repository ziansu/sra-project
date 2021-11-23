protected synchronized void persistObject(org.liquidplayer.webkit.javascriptcore.JSObject obj) {
    objects.put(obj.valueRef(), new java.lang.ref.WeakReference<org.liquidplayer.webkit.javascriptcore.JSObject>(obj));
}