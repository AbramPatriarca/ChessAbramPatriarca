public class Point {
    private int[] coordinates = new int[2];
    
    public Point(int x, int y) {
        coordinates[1] = x;
        coordinates[2] = y;
    }

    public int[] getCoords() {
        return coordinates;
    }

    public boolean equals(Point p2) {
    return (this.getCoords()[0] == p2.getCoords()[0] && this.getCoords()[1] == p2.getCoords()[1]);
    }
}
