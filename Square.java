class Square {
  private double side;
  private Point ais;

  public Square() {
    side = 0;
    ais = new Point();
  }

  public Square(double side, Point ais) {
    this.side = side;
    this.ais = ais;
  }

  public double getSide() {
    return side;
  }

  public void setSide(double side) {
    this.side = side;
  }

  public Point getAis() {
    return ais;
  }

  public void setAis(Point ais) {
    this.ais = ais;
  }

  public void shiftX(double d) {
    ais.shiftX(d);
  }

  public void shiftY(double d) {
    ais.shiftY(d);
  }

  public Point getAss() {
    return ais.shiftYCreate(side);
  }

  public Point getAsd() {
    return ais.shiftPointCreate(side, side);
  }

  public Point getAid() {
    return ais.shiftXCreate(side);
  }

  public boolean equals(Square square) {
    return getAis() == square.getAis() && getSide() == square.getSide();
  }

  public String toString() {
    return "side: " + getSide() + ", aisx(" + getAis() + ")";
  }
}
