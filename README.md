# Split Car
## A simple project for share your route on Kotlin MVVM + live com.globant.splitcar.data + room + firebase + clean architecture

### With Split Car you can get an economical trip in minutes.
### Split Car allows you to request a car at the touch of a button and be picked up by a friendly driver who will take you to your destination immediately. Get trips from our partners instead of taking a taxi or waiting for the bus and enjoy a cozy, affordable and memorable trip today!

### Split Car app is free, cheaper than a taxi, faster than the bus and easy to use. Travel to any place you want to go without the need for car rental services or find out bus routes: we will take you directly to your destination.

### Shared ride made easy
• Use Split Car, register, then simply open the application and request a ride.
• Your Split Car driver will be at your available location at the agreed time, ready to take you to your destination.
### Affordable transit
• Is there no money for the taxi or the bus? With Split Car: it's easy, fast and safe!
### Transportation you can trust
• All Split Car drivers are partner and checks before they are approved for service.
• Drivers are qualified by passengers.
### DRIVER PROFILE
### Why split car?
Flexible
### Happy passengers
The Split Car community is full of friendly people, passengers and drivers alike from our partners.
Keywords: Split Car, save the environment, Less traffic
### General objective:
Implement an application in Android Studio with Kotlin to share the travel routes of our partners.
### Specific objectives:
###
§ Officialize the use of shared route with ours partners
###
§ Raise awareness ours partners regarding the environment, less cars, better quality of life.
###
§ Increase security in night travel to homes, less robberies and less robberies.
###
§ Expand the use of collective economy.
###
§ Reduce transportation costs for our partners.
###
### Impact achieved or expected with this theme in the target population
### Be friendly to the environment, less cars less pollution
### Travel and join the users who chose Split Car instead of a taxi to travel, go out at night and get home safely. When you need a trip, skip the bus, taxi or car service and choose Split Car. Forget about the peak and license plate
### The use of Split Car simplifies heavy city traffic and provides a shared economy: use it now and make your next trip the best trip you have ever had.
### Technique or methodology used
### Programming in Android Studio
### KOTLIN Programming Language
### Android architecture components

#
![Alt Text](https://github.globant.com/storage/user/2520/files/0e71cc80-060a-11ea-8765-a75ba2a7d1d9)
#
![Alt Text](https://github.globant.com/storage/user/2520/files/d3ae9680-07b9-11ea-9314-6873c68559a8)
#
![Alt Text](https://github.globant.com/storage/user/2520/files/e65ee080-09f0-11ea-839d-a4cc8ed4f9f6)
#
![Alt Text](https://github.globant.com/storage/user/2520/files/11abba80-07ba-11ea-9076-a97c7903bbc6)  


## Use cases   
#  Make a Route  
![Alt Text](https://github.globant.com/storage/user/2520/files/7ed21b00-0615-11ea-9bed-3704dea37b08)
#  
#  Routes List        
![Alt Text](https://github.globant.com/storage/user/2520/files/cfe20f00-0615-11ea-8d79-071b4db7c4da)
#  
#  Detail    
![Alt Text](https://github.globant.com/storage/user/2520/files/9dd0ad00-0615-11ea-8f49-8c1d0ee2d432)
#    
  
    
      
## Class Diagram   
#  
![Alt Text](https://github.globant.com/storage/user/2520/files/28fd7300-0615-11ea-894b-1fd89ed0b788)
#  

## User Stories  
 
#
#
1. **Authentication with my Google account.**
<br />:walking: [Stakeholders] <br /> [driver, passenger] <br /> [Requirements] <br /> **_- I Want_** to be able to authenticate myself with my 
Google account, to enter the application in an easy and secure way.
#  
-Google Account enabled and working.
#  
<br /> [Restrictions] <br /> 
-Users don't want to authenticate or don't have a working Google Account.
#  
2. **List of available trips.**
<br />:walking: [Stakeholders] <br /> [driver, passenger] <br /> [Requirements] <br /> **_- I Want_** to see a list of trips, each trip must show 
the following fields: driver, origin, final destination, destination reference, time and available seats, to identify a trip of interest.
#  
**_- I Want_** to be able to identify on two different screens what trips are available and what trips are mine.
#  
[Restrictions]
#  
-Trips shown are only from the current day.
#  
-Trips will not be deleted from the database, it will be saved to keep the record of each of them.
#  
3. **Filter the locations where the trip will pass by.**
<br />:walking: [Stakeholders] <br /> [driver, passenger] <br /> [Requirements] <br /> **_- I Want_** to search for trips of my convenience that 
pass close to my destination, to join the trip.
#  
-I can type sites in a search text box.  
#  
[Restrictions]
#  
-List of trips will be filtered, each time the stakeholder types a letter; if the text box is empty, it will show all trips with a 10-item pagination.
#  
-Filter of trips is based on preloaded sites, these sites must be selected from a list.
#  
4. **Creation of the trip.**
<br />:walking: [Stakeholders] <br /> [driver] <br /> [Requirements] <br /> **_- I Want_** to create trips in an easy way, choose destination, choose the locations where I am going to pass with my trip, choose the time in an easy way, a meeting point with preloaded sites, and select the available seats.
#  
-**_- I Want_** to access to the previous trips.
#  
-**_- I Want_** a previous trip's  information to be preloaded.
#  
[Restrictions]
#  
-Destination is based on preloaded sites, these sites must be selected from a list.
#  
-Locations is based on preloaded sites, these sites must be selected from a list.
#  
-Drivers who have an active trip, cannot subscribe to any existing trip.
#  
-Drivers cannot have more than one active trip once.
#  
-Passengers cannot create trips until they complete the current trip.
#  
-Passengers cannot belong more than one trip once.
#  
5. **Enabled or Disbaled a trip.**
<br />:walking: [Stakeholders] <br /> [driver] <br /> [Requirements] <br /> **_I Want_** to enable or disable a trip, in List of my trips, just with the gesture swipe. 
#  
-When trip is disabled a notification will be sent to each passenger.
#  
6. **Join a trip.**
<br />:walking: [Stakeholders] <br /> [driver] <br /> [Requirements] <br /> **_I Want_** to be able to join a trip by selecting an available trip 
from the list in the main view.
#  
**_I Want_** to have the information of a selected trip with the following fields: owner, time, origin, destination, available seats, meeting place, 
destination references. 
#  
[Restrictions]
#  
-Passenger can't joined, if trip is not available.
#  
7. **Alarm close to departure time.**
<br />:walking: [Stakeholders] <br /> [driver] <br /> [Requirements] <br /> **_I Want_** to be notified within 15 minutes of departure time by sound 
and/or vibration to arrive punctually at the departure meeting point.

#  