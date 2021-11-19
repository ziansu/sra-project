public Value agent(Value e) {
    if (e == null)
        return null;
    
    return _tbl.get(e);
}