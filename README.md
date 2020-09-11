# JWT demo

Demo of JWT authentication for an API

## Features
This is a list of currently implemented features
- [x] Protect an API with JWT authentication
- [ ] Base JWT token on actual login
- [ ] Integrate identity providers:
  - [ ] Google
  - [ ] LinkedIn
- [ ] Retrieve secrets from a key-vault

## How to

Needed (or alternatives):
* IntelliJ (any version)
* PostMan

Start the application:
* Start the application using IntelliJ IDE.
  * Import the project by opening the Maven POM file "as a project".
  * Right-click the class ```JwtDemoApplication```, then click "Run JwtDemoApplication"

The application should compile and start, with the console displaying the Spring ASCII-art and ending with ```Started JwtDemoApplication in 1.624 seconds (JVM running for 2.194)```

Test the application:
* Start PostMan
* Create a POST-request to ```http://localhost:8080/user```
* Add a body of type ```x-www-form-urlencoded``` with the following key-value pairs (no validation currently implemented):
  * user - foo
  * password - bar

This request should return a JSON with the provided user and a JWT Bearer token:
```json
{
    "user": "foo",
    "pwd": null,
    "token": "Bearer <JWT token>"
}
```

## Sources
Based on these blogs:
* [Token-based API](https://blog.softtek.com/en/token-based-api-authentication-with-spring-and-jwt) authentication with Spring and JWT by SoftTek
