private com.synova.realestate.base.BaseFragment getCurrentFragment() {
    return (fragmentStacks.size()) > 0 ? fragmentStacks.peek() : null;
}