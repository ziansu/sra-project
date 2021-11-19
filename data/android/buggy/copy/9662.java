@java.lang.Override
public void redraw(functiongenerator.core.EvolutionStateHelper helper) {
    double fitness = helper.getFitness();
    int generation = helper.getGeneration();
    org.jfree.chart.JFreeChart chart = this.getChart(fitness, generation);
    chartPanel.setChart(chart);
}