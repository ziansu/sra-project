public int compare(BigNumber num) {
    int difference = num.number.compareTo(number);
    if (difference > 0)
        return 1;
    else
        if (difference < 0)
            return -1;
        else
            return 0;
        
    
}