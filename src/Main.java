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
        int bananaWeight = 5 * 80;
        int milkWeight = 2 * 105;
        int iceWeight = 2 * 100;
        int eggsWeight = 4 * 7;
        float Weight = bananaWeight + milkWeight + iceWeight + eggsWeight;
        float weightKg = Weight / 1000;
        System.out.println("Вес завтрака в граммах: " + Weight);
        System.out.println("Вес завтрака в килограммах: " + weightKg);

        // Задание 7

        int Days1 = 7 * 1000 / 250;
        int Days2 = 7 * 1000 / 500;
        int avrDays = (Days1 + Days2) / 2;
        System.out.println("Дней при 250 гр.:" + Days1);
        System.out.println("Дней при 500 гр.:" + Days2);
        System.out.println("Среднее количество дне:" + avrDays);

        // Задание 8

        int Masha = 67760;
        int Denis = 83690;
        int Kristina = 76230;


        System.out.println("Маша теперь получает " + (Masha * 1.1) + " рублей. Годовой доход вырос на " + (Masha * 1.1 * 12 - Masha * 12) + " рублей");
        System.out.println("Денис теперь получает " + (Denis * 1.1) + " рублей. Годовой доход вырос на " + (Denis * 1.1 * 12 - Denis * 12) + " рублей");
        System.out.println("Кристина теперь получает " + (Kristina * 1.1) + " рублей. Годовой доход вырос на " + (Kristina * 1.1 * 12 - Kristina * 12) + " рублей");




    }
}

