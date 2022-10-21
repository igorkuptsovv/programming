public class Main
{
    public static void main(String[] args)
    {
        long[] a = {5, 7, 9, 11, 13, 15, 17};
        double[] x = new double[16];

        for (int i = 0; i < 16; ++i)
        {
            x[i] = Math.random() * (13 - (-3)) + (-3);
        }

        double[][] b = new double[7][16];

        for (int i = 0; i < a.length; ++i)
        {
            if(a[i] == 7)
            {
                for (int j = 0; j < b[i].length; ++j)
                {
                    b[i][j] = Math.pow((Math.cos(Math.pow(x[j] / 0.25, 3)) + 1) / 4, 2);
                }
            }
            else if(a[i] == 11 || a[i] == 13 || a[i] == 17)
            {
                for (int j = 0; j < b[i].length; ++j)
                {
                    b[i][j] = Math.tan(Math.asin(Math.cos(x[j])));
                }
            }
            else
            {
                for (int j = 0; j < b[i].length; ++j)
                {
                    double m = Math.pow(2 / 3 / Math.atan(Math.pow(Math.E, -Math.abs(x[j]))), 3);
                    double n = 1 / 3 * Math.pow(0.5 * (4 - Math.pow(0.25 / x[j], 6)), Math.sin(Math.cbrt(x[j])));
                    b[i][j] = Math.pow(m, n);
                }
            }
        }
        for (int i = 0; i < b.length; ++i)
        {
            System.out.print(String.format("%.5f", b[i][0]));
            for (int j = 1; j < b[i].length; ++j)
            {
                System.out.print(String.format(" %.5f", b[i][j]));
            }
            System.out.println("");
        }
    }
}
