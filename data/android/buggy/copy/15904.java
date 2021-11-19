@javax.ws.rs.GET
@javax.ws.rs.Produces(value = javax.ws.rs.core.MediaType.APPLICATION_JSON)
@javax.ws.rs.Path(value = "/topten")
public java.util.List<com.orbis.orbis180.dataStructures.WileyQuery> sendTopTen() {
    dbStore = new com.orbis.orbis180.storage.DatabaseDAO();
    dbStore.init(false);
    java.util.List<com.orbis.orbis180.dataStructures.WileyQuery> retVal = dbStore.getTopTen();
    this.dbStore.uninit();
    return null;
}