@java.lang.Override
public int getItemCount() {
    if (((mStepArrayList) != null) && ((mStepArrayList.size()) > 0)) {
        return (mStepArrayList.size()) + 1;
    }else {
        return 0;
    }
}