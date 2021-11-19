public void translateUpRel(int dy) {
    if (isFirst()) {
        translateUp(dy);
    }else {
        translateAbs(0, (-dy));
        prevNode().translateUp(dy);
    }
}