public class _9_Kappa_Calculation {
    public static void main(String[] args) {
        int[][] mtx = { { 3, 2 },
                { 1, 4 }
        };

        double p0 = 0, ptot = 0;

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                ptot += mtx[i][j];

                if (i == j) {
                    p0 += mtx[i][j];
                }
            }

        }

        double pfav = 0, pagn = 0, kp = 0, pnot = 0, pe = 0;

        pnot = p0 / ptot;
        pfav = ((double) (mtx[0][0] + mtx[0][1]) / 10) * ((double) (mtx[0][0] + mtx[1][0]) / 10);
        pagn = ((double) (mtx[1][0] + mtx[1][1]) / 10) * ((double) (mtx[0][1] + mtx[1][1]) / 10);

        // System.out.println(pfav + " " + pagn + " " + ptot);
        pe = pfav + pagn;

        kp = (pnot - pe) / (1 - pe);

        System.out.printf("%.2f", kp);
    }
}
