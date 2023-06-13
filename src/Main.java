import Exceptions.MyArrayDataException;
import Exceptions.MyArraySizeException;

public class Main {
    public static void main(String[] args) throws MyArraySizeException, MyArrayDataException {
        String[][] test = new String[4][4];
        //String[][] test = new String[3][4]; // для проверки выборса первого исключения
        for(int i = 0; i < test.length; i++){
            for(int j = 0; j < test[0].length; j++){
                test[i][j] = "1";
                //test[i][j] = "z"; // для проверки выброса второго исключения
            }
        }
        System.out.println(sum(test));

    }

    public static int sum (String[][] list) throws MyArraySizeException, MyArrayDataException {
        if(list.length != 4 || list[0].length != 4){
            throw new MyArraySizeException();
        }
        int resultSum = 0;
        for(int i = 0; i < 4; i++){
            for(int j = 0; j < 4; j++){
                String perm = list[i][j];
                    if(!perm.matches("[-+]?\\d+")){
                        System.out.printf("В ячейке с идексом [%s][%d] ошибка!\n",i,j);
                        throw new MyArrayDataException();
                    }
                    int conv = Integer.parseInt(perm);
                    resultSum = resultSum+ conv;
            }
        }
        return resultSum;
    }
}
