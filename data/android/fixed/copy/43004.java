public boolean train(org.openbw.bwapi4j.type.UnitType type) {
    return issueCommand(id, UnitCommandType.Train.ordinal(), (-1), (-1), (-1), type.getId());
}