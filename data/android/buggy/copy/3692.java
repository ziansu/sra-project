@java.lang.Override
public T push(T o) {
    m_parsedObjects.add(o);
    return super.push(o);
}