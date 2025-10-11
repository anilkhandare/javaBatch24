package keywords.thiskeyword;

public class Demo1 {
     String title;
     String description;

    public Demo1 ( String title,String description) {
        this.description = description;
        this.title = title;
    }

    Demo1(){
        this("title","dsecription");//current cusntrutor
    }
    static void display(){
        System.out.println (new Demo1 ().title);
        System.out.println (new Demo1 ().description);
    }
}
