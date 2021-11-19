public boolean containsKey(int index) {
    if ((index < (m_value.length)) && (m_has_value[index]))
        return true;
    
    return false;
}