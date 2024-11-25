- GET /companies 
  - \# get all companies
- GET /companies/{id}
  - \# get company by id
- GET /companies/{id}/employees
  - \# get all employee under a certain specific company
- GET /companies?page=1&size=5
  - \# page query get companies
- PUT /companies/{id}
  - \# update company by id
  - ``` 
    {
        "name": "",
        "employees": {
                        "name":"",
                        "age":20,
                         ...  
                     },
                     {
                        "name":"",
                        "age":20,
                         ...  
                     }
    }
    ```
- PUT /companies
  - \# create company
  - ``` 
    {
        "name": "",
        "employees": {
                        "name":"",
                        "age":20,
                         ...  
                     },
                     {
                        "name":"",
                        "age":20,
                         ...  
                     }
    }
    ```
- DELETE /companies/{id}
  - \# delete company by id