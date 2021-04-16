package ObjectOriented;
import java.util.*;

abstract class Book {
    String title;
    abstract void setTitle(String s);
    String getTitle() {
        return title;
    }
}

class Abstract extends Book {
    @Override
    void setTitle(String s) {
        title = s;
    }
}

class Main {

    public static void main(String []args) {
        //Book new_novel=new Book(); This line prHMain.java:25: error: Book is abstract; cannot be instantiated
        Scanner sc=new Scanner(System.in);
        String title=sc.nextLine();
        Abstract new_novel = new Abstract();
        new_novel.setTitle(title);
        System.out.println("The title is: "+new_novel.getTitle());
        sc.close();
    }
}