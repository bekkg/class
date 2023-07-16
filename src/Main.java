public class Main {
    public static void main(String[] args) {
        Class class1 = new Class (3,"animal", new int[]{12,233,543});

        System.out.println(
                " id: " + class1.getId()+
                        " word: " + class1.getWord()


        );
        for(int class2 :class1.getArray()){
            System.out.print(class2+" ");
        }
    }
}