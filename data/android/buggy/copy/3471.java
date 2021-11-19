private void count(char character) {
    for (Scanner scanner : scanners)
        if (!(scanner instanceof WordScanner))
            scanner.scan(character);
        
    
}