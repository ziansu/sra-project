@org.springframework.web.bind.annotation.RequestMapping(path = "/result", method = org.springframework.web.bind.annotation.RequestMethod.GET, produces = "application/json")
java.util.List<nodomain.cleversort.sorter.SortingResultModel> result() {
    return sorterService.getAllResults().stream().map(SortingResultModel::create).collect(java.util.stream.Collectors.toList());
}