public static <TResponse> com.fuzz.datacontroller.source.DataSource.Builder<TResponse> builderInstance(com.fuzz.datacontroller.okhttp.OkHttpDataSource.ResponseConverter<TResponse> responseConverter) {
    return new com.fuzz.datacontroller.source.DataSource.Builder<>(new com.fuzz.datacontroller.okhttp.OkHttpDataSource<>(responseConverter), DataSource.SourceType.NETWORK);
}