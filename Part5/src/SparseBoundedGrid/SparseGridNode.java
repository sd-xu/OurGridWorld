package SparseBoundedGrid;

public class SparseGridNode {
    private Object occupant;
    private int col;
    private SparseGridNode next;

    public SparseGridNode(Object occupant, int col, SparseGridNode next) {
        this.occupant = occupant;
        this.col = col;
        this.next = next;
    }

    public Object getOccupant() {
        return occupant;
    }

    public void setOccupant(Object occupant) {
        this.occupant = occupant;
    }

    public int getCol() {
        return col;
    }

    public void setCol(int col) {
        this.col = col;
    }

    public SparseGridNode getNext() {
        return next;
    }

    public void setNext(SparseGridNode next) {
        this.next = next;
    }
}
