public java.lang.String getName() {
    if (this.isCached) {
        return this.cachedName();
    }else {
        return this.currentName();
    }
}