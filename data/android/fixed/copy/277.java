@java.lang.Override
public java.lang.Object next() {
    return java.lang.reflect.Array.get(obj, ((this.index)++));
}