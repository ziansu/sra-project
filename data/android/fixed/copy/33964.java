@java.lang.Override
public E get(int index) {
    return myList.get((((size()) - index) - 1));
}