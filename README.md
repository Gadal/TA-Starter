# TA-Starter

CSC 302: Teaching Assistant Registration System

(This project is currently a work in progress.)

This repository provides a sample application that can be used as a starting point for your group's teaching assistant registration system (TARS) modules.

For those who will be doing backend work, you can implement the interface that will be specified here in api.yaml, and your work will be interoperable with your classmates'.

For those who will be doing frontend work, you can consume the interface specified in api.yaml, and hit this reference implementation to populate your view.

Any updates to this implementation will follow the semantic versioning conventions:
http://semver.org/

## Starting the Application

Clone the project

Install Eclipse

Load the project into an Eclipse Workspace. 
Eclipse speak: load as "existing maven project" by importing directory containing pom.xml file.

Run it (F11)

You will be able to query localhost:8080 and get the sample data out of applicants.csv

###Example:

```
curl -get http://localhost:8080/applicant?name=Doe
```

Returns (as of v0.1.0):
```
[
   {
      "studentNumber":"000000000",
      "names":[
         "Jane",
         "Doe"
      ],
      "phoneNumber":"(416) 000-0000",
      "department":"ECE",
      "program":"BSC",
      "year":"2",
      "workStatus":"Eligible",
      "workStatusExplanation":"",
      "applicationDate":"20170101"
   },
   {
      "studentNumber":"000000001",
      "names":[
         "John",
         "Doe"
      ],
      "phoneNumber":"(416) 000-0001",
      "department":"CSC",
      "program":"BSC",
      "year":"1",
      "workStatus":"Eligible",
      "workStatusExplanation":"",
      "applicationDate":"20170101"
   }
]
```
