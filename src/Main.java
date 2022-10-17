public class Main {
    public static void main(String[] args) {
        var dog = 8;
        var cat = 6;
        var paper = 763789;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
        dog = dog + 4;
        cat = cat + 4;
        paper =  paper + 4;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
        dog = dog - 5;
        cat = cat - 6;
        paper = paper - 7639;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
        var friend = 19;
        System.out.println(friend);
        friend = friend + 2;
        System.out.println(friend);
        friend = friend / 7;
        System.out.println(friend);
        var frog = 5;
        System.out.println(frog);
        frog = frog * 10;
        System.out.println(frog);
        frog = frog / 5;
        System.out.println(frog);
        frog = frog +4;
        System.out.println(frog);

        var boxerJohn = 78;
        var boxerTommy = 82;
        var totalWieght = boxerTommy + boxerJohn;
        System.out.println("Общий вес боксеров " + totalWieght+ " кг!");
        var weightDifference =  boxerTommy - boxerJohn;
        System.out.println("Разница в весе " + weightDifference + " кг!");
        weightDifference = boxerTommy % boxerJohn;
        System.out.println("Разница в  весе (остаток от деления) " + weightDifference + " кг!");

        var totalTime = 640;
        var employeeShiftTime = 8;
        var amountOfWorkers = totalTime / employeeShiftTime;
        System.out.println("Всего сотрудников " + amountOfWorkers + " человек");
        amountOfWorkers = amountOfWorkers + 94;
        totalTime = amountOfWorkers * 8;
        System.out.println("Если в компании работает " + amountOfWorkers + " человек, то всего " + totalTime + " часов работы может быть поделено между сотрудниками");






    }
}
