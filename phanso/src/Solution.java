public class Solution {
    private int numerator;
    private int denominator;

    public int getNumerator() {
        return numerator;
    }

    public void setNumerator(int numerator) {
        this.numerator = numerator;
    }

    public int getDenominator() {
        return denominator;
    }

    public void setDenominator(int denominator) {
        this.denominator = denominator;
    }
    public void Solution() {

    }
    public Solution(int numerator, int denominator) {
        // Chúng ta khởi tạo gì đó sau
        super();
        this.setDenominator(denominator);
        this.setNumerator(numerator);
    }

    public Solution reduce() {
        Solution a = new Solution();
        int i = timUSCLN(this.getNumerator(), this.getDenominator());
        this.setNumerator(this.getDenominator() / i);
        this.setDenominator(this.getNumerator() / i);
        a.setNumerator(this.getNumerator());
        a.setDenominator(this.getDenominator());
        return a;
    }

    public int timUSCLN(int a, int b) {
        while (a != b) {
            if (a > b) {
                a -= b;
            } else {
                b -= a;
            }
        }
        return a;
    }

    public void add(Solution ps) {
        int ts = this.getNumerator() * ps.getDenominator() + ps.getNumerator() * this.getDenominator();
        int ms = this.getDenominator() * ps.getDenominator();
        Solution s = new Solution(ts, ms);
        s.reduce();
    }

    public void subtract(Solution ps) {
        int ts = this.getNumerator() * ps.getDenominator() - ps.getNumerator() * this.getDenominator();
        int ms = this.getDenominator() * ps.getDenominator();
        Solution s = new Solution(ts, ms);
        s.reduce();
    }

    public void multiply(Solution ps) {
        int ts = this.getNumerator() * ps.getNumerator();
        int ms = this.getDenominator() * ps.getDenominator();
        Solution s = new Solution(ts, ms);
        s.reduce();
    }

    public void divide(Solution ps) {
        int ts = this.getNumerator() * ps.getDenominator();
        int ms = this.getDenominator() * ps.getNumerator();
        Solution s = new Solution(ts, ms);
        s.reduce();
    }
}
