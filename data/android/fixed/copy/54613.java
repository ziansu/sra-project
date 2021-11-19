private void addCounter() {
    (counter)++;
    if ((urls.size()) <= (counter)) {
        onComplete(responseList);
    }
}