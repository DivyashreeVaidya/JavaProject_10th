### Problem Definition
To create a project titled “Netflix” for a subscription service:
*	A Main menu with proper options, logo and date should be displayed.
*	Users should be able to access pages like About Us, FAQ and Contact Us for getting basic information about Netflix.
*	After selecting the sign in/ sign up option from the main menu, a question for confirmation should be asked, before entering the corresponding section-i.e.” Are you sure you want to sign in? Enter “yes” to continue, “no” to go back.”
*	Users should be able to create a new account, and sign in using an already existing/newly-created account.
*	Subscription service should get activated on the day of registration of the account.
*	While creating an account, if the entered username is already taken, an appropriate message should be displayed.
*	After the creation of an account, users should be notified about their account details, bill amount and next bill payment due date.
*	While signing in, if an incorrect username/password is entered, an appropriate message should be displayed.
*	After signing in, a welcome message should be displayed on the Main Account page, and the members should be able to access and manage their account through that page.
*	A section should be created which enables users to browse through a catalogue, select titles from the options available and add them to their library.
*	Users should be able to view their library and add more titles anytime.
*	An option to change membership plan should be made available- so that users can conveniently change the plan as per their suited price. [For e.g.: To change membership plan from Premium(Rs.800) to Standard(Rs.650).]
*	In case the user wishes to discontinue his/her membership, an option for cancelling the membership should also be made available. After cancelling membership, no other page (except for the main menu) should be made accessible.
*	Members should be able to view and access their account details through a separate menu option anytime, in case they forget their Log-in details.
*	There should be an option to go back to the Previous Page on every menu.
*	In case the user enters an invalid input (For e.g. Entering “9” when there are only 7 options, or entering “abc” when only numbers are accepted); an appropriate error message should be displayed and the user should be made to enter the input again.
*	An Appropriate Bill should be displayed (through a View Current Bill Status option), displaying the next month’s date as the Next bill payment due date. The user should be given an option to pay the bill in advance. In case the user pays the bill in advance, the month after the next month’s date should be displayed, for the next billing cycle.
*	The Bill should contain all customer details, the date in proper format, total price inclusive of tax, and the bill number among other things.
*	Every new bill (after payment has been made in advance) should display a new bill number, and the changed Next Bill payment due date.
*	At the end, after selecting the “Exit” option, an appropriate “Thank You” message should be displayed. 

### Synopsis
The project titled “Netflix” is based on the world’s leading subscription and Video-streaming service of the same name. Users can subscribe and create their own account, browse through a plethora of Movie/T. V show options available and add titles to their library. They will be billed once per month, on the date of their original registration. Members can change their membership plan anytime, and can also cancel their membership anytime. 
####The package Netflix-CA Project consists of 3 classes: 
#### 1.Index 2. menu and 3. submenu
Each class consists of the following methods:
1.Index:
a)	main method-Initializes all static data members, and executes the run() method.
b)	check()- Checks whether the input entered by the user is correct or not; for validation of the input. For eg: If there are 7 menu options, and the user enters “8”, relevant message is displayed.
c)	monthcheck()-If the user pays the bill in advance, this method receives the current month from the mybill() method of submenu class (through pass by value), and then returns the next month, to be displayed on the bill for the next bill cycle.
d)	tylogo()-Contains the “Thank You” logo, to be displayed on entering Menu option 6[Exit option]. 
e)	run()-Displays the first page (Main Menu) of the program, enabling the user to execute any of the following options:
1.About Us(Displays information about Netflix)
2.Sign in(Enables the user to sign in through an already existing account, and access the Main account page.)
3.Join now(Enables the user to create an account in 3 simple steps)
4.FAQ(Displays Netflix’s FAQ page; part of Netflix Help Centre)
5.Contact Us(Displays the Netflix customer care contact no and email id; part of Netflix Help Centre)
6.Exit(To exit the program)
2.menu:
a)	about us()-Contains the About Us article to be displayed on entering Menu option 1.
b)	logo()-Contains the “NETFLIX” logo, to be displayed in the beginning of every page.
c)	FAQ()-Contains the FAQ article to be displayed on entering Menu option 4.
d)	contactus()-Contains the Netflix Help Centre: Contact Us article to be displayed on entering Menu option 5.
e)	FAQlogo()-Contains the “FAQ” logo to be displayed at the beginning of the FAQ page.
f)	signinlogo()-Contains the “Sign In” logo to be displayed on the “Sign in” page, which is accessed by entering the 2nd option from the Main menu .
g)	joinnowlogo()-Contains the “Sign Up” logo to be displayed on the “Sign Up” page, which is accessed by entering the 3rd  option from the Main menu .
h)	joinnow()- This method is used for creating a new account, by following 3 steps:
              i)Step 1:Entering details(Username, password, email id and contact no.)
              ii)Step 2:Choosing Membership plan(Basic,Standard or Premium)
              iii)Step 3:Entering Credit card details  
i)	signin()-This method enables the user to Sign-into their account, and access the Main Account page by entering the correct Log-in details. It also checks whether the log-in details entered are correct, and displays a corresponding message if the log-in details entered are incorrect or do not match.
j)	accpage()-This method displays the Main Account page of the user, and enables him/her to access either of the following pages through the menu displayed:
1.Manage Your Account[redirects user to myacc() method]
2.Browse through the Netflix catalogue[displays Netflix catalogue and enables the user to add titles to his/her library]
3.View current Bill Status[displays Bill for the current month]
4.Main Menu[redirects user back to the run() method, i.e. to the Main Menu]

3.submenu:
a)	myacc()-This method enables the user to manage his/her account, through the following Menu options:
1.View Your Account Details[displays account details]
2.Upgrade/Downgrade Your Membership plan[enables user to change current membership plan to Basic, Standard or Premium]
3.View Your Library[displays the user’s library; shows empty if no titles have been added]
4.Cancel Membership[enables user to cancel his/her membership]
5.Go back[redirects user back to the accpage() method, i.e. the previous page(Main Account page.)]
b)	Netcat()-Displays the Netflix catalogue, and enables the user to add titles to his/her library from 3 options:
1.TV Shows
2.Movies
3.Kid’s shows
c)	mybill()-Displays the bill for the current month, giving the user an option to pay the bill in advance. If the user enters “yes”, bill payment is made and the new bill will now show the bill for the next month.
d)	changemp()-Displays the user’s current membership plan, along with the Comparison Chart for all the three membership plans. The user can select either 1,2, or 3 and the Membership plan will get updated.
e)	viewlib()-Displays the user’s library, as per the selections made by the user in the Netflix Catalogue.


f)	cancelmship()-This method enables the user to cancel his/her membership.
After asking for confirmation, the cancellation message is displayed. The user cannot access any other Main Account page now, but can directly access the Main Menu, to create a new account.  

The sequential flow of the project has been given in the picture below:
![Sequential project flow](/netflix_seq.png)

#### Java Concepts used
*	Array: It is a structure created in the memory to represent a similar type of data items using a single variable.
*	Break statement: Used to terminate the program when the condition is satisfied.
*	Dynamic Binding: The process of linking the function call with the function signature during the execution of the program.
*	Encapsulation: The wrapping up of data and function together into a single unit is called as Encapsulation.
*	Loops: A repetitive structure used in a program to operate statement for a given number of times
1.Do-while loop
2.For-loop

*	Nested loops: A loop within a loop
*	New operator: Used for dynamic allocation of an object.
*	Static Data Member: An instant variable, which is global in the class and used commonly by all the objects of that class type.
*	Switch case:It is a multiple branching statement, which is used to perform a particular task out of a number of actions depending upon a switch value.
*	Library package java.util—
                               

                                             1.Scanner class
                                             2.Date class
*	System.exit(0): To exit the program
*	Escape sequences: “\f”: formfeed
*	Composite reference
*	String functions:1.equalsIgnoreCase()
                             2.substring()
                             3.Integer.valueOf(String)
*	Conditional branching: Bi-directional branching statements:-
1.if statement
2.if and only if statement(multiple use of if)
3.if-else statement
4.if-else-if statement
5.nested if statement

### Output Screenshots(terminal window display)

Entering 1 for viewing the “About Us” page
![screenshot](/n1.png)

Netflix~ “About Us”
![screenshot](/n2.png)
Entering 4 for viewing the “FAQ” page
![screenshot](/n3.png)
The “FAQ” page  
![screenshot](/n4.png)
Entering 5 for viewing the “Contact Us” page
![screenshot](/n5.png)

Netflix Help Centre ~ Contact Us 
![screenshot](/n6.png)
 
Entering 3 for Signing Up and Creating a New Account
![screenshot](/n7.png)


Message displayed for confirming the creation of a new account 
![screenshot](/n8.png)

Signing Up Step 1: Entering Personal Details
![screenshot](/n9.png)
Signing Up Step 2: Choosing Membership Plan
![screenshot](/n10.png)

 
 
Signing Up Step 3: Entering Card Details; Creation of a New Account
![screenshot](/n11.png)
Entering 2 from the Main Menu, to Sign Into the newly-created account
 ![screenshot](/n12.png)
 
Message displayed for confirmation of Signing in
![screenshot](/n13.png)
 
Signing in Case 1: Incorrect Login information entered 
![screenshot](/n14.png)
Corresponding message displayed for entering incorrect Login-information
![screenshot](/n15.png)

Signing in Case 2: Correct Login information entered 
![screenshot](/n16.png)



After signing in, Main Account page displayed – Entering choice 1 to Manage Account
![screenshot](/n17.png)
 
“Manage Your Account” menu – Entering 1 to view account details
![screenshot](/n18.png)
 

Viewing account details
![screenshot](/n19.png)
 
Entering 2 from the “Manage Your Account” Menu – To Upgrade/Downgrade Membership plan
![screenshot](/n20.png) 
 
Changing Membership Plan from Premium to Standard
![screenshot](/n21.png)

 
Entering 1 again from the “Manage Your Account” Menu to view the changed account details (Changed Membership Plan)
![screenshot](/n22.png)
 
 
Changed Membership Plan in Account Details – From Premium to Standard
![screenshot](/n23.png)

 
Entering 3 from the “Manage your Account” Menu to view library
![screenshot](/n24.png)



 
Empty Library – Since no titles have been added so far
![screenshot](/n25.png)
 
Entering 5 to back to the Main Account page – To add titles to the library
![screenshot](/n26.png)


Entering 2 from the Main Account page menu to add titles to the library from the Netflix Catalogue
![screenshot](/n27.png)

Adding titles: TV Shows: “House”
![screenshot](/n28.png)



Adding titles: Movies: “Inception”
![screenshot](/n29.png)



Adding titles: Kid’s Shows: “Detective Conan”
![screenshot](/n30.png)



Adding titles: TV shows: “Friends”
![screenshot](/n31.png)
 
Adding titles: Movies: “Harry Potter Series”
![screenshot](/n32.png)

Adding titles: Kid’s Shows: “Scooby-Doo, Where Are You!”
![screenshot](/n33.png)

 
Entering 4 to return to the previous Main Account page menu
![screenshot](/n34.png)

 Entering 1 to View Library through “Manage Your Account” option
 
![screenshot](/n35.png)


Entering 3 to View Library after adding titles
![screenshot](/n36.png)

Viewing library after adding titles
   
![screenshot](/n37.png)

      Entering 5 to go back to the Main Account page menu to check Bill Status

![screenshot](/n38.png)

      Entering 3 to view current Bill Status

![screenshot](/n39.png)

      Bill Displayed – Along with Next payment due date (Monthly Charged),
      Bill paid in advance
![screenshot](/n40.png)

      Entering 3 to view Bill Status again – To check the change in Next bill payment     due date
     (Since Bill is already paid in advance, Next bill payment due date should change from 21 Dec to 21 Jan)
![screenshot](/n41.png)

i)Bill no changed from 1000100 to 1000101,
ii)Next Bill Payment due date – Changed from 21 Dec to 21 Jan (Since Bill for 21 Dec has already been paid in advance)

![screenshot](/n42.png)

    Entering 1 to go to “Manage Your Account” section, to Cancel Membership

![screenshot](/n43.png)

    
    Entering 4 to Cancel Membership
      
![screenshot](/n44.png)

Message displayed for Confirmation of Cancellation – 
Membership Cancelled

![screenshot](/n45.png)


Previous page (Manage Your Account menu) and all other pages inaccessible – Since Membership has been cancelled 

![screenshot](/n46.png)

After going through all Main Menu options, entering the last one (6)– to Exit

![screenshot](/n47.png)

“Thank You” message displayed at the end
![screenshot](/n48.png)

#### References
*	Headings and Logos for displaying output: Text to ASCII converter – Patorjk.com
*   Content of the project (About Us, FAQ, Membership Plan options etc.):
Netflix.com and media.netflix.com (Official Netflix Website.)

























 


 

