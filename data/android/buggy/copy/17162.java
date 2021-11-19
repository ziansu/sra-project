public void addClass(interfaces.IClass newClass) {
    if (!(classes.containsKey(newClass.getName())))
        classes.put(newClass.getName(), newClass);
    
}