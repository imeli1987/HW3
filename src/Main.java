public class Main {
    public static void main(String[] args) {
//        Task  1
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
        float a = 27.12f;
        long b = 987678965549L;
        float c = 2.786f;
        short d = 569;
        short e = -159;
        int f = 27897;
        byte g = 67;
//        Task 3
        byte lp = 23;
        byte as = 27;
        byte ea = 30;
        short totalPaperSheet = 480;
        int oneStudentPaperSheet;
        oneStudentPaperSheet = totalPaperSheet / (lp + as + ea);
        System.out.println("На каждого ученика рассчитано " + oneStudentPaperSheet + " листов бумаги");
//        Task 4
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
//        На ремонт школы нужно 120 банок краски двух цветов: белой и коричневой.
//                На один класс уходит 2 банки белой и 4 банки коричневой краски.
//                Сколько банок каждой краски было куплено?
//        Выведите результат задачи в консоль в формате:
//        «В школе, где … классов, нужно … банок белой краски и … банок коричневой краски».
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


    }
}