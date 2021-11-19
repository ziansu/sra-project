@java.lang.Override
@org.springframework.transaction.annotation.Transactional(readOnly = true)
@org.springframework.cache.annotation.Cacheable
public java.util.SortedSet<org.lcmanager.gdb.service.data.model.ComputerSystem> retrieveComputerSystems(final org.lcmanager.gdb.service.data.model.User user) {
    return new java.util.TreeSet(this.computerSystemMapper.findByUser(user.getId()));
}