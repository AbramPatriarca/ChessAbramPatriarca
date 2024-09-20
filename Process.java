class Process {

    public static Point[] moveToInt(String start, String end) {
        int s1 = Board.toInt(start.charAt(0) + "");
        int s2 = Integer.parseInt(start.charAt(1) + "");
        int e1 = Board.toInt(end.charAt(0) + "");
        int e2 = Integer.parseInt(end.charAt(1) + "");
        Point p1 = new Point(s1, s2);
        Point p2 = new Point(e1, e2);
        Point[] pointList = {p1, p2};
        return pointList;
    } 

    public static boolean legalMove(Piece piece, Point[] startEnd) {
        return false;
    }
}