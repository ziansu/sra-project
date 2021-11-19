@java.lang.Override
@org.springframework.transaction.annotation.Transactional(readOnly = true)
@org.springframework.cache.annotation.Cacheable
public java.util.List<org.lcmanager.gdb.service.data.model.ComputerSystem> retrieveComputerSystems(final org.lcmanager.gdb.service.data.model.User user) {
    final java.util.List<org.lcmanager.gdb.service.data.model.ComputerSystem> result = new java.util.ArrayList(this.computerSystemMapper.findByUser(user.getId()));
    java.util.Collections.sort(result);
    return result;
}