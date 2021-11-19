public void reset(T object) {
    while ((this.size()) > 0) {
        super.pop();
    } 
    super.push(object);
    numPushes = 0;
    discarded = 0;
}