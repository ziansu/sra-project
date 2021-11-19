public void deallocate() {
    jcuda.runtime.JCuda.cudaFree(val);
    jcuda.runtime.JCuda.cudaFree(rowPtr);
    jcuda.runtime.JCuda.cudaFree(colInd);
}