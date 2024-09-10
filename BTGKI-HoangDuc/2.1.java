
    private int deltaFunction(int n) {
        return (n == 0) ? 1 : 0;
    }

    public static void main(String[] args) {
        int n0 = 2;
        int[] h = {1, 2, 3, 4, 5}; 

        DiscreteSignal signal = new DiscreteSignal(n0, h);
        
        int[] indices = {0, 1, 2, 3, 4};
        signal.printSignal(indices);
    }
}