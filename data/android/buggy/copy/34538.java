@java.lang.Override
public void endNode(com.github.cstroe.svndumpgui.api.SvnNode node) {
    inRemovedNode = false;
    super.endNode(node);
}