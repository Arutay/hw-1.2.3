public class Main {
    public static void main(String[] args) {
        //zadanie 6
        System.out.println("zadanie 6");
        var boxer1Weqight = 78.2;
        System.out.println(boxer1Weqight);
        var boxer2Weight = 82.7;
        System.out.println("общий вес двух бойцов (1 способ): " + (boxer1Weqight + boxer2Weight));
        System.out.println("разница весов двух бойцов (2 способ): " + (boxer2Weight - boxer1Weqight));

        //zadanie 7
        System.out.println("zadanie 7");
        System.out.println("общий вес двух бойцов: " + (boxer1Weqight + boxer2Weight));
        System.out.println("разница весов двух бойцов: " + (boxer2Weight % boxer1Weqight));

        //zadanie 8
        System.out.println("zadanie 8");
        var totalWorkingHours = 640;
        var hoursPerDay = 8;
        var totalEmploys = totalWorkingHours / hoursPerDay;
        System.out.println("Всего работников в компании - " + totalEmploys + " человек");
        totalEmploys = totalEmploys + 94;
        totalWorkingHours = totalEmploys * hoursPerDay;
        System.out.println("Если в компании работает " + totalEmploys + " человека, то всего "+totalWorkingHours + " часа работы может быть поделено между сотрудниками");






    }

}