private void percentage(int sum, int size) {
    int percentage = (sum * 100) / size;
    if ((percentage % 10) == 0) {
        progressBar.showProgress(percentage);
    }
}