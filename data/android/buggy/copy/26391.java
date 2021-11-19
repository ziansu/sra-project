public boolean visitNode(gr.demokritos.iit.jinsect.structs.JVertex vVisit) {
    return (unvisited.remove(vVisit)) && (visited.add(vVisit));
}