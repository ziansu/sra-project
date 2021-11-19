@java.lang.Override
public boolean test(E e) {
    return (this.predicate.test(e)) && (perform(e));
}