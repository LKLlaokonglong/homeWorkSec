package homeWork;

public class level2 {
    public static void main(String[] args) {
        String s = "acbdw,12695,47AasIDX";
        String[] arr = s.split(",");
        level2 demo1 = new level2();
        for (int i = 0; i < arr.length; i++) {

          //  System.out.println(demo1.isNumber(arr[i]));
           // System.out.println(demo1.isCharacter(arr[i]));
            System.out.println(demo1.isCapital(arr[i]));
        }
    }

    public static boolean isNumber(String num) {
        char[] array = num.toCharArray();
        for (int j = 0; j < array.length; j++) {
            if (array[j] < '0' || array[j] > '9') {
                return false;
            }

        }
        return true;
    }

    public static boolean isCharacter(String num1) {
        char[] array1 = num1.toCharArray();
        for (int k = 0; k < array1.length; k++) {
            if (array1[k] > 'A' && array1[k] < 'Z') {
                return true;
            }
        }
        return false;
    }
    public static  String isCapital(String num2){
        char[] array2 = num2.toCharArray();
        for (int c = 0; c < array2.length; c++) {
            if(array2[c] < 'z' && array2[c] > 'a'){
                array2[c] = array2[c - 32];
                System.out.println(array2[c]);
            }
        }
        return num2;
    }




}
