void removeServiceRef(org.appsugar.cluster.service.akka.system.AkkaServiceRef ref) {
    serviceRefList.remove(ref);
    if (serviceRefList.isEmpty()) {
        return ;
    }
    if (ref == (min)) {
        min = java.util.Collections.min(serviceRefList);
    }
}