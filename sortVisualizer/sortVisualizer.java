package sortVisualizer;
import java.util.ArrayList;
import javax.swing.JFrame;
/*import sortVisualizer.algorithms.BubbleSort;
import sortVisualizer.algorithms.GnomeSort;*/

/**
 * The main class for the sort visualiser GUI
 * @author Matt Hopson
 */
public class sortVisualizer {
    private final JFrame window;
    private final sortArray sortArray;
    private final ArrayList<ISortAlgorithm> sortQueue;
    private final long millisecondDelay = 70;

    /**
     * Creates the GUI
     */
    public sortVisualizer() {
        window = new JFrame("Sort Visualizer");
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        sortArray = new sortArray();
        window.add(sortArray);
        window.pack();
        window.setVisible(true);

        sortQueue = new ArrayList<>();
        //sortQueue.add(new GnomeSort());

        sortQueue.add(new SelectionSort());
        sortQueue.add(new InsertionSortMT());
        sortQueue.add(new QuickSort());
        sortQueue.add(new MergeSort());

        //sortQueue.add(new BubbleSort());
    }


    private void shuffleAndWait() {
        sortArray.shuffle();
        sortArray.resetColours();
        try {
            Thread.sleep(millisecondDelay);
        } catch (InterruptedException ex) {
            Thread.currentThread().interrupt();
        }
        // sleepFor(secondsToNano(2));

    }

    public void run() {
        this.sortArray.shuffle();

        new InsertionSortMT().runSort(this.sortArray);
        System.out.println("Insertion Sort Done!");
        this.sortArray.highlightArray();
        /*for (ISortAlgorithm algorithm : sortQueue) {
            try {
                Thread.sleep(millisecondDelay);
            } catch (InterruptedException ex) {
                Thread.currentThread().interrupt();
            }

            // sleepFor(secondsToNano(1));
            shuffleAndWait();
            algorithm.runSort(sortArray);
            System.out.println("SORT DONE");
            sortArray.resetColours();
            sortArray.highlightArray();
            sortArray.resetColours();
        }*/
    }

    public static void main(String... args) {
        sortVisualizer sortVisualizer = new sortVisualizer();
        sortVisualizer.run();
    }
}