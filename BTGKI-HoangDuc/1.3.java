public class ContinuousSignal implements Signal {

    public double getValue(double t) {
        return Math.sin(t);
    }

    public double getValue(int n) {
        throw new UnsupportedOperationException("Phương thức getValue(int n) không hỗ trợ cho tín hiệu liên tục.");
    }
}