@java.lang.Override
public java.lang.Boolean apply(org.jruby.truffle.runtime.core.RubyModule module) {
    if (module.getClassVariables().containsKey(name)) {
        module.setClassVariable(currentNode, name, value);
        return true;
    }else {
        return null;
    }
}