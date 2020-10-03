public class java_lesson_<1>
{
     public static void main(String []args){
        // завдання 1
        
        String name = "John";
        System.out.println(name);
        int myNum = 15;
        System.out.println(myNum);
        float myFloatNum = 5.99f;
        System.out.println(myFloatNum);
        char myLetter = 'D';
        System.out.println(myLetter);
        boolean myBool = true;
        System.out.println(myBool);
         
         
        // завдання 2
        Byte a1 =2;
        System.out.println("Byte is :" + Byte.MIN_VALUE);
        System.out.println("Byte is :" + Byte.MAX_VALUE);
        
        Short a2 = 2;
        System.out.println("Short is :" + Short.MIN_VALUE);
        System.out.println("Short is :" + Short.MAX_VALUE);
        
        Integer a3 = 2;
        System.out.println("Integer is :" + Integer.MIN_VALUE);
        System.out.println("Integer is :" + Integer.MAX_VALUE);
        
        Long a4 = 2L;
        System.out.println("Long is :" + Long.MIN_VALUE);
        System.out.println("Long is :" + Long.MAX_VALUE);
        
        Double b = 2.2;
        System.out.println("Double is :" + Double.MIN_VALUE);
        System.out.println("Double is :" + Double.MAX_VALUE);
        
        Float b1 = 3.3F;
        System.out.println("Float is :" + Float.MIN_VALUE);
        System.out.println("Float is :" + Float.MAX_VALUE);
        
        // завдання 3 
        // Пошук максимального числа в масиві
        
        double array[] = {1.1, 2.2, 1.1, 3.2, 1.2, 2.1};
        double max = array[0];
        for (int i = 0; i < 6; i++) {
            if (max < array[i])
                max = array[i];
        }
        System.out.println("Максимальне число в масиві: " + max);
        
        // Пошук мінімального числа в масиві
        
        double array1[] = {1.1, 2.2, 1.1, 3.2, 1.2, 2.1};
        double min = array1[0];
        for (int i = 0; i < 6; i++) {
            if (min > array1[i])
                min = array1[i];
        }
        System.out.println("Мінімальне число в масиві: " + min);
        
     }
}