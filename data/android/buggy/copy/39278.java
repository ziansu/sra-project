@java.lang.Override
public java.lang.Object get(int index, org.mozilla.javascript.Scriptable start) {
    if (index < (bufLength)) {
        return get(index);
    }
    return org.mozilla.javascript.Undefined.instance;
}