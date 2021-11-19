@java.lang.Override
public void onClosedOnScreenAnimationComplete() {
    m_animating = false;
    com.eegeo.menu.MenuViewJniMethods.ViewCloseCompleted(m_nativeCallerPointer);
    m_list.setVisibility(View.GONE);
}