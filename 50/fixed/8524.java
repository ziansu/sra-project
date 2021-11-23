public void RefreshGraph(br.uff.ic.provviewer.Variables variables) {
    CollapseEdges(variables);
    variables.filter.RemoveFilters(variables);
    variables.view.repaint();
}