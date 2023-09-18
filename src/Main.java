public class Main {
    public static void main(String[] args) {
        //Задание 1
        int i = 1000;
        byte b = 1;
        short sh = 100;
        long ln = 10000L;
        float fl = 10.1f;
        double db = 10.2;


        System.out.println("Значение переменной i с типом int равно " + i);
        System.out.println("Значение переменной b с типом byte равно " + b);
        System.out.println("Значение переменной sh с типом short равно " + sh);
        System.out.println("Значение переменной ln с типом long равно " + ln);
        System.out.println("Значение переменной fl с типом float равно " + fl);
        System.out.println("Значение переменной db с типом double равно " + db);

        // Задание 2

        float fl2 = 27.12f;
        long ln2 = 987678965549L;
        float fl3 = 2.786f;
        int i2 = 569;
        short sh1 = -159;
        short sh2 = 27897;
        byte b1 = 67;

        // Задание 3

        int class1 = 23;
        int class2 = 27;
        int class3 = 30;
        int paper = 480;
        int paperPupil = paper / (class1 + class2 + class3);

        System.out.println("На каждого ученика рассчитано " + paperPupil + " листов бумаги");

        // Задание 4

        int bottle = 16;
        int time = 2;
        int bottleMinute = bottle / time;
        int bottle20Min = bottleMinute * 20;
        int bottleDay = bottleMinute * 60 * 24;
        int bottle3Days = bottleDay * 3;
        int bottle30Days = bottleDay * 30;

        System.out.println("За 20 минут машина произвела " + bottle20Min + " штук бутылок");
        System.out.println("За сутки машина произвела " + bottleDay + " штук бутылок");
        System.out.println("За 3 дня машина произвела " + bottle3Days + " штук бутылок");
        System.out.println("За месяц машина произвела " + bottle30Days + " штук бутылок");

        // Задание 5
        int count = 120;
        int white = 2;
        int brown = 4;
        int classes = count / (white + brown);
        int whiteCount = classes * white;
        int brownCount = classes * brown;
        System.out.println("В школе, где " + classes + " классов, нужно " + whiteCount + " банок белой краски и " + brownCount + " банок коричневой краски");

        // Задание 6


        int banana = 5;
        int milk = 200;
        int iceCream = 2;
        int eggs = 4;

        int bananaWeight = 80;
        int milkWeight = 105;
        int iceWeight = 100;
        int eggsWeight = 7;
        float weight = bananaWeight * banana + milkWeight * milk /100 + iceWeight * iceCream + eggsWeight * eggs;
        float weightKg = weight / 1000;
        System.out.println("Вес завтрака в граммах: " + weight);
        System.out.println("Вес завтрака в килограммах: " + weightKg);

        // Задание 7

        int weightSport = 7 * 1000;
        int days1 = weightSport / 250;
        int days2 = weightSport / 500;
        int avrDays = (days1 + days2) / 2;
        System.out.println("Дней при 250 гр.:" + days1);
        System.out.println("Дней при 500 гр.:" + days2);
        System.out.println("Среднее количество дне:" + avrDays);

        // Задание 8

        int masha = 67760;
        int denis = 83690;
        int kristina = 76230;
        double dopMasha = masha * 1.1;
        double dopDenis = denis * 1.1;
        double dopKristina = kristina * 1.1;
        double difMasha = dopMasha * 12 - masha * 12;
        double difDenis = dopDenis * 12 - denis * 12;
        double difKristina = dopKristina * 12 - kristina * 12;


        System.out.println("Маша теперь получает " + dopMasha + " рублей. Годовой доход вырос на " + difMasha + " рублей");
        System.out.println("Денис теперь получает " + dopDenis + " рублей. Годовой доход вырос на " + difDenis + " рублей");
        System.out.println("Кристина теперь получает " + dopKristina + " рублей. Годовой доход вырос на " + difKristina + " рублей");




    }
}

