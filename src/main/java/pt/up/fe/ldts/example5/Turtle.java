package pt.up.fe.ldts.example5;

public class Turtle {
    /*

    public void execute(char command) {
        if (command == 'L') { // ROTATE LEFT
            if (direction == 'N') direction = 'W';
            else if (direction == 'W') direction = 'S';
            else if (direction == 'S') direction = 'E';
            else if (direction == 'E') direction = 'N';
        } else if (command == 'R') { // ROTATE RIGHT
            if (direction == 'N') direction = 'E';
            else if (direction == 'E') direction = 'S';
            else if (direction == 'S') direction = 'W';
            else if (direction == 'W') direction = 'N';
        } else if (command == 'F'){ // MOVE FORWARD
            if (direction == 'N') row--;
            if (direction == 'S') row++;
            if (direction == 'W') column--;
            if (direction == 'E') column++;
        }
    }*/
    private int row;
    private int column;
    protected TurtleState direction;
    public Turtle(int row, int column, TurtleState direction) {
        this.row = row;
        this.column = column;
        this.direction = direction;
        direction.setTurtle(this);
    }
    public int getRow() {
        return row;
    }
    public int getColumn() {
        return column;
    }
    public TurtleState getDirection() {
        return direction;
    }
    public void setRow(int row) {
        this.row = row;
    }
    public void setColumn(int column) {
        this.column = column;
    }
    public void setDirection(TurtleState direction) {
        this.direction = direction;
    }
    public void execute(char command) {
        if (command == 'L') direction.rotateLeft();
        else if (command == 'R') direction.rotateRight();
        else if (command == 'F') direction.moveForward();
    }
}
