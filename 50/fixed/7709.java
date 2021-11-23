public boolean getButton(java.lang.String name) {
    if (buttons_.containsKey(name))
        return buttons_.get(name).state;
    
}