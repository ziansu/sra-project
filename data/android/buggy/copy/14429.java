@java.lang.Override
void pushBack(char ch) {
    assert (pushBack) == (com.dell.doradus.common.JSONAnnie.EOF) : "Only 1 char can be pushed back";
    pushBack = ch;
}