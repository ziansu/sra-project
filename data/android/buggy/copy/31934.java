public void setUseGPU(com.sheepit.client.hardware.gpu.GPUDevice device) {
    this.GPUDevice = device;
    if (device == null) {
        this.computeMethod = com.sheepit.client.Configuration.ComputeType.CPU_GPU;
    }
}