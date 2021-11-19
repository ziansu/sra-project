@java.lang.Override
public java.lang.String toString() {
    return ((m_point) == 0) && ((m_micro) == 0) ? ((m_major) + ".") + (m_minor) : toStringFull(".", ((m_micro) == 0));
}