public boolean contains(dependency.ADependency funcDep) {
    for (dependency.ADependency item : this.df)
        if (item.equals(funcDep))
            return true;
        
    
    return false;
}