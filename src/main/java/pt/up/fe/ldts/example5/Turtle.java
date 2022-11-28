package pt.up.fe.ldts.example5;

/*public class Turtle {
    private int row;
    private int column;
    private char direction;
    protected TurtleState turtle;
    public Turtle(int row, int column, char direction) {
        this.row = row;
        this.column = column;
        this.direction = direction;
        turtle.setTurtle(this);
    }
    public int getRow() {
        return row;
    }
    public int getColumn() {
        return column;
    }
    public char getDirection() {
        return direction;
    }
    public void setRow(int row) {
        this.row = row;
    }
    public void setColumn(int column) {
        this.column = column;
    }
    public void setDirection(TurtleState direction) {
        this.turtle = direction;
    }
    public void execute(char command) {
        if (command == 'L') turtle.rotateLeft();
        else if (command == 'R') turtle.rotateRight();
        else if (command == 'F') turtle.moveForward();
    }
}*/
public class Turtle {
    Position p;

    public Turtle(int row, int column, char direction) {
        this.p = new Position(row, column, direction);
    }

    public int getRow() {
        return p.getRow();
    }

    public int getColumn() {
        return p.getColumn();
    }

    public char getDirection() {
        return p.getDirection();
    }

    public void setRow(int row) {
        p.setRow(row);
    }

    public void setColumn(int column) {
        p.setColumn(column);
    }

    public void setDirection(char direction) {
        p.setDirection(direction);
    }

    public void setP(Position p) {
        this.p = p;
    }

    public void execute(char command) {
        if (command == 'L') { // ROTATE LEFT
            setP(new RotateLeft(p).execute());
        } else if (command == 'R') { // ROTATE RIGHT
            setP(new RotateRight(p).execute());
        } else if (command == 'F'){ // MOVE FORWARD
            setP(new MoveForward(p).execute());
        }
    }
}

