private void firstItem() {
    if ((searchResult) != null) {
        if ((searchResult.length) > 1) {
            resultCounter = 0;
            displayResult(searchResult[resultCounter]);
        }
    }
}