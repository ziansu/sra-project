@java.lang.Override
public int hashCode() {
    int h = hashcode;
    if (h == 0)
        hashcode = h = this.fs.hashCode();
    
    return h;
}