import java.util.ArrayList;

public class P133_ArrayList {

    private P133_ArrayList() {
        //Constructor if needed later
        //comment 8/5/2023
    }

    public static void main(String[] Args) {
        P133_ArrayList ar = new P133_ArrayList();
        ar.run();
    }

    private void run()  {
        ArrayList<Egg> myList = new ArrayList<Egg>();
        Egg egg1 = new Egg();
        myList.add(egg1);  //cannot resolve symbol Egg1

        egg1.crack(3);

        Egg egg2 = new Egg();
        myList.add(egg2);

        Egg egg3 = new Egg();
        myList.add(egg3);

        int theSize = myList.size();

        boolean isIn = myList.contains(egg1);

        int idx = myList.indexOf(egg2);

        boolean empty = myList.isEmpty();

        myList.remove(egg1);  //cannot resolve method remove(egg1)

    }


}

 class Egg{
    String style = "scrambled";
    void crack(int numOfCracks){
      while (numOfCracks>0){
          System.out.println("crack");
          numOfCracks -= 1;
      }

    }
}