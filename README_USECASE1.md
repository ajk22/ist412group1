Extra requirement for submission: 
Please include a README_USECASE1.txt file in your project submission.  
Inside this file write a short paragraph/few sentences that:
-explains at a high level what your use case is and 
-what your software should be able to accomplish with your completed use case.  

The first use case our group has done for this assignment is the viewing the park information.
Firstly, users need to type in correct account and password if they already have accounts.
Otherwise, they need to sign up an new account. Once they log in successfully, the main menu 
will be displayed by controller, and users can choose one button from the main menu. If users
want to learn some information about each park, including attractions, restaurants, shops, 
rides and their business hours, they can click the park information button. After users push the 
park information button, they need to pick one park first, and then, they can easily browse all 
basic information of that park. Additionally, all information is classified into attractions, 
restaurants, shop, and rides, so users can check details of anything that they are looking for,
 and the reset button is also created for users to refresh the page.

To Login, enter the "password123" as the password for any of the available usernames. 
After logging in, select "Park Information" from the main menu. From the Park Information menu,
a user can select a specific park to view information about. Within the menu for each park, users
can view all attractions or filter attractions based on their specific type. At each stage of the UIs, 
the user can exit out of the menus at anytime by selecting the exit button.

Changes for this assignment were made in the following classes:
engine.engine
engine.controller
engine.mainUI
engine.user
engine.attractionList
engine.attraction
login.loginUI
login.recovery
login.register
parkInfo.parkAttractionTableModel
parkInfo.parkEventTableModel
parkInfo.parkInfo
parkInfo.parkInfoController
parkInfo.parkInfoUI
parkInfo.parkRideTableModel
parkInfo.parkSelectUI
parkInfo.parkShopTableModel
parkInfo.parksList
