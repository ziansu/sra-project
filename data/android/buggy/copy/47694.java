public void set(java.lang.String namespace, java.lang.String key, java.lang.Object obj, java.util.Date expires) {
    this.init();
    this._set(this.getKey(key, namespace), obj, expires);
}