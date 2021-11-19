public float getCpuUsed() {
    return (cpuUsed) != null ? java.lang.Float.parseFloat(cpuUsed.substring(9, ((cpuUsed.length()) - 1))) : 0.0F;
}