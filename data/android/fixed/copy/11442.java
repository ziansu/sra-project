public void deallocate() {
    cudaFree(val);
    cudaFree(rowPtr);
    cudaFree(colInd);
}