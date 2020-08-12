import java.util.*;
public class Index
{
    static Date sc=new Date();
    static int e=0;
    static String dt="",dt1="",mt="",m1="",dt2="";
    static int DT1=0;
    static String M="";
    static Scanner in=new Scanner(System.in);
    static Scanner ob=new Scanner(System.in);
    static String user[]=new String[100];
    static String pword[]=new String[100];
    static String email[]=new String[100];
    static long cno[]=new long[100];
    static int uplan[]=new int[100];
    static long cdno[]=new long[100];
    static String cname[]=new String[100];
    static String plan[]=new String[3];
    static String lib[]=new String[100];
    static int bill[]=new int[4];
    static int index=0;
    static String choice="";
    static int z=0;
    static int bl=0;
    static boolean b=true;
    public static void main(String args[])
    {
        e=-1;
        user[0]="Steven Spielberg";
        user[1]="Robert De Niro";
        pword[0]="11235";
        pword[1]="12121";
        email[0]="stevenspielberg@gmail.com";
        email[1]="robniro@gmail.com";
        cno[0]=10023415;
        cno[1]=10034526;
        uplan[0]=1;
        uplan[1]=2;
        cdno[0]=441323;
        cdno[1]=772346;
        cname[0]="SPIELBERGSTEVEN";
        cname[1]="NIROROBERT";
        plan[0]="Basic";
        plan[1]="Standard";
        plan[2]="Premium";
        bill[0]=650;
        bill[1]=800;
        dt=sc.toString();
        dt2=dt.substring(24,28);//Year
        mt=dt.substring(4,7);//Month
        dt1=dt.substring(8,10);//Date
        DT1=Integer.valueOf(dt1);
        /*lib[0]=
        lib[1]=**/
        index=1;
        run();
    }
    public static boolean check(int a,String choice)
    {
        if(choice.length()==1)
        {
            if(Character.isDigit(choice.charAt(0)))
            {
                z=Integer.parseInt(choice+"");
                if(z>=1&&z<=a)
                {
                    return false;

                }
                else
                {
                    System.out.println("Sorry!There are only "+a+" choices");
                    System.out.println("Please enter your choice again.");
                    System.out.println("Press Enter to continue");
                    ob.nextLine();
                    return true;
                }
            }
            else
            {
                System.out.println("Sorry! Alphabets and symbols are invalid!");
                System.out.println("Press Enter to continue");
                ob.nextLine();
                return true;
            }
        }
        else
        {
            System.out.println("Please enter your choice as per the given options only.");
            ob.nextLine();
            return true;
        }
    }
    public static String monthcheck(String m)
    {

        if(m.equalsIgnoreCase("Jan"))
        {
            
            m1="Feb";
            if(DT1>28)
            DT1=28;
        }
        if(m.equalsIgnoreCase("Feb"))
        {
            
            m1="Mar";
        }
        if(m.equalsIgnoreCase("Mar"))
        {
            
            m1="Apr";
            if(DT1>30)
            DT1=30;
        }
        if(m.equalsIgnoreCase("Apr"))
        {
            
            m1="May";
        }
        if(m.equalsIgnoreCase("May"))
        {
            
            m1="Jun";
            if(DT1>30)
            DT1=30;
        }
        if(m.equalsIgnoreCase("Jun"))
        {
            
            m1="Jul";
        }
        if(m.equalsIgnoreCase("Jul"))
        {
            
            m1="Aug";
        }
        if(m.equalsIgnoreCase("Aug"))
        {
            
            m1="Sep";
            if(DT1>30)
            DT1=30;
        }
        if(m.equalsIgnoreCase("Sep"))
        {
           
            m1="Oct";
        }
        if(m.equalsIgnoreCase("Oct"))
        {
            
            m1="Nov";
            if(DT1>30)
            DT1=30;
        }
        if(m.equalsIgnoreCase("Nov"))
        {
            
            m1="Dec";
        }
        if(m.equalsIgnoreCase("Dec"))
        {
            m1="Jan";
            
        }
        return m1;
    }


    public static void run()
    {
        m1=monthcheck(mt);
        if(mt.equalsIgnoreCase("Jan"))
        {
            M="01";
        }
        if(mt.equalsIgnoreCase("Feb"))
        {
            M="02";
        }
        if(mt.equalsIgnoreCase("Mar"))
        {
            M="03";
        }
        if(mt.equalsIgnoreCase("Apr"))
        {
            M="04";
        }
        if(mt.equalsIgnoreCase("May"))
        {
            M="05";
        }
        if(mt.equalsIgnoreCase("Jun"))
        {
            M="06";
        }
        if(mt.equalsIgnoreCase("Jul"))
        {
            M="07";
        }
        if(mt.equalsIgnoreCase("Aug"))
        {
            M="08";
        }
        if(mt.equalsIgnoreCase("Sep"))
        {
            M="09";
        }
        if(mt.equalsIgnoreCase("Oct"))
        {
            M="10";
        }
        if(mt.equalsIgnoreCase("Nov"))
        {
            M="11";
        }
        if(mt.equalsIgnoreCase("Dec"))
        {
            M="Jan";
        }
        String choice1="";
        do
        {
            System.out.println("\f");
            System.out.println(dt1+"/"+M+"/"+dt2);
            menu.logo();
            System.out.println("1.About Us");
            System.out.println();
            System.out.println("Getting Started:");
            System.out.println("2.Sign in");
            System.out.println("3.Don't have an account? Join now");
            System.out.println();
            System.out.println("Netflix Help Centre:");
            System.out.println("4.FAQ");
            System.out.println("5.Contact Us");
            System.out.println();
            System.out.println("6.Exit");
            System.out.println("Enter your choice:");
            choice1=in.next();
            if(choice1.length()==1)
            {
                if(Character.isDigit(choice1.charAt(0)))
                {
                    int z=Integer.parseInt(choice1+"");
                    if(z>=1&&z<=6)
                    {
                        break;
                    }
                    else
                    {
                        System.out.println("Sorry! There are only 6 choices.");
                        System.out.println("Please enter your choice again.");
                        System.out.println("Press Enter to continue:");
                        ob.nextLine();
                    }
                }
                else
                {
                    System.out.println("sorry! Alphabets and symbols are invalid!");
                    System.out.println("Press Enter to continue:");
                    ob.nextLine();
                }
            }
            else
            {
                System.out.println("Please enter your choice as per the given options only.");
                ob.nextLine();
            }
        }while(true);
        /*System.out.println("Your choice is:"+choice);
        System.out.println("Press Enter to continue.");
        ob.nextLine();**/
        if(choice1.equals("1"))
        {
            System.out.println("\f");
            menu.logo();
            System.out.println();
            menu.aboutus(); 
            System.out.println("  Press Enter to go to the Main Menu.");
            ob.nextLine();
            run();
        }
        if(choice1.equals("4"))
        {
            System.out.println("\f");
            menu.FAQ();
            System.out.println("  Press Enter to go to the Main Menu.");
            ob.nextLine();
            run();
        }
        if(choice1.equals("5"))
        {
            System.out.println("\f");
            menu.contactus();
            System.out.println("  Press Enter to go to the Main Menu.");
            ob.nextLine();
            run();
        }
        if(choice1.equals("2"))
        {
            //System.out.println("\f");
            menu.signin();
        }
        if(choice1.equals("3"))
        {
            //System.out.println("\f");
            menu.joinnow();
        }
        if(choice1.equals("6"))
        {
            System.out.println("\f");
            tylogo();
            System.out.println();
            System.out.println("              For using Netflix Services!");
            System.out.println();
            System.out.println();
            System.out.println();
            System.out.println();
            System.out.println("              ~Your friends at Netflix    ");
            System.exit(0);

        }
    }


    public static void tylogo()
    {
        System.out.println("  ________   __    __     ____        __      _    __   ___     __      __    ____     __    __ "); 
        System.out.println(" (___  ___) (  \\  /  )   (    )      /  \\    / )  () ) / __)    ) \\    / (   / __ \\    ) )  ( (  ");
        System.out.println("     ) )     \\ (__) /    / /\\ \\     / /\\ \\  / /   ( (_/ /        \\ \\  / /   / /  \\ \\  ( (    ) ) ");
        System.out.println("    ( (       ) __ (    ( (__) )    ) ) ) ) ) )   ()   (          \\ \\/ /   ( ()  () )  ) )  ( (  ");
        System.out.println("     ) )     ( (  ) )    )    (    ( ( ( ( ( (    () /\\ \\          \\  /    ( ()  () ) ( (    ) ) ");
        System.out.println("    ( (       ) )( (    /  /\\  \\   / /  \\ \\/ /    ( (  \\ \\          )(      \\ \\__/ /   ) \\__/ (  ");
        System.out.println("    /__\\     /_/  \\_\\  /__(  )__\\ (_/    \\__/     ()_)  \\_\\        /__\\      \\____/    \\______/  ");

    }


}






