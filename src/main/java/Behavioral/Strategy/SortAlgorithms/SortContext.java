package Behavioral.Strategy.SortAlgorithms;

public class SortContext {
    private SortingStrategy strategy;
    public SortContext(SortingStrategy strategy) {
        this.strategy = strategy;
    }
    public void executeSort(int[] array) {
         strategy.sort(array);
    }
}
