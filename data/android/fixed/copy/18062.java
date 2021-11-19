protected org.eclipse.jdt.core.IModuleDescription resolveModule(char[] moduleName) {
    org.eclipse.jdt.internal.core.NameLookup.Answer answer = this.nameLookup.findModule(new java.lang.String(moduleName));
    if (answer != null) {
        return answer.module;
    }
    return null;
}