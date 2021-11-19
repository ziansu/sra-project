@java.lang.Override
public void onOpenOnScreenAnimationComplete() {
    com.eegeo.menu.MenuViewJniMethods.ViewOpenCompleted(m_nativeCallerPointer);
    m_animating = false;
    m_list.setEnabled(true);
}