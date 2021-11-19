public int hashCode() {
    return (this.hostname.hashCode()) ^ (java.lang.Math.abs(this.port));
}