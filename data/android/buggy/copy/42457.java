@java.lang.Override
protected void addAction(java.lang.String id, int synSet) {
    currentAction = dz.aak.sentrep.ston.ReqAction.create(id, synSet);
    actions.put(id, currentAction);
    java.lang.System.out.println(("action added: " + id));
}