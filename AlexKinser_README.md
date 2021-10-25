Alex Kinser
Group 1

M03-A03 Implemented Design Patterns:

Object Oriented Pattern: Iterator
    -Package: engine, data (parkInfo.txt & users.txt)
    -Classes: engine, controller
    -Other classes affected (to String): admin, attraction, 
    event, restaurant, ride, shop, user, vacationer, worker
    -Comments: This Iterator pattern reads and iterates through the data files
    in order to correctly identify the proper object to create, and then add
    that specific object to either the user list or attraction list 

User Interface Design Pattern: Search Filters
    -Package: admin, engine, data(users.txt)
    -Classes: attractionDataUI, adminController, rideTableMode, attractionTableModel, mainUI, controller
    -Comments: This Search Filter pattern is used to filter the ride's
    from the rest of the other attractions that are at the park. This
    pattern utilize two different table models found in the admin package