private java.util.List<nodomain.cleversort.sorter.SortingResultModel> getAllResults() {
    return sorterService.getAllResults().stream().map(SortingResultModel::create).collect(java.util.stream.Collectors.toList());
}