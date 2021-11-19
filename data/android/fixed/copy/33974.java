public boolean deleteProvider(java.lang.String providerName) {
    assert providerName != null : "The provider name is recieving null";
    boolean wasDeleted = false;
    dao.ProviderDAO providerDao = new dao.ProviderDAO();
    wasDeleted = providerDao.deleteProvider(providerName);
    return wasDeleted;
}