# Spring Boot configuration properties bug demo
A sample application to demonstrate the bug described in [SB-6240](https://github.com/spring-projects/spring-boot/issues/6240)
To observe the bug simply run application:
```
./gradlew run
```
Normally you should see exceptions from _application.yml_ printed, which are:
```
[class java.io.IOException, class java.lang.IllegalArgumentException]
```
But unfortunately you see:
```
[class java.lang.Exception, class java.lang.RuntimeException]
```
printed, which are the default exceptions defined in `SampleProperties`.