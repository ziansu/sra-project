public void addInterface(org.robinbird.model.Class interfaceClass) {
    com.google.common.base.Preconditions.checkState(((interfaceClass.getClassType()) == (ClassType.INTERFACE)));
    interfaces.add(interfaceClass);
}