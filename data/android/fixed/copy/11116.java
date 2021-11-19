private boolean checkTermination() {
    return (result.getGenerated()) < (domain.maxGeneratedSize());
}