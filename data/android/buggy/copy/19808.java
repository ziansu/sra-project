public static yaplstack.Instruction.IncIP loadVar(java.lang.String name, int ordinal) {
    return ( thread) -> {
        java.lang.String theName = name;
        java.lang.Object value = thread.callFrame.get(ordinal);
        thread.callFrame.push(value);
    };
}