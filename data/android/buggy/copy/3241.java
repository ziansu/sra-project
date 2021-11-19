public synchronized <S> void addService(java.lang.Class<S> classe, S object) {
    instanciedServices.put(classe.getSimpleName(), object);
}