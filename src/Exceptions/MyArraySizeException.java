package Exceptions;

public class MyArraySizeException extends Exception{
    @Override
    public String getMessage() {
        return "Размер входного массива не равен 4х4";
    }
}
