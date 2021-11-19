@java.lang.Override
public com.reactnativenavigation.core.objects.Screen getCurrentScreen() {
    return (mScreenStacks) != null ? mScreenStacks.get(mCurrentStackPosition).peek() : null;
}