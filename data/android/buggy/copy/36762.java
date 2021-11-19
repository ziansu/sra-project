@java.lang.Override
public int getOffset(int key) {
    return key < (_minkey) ? -1 : _offsets[(key - (_minkey))];
}