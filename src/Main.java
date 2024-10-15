public class Main {
    public static void main(String[] args) {
//        Task  1
        System.out.println("\nTask 1\n");
        byte temperatureArctic = -100;
        short priceBook = 20650;
        int countAnt = 321000;
        long numberOfStars = 100000000L;
        float canOfBeer = 0.5f;
        double sizeAtom = 0.000001;
        System.out.println("Значение переменной temperatureArctic с типом byte равно " + temperatureArctic);
        System.out.println("Значение переменной priceBook с типом short равно " + priceBook);
        System.out.println("Значение переменной countAnt с типом int равно " + countAnt);
        System.out.println("Значение переменной numberOfStars с типом long равно " + numberOfStars);
        System.out.println("Значение переменной canOfBeer с типом float равно " + canOfBeer);
        System.out.println("Значение переменной sizeAtom с типом double равно " + sizeAtom);
//        Task 2
        System.out.println("\nTask 2\n");
        float a = 27.12f;
        long b = 987678965549L;
        float c = 2.786f;
        short d = 569;
        short e = -159;
        int f = 27897;
        byte g = 67;
//        Task 3
        System.out.println("\nTask 3\n");
        byte lp = 23;
        byte as = 27;
        byte ea = 30;
        short totalPaperSheet = 480;
        int oneStudentPaperSheet;
        oneStudentPaperSheet = totalPaperSheet / (lp + as + ea);
        System.out.println("На каждого ученика рассчитано " + oneStudentPaperSheet + " листов бумаги");
//        Task 4
        System.out.println("\nTask 4\n");
        byte bottle = 16;
        byte time = 2;
        byte time20 = 20;
        short timeDay = 1440;
        short timeThreeDay = 4320;
        int oneMonth = 43200;
        int output;
        output = bottle / time;
        System.out.println("За 2 минуты машина произвела " + output * time + " штук бутылок");
        System.out.println("За 20 минут машина произвела " + output * time20 + " штук бутылок");
        System.out.println("За один день машина произвела " + output * timeDay + " штук бутылок");
        System.out.println("За три дня машина произвела " + output * timeThreeDay + " штук бутылок");
        System.out.println("За один месяц машина произвела " + output * oneMonth + " штук бутылок");
//    Task 5
        System.out.println("\nTask 5\n");
        int totalCanOfColor = 120;
        int totalClass;
        int whiteColor = 2;
        int brownColor = 4;
        int oneClassCanColor;
        int totalWhiteColor;
        int totalBrownColor;
        oneClassCanColor = whiteColor + brownColor;
        totalClass = totalCanOfColor / oneClassCanColor;
        totalBrownColor = totalClass * brownColor;
        totalWhiteColor = totalClass * whiteColor;
        System.out.println(String.format("В школе, где %d классов, нужно %d банок белой краски и %d банок коричневой краски", totalClass, totalWhiteColor, totalBrownColor));
//    Task 6
        System.out.println("\nTask 6\n");
        int weightOneBananas = 80;
        int weightOneHundredMilk = 105;
        int weightOneIceCream = 100;
        int weightOneEgg = 70;

        int quantityBananas = 5;
        int quantityMilk = 200;
        int quantityIceCream = 2;
        int quantityEggs = 4;

        int totalWeight = weightOneBananas * quantityBananas + quantityMilk / 100 * weightOneHundredMilk + weightOneIceCream * quantityIceCream + weightOneEgg * quantityEggs;
        System.out.println("Вес спортзавтрака " + totalWeight + " граммов, или " + totalWeight/1000 + " килограмм и " + totalWeight % 1000 + " грамм");
//    Task 7
        System.out.println("\nTask 7\n");
        int needLose = 7;
        int grammDay250 = 250;
        int grammDay500 = 500;

        int firstVariant = needLose * 1000 / grammDay250;
        int secondVariant = needLose * 1000 / grammDay500;
        int averageDay = (firstVariant + secondVariant) / 2;
        System.out.println(String.format("%d дней нужно потратить, если худеть на 250 грамм в день", firstVariant));
        System.out.println(String.format("%d дней нужно потратить, если худеть на 500 грамм в день", secondVariant));
        System.out.println(String.format("В среднем нужно потратить %d дней на похудение", averageDay));
//        Task 8
        System.out.println("\nTask 8\n");
        int salaryMary = 67760;
        int salaryDenis = 83690;
        int salaryKristina = 76230;

        int salaryAfterPromotionMary = salaryMary + (int)(salaryMary * 0.1);
        int salaryAfterPromotionDenis = salaryDenis + (int)(salaryDenis * 0.1);
        int salaryAfterPromotionKristina = salaryKristina + (int)(salaryKristina * 0.1);

        int yearDeltaMary = salaryAfterPromotionMary * 12 - salaryMary * 12;
        int yearDeltaDenis = salaryAfterPromotionDenis * 12 - salaryDenis * 12;
        int yearDeltaKristina = salaryAfterPromotionKristina * 12 - salaryKristina * 12;

        System.out.println(String.format("Маша теперь получает %d рублей. Годовой доход вырос на %d рублей", salaryAfterPromotionMary, yearDeltaMary));
        System.out.println(String.format("Денис теперь получает %d рублей. Годовой доход вырос на %d рублей", salaryAfterPromotionDenis, yearDeltaDenis));
        System.out.println(String.format("Кристина теперь получает %d рублей. Годовой доход вырос на %d рублей", salaryAfterPromotionKristina, yearDeltaKristina));
    }
}