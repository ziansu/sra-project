@java.lang.Override
public void endNode(com.github.cstroe.svndumpgui.api.SvnNode node) {
    if (inRemovedNode) {
        inRemovedNode = false;
    }else {
        super.endNode(node);
    }
}