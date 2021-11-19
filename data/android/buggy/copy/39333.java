public  commandType() {
    if ((type) == "push")
        type = "C_PUSH";
    else
        if ((type) == "pop")
            type = "C_POP";
        else
            type = "C_ARITHMETIC";
        
    
    return type;
}