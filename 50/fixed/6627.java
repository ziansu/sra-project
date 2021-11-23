@net.smartcosmos.dao.things.repository.Test
public void findByIdAndTenantId() throws java.lang.Exception {
    assertTrue(this.repository.findByIdAndTenantIdAndTypeIgnoreCase(id, tenantId, type).isPresent());
}