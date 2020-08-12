import java.util.*;
public class menu
{
    static Date sc=new Date();
    static int a1=-1;
    public static void aboutus()
    {
        System.out.println();
        System.out.println("       Welcome to Netflix! We are a subscription service that provides our members with access to movies and TV shows");
        System.out.println("  streamed over the Internet to certain Internet-connected TVs, computers and other devices ['Netflix ready devices']."); 
        System.out.println("  Our service also provides recommendations, reviews and other information regarding these movies and TV shows.");

        System.out.println("  Netflix has been leading the way for digital content since 1997.");
        System.out.println("  It is the world’s leading Internet television network with over 83 million members in over 190 countries enjoying");
        System.out.println("  more than 125 million hours of TV shows and movies per day, including original series, documentaries and feature films."); 
        System.out.println("  Members can watch as much as they want, anytime, anywhere, on nearly any Internet-connected screen. Members can play, pause");
        System.out.println("  and resume watching, all without commercials or commitments.");
    }


    public static void logo()
    {

        System.out.println("                 _        _______ _________ _______  _       _________         ");
        System.out.println("                ( (    /|(  ____ \\\\__   __/(  ____ \\( \\      \\__   __/|\\     /|");
        System.out.println("                |  \\  ( || (    \\/   ) (   | (    \\/| (         ) (   ( \\   / )");
        System.out.println("                |   \\ | || (__       | |   | (__    | |         | |    \\ (_) / ");
        System.out.println("                | (\\ \\) ||  __)      | |   |  __)   | |         | |     ) _ (  ");
        System.out.println("                | | \\   || (         | |   | (      | |         | |    / ( ) \\ ");
        System.out.println("                | )  \\  || (____/\\   | |   | )      | (____/\\___) (___( /   \\ )");
        System.out.println("                |/    )_)(_______/   )_(   |/       (_______/\\_______/|/     \\|");                                                                                                                                          
    }


    public static void FAQ()
    {
        FAQlogo();
        System.out.println("       Welcome to the Netflix Help Centre. Here are some of the questions frequently asked by our users:");
        System.out.println();
        System.out.println("   1.How does the Netflix Billing System Work?");
        System.out.println(  "=> If you choose to remain a member of Netflix, you'll be billed once per month on the date that you originally signed up.");
        System.out.println();
        System.out.println("   2.What can I use to stream Netflix?");
        System.out.println(  "=> You can watch instantly from any Internet-connected device that offers the Netflix app, such as a smart TV,");
        System.out.println(  "game console, streaming player, phone or tablet.You can also watch it on your computer!");
        System.out.println();
        System.out.println("  3.Can I stream Netflix in High Definition?");
        System.out.println(  "=> Yes! Many Netflix titles are available in High Definition (HD) and even Ultra High Definition (UHD). The picture quality"); 
        System.out.println("while streaming movies and TV shows may vary from computer to computer and device to device. Picture quality may be affected by a variety of other");
        System.out.println("factors, such as your location, the bandwidth available through and/or speed of your Internet connection.");
        System.out.println();
        System.out.println("  4.How many devices can I use Netflix on at the same time?");
        System.out.println(  "=> The number of devices that may be allowed to instantly watch simultaneously will depend on your membership plan."); 
        System.out.println("To see the details of your membership plan, Sign In from the Main Menu and refer to the 'Manage Your account' section.");
        System.out.println();
        System.out.println("  5.System Requirements: How fast does my Internet need to be?");
        System.out.println("=>The minimum required connection speed is 0.5 megabits per second, but you may want a faster connection for improved video quality."); 
        System.out.println();
        System.out.println(  "If your queries are still not answered, you can always refer to the 'Contact Us' Section from the Main Menu. :)");
    }


    public static void contactus()
    {
        logo();
        System.out.println("          Welcome to the Netflix Help Centre. You can contact us through:");
        System.out.println();
        System.out.println("  1.Netflix Customer Service Helpline:");
        System.out.println("  => 1800 263 4415");
        System.out.println("  2.Email:");
        System.out.println("  =>customercare_support@netflix.com");
    }


    public static void FAQlogo()
    {
        System.out.println("                           _________    ____       ____     ");
        System.out.println("                          (_   _____)  (    )     / __ \\    ");
        System.out.println("                           ) (___      / /\\ \\    / /  \\ \\   ");
        System.out.println("                          (   ___)    ( (__) )  ( (    ) )  ");
        System.out.println("                           ) (         )    (   ( (  /\\) )  ");
        System.out.println("                          (   )       /  /\\  \\   \\ \\_\\ \\/   ");
        System.out.println("                           \\_/       /__(  )__\\   \\___\\ \\__  ");
        System.out.println("                                                         \\__) ");

    }


    public static void signinlogo()
    {
        System.out.println("                     _____    _____      _____       __      _       _____      __      _  ");
        System.out.println("                    / ____\\  (_   _)    / ___ \\     /  \\    / )     (_   _)    /  \\    / "); 
        System.out.println("                   ( (___      | |     / /   \\_)   / /\\ \\  / /        | |     / /\\ \\  / / "); 
        System.out.println("                    \\___ \\     | |    ( (  ____    ) ) ) ) ) )        | |     ) ) ) ) ) )  ");
        System.out.println("                        ) )    | |    ( ( (__  )  ( ( ( ( ( (         | |    ( ( ( ( ( (   ");
        System.out.println("                    ___/ /    _| |__   \\ \\__/ /   / /  \\ \\/ /        _| |__  / /  \\ \\/ /");   
        System.out.println("                   /____/    /_____(    \\____/   (_/    \\__/        /_____( (_/    \\__/    ");

    }


    public static void joinnowlogo()
    {
        System.out.println("            _____    _____      _____       __      _      __    __   _____        ");
        System.out.println("           / ____\\  (_   _)    / ___ \\     /  \\    / )     ) )  ( (  (  __ \\   ");
        System.out.println("          ( (___      | |     / /   \\_)   / /\\ \\  / /     ( (    ) )  ) )_) )   ");
        System.out.println("           \\___ \\     | |    ( (  ____    ) ) ) ) ) )      ) )  ( (  (  ___/     ");
        System.out.println("               ) )    | |    ( ( (__  )  ( ( ( ( ( (      ( (    ) )  ) )          ");
        System.out.println("           ___/ /    _| |__   \\ \\__/ /   / /  \\ \\/ /       ) \\__/ (  ( (      ");
        System.out.println("          /____/    /_____(    \\____/   (_/    \\__/        \\______/  /__\\      ");

    }


    public static void joinnow()
    {
        System.out.println("\f");
        Scanner in=new Scanner(System.in);
        Index.dt=sc.toString();
        Index.dt1=Index.dt.substring(8,11);
        joinnowlogo();
        System.out.println("Are you sure you want to create a new account?");
        System.out.println("(Enter: 'yes' to continue/'no' to go back to the Main Menu)");
        String ar=in.nextLine();
        if(ar.equalsIgnoreCase("yes"))
        {
            System.out.println("\f");
            joinnowlogo();
            String st;
            System.out.println("Create your Netflix Account in 3 Simple Steps:");
            System.out.println("Step 1: Provide us with your details:");
            loop1:
            do
            {
                System.out.println("Enter your Username:");
                st=in.nextLine();
                for(int i=0;i<=Index.index;i++)
                {   
                    if(st.equalsIgnoreCase(Index.user[i]))
                    {
                        System.out.println("Sorry!This username has already been taken. Try out another one!");
                        Index.ob.nextLine();
                        System.out.println("\f");
                        joinnowlogo();
                        System.out.println("Create your Netflix Account in 3 Simple Steps:");
                        System.out.println("Step 1: Provide us with your details:");
                        continue loop1;
                    }
                }
                break;
            }while(true);
            System.out.println("Enter your password:");
            String st1=in.nextLine();
            System.out.println("Enter your Email Address:");
            String st2=in.nextLine();
            System.out.println("Enter your contact no:");
            long st3=in.nextLong();
            if(st3==0)
            {
                System.out.println("Sorry! Invalid Contact no. Please try again.");
                System.out.println("Press Enter to continue.");
                Index.ob.nextLine();
                joinnow();
            }
            else
            {
            Index.user[++Index.index]=st;
            Index.pword[Index.index]=st1;
            Index.email[Index.index]=st2;
            Index.cno[Index.index]=st3;
            System.out.println("Press Enter to proceed to the next step.");
            Index.ob.nextLine();
            do{
                System.out.println("\f");
                joinnowlogo();
                System.out.println("Step 2: Choose your Plan:");
                System.out.println("	                                                1.BASIC\t\t2.STANDARD\t3.PREMIUM  ");
                System.out.println("Rates(Monthly)\t\t\t\t\t\tRs.500\t\tRs.650\t\tRs.800    ");
                System.out.println("HD available\t\t\t\t\t\tNo\t\tYes\t\tYes        ");
                System.out.println("Ultra HD available\t\t\t\t\tNo\t\tNo\t\tYes        ");  
                System.out.println("Screens you can watch on at the same time\t\t1\t\t2\t\t4          ");
                System.out.println("Watch on your laptop, TV, phone and tablet\t\tYes\t\tYes\t\tYes        ");	
                System.out.println("Unlimited movies and TV shows\t\t\t\tYes\t\tYes\t\tYes        ");
                System.out.println("Cancel anytime\t\t\t\t\t\tYes\t\tYes\t\tYes        ");
                //System.out.println("First month free			                              Yes               Yes                  Yes        ");
                System.out.println("Enter your choice:(1 for Basic, 2 for Standard and 3 for Premium)");
                String choice2=in.next();
                Index.b=Index.check(3,choice2);
            }while(Index.b==true);
            System.out.println("Your choice: "+Index.z);
            if(Index.z==1)
            {
                System.out.println("Your membership plan is: Basic.");
                Index.uplan[Index.index]=0; 
                Index.bill[Index.index]=500;
            }

            else if(Index.z==2)
            {
                System.out.println("Your membership plan is: Standard.");
                Index.uplan[Index.index]=1;
                Index.bill[Index.index]=650;
            }
            else if(Index.z==3)
            {
                System.out.println("Your membership plan is: Premium.");
                Index.uplan[Index.index]=2;
                Index.bill[Index.index]=800;
            }
            System.out.println("Press Enter to proceed to the next step.");    
            Index.ob.nextLine();
            System.out.println("\f");
            joinnowlogo();
            System.out.println("Step 3:Enter your card details:");
            System.out.println("Enter your name:(First name only, as it appears on your Credit/Debit Card)");
            Index.cname[Index.index]=in.next();
            System.out.println("Enter your Credit/Debit Card Number:");
            Index.cdno[Index.index]=in.nextLong();
            System.out.println("Congratulations on your newly acquired Netflix-Membership!");
            System.out.println("You are now a successfully registered user as of "+Index.dt1+"/"+Index.M+"/"+Index.dt2+" :D");
            System.out.println("Henceforth, you will be billed Rs."+Index.bill[Index.index]+" once per month, on the "+Index.dt1+" of each month.");
            System.out.println("If you wish to pay the bill in advance, you can do so through the 'View Current Bill Status' option after signing in.");
            System.out.println("Press Enter to go back to the Main Menu and continue with your Netflix Browsing");
            System.out.println("through the 'Sign in' section.");
            Index.ob.nextLine();
            Index.run();
         }
        }
        else if(ar.equalsIgnoreCase("no"))
        {
            Index.run();
        }
        else
        {
            System.out.println("\f");
            joinnow();
        }
    }


    public static void signin()
    {
        System.out.println("\f");
        Scanner in=new Scanner(System.in);
        Index.dt=sc.toString();
        signinlogo();
        System.out.println("Are you sure you want to Sign In?");
        System.out.println("(Enter: 'yes' to continue/'no' to go back to the Main Menu)");
        String ar1=in.nextLine();
        if(ar1.equalsIgnoreCase("yes"))
        {
            System.out.println("\f");
            signinlogo();
            System.out.println("Enter Your Username:");
            String k1=in.nextLine();
            System.out.println("Enter Your Password:");
            String k2=in.nextLine();
            //int a1=-1;
            for(int i=0;i<=Index.index;i++)
            {
                if(k1.equalsIgnoreCase(Index.user[i])&& k2.equalsIgnoreCase(Index.pword[i]))
                {
                    a1=i;
                    break;
                }
            }

            if(a1>=0)
            {
                accpage();
            }
            else
            {
                System.out.println("\f");
                signinlogo();
                System.out.println("Sorry! The Username and Password you entered did not match.");
                System.out.println("Please Try Again!");
                System.out.println("Enter 1 to continue, and 0 to go back to the Main Menu.");
                System.out.println("Enter Your Choice:");
                String ch1=in.next();
                if(ch1.equals("1"))
                {
                    System.out.println("\f");
                    signin();
                }
                else if(ch1.equals("0"))
                {
                    Index.run();
                }
                else
                {
                    System.out.println("\f");
                    signin();
                }
            }
        }
        else if(ar1.equalsIgnoreCase("no"))
        {
            Index.run();
        }
        else
        {
            System.out.println("\f");
            signin();
        }
    }
    public static void accpage()
    {
        Scanner in=new Scanner(System.in);
        String choice3="";
        /*System.out.println("\f");
        logo();
        System.out.println();
        System.out.println("                             Welcome, "+Index.user[a1]+" :)");**/

        do{
            System.out.println("\f");
            logo();
            System.out.println();
            System.out.println("                             Welcome, "+Index.user[a1]+" :)");
            System.out.println("      1.Manage Your Account");
            System.out.println("      2.Browse through the Netflix Catalogue");
            System.out.println("      3.View Current Bill Status");
            System.out.println("      4.Main Menu");
            System.out.println("      Enter Your Choice:");
            choice3=in.next();
            Index.b=Index.check(4,choice3);
        }while(Index.b==true);
        if(choice3.equals("1"))
        {
            submenu.myacc();
        }
        if(choice3.equals("2"))
        {
            submenu.Netcat();
        }
        if(choice3.equals("3"))
        {
            submenu.mybill();
        }
        if(choice3.equals("4"))
        {
            Index.run();
        }

    }
}




