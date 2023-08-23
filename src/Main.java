import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Converter converter = new Converter();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введи число: ");
        int number = 654321;
        String word = null;

        if(number < 20){
            word = converter.oneKeyMap.get(number);
            System.out.println(word);
        }else if(number < 100){
            int num = number/10;
            number = number%10;
            word = converter.twoKeyMap.get(num);
            word += converter.oneKeyMap.get(number);
            System.out.println(word);
        }else if(number < 1000){
            int num1 = number/100;
            int num = (number/10) % 10;
            number = number%10;
            word = converter.threeKeyMap.get(num1);
            word += converter.twoKeyMap.get(num);
            word += converter.oneKeyMap.get(number);
            System.out.println(word);
        }else if(number < 10000){
            int num2 = number/1000;
            int num1 = (number/100) % 10;
            int num = (number/10) % 10;
            number = number%10;
            word = converter.fourKeyMap.get(num2);
            word += converter.threeKeyMap.get(num1);
            word += converter.twoKeyMap.get(num);
            word += converter.oneKeyMap.get(number);
            System.out.println(word);
        }else if(number < 100000) {
            int num3 = number / 10000;
            int num2 = (number / 1000) % 10;
            int num1 = (number / 100) % 10;
            int num = (number / 10) % 10;
            number = number % 10;
            word = converter.twoKeyMap.get(num3);
            word += converter.oneKeyMap.get(num2);
            word += converter.thousandsKeyMap.get(2);
            word += converter.threeKeyMap.get(num1);
            word += converter.twoKeyMap.get(num);
            word += converter.oneKeyMap.get(number);
            System.out.println(word);
        }else if(number < 1000000) {
            int num4 = number / 100000;
            int num3 = (number / 10000) % 10;
            int num2 = (number / 1000) % 10;
            int num1 = (number / 100) % 10;
            int num = (number / 10) % 10;
            number = number % 10;
            word = converter.threeKeyMap.get(num4);
            word += converter.twoKeyMap.get(num3);
            word += converter.oneKeyMap.get(num2);
            word += converter.thousandsKeyMap.get(2);
            word += converter.threeKeyMap.get(num1);
            word += converter.twoKeyMap.get(num);
            word += converter.oneKeyMap.get(number);
            System.out.println(word);
        }
    }
}