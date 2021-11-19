@java.lang.Override
public org.hni.user.om.Client getByUserId(java.lang.Long id) {
    org.hni.user.om.Client client = clientDAO.getByUserId(id);
    return client;
}