/**
 * @author deepakjha on 10/13/19
 * @project ai-assignments
 */
public enum MoveType {
    JUMP("J"),
    EMPTY("E");

    public final String move;

    MoveType(String move) {
        this.move = move;
    }

    public String getMoveCode() {
        return this.move;
    }
}
