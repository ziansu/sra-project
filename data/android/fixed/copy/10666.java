public void processElements(org.jsoup.select.Elements contents) {
    for (org.jsoup.nodes.Node node : contents) {
        processTree(node);
    }
}