@java.lang.Override
public com.google.codeu.codingchallenge.JSON getObject(java.lang.String name) {
    if (objectMap.containsKey(name)) {
        return objectMap.get(name);
    }else {
        throw new java.lang.NullPointerException((("The object \"" + name) + "\" was not found!"));
    }
}