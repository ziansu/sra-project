public void score(int target) {
    total = findValue();
    if ((total) == target)
        score = 0;
    
    score = ((double) (1)) / (target - (total));
}