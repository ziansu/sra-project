@java.lang.Override
public boolean handle(java.io.BufferedWriter writer) {
    return cn.edu.fudan.se.dac.FileUtil.eachLine(src, new cn.edu.fudan.se.dac.FileUtil.OutputLineHandler(writer), filter);
}