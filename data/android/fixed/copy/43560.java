@java.lang.Override
public void addDataMember(dyvil.tools.repl.context.REPLVariable field) {
    this.initMember(field);
    this.currentClass.getBody().addDataMember(field);
    this.members.add(field);
}