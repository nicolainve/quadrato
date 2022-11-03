class UseSquare {
  public static void main(String[] args) {
    double l1 = 10;
    Point p1 = new Point(3, 5);
    Square q1 = new Square(l1, p1);

    System.out.println(q1);

    q1.shiftX(10);

    System.out.println(q1);

    System.out.println(q1.getAss());
  }
}