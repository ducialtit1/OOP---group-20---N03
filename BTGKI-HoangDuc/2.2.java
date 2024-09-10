public class Radar {

    public static double computeSignal(int n) {
        if (n >= 0 && n <= 15) {
            return 1 - (n / 15.0);
        } else {
            return 0;
        }
    }

    public static void main(String[] args) {
        int n = 4; // 

        System.out.println("Tín hiệu với n = 4:");

        for (int i = 0; i < n; i++) {
            double signalValue = computeSignal(i);
            System.out.println("x(" + i + ") = " + signalValue);
        }
    }
}