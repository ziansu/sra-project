public final void start(int id) {
    if (id < 0)
        throw new java.lang.IllegalArgumentException("The id must be a positive Integer.");
    
    this.id = id;
    if (this.waiting) {
        synchronized(this) {
            this.notify();
        }
    }
}