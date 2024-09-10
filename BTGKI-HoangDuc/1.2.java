public class DiscreteSignal implements Signal {

    public double getValue(int n) {
        if (n >= 0 && n <= 15) {
            return 1 - (n / 15.0);
        } else {
            return 0;
        }
    }

    public double getValue(double t) {
        throw new UnsupportedOperationException("Phương thức getValue(double t) không hỗ trợ cho tín hiệu rời rạc.");
    }
}