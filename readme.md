************Connection Service******************
This simple application, where two railroads are connected having origin and destination.which accept two parameters, Origin and destination in the URL.Each time, when we run the URL, the selected Origin and destination is with in the city.txt file. It will display  “YES” else “No”. I have written the Junit test Condition for pass and fail scenarios.  

# Connection between two raods Micro Service

  src\main\java\com\sampleproject\connection\demo\DemoApplication.java Run  as a Java Application.

## Resources

- http://localhost:8080/connected?origin=Boston&destination=Newark

```json
{
 yes
}
```

## Resources

- http://localhost:8080/connected?origin=Boston&destination=Texas

```json
{
 No
}

## Notes