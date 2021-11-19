private long getTotalPages(long totalUsersNumber, int resultsPerPage) {
    return (totalUsersNumber % resultsPerPage) == 0 ? totalUsersNumber / resultsPerPage : (totalUsersNumber / resultsPerPage) + 1;
}