public boolean isSupported(final com.github.kuros.random.jpa.types.Version currentVersion) {
    return (currentVersion.getSeries()) >= (getSeries());
}