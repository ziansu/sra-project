@java.lang.Override
public void reduce(hex.glm.GLMTask.GLMGenerateWeightsTask git) {
    water.util.ArrayUtils.add(denums, git.denums);
    wsum += git.wsum;
    wsumu += git.wsumu;
    _likelihood += git._likelihood;
}