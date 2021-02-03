package task1;


public class Main {

    public static void main(String[] args) {

        var cats = Cat.makeCats(10);
        Printer.print(cats);

        System.out.println("----Sort by Age------");
        cats.sort(Cat::byAge);
        Printer.print(cats);

        System.out.println("----Sort by Bread------");
        cats.sort(Cat::byBread);
        Printer.print(cats);

        System.out.println("----Sort by Name------");
        cats.sort(Cat::byName);
        Printer.print(cats);

        System.out.println("----Delete names with 5 letters------");
        cats.removeIf(Cat::deleteFiveLettersName);
        Printer.print(cats);

        System.out.println("----Delete color------");
        cats.removeIf(cat -> cat.sameColor(Cat.Color.TABBY));
        Printer.print(cats);


        // А сюда добавьте код, который будет сортировать коллекцию котов
        // используйте лямбда-выражения и ссылки на методы
        //cats.sort(?);
        //Printer.print(cats);
    }


}
