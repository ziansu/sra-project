public final void rrun() {
    if ((path.valid()) && (walker.active()))
        if (!(walker.interim()))
            walker.walk();
        else
            run();
        
    
}