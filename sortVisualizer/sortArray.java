package sortVisualizer;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.util.Random;
import javax.swing.JPanel;
/**
 * The array that can be sorted
 * @author mhops
 */
public class sortArray extends JPanel {
    public static final int WIN_WIDTH = 980;
    public static final int WIN_HEIGHT = 600;
    private static final int BAR_WIDTH = 20;
    private static final int NUM_BARS = WIN_WIDTH / BAR_WIDTH;

    private final int[] array;
    private final int[] barColours;

    public sortArray() {
        setBackground(Color.PINK);
        array = new int[NUM_BARS];
        barColours = new int[NUM_BARS];
        for (int i = 0; i < NUM_BARS; i++) {
            array[i] = i;
            barColours[i] = 0;
        }

    }

    public int arraySize() {
        return array.length;
    }

    public int getValue(int index) {
        return array[index];
    }

    public void swap(int firstIndex, int secondIndex, long
            millisecondDelay) {
        int temp = array[firstIndex];
        array[firstIndex] = array[secondIndex];
        array[secondIndex] = temp;

        barColours[firstIndex] = 100;
        barColours[secondIndex] = 100;

        repaint();
        try {
            Thread.sleep(millisecondDelay);
        } catch (InterruptedException ex) {
            Thread.currentThread().interrupt();
        }
        //sleepFor(millisecondsToNano(milliSecDelay));

    }

    public void updateSingle(int index, int value, long millisecondDelay) {
        array[index] = value;
        barColours[index] = 100;
        repaint();
        try {
            Thread.sleep(millisecondDelay);
        } catch (InterruptedException ex) {
            Thread.currentThread().interrupt();
        }
        // sleepFor(millisecondsToNano(millisecondDelay));
        // for (int count=0; count< 3; count++)
        //delayAll();
    }

    public void shuffle() {
        Random rng = new Random();
        for (int i = 0; i < arraySize(); i++) {
            int swapWithIndex = rng.nextInt(arraySize() - 1);
            swap(i, swapWithIndex, 5);
        }
    }

    public void highlightArray() {
        for (int i = 0; i < arraySize(); i++) {
            updateSingle(i, getValue(i), 5);
        }
    }

    /**
     * Gets the canvas size
     * @return size
     */

    public Dimension getPreferredSize() {
        return new Dimension(WIN_WIDTH, WIN_HEIGHT);
    }

    public void resetColours() {
        for (int i = 0; i < NUM_BARS; i++) {
            barColours[i] = 0;
        }
        repaint();
    }

    private String showSortName(ISortAlgorithm algo) {
        return algo.getName();
    }

    /**
     * Draws the array
     * @param g The graphics device for drawing
     */
    public void paintComponent(Graphics g) {
        Graphics2D graphics = (Graphics2D)g;
        super.paintComponent(graphics);

        graphics.setColor(Color.white);
        for (int x = 0; x < NUM_BARS; x++) {
            int height = getValue(x) * 2;
            int xBegin = x + (BAR_WIDTH - 1) * x;
            int yBegin = WIN_HEIGHT - height;

            int val = barColours[x] * 2;
            graphics.setColor(new Color(200, 200 - val, 200 -
                    val));
            graphics.fillRect(xBegin, yBegin, BAR_WIDTH,
                    height);
            if (barColours[x] > 0) {
                barColours[x]-= 10;
            }
        }

        graphics.setColor(Color.black);

        graphics.drawString("Insertion Sort", WIN_WIDTH / 2, WIN_HEIGHT / 2);
    }
}