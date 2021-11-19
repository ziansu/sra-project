public boolean addSubClassEntityConfig(net.dankito.jpa.annotationreader.config.EntityConfig subClassEntityConfig) throws java.sql.SQLException {
    if ((subClassEntityConfigs.contains(subClassEntityConfig)) == false) {
        return subClassEntityConfigs.add(subClassEntityConfig);
    }
    return false;
}