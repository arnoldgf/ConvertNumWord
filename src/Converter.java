import java.util.TreeMap;

public class Converter {
    TreeMap<Integer, String> thousandsKeyMap = new TreeMap<>();
    TreeMap<Integer, String> oneKeyMap = new TreeMap<>();
    TreeMap<Integer, String> twoKeyMap = new TreeMap<>();
    TreeMap<Integer, String> threeKeyMap = new TreeMap<>();
    TreeMap<Integer, String> fourKeyMap = new TreeMap<>();
    TreeMap<Integer, String> fiveKeyMap = new TreeMap<>();
    public Converter() {
        oneKeyMap.put(1, "один ");
        oneKeyMap.put(2, "два ");
        oneKeyMap.put(3, "три ");
        oneKeyMap.put(4, "четыре ");
        oneKeyMap.put(5, "пять ");
        oneKeyMap.put(6, "шесть ");
        oneKeyMap.put(7, "семь ");
        oneKeyMap.put(8, "восемь ");
        oneKeyMap.put(9, "девять ");
        oneKeyMap.put(10, "десять ");
        oneKeyMap.put(11, "одиннадцать ");
        oneKeyMap.put(12, "двенадцать ");
        oneKeyMap.put(13, "тринадцать ");
        oneKeyMap.put(14, "четырнадцать ");
        oneKeyMap.put(15, "пятнадцать ");
        oneKeyMap.put(16, "шестьнадцать ");
        oneKeyMap.put(17, "семьнадцать ");
        oneKeyMap.put(18, "восемьнадцать ");
        oneKeyMap.put(19, "девятнадцать ");

        twoKeyMap.put(2, "двадцать ");
        twoKeyMap.put(3, "тридцать ");
        twoKeyMap.put(4, "сорок ");
        twoKeyMap.put(5, "пятьдесят ");
        twoKeyMap.put(6, "шестьдесят ");
        twoKeyMap.put(7, "семьдесят ");
        twoKeyMap.put(8, "восемьдесят ");
        twoKeyMap.put(9, "девятьдесять ");

        threeKeyMap.put(1, "сто ");
        threeKeyMap.put(2, "двести ");
        threeKeyMap.put(3, "триста ");
        threeKeyMap.put(4, "четыреста ");
        threeKeyMap.put(5, "пятьсот ");
        threeKeyMap.put(6, "шестьсот ");
        threeKeyMap.put(7, "семьсот ");
        threeKeyMap.put(8, "восемьсот ");
        threeKeyMap.put(9, "девятьсот ");

        fourKeyMap.put(1, "одна тысяча ");
        fourKeyMap.put(2, "две тысячи ");
        fourKeyMap.put(3, "три тысячи ");
        fourKeyMap.put(4, "четыре тысячи ");
        fourKeyMap.put(5, "пять тысяч ");
        fourKeyMap.put(6, "шесть тысчяч ");
        fourKeyMap.put(7, "семь тысяч ");
        fourKeyMap.put(8, "восемь тысяч ");
        fourKeyMap.put(9, "девять тысяч ");

        thousandsKeyMap.put(1, "тысяч ");
        thousandsKeyMap.put(2, "тысячи ");
    }
}
