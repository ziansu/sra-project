@java.lang.Override
public boolean matches(org.jsoup.nodes.Element root, org.jsoup.nodes.Element element, int index, int collectionSize, int depth) {
    return (depth == 0) && (evaluator.matches(root, element, index, collectionSize, depth));
}