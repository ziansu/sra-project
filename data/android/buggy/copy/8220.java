public com.kazuki43zoo.domain.MockApi findOneBy(java.lang.String path, java.lang.String method) {
    return repository.findOneByUk(path, method.toLowerCase());
}