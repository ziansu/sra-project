private void commentLine() {
    while ((!(isEndline())) && (!(isEndOfFile()))) {
        next();
    } 
    if (!(isEndOfFile())) {
        endline();
    }
}