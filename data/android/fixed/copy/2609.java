public void setValue(java.lang.String key, double[] value) {
    synchronized(values) {
        this.values.put(key, value);
        modifications = true;
    }
}