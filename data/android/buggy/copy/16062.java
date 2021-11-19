public void setValue(int dataAttributeInstance_id, java.lang.Object value) {
    java.lang.String sql = (("UPDATE dataattributeinstance SET value = '" + value) + "' WHERE id = ") + dataAttributeInstance_id;
    executeUpdateStatement(sql);
    de.uni_potsdam.hpi.bpt.bp2014.jhistory.Log log = new de.uni_potsdam.hpi.bpt.bp2014.jhistory.Log();
    log.newDataAttributeInstanceValue(dataAttributeInstance_id, value);
}