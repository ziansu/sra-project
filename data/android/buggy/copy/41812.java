@java.lang.Override
public int compareTo(java.lang.Object o) {
    by.bsuir.ootpsp.task1.models.Person other = ((by.bsuir.ootpsp.task1.models.Person) (o));
    return by.bsuir.ootpsp.task1.models.Person.SURNAME_COMPARATOR.compare(this, other);
}