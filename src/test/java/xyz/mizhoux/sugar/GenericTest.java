package xyz.mizhoux.sugar;

public class GenericTest {
    public static void main(String[] args) {
        GenericTest listTest = new GenericTest();
         Generic<Integer> gInteger = new Generic<Integer>(123);
        Generic  <Number> gNumber = new Generic<Number>(456);
        print(gInteger);
        print(gNumber);
    }

    /**
     *Generic<Number> clazz 并不能传  Generic<Integer>  所以 这里要用？
     *
     * @param clazz
     */
    public  static   void  print(Generic<?> clazz){
        System.out.println(clazz.getKey());

    }
}
