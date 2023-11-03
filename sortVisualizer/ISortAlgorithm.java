package sortVisualizer;
import sortVisualizer.sortArray;
/**
 * Base interface for the
 sort algorithms
 * @author Matt Hopson
 */
public interface ISortAlgorithm
{
    public String getName();
    public long getDelay();
    public void runSort(sortArray array);
}