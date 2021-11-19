@java.lang.Override
public void onClick(android.view.View arg0) {
    if ((m_listener) != null)
        m_listener.onLocalSelected();
    
    getDialog().dismiss();
}