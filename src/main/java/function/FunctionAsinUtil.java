package function;

import static java.lang.Double.NaN;

public final class FunctionAsinUtil {

    public final static double PRECISION = 1e-10;

    // Методом Ньютона
    public static double asinNewton(double x) {
        // Если x находится за пределами диапазона [-1, 1], возвращаем NaN
        if (x < -1 || x > 1) {
            return NaN;
        }

        // Для x = 1 и x = -1 возвращаем крайние значения
        if (x == 1) {
            return Math.PI / 2;
        } else if (x == -1) {
            return -Math.PI / 2;
        }

        // Для значений в пределах [-1, 1] используем рациональную аппроксимацию
        double y = Math.sqrt(1 - x * x);
        double result = x / y;

        // Используем метод Ньютона для уточнения результата
        double error = x - Math.sin(result);
        while (Math.abs(error) > PRECISION) {
            result += error / Math.sqrt(1 - x * x);
            error = x - Math.sin(result);
        }

        return result;
    }

    // Рядами Тейлора
    public static double asin(double x) {
        if (Math.abs(x) > 1) {
            return NaN;
        }
        double result = x, term = x;
        int n = 1;
        while (Math.abs(term) > PRECISION) {
            term *= x * x * (2 * n - 1) * (2 * n - 1) / (2 * n) / (2 * n + 1);
            result += term;
            n++;
        }
        return result;
    }
}
