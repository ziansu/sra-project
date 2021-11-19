@java.lang.Override
public int hashCode() {
    int result = 73;
    result += (_lastAccessedTime.hashCode()) + ((_myObj) == null ? 0 : _myObj.hashCode());
    return result;
}