private boolean shouldDoRandomDrop(java.util.Random rand, int beheading, int looting) {
    if (beheading > 0)
        return (rand.nextInt(100)) < (beheading * 10);
    
    return false;
}