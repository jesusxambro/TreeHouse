package HelloWorld;

public class Person {
    String name;

    Person(String name)
    {
        this.name = name;
    }

    //editor-fold desc="Getter">
    String getName()
    {
        return this.name;
    }

    //</editor-fold>




    enum apple {
        fighting(5),
        killing(10);

    int energy; // Energy Required

        apple(int energy)
        {
            this.energy = energy;
        }

    }

   public  int appleSwitcher(apple passMe)
   {
      System.out.println("Energy Required " +apple.fighting.energy);
      apple a = passMe;
      switch (a)
      {
          case fighting:
              System.out.println("Fighting");
              break;

          case killing:
              System.out.println("Killing");
              break;
          default:
              System.out.println("Nothing is Working");
              break;
      }



        return apple.fighting.energy;
   }


}
