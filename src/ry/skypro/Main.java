package ry.skypro;

import java.io.IOException;

public class Main {

    public static void main(String[] args) {
        //Напишите пример обработки нескольких исключений в одном блоке catch.

        try {
            //кусок в котором могут быть исключения
        } catch (NullPointerException | IndexOutOfBoundsException | IllegalArgumentException e){
            System.out.println(e);
        } catch (IllegalAccessException e){
            System.out.println(e);
            someMethod();
        } catch (IOException e){
            throw new RuntimeException();
        }
    }

    private static void someMethod() {
    }
}
