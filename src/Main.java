import animals.*;

public class Main {
    public static void main(String[] args) {
        Herbivores gazel = new Herbivores("Газель", 3, "степи, пустыни и полупустыни", 50, "травоядное");
        Herbivores zhiraf = new Herbivores("Жираф", 6, "саванны Африки", 55, "травоядное");
        Herbivores hors = new Herbivores("Лошадь", 1, "саванны Восточной Африки", 80, "травоядное");
        System.out.println(gazel.toString() + "\n" + zhiraf.toString() + "\n" + hors.toString());

        Predators giena = new Predators("Гиена", 1, "саванны и заросли Африки", 50, "плотоядное");
        Predators tiger = new Predators("Тигр", 7, "дальний восток России", 96, "плотоядное");
        Predators bear = new Predators("Медведь", 5, "северная Америка, Евразия", 50, "всеядное");
        System.out.println(giena.toString() + "\n" + tiger.toString() + "\n" + bear.toString());

        Amphibians frog = new Amphibians("Лягушка", 3, "вблизи водоемов");
        Amphibians snake = new Amphibians("Уж пресноводный", 7, "русле реки, среди зарослей и густых кустарников");
        System.out.println(frog.toString() + "\n" + snake.toString());

        Flightless pavlin = new Flightless("Павлин", 8, "леса и саванны на полуострове Индостан и на острове Цейлон", "не летает");
        Flightless penguin = new Flightless("Пенгвин", 15, "Антарктика и на прилегающие к ней острова", "");
        Flightless dodo = new Flightless("Птица Додо", 20, "Маскаренский архипелаг", "не летает");
        System.out.println(pavlin.toString() + "\n" + penguin.toString() + "\n" + dodo.toString());

        Flying seagull = new Flying("Чайка", 5, "где есть открытый выход к морю или океану, а так же на внутренних территориях", "");
        Flying albatross = new Flying("Альбатрос", 6, "Южном океане", "");
        Flying falcon = new Flying("Сокол", 13, "Южной Америке и Африке", "");
        System.out.println(seagull.toString() + "\n" + albatross.toString() + "\n" + falcon.toString());
    }
}