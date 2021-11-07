Michael Cao
Group 1

M03-A03 Implemented Design Patterns:

Object Oriented Pattern: Abstract Factory
- Package: parkinfo, planning, transactions
- Classes: parkInfoController, planningController, transactionsController
- Comments: This abstract factory pattern is achieved through the controller
class in multiple packages that is able to pass custom information into the UI
classes in the packages, thereby acting as a factory that allows us to create
multiple customized instances of the specific classes with information tailored
specifically to the logged in user.

User Interface Design Pattern: Onboarding
- Package: login
- Classes: onboardingUI
- Comments: This Onboarding pattern is used to gather data about the user 
when they first begin using the application. This will walk the user through
a step by step process to sign up for the app and enter relevant information
that allows us to customize their experience.