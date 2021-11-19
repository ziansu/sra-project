@java.lang.Override
public boolean add(java.lang.String element) {
    if ((element.length()) == 0) {
        return false;
    }
    if (node.add(element, 0)) {
        count += 1;
        return true;
    }
    return false;
}