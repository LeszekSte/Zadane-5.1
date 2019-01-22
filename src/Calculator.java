public class Calculator {

    public void obliczenia(double piewrsza, double druga) {

        if (piewrsza > druga) {
            System.out.printf("%.2f + %.2f = %.2f", piewrsza, druga, piewrsza + druga);
        } else if (piewrsza < druga) {
            System.out.printf("%.2f * %.2f = %.2f", piewrsza, druga, piewrsza * druga);
        } else {
            System.out.printf("%.2f^2  = %.2f", piewrsza,  piewrsza*druga );
        }
    }
}
