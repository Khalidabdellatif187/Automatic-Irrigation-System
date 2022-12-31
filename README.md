# Automatic-Irrigation-System

# Objective
It is a simple automatic airrigation system of plots of lands need to be irrigated automatically </br>
By sending a signls to a sensor and sensor will recieve the request and irrigation start  </br>
we will make crud operations of plots of lands and their time slots (start,Duration of irrigation and end of irrigation) 


# installation
1-Initialize new Springboot project from springinitializer </br>
2-you can clone project from this link #https://github.com/Khalidabdellatif187/Automatic-Irrigation-System.git then import  </br>
repo from your machine </br>
3-Install mysql workbench connection then connect to it </br>
      1-3 create your database irrigation_system </br>
      2-3 you can make springboot create table by using <strong> #ddlauto </strong> </br> 
  if you don't </br>
  write these statements in your script </br>
  <strong> create table details(  </br>
  id Int primary key Auto Increment ,   </br>
  crop Varchar(256) ,    </br>
  area Varchar (256) ,    </br>
  water_amount Varchar(256)  </br>
 );
 </strong>
 
</br></br>

# Rest-Api Operations
You can make operations on a tool like postman  </br>
</br> Let's use postman </br> 
<strong> http://localhost:8080/api/plots </strong>  to get list of all plots and their details  <strong>You must make request GET in postman </strong>  </br>
<strong> http://localhost:8080/api/plots/id </strong>  to get one plot of land and its details  <strong>You must make request GET in postman </strong>  </br>
<strong> http://localhost:8080/api/save/plots </strong>  to save one plot of land and its details in database <strong>You must make request POST in postman </strong>  </br>
<strong> http://localhost:8080/api/update/plots/id </strong>  to update one plot of land and its details in database <strong>You must make request PUT in postman </strong>  </br>
<strong> http://localhost:8080/api/delete/plots/id </strong>  to delete one plot of land and its details from database <strong>You must make request DELETE in postman </strong>  </br> </br>


# Sensor 
I will tell you how the code of Sensor class work </br></br>
First : we must check if the sensor is a vailable or not and we assume that is available </br>
If the sensor is not available we send a response message that the sensor not found </br> </br>

Second : Sensor will check if the plots of land exist in Rest-Api and if they are existed </br></br>
Sensor will start irrigation of land at specific time of the day </br></br>
note : the duration of irrigation is <strong> five seconds </strong>  </br></br>
after end of irrigation sensor will send a message that the irrigation is finished at a specific time </br></br>
The operation will work for the same steps at specific times of the day </br></br>

# Unit Testing : 

The application provide unit testing for (get,save and update) operations









 
 
 
 
 
