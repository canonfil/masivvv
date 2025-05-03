public class Main {
    public static void main(String[] args) {

        System.out.println("Task 1");
        int[] monthPayments = new int[]{45000, 55000, 30000, 60000, 100000};
        int sum = 0;

        for (int payment : monthPayments) {
            sum += payment;


            System.out.println("Сумма трат за месяц составила " + sum + " P");

            System.out.println();
            System.out.println("------");}

        System.out.println( " Task 2");
        int mintPayment = monthPayments[0];
        int maxPayment = monthPayments [0];
        for (int payment : monthPayments){
            if (payment> maxPayment){
                maxPayment = payment;
            }
            if (payment < mintPayment) {
                mintPayment = payment;
            }
        }
        System.out.println(" Минимальная сумма трат за неделю составила "+ mintPayment +" P "+
                " Максимальная сумма трат за неделю составила " + maxPayment+ " P");

        System.out.println();
        System.out.println("------");

        System.out.println(" Task 3");

        double  averageMonthPayment = (double) sum/monthPayments.length ;
        System.out.println(" Средняя сумма трат за месяц составила " + averageMonthPayment + " P");

        System.out.println(" Task 4");


        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};

        for (int i = reverseFullName.length -1;i>=0;i--){
            System.out.print(reverseFullName[i]);
        }
        System.out.println();
        System.out.println("------");


    }}