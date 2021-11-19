protected void setReader(org.jruby.runtime.builtin.IRubyObject io) {
    org.jruby.Ruby runtime = this.getRuntime();
    runtime.defineVariable(new org.jruby.RubyGlobal.InputGlobalVariable(runtime, com.aptana.scripting.model.CommandBlockRunner.STDIN_GLOBAL, io), Scope.GLOBAL);
    runtime.defineGlobalConstant(com.aptana.scripting.model.CommandBlockRunner.STDIN_CONSTANT, io);
}