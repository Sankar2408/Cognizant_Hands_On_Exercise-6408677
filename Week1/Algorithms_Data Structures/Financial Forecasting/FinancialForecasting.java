public class FinancialForecasting {
    public static void main(String[] args) {
        double initialAmount = 10000;
        double annualGrowthRate = 0.08;
        int years = 5;

        double futureValue = predictFutureValue(initialAmount, annualGrowthRate, years);
        System.out.println("Recursive Forecast for " + years + " years: Rs." + futureValue);

        System.out.println("\nTime Complexity Analysis:");
        System.out.println("Recursive approach: O(n) where n is the number of years");

        System.out.println("\nOptimized Version Using Memoization:");
        double[] memo = new double[years + 1];
        double optimizedValue = predictWithMemo(initialAmount, annualGrowthRate, years, memo);
        System.out.println("Optimized Forecast: Rs." + optimizedValue);
    }

    static double predictFutureValue(double amount, double rate, int years) {
        if (years == 0) return amount;
        return predictFutureValue(amount, rate, years - 1) * (1 + rate);
    }

    static double predictWithMemo(double amount, double rate, int years, double[] memo) {
        if (years == 0) return amount;
        if (memo[years] != 0) return memo[years];
        memo[years] = predictWithMemo(amount, rate, years - 1, memo) * (1 + rate);
        return memo[years];
    }
}
