package sortVisualizer;
import sortVisualizer.sortArray;
/**
 * Insertion sort
 implementation
 * @author Matthew Hopson
 */
public class InsertionSortMT implements ISortAlgorithm
{
    @Override
    public void runSort(sortArray array) {
        for (int i = 0; i <
                array.arraySize(); i++) {
            int key =
                    array.getValue(i);
            int j = i - 1;
            while (j >= 0 &&
                    array.getValue(j) > key) {

                array.updateSingle(j + 1,
                        array.getValue(j), 5);
                j--;
            }

            array.updateSingle(j + 1,
                    key, 2);
        }
    }
    @Override
    public String getName() {
        return "Insertion Sort";
    }
    @Override
    public long getDelay() {
        return 2;
    }
}