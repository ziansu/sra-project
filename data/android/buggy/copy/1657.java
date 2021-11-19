@java.lang.Override
public int compare(com.alibaba.android.vlayout.LayoutHelper lhs, com.alibaba.android.vlayout.LayoutHelper rhs) {
    return (lhs.getRange().getLower().intValue()) - (rhs.getRange().getLower().intValue());
}