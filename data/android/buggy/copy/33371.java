public java.util.List<java.lang.Long> handleRequest(java.lang.Integer i, com.amazonaws.services.lambda.runtime.Context context) {
    return java.util.stream.Stream.generate(() -> idService.getUniqueId()).limit(i).collect(java.util.stream.Collectors.toList());
}