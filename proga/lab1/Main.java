class Main{
    public static void main(String[] args) {
        int[] k = new int[8];
        for (int i = 0; i < 8; i++) {
            k[i] = 16 - 2*i;
        }
        float[] x = new float[10];
        for (int i = 0; i < 10; i++) {
            x[i] = (float) (-12.0f + Math.random()*(15f));
        }
        double[][] w = new double[8][10];
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 10; j++) {
                w[i][j] = calcElem(k[i], x[j]);
            }            
        }
        printMatrix(w);
    }
    static double calcElem(int c, double n) {
        return switch (c) {
            case 6 -> Math.pow((n / 6.0), (0.25-Math.pow(1.0/3.0/(3.0 - Math.cos(n)), Math.cbrt(n)))/6.0);
            case 2, 4, 8, 14 -> Math.exp(Math.exp(0.25*(4+n)));
            default -> Math.pow(Math.atan(0.5*(n-4.5)/15.0), ((Math.pow(Math.E, Math.atan(Math.cos(n))))
                    /
                    (1 - Math.pow((Math.log(Math.sqrt(Math.abs(n))) * Math.cbrt(Math.atan((n-4.5)/15.0))+1), Math.pow(Math.exp(n), 0.25*(0.5+n/3.0))))
                    ));
        };
        }
    static void printMatrix(double[][] w) {
        for (double[] w1 : w) {
            for (double n : w1) {
                System.out.printf("%.3f", w1);
                System.out.print(" ");
            }
            System.out.println();
        }
    }

}
