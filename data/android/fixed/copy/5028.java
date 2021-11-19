public int compare(classifier.Node o1, classifier.Node o2) {
    if ((o1.getDistance()) >= (o2.getDistance())) {
        return -1;
    }else {
        return 1;
    }
}