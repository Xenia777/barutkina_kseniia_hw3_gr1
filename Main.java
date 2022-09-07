public class Main {

        public static void main(String[] args) {
            double[] fractionalNumbers = {1.3, 8.6, 5, -3.1, -8.5, 4.2, -3.2, -1.3, 4.4, -2.6, 9.1, -2,2, 5.3, -9.4, 6.1};
            double sum = 0.0;
            int count = 0;
            boolean negative = false;
            for (double arrays : fractionalNumbers) {
                if (arrays < 0) {
                    negative = true;
                } else if (negative) {
                    sum += arrays;
                    count++;
                }
            }
            double arithmeticalMean = sum / count;

            System.out.println(arithmeticalMean);}
}
