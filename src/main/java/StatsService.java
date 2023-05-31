public class StatsService {
    public long sumSales(long[] sales) {
        long sum = 0;
        for (int i = 0; i < sales.length; i++) {
            sum = sum + sales[i];
        }
        return sum;

    }

    public long mediumSales(long[] sales) {
        long sum = sumSales(sales);
        double medium = sum / 12;
        return (long) medium;
    }

    public int maxSales(long[] sales) {
        long max = 0;
        int maxMonthIndex = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= max) {
                max = sales[i];
                maxMonthIndex = i;
            }
        }

        return maxMonthIndex + 1;
    }

    public int minSales(long[] sales) {
        long min = sales[0];
        int minMonthIndex = 0;

        for (int i = 1; i < sales.length; i++) {
            if (sales[i] <= min) {
                min = sales[i];
                minMonthIndex = i;
            }
        }
        return minMonthIndex + 1;
    }

    public int numberMonthWithBelowMediumSales(long[] sales) {
        int counter = 0;
        long medium = mediumSales(sales);
        for (long sale : sales) {
            if (sale < medium)
                counter++;
        }
        return counter;
    }

    public int numberMonthWithAboveMediumSales(long[] sales) {
        int counter = 0;
        long medium = mediumSales(sales);
        for (long sale : sales) {
            if (sale >= medium)
                counter++;
        }
        return counter;
    }

}

