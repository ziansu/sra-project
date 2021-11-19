public boolean visitNode(gr.demokritos.iit.jinsect.structs.JVertex vVisit) {
    return (visited.add(vVisit)) && (unvisited.remove(vVisit));
}