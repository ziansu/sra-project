@java.lang.Override
void pushBack(char ch) {
    assert (pushBack) == (-1) : "Only 1 char can be pushed back";
    pushBack = ch;
}