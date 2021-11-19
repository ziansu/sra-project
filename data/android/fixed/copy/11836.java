public void maybeMakeProgress(java.util.Random random) {
    if ((random.nextInt(1000000)) < (this.getProgressChance())) {
        this.makeProgress();
    }
}