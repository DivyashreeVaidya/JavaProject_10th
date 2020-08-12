import java.util.*;
public class submenu
{

    public static void myacc()
    {
        String choice4="",choice5="";
        Scanner in=new Scanner(System.in);
        System.out.println("\f");
        menu.logo();
        if(Index.cno[menu.a1]==0)
        {
            System.out.println("This page cannot be accessed since you have cancelled your membership.");
            System.out.println("Press Enter to return to the Main Menu and Create an account/Sign in again.");
            Index.ob.nextLine();
            Index.run();
        }
        else
        {
            //System.out.println("                             Welcome, "+Index.user[menu.a1]+" :)");

            do{
                System.out.println("\f");
                menu.logo();
                System.out.println("                             Welcome, "+Index.user[menu.a1]+" :)");
                System.out.println("      1.View Your Account Details");
                System.out.println("      2.Upgrade/Downgrade your Membership Plan");
                System.out.println("      3.View Your Library");
                System.out.println("      4.Cancel your Membership");
                System.out.println("      5.Go Back");
                System.out.println("      Enter Your Choice:");
                choice4=in.next();
                Index.b=Index.check(5,choice4);
            }while(Index.b==true);
            if(choice4.equals("1"))
            //switch(Index.choice)
            {
                //case "1":
                if(Index.cno[menu.a1]==0)
                {
                    System.out.println("This page cannot be accessed since you have cancelled your membership.");
                    System.out.println("Press Enter to return to the Main Menu and Create an account/Sign in again.");
                    Index.ob.nextLine();
                    Index.run();
                }
                else
                {
                    menu.logo();
                    System.out.println("                                 Welcome, "+Index.user[menu.a1]+" :)");
                    System.out.println();
                    System.out.println("               \fYour Account Details:");
                    System.out.println("  1.Username: "+Index.user[menu.a1]);
                    System.out.println("  2.Password: "+Index.pword[menu.a1]);
                    System.out.println("  3.Email Address: "+Index.email[menu.a1]);
                    System.out.println("  4.Contact No: "+Index.cno[menu.a1]);
                    System.out.println("  5.Membership Plan: "+Index.plan[(Index.uplan[menu.a1])]);
                    System.out.println("Press Enter to go back.");
                    Index.ob.nextLine();
                    myacc();
                }
            }
            //break;
            //}
            if(choice4.equals("2"))
            //
            //case 2:
            {
                System.out.println("\f");
                System.out.println();
                changemp();

                //break;
            }

            //}while(cmp!="yes"||cmp!="no");
            if(choice4.equals("3"))
            //{
            //case "3":
            {
                System.out.println("\f");
                System.out.println();
                viewlib();

            }
            //break;

            if(choice4.equals("4"))
            //case "4":
            {
                System.out.println("\f");
                System.out.println();
                cancelmship();

                //break;
            }
            if(choice4.equals("5"))
            //case "5":
            {
                System.out.println("\f");
                menu.accpage();
                //break;
            }
            /*default:
            System.out.println("Wrong Choice!");
            System.out.println("Press Enter to go back to the previous page.");
            Index.ob.nextLine();
            System.out.println("\f");
            menu.accpage();
            break;**/
        }

    }


    public static void Netcat()
    {
        if(Index.cno[menu.a1]==0)
        {
            System.out.println("This page cannot be accessed since you have cancelled your membership.");
            System.out.println("Press Enter to return to the Main Menu and Create an account/Sign in again.");
            Index.ob.nextLine();
            Index.run();
        }
        else
        {
            System.out.println("\f");
            Scanner in=new Scanner(System.in);
            menu.logo();
            System.out.println("                        Welcome to the Netflix Catalogue.");
            System.out.println("   You can view and add items to your Library here.");
            System.out.println("   To begin, choose your preference:");
            System.out.println("   1.TV shows");
            System.out.println("   2.Movies");
            System.out.println("   3.Kid's Section");
            System.out.println("   4.Return to the previous page");
            System.out.println("(Enter 1,2,3 or 4)");
            int C=in.nextInt();
            switch (C)
            {
                case 1:
                System.out.println("       T.V Shows:");
                System.out.println("   1.Suits");
                System.out.println("   2.Friends");
                System.out.println("   3.Prison Break");
                System.out.println("   4.House");
                System.out.println("   5.Modern Family");
                System.out.println("   6.How I Met Your Mother");
                System.out.println("   Enter your choice:(1,2,3,4,5 or 6)");
                String C2=in.next();
                if(C2.equals("1"))
                {
                    Index.lib[++Index.e]="Suits";
                }
                else if(C2.equals("2"))
                {
                    Index.lib[++Index.e]="Friends";
                }
                else if(C2.equals("3"))
                {
                    Index.lib[++Index.e]="Prison Break";
                }
                else if(C2.equals("4"))
                {
                    Index.lib[++Index.e]="House";
                }
                else if(C2.equals("5"))
                {
                    Index.lib[++Index.e]="Modern Family";
                }
                else if(C2.equals("6"))
                {
                    Index.lib[++Index.e]="How I Met Your Mother";
                }
                else
                {
                    Netcat();
                }
                System.out.println("Your choice: "+C2);
                System.out.println("Press Enter to go back to the previous page and make more selections.");
                Index.ob.nextLine();
                Netcat();
                break;
                case 2:
                System.out.println("         Movies:");
                System.out.println(" 1.Shutter Island");
                System.out.println(" 2.Harry Potter Series");
                System.out.println(" 3.Zootopia");
                System.out.println(" 4.Suicide Squad");
                System.out.println(" 5.Inception");
                System.out.println(" 6.Kung Fu Panda Series");
                System.out.println("   Enter your choice:(1,2,3,4,5 or 6)");
                String C3=in.next();
                if(C3.equals("1"))
                {
                    Index.lib[++Index.e]="Shutter Island";
                }
                else if(C3.equals("2"))
                {
                    Index.lib[++Index.e]="Harry Potter Series";
                }
                else if(C3.equals("3"))
                {
                    Index.lib[++Index.e]="Zootopia";
                }
                else if(C3.equals("4"))
                {
                    Index.lib[++Index.e]="Suicide Squad";
                }
                else if(C3.equals("5"))
                {
                    Index.lib[++Index.e]="Inception";
                }
                else if(C3.equals("6"))
                {
                    Index.lib[++Index.e]="Kung Fu Panda Series";
                }
                else
                {
                    Netcat();
                }
                System.out.println("Your choice: "+C3);
                System.out.println("Press Enter to go back to the previous page and make more selections.");
                Index.ob.nextLine();
                Netcat();
                break;
                case 3:
                System.out.println("         Kid's Section:");
                System.out.println(" 1.Scooby-Doo, Where Are You!");
                System.out.println(" 2.House Of Mouse");
                System.out.println(" 3.Dragon Tales");
                System.out.println(" 4.Doraemon");
                System.out.println(" 5.Spongebob Squarepants");
                System.out.println(" 6.Detective Conan");
                System.out.println("   Enter your choice:(1,2,3,4,5 or 6)");
                String C4=in.next();
                if(C4.equals("1"))
                {
                    Index.lib[++Index.e]="Scooby-Doo, Where Are You!";
                }
                else if(C4.equals("2"))
                {
                    Index.lib[++Index.e]="House Of Mouse";
                }
                else if(C4.equals("3"))
                {
                    Index.lib[++Index.e]="Dragon Tales";
                }
                else if(C4.equals("4"))
                {
                    Index.lib[++Index.e]="Doraemon";
                }
                else if(C4.equals("5"))
                {
                    Index.lib[++Index.e]="Spongebob Squarepants";
                }
                else if(C4.equals("6"))
                {
                    Index.lib[++Index.e]="Detective Conan";
                }
                else
                {
                    Netcat();
                }
                System.out.println("Your choice: "+C4);
                System.out.println("Press Enter to go back to the previous page and make more selections.");
                Index.ob.nextLine();
                Netcat();
                break;
                case 4:
                menu.accpage();
                default:
                Netcat();
            }
        }
    }

    public static void mybill()
    {
        //Index.m1=Index.monthcheck(Index.mt);
        if(Index.cno[menu.a1]==0)
        {
            System.out.println("This page cannot be accessed since you have cancelled your membership.");
            System.out.println("Press Enter to return to the Main Menu and Create an account/Sign in again.");
            Index.ob.nextLine();
            Index.run();
        }
        else
        {
            Scanner in=new Scanner(System.in);
            System.out.println("\f");
            menu.logo();
            System.out.println("                                 Welcome, "+Index.user[menu.a1]+" :)");
            System.out.println();
            System.out.println("  Your Bill:");
            System.out.println();

            System.out.println("  NETFLIX INC.******************"+Index.dt1+"/"+Index.M+"/"+Index.dt2);
            System.out.println("  Bill No:\t\t\t"+100010+Index.bl);++Index.bl;
            System.out.println("  Name:\t\t\t\t"+Index.user[menu.a1]);
            System.out.println("  Email Address:\t\t"+Index.email[menu.a1]);
            System.out.println("  Contact No:\t\t\t"+Index.cno[menu.a1]);
            System.out.println("  Membership Plan:\t\t"+Index.plan[(Index.uplan[menu.a1])]);
            //String m1=Index.monthcheck(Index.mt);
            System.out.println("  Next Bill Payment due date:\t"+Index.DT1+" "+Index.m1);
            System.out.println("  Bill Amount:\t\t\tRs."+Index.bill[menu.a1]);
            System.out.println("  Tax:[12%]:\t\t\tRs."+0.12*Index.bill[menu.a1]);
            System.out.println("  Grand total:\t\t\tRs."+(Index.bill[menu.a1]+0.12*Index.bill[menu.a1]));
            System.out.println("  Do you wish to pay your bill in advance?");
            System.out.println("(Enter 'yes' to pay, and 'no' to go back to the previous page.)");
            String bch=in.nextLine();
            if(bch.equalsIgnoreCase("yes"))
            {
                System.out.println();
                System.out.println("Your payment of Rs."+ (Index.bill[menu.a1]+0.12*Index.bill[menu.a1])+" has been successful.");
                Index.m1=Index.monthcheck(Index.m1);
                System.out.println("Press Enter to return to the previous page.");
                Index.ob.nextLine();
                menu.accpage();
            }
            else if(bch.equalsIgnoreCase("no"))
            {
                menu.accpage();
            }
            else
            {
                menu.accpage();
            }
        }
    }

    public static void changemp()
    {
        if(Index.cno[menu.a1]==0)
        {
            System.out.println("This page cannot be accessed since you have cancelled your membership.");
            System.out.println("Press Enter to return to the Main Menu and Create an account/Sign in again.");
            Index.ob.nextLine();
            Index.run();
        }
        else
        {
            String choice5="";
            Scanner in=new Scanner(System.in);
            System.out.println("   \fYour membership Plan: "+Index.plan[(Index.uplan[menu.a1])]);
            System.out.println();
            System.out.println("   View and compare Options:");
            System.out.println();
            System.out.println("	                                                1.BASIC\t\t2.STANDARD\t3.PREMIUM  ");
            System.out.println("Rates(Monthly)\t\t\t\t\t\tRs.500\t\tRs.650\t\tRs.800    ");
            System.out.println("HD available\t\t\t\t\t\tNo\t\tYes\t\tYes        ");
            System.out.println("Ultra HD available\t\t\t\t\tNo\t\tNo\t\tYes        ");  
            System.out.println("Screens you can watch on at the same time\t\t1\t\t2\t\t4          ");
            System.out.println("Watch on your laptop, TV, phone and tablet\t\tYes\t\tYes\t\tYes        ");	
            System.out.println("Unlimited movies and TV shows\t\t\t\tYes\t\tYes\t\tYes        ");
            System.out.println("Cancel anytime\t\t\t\t\t\tYes\t\tYes\t\tYes        ");
            System.out.println();

            System.out.println("Are you sure you want to continue and change your Membership Plan?");
            System.out.println("(Enter 'yes' to continue, 'no' to go back.)");
            String cmp=in.nextLine();
            if(cmp.equalsIgnoreCase("yes"))
            {
                do{System.out.println("Enter your choice:(1 for Basic, 2 for Standard and 3 for Premium)");
                    choice5=in.next();
                    Index.b=Index.check(3,choice5);}while(Index.b==true);
                System.out.println("Your choice: "+Index.z);
                if(Index.z==1)
                {
                    System.out.println("Your new membership plan is: Basic.");
                    Index.uplan[menu.a1]=0; 
                    Index.bill[menu.a1]=500;
                }

                else if(Index.z==2)
                {
                    System.out.println("Your new membership plan is: Standard.");
                    Index.uplan[menu.a1]=1;
                    Index.bill[menu.a1]=650;
                }
                else if(Index.z==3)
                {
                    System.out.println("Your new membership plan is: Premium.");
                    Index.uplan[menu.a1]=2;
                    Index.bill[menu.a1]=800;
                }
                System.out.println("Press Enter to go back to the previous page.");
                Index.ob.nextLine();
                myacc();
            }
            else if(cmp.equalsIgnoreCase("no"))
            {
                myacc();
            }
            else
                myacc();
        }
    }


    public static void viewlib()
    {
        if(Index.cno[menu.a1]==0)
        {
            System.out.println("This page cannot be accessed since you have cancelled your membership.");
            System.out.println("Press Enter to return to the Main Menu and Create an account/Sign in again.");
            Index.ob.nextLine();
            Index.run();
        }
        else
        {
            System.out.println("\f");
            menu.logo();
            System.out.println("                             Welcome, "+Index.user[menu.a1]+" :)");
            if(Index.e==-1)
            {
                System.out.println("Your Library is empty. Go to the 'Browse the Netflix Catalogue section'");
                System.out.println("to add titles to your library.");
                System.out.println();
                System.out.println("Press Enter to go back to the previous page.");
                Index.ob.nextLine();
                myacc();
            }
            else
            {
                System.out.println("\f");
                menu.logo();
                System.out.println("                             Welcome, "+Index.user[menu.a1]+" :)");
                System.out.println("Your Library:");
                do
                {
                    System.out.println(Index.lib[Index.e]);
                    Index.e--;
                }while(Index.e>=0);
                System.out.println();
                System.out.println("Press Enter to go back to the previous page.");
                Index.ob.nextLine();
                myacc();
            }
        }
    }


    public static void cancelmship()
    {
        if(Index.cno[menu.a1]==0)
        {
            System.out.println("This page cannot be accessed since you have already cancelled your membership.");
            System.out.println("Press Enter to return to the Main Menu and Create an account/Sign in again.");
            Index.ob.nextLine();
            Index.run();
        }
        else
        {
            Scanner in=new Scanner(System.in);
            System.out.println("          Are you sure you want to cancel your Netflix Membership?");
            System.out.println("  You will lose all the saved items from your library, your viewing history, and your monthly Newsletter subscription.");
            System.out.println("  You will not be charged for the month in which you have cancelled your Membership.");
            System.out.println("  Enter 'yes' to continue and cancel your Membership, or 'no' to go back to the previous page.");
            String canCh=in.nextLine();
            if(canCh.equalsIgnoreCase("yes"))
            {
                Index.user[menu.a1]=null;
                Index.pword[menu.a1]=null;
                Index.email[menu.a1]=null;
                Index.cno[menu.a1]=0;
                Index.uplan[menu.a1]=0;
                Index.cdno[menu.a1]=0;
                Index.cname[menu.a1]=null;
                Index.bill[menu.a1]=0;
                System.out.println("Your Membership has been successfully cancelled.");
                System.out.println("Press Enter to back to the previous page.");
                Index.ob.nextLine();
                myacc();
            }
            else if(canCh.equalsIgnoreCase("no"))
            {
                myacc();
            }
            else
                myacc();
        } } }
