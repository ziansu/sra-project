@java.lang.Override
public int hashCode() {
    return ((m_identifier.hashCode()) ^ (m_properties.hashCode())) ^ (m_value.hashCode());
}