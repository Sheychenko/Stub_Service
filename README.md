## REST API STUB 

This is a simple Spring Boot application designed as a stub REST API. The project includes basic functionalities for handling JSON requests and generating JSON responses with simulated random response times. Additionally, it provides an HTML interface for testing.

### Features

	•	Handles POST requests with JSON payloads.
	•	Parses incoming JSON into Java objects.
	•	Generates structured JSON responses including processing time.
	•	Includes an HTML form for submitting data and displaying results.

### How to Run the Project

Follow these steps to clone, build, and run the project.

Step 1: Run the JAR file:
Use the following command to start the application:
```
    java -jar demo-0.0.1-SNAPSHOT.jar
```
Step 2:
Access the application
	•	Open your browser and navigate to:
```
http://localhost:8090/
```

### How to Use the Application

#### Option 1: Test Using the HTML Interface

	•	Enter your data (e.g., Name and Age) in the provided form.
	•	Click the Send JSON button.
	•	The response will be displayed below the form.

#### Option 2: Test Using Curl
You can test the application by sending HTTP requests using cURL.

#### Sending a POST Request:
```
curl -X POST http://localhost:8090/api/process \
     -H "Content-Type: application/json" \
     -d '{"name": "John Doe", "age": 30}'
```

#### Example Response:
```
{
    "message": "Request processed successfully!",
    "originalName": "John Doe",
    "responseTime": 243
}
```
