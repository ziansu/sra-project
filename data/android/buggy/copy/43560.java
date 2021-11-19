@java.lang.Override
public void addDataMember(dyvil.tools.repl.context.REPLVariable variable) {
    this.initMember(variable);
    this.currentClass.getBody().addDataMember(variable);
    this.members.add(variable);
}