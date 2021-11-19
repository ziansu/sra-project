@java.lang.Override
public boolean shouldShowModule() {
    for (com.wzx.lightmodule.library.Module child : mChildren) {
        if (child.shouldShowModule()) {
            return true;
        }
    }
    return false;
}