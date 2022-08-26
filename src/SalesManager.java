import java.util.Arrays;

public class SalesManager {
    protected long[] sales;

    public SalesManager(long[] sales) {
        this.sales = sales;
    }

    public long max() {
        long max = -1;
        for (long sale : sales) {
            if (sale > max) {
                max = sale;
            }
        }
        return max;
    }
    public static double salesMinMax(long[] sales) { // метод расчета среднего
        System.out.println("Программа расчета обрезанного среднего");
        System.out.println("Данные массива: " + "\n" + Arrays.toString(sales)); //вывод исходных данных
        long max = sales[0];
        long min = sales[0];
        long sum = 0;
        for (int i = 0; i < sales.length; i++) { //цикл for
            sum = sum + sales[i];
            if (sales[i] > max)  //проверка по условию, поиск мах значения массива
                max = sales[i];
            if (sales[i] < min)  //проверка по условию, поиск мин значения массива
                min = sales[i];
        }
        return ((double) sum - max - min) / (sales.length - 2); // расчет среднего
    }
}