@java.lang.Override
public int getParallelismDegree() {
    return ((gpus) == null) || ((gpus.length) == 0) ? java.lang.Runtime.getRuntime().availableProcessors() : gpus.length;
}