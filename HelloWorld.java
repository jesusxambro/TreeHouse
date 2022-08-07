package HelloWorld;


import javax.swing.plaf.synth.Region;

public class HelloWorld {

    public static void main(String[] args)
    {

        //<editor-fold desc="Here You need to make a for loop">
        for (int test = 0; test <= 100; test++)
    {
        if(test % 2 == 0)
        {

            System.out.println("Even");
        }
        else
        {
            System.out.println("ODD ?");
        }
        System.out.printf("%d\n", test);
    }
        //</editor-fold>

    }


}
