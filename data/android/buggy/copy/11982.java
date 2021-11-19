public java.lang.String getLastJobId() {
    return (jobIds.size()) == 0 ? null : jobIds.get(((jobIds.size()) - 1));
}