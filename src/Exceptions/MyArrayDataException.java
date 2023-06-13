package Exceptions;

public class MyArrayDataException extends Exception{
    @Override
    public String getMessage() {
        return "Данный в массиве не могут быть преобразованы в число";
    }

    public String getMessage(int index1, int index2) {
        return "Данные в ячейке " + "["+index1+"]"+"["+index2+"] "+ "не могут быть преобразованы в число";
    }
}
