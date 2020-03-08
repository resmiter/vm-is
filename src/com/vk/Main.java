package com.vk;

import com.vk.exception.MyException;

public class Main {

    /**
     * Метод для генерации NullPointerException
     */
    private static void generateNullPointerException() {
        String name = null;
        name.length();
    }

    /**
     * Метод для генерации ArrayIndexOutOfBoundsException
     */
    private static void generateArrayIndexOutOfBoundsException() {
        int[] superNumbers = new int[3];
        int number = superNumbers[superNumbers.length];
    }

    /**
     * Стартовый метод программы
     * @throws Exception тип сгенерированного исключения, которое может быть "выброшено" методом
     */

    public static void main(String[] args) throws MyException {
        try {
            generateNullPointerException();
            generateArrayIndexOutOfBoundsException();
        } catch (NullPointerException e){
            System.out.println("либо лыжи не едут");
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println("либо я дурак");
        }
        throw new MyException("kva kva");
    }
}
