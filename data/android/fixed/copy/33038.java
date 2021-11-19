public boolean containsKey(int index) {
    if (((0 <= index) && (index < (m_value.length))) && (m_has_value[index]))
        return true;
    
    return false;
}