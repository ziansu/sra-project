@java.lang.Override
public practice.webgameproject.strategy.model.ModelStructures getStructure(practice.webgameproject.strategy.model.ModelStructures targetStructures) {
    return session.selectOne("mapper.mysql.mapperWebGame.getStructure", targetStructures);
}