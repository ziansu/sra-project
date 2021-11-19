@java.lang.Override
public void setPadding(int left, int top, int right, int bottom) {
    innerPaddingRight = right;
    innerPaddingLeft = left;
    innerPaddingTop = top;
    innerPaddingBottom = bottom;
    setPadding();
}