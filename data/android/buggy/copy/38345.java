@java.lang.Override
public com.notlob.jgrid.examples.Person[] getChildren(com.notlob.jgrid.examples.Person person) {
    if ((person.getChildren()) != null) {
        return person.getChildren().toArray(new com.notlob.jgrid.examples.Person[]{  });
    }
    return super.getChildren(person);
}