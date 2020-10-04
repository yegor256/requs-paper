class User {
  public Fraction createsFraction() {
  }
  public void receivesResult(Float quotient) {
  }
  public void fails(String message) {
  }
}
class Fraction {
  private final float numerator;
  private final float denumerator;
  public Fraction(float num, float denum) {
    this.numerator = num;
    this.denumerator = denum;
  }
  public Float quotient() throws DivisionByZero {
    }
  }
  class SuD {
    private final User user;
    public dividesTwoNumbers() {
    Fraction fraction = this.user.createsFraction();
    try {
      this.user.receivesResult(fraction.quotient());
    } catch (DivisionByZero ex) {
      this.user.fails("denominator can't be zero");
    }
  }
}
