@java.lang.Override
public void addNode(cn.cjtblog.domain.Node node) {
    cn.cjtblog.util.FileUtil.makeDir(node.getId());
    nodeDAO.add(node);
}