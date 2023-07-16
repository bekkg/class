public class Class {
    private int id ;
    private  String word ;
    private int [] array ;

    public Class(int id, String word, int[] array) {
        this.id = id;
        this.word = word;
        this.array = array;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setWord(String word) {
        this.word = word;
    }

    public void setArray(int[] array) {
        this.array = array;
    }

    public int getId() {
        return id;
    }

    public String getWord() {
        return word;
    }

    public int[] getArray() {
        return array;
    }
}
