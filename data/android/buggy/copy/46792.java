@java.lang.Override
public com.google.codeu.codingchallenge.JSON getObject(java.lang.String name) {
    return (list.get(name)) instanceof com.google.codeu.codingchallenge.MyJSON ? ((com.google.codeu.codingchallenge.MyJSON) (list.get(name))) : null;
}