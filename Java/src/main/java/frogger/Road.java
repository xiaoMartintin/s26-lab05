package frogger;

/**
 * Refactor Task 1.
 *
 * @author Zishen Wen (F22), Deyuan Chen (S22)
 */
public class Road {
    private final boolean[] occupied;

    public Road(boolean[] occupied) {
        this.occupied = occupied;
    }

    public boolean isValidPosition(int position) {
        return position >= 0 && position < this.occupied.length;
    }

    public boolean isOccupied(int position) {
        if (!isValidPosition(position)) {
            return true;
        }
        return this.occupied[position];
    }
}
