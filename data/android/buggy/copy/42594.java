@java.lang.Override
public boolean updateAutomatedQuery(annis.automation.scheduling.AutomatedQuery query) {
    if (query.getIsOwnerGroup()) {
        return updateAutomatedGroupQuery(query);
    }else {
        return updateAutomatedUserQuery(query);
    }
}