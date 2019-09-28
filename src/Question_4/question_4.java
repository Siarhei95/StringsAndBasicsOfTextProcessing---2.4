package Question_4; //С помощью функции копирования и операции конкатенации составить из частей слова “информатика” слово “торт”.

public class question_4 {
    public static void main(String[] args) {
        StringBuilder informatic = new StringBuilder("информатика");
        StringBuilder cake = new StringBuilder("торт");

        char [] cookCake = new char [4];                                //С помощью функции копирования
        informatic.getChars(7,8, cookCake,0);
        informatic.getChars(3,4, cookCake,1);
        informatic.getChars(4,5, cookCake,2);
        informatic.getChars(7,8, cookCake,3);
        System.out.print("CopyType: ");
        System.out.println(cookCake);

        String s = "";                                                  //С помощью функции операции конкатенации
        s = s.concat(String.valueOf(cake));
        System.out.println("ConcatType: " + s);
    }
}