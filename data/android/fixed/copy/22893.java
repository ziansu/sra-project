public T delete(T t) {
    this.em.remove(t);
    return t;
}