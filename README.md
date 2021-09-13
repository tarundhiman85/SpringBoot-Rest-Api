
# SpringBoot-Rest-Api

## Description of the Project 
I have created TrainingController on Controller package where I have handled saving training information @PostMapping and Getting all the information by @Get Mapping. I have used Hibernate ORM on spring boot you can change the properties on the application properties. I have given this JSON text to be checked on the postman client the information can be validated by changing the text, for example, center code exceeding 40 alphanumeric characters There is a separate entity for the Address and courses and I have used DTO and one to many mapping to save the information


## Deployment

Api can be checked at this url

```bash
   http://localhost:8080/api/training 
```

  ## JSON Api data to Post
  ```bash
 {
  "training": {
    "centerId": "2",
    "centerName": "Ambala",
    "contactEmail": "ambal@aabc.com",
    "contactPhone": "8572008222",
    "centerCode": "102423324222",
    "studentCapacity": 2,
    "addresses": [
      {
        "detailedAddress": "haryana",
        "city": "Ambala",
        "state": "Haryana",
        "pincode": "134202"
      }
    ],
    "courses": [
      {
        "courseId": 1,
        "courseName": "Java"
      }
    ]
  }
}
  ```
