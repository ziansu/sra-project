public ai2016.group16.Value getValue(java.lang.String name) {
    ai2016.group16.Value value = null;
    for (ai2016.group16.Value _value : values)
        if (_value.getName().equals(name))
            return _value;
        
    
    return value;
}