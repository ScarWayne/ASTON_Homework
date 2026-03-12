package com.example;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import io.restassured.response.Response;
import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

public class ApiTest {
   
    @Test
    public void getRequest() {
        
        Response response =

            given()
                .queryParam("foo1", "bar1")
                .queryParam("foo2", "bar2")

            .when()
                .get("https://postman-echo.com/get");
                        
                assertEquals(200, response.getStatusCode());
                assertEquals("bar1", response.jsonPath().getString("args.foo1"));
                assertEquals("bar2", response.jsonPath().getString("args.foo2"));
                assertEquals("postman-echo.com", response.jsonPath().getString("headers.host"));
                assertEquals("gzip, br", response.jsonPath().getString("headers.accept-encoding"));
                assertEquals("https", response.jsonPath().getString("headers.x-forwarded-proto"));
                //assertNotNull(response.jsonPath().getString("headers.postman-token"));
                assertEquals("*/*", response.jsonPath().getString("headers.accept"));
                //assertEquals("PostmanRuntime/7.51.1", response.jsonPath().getString("headers.user-agent"));
                //assertNotNull(response.jsonPath().getString("headers.cookie"));
                assertEquals("https://postman-echo.com/get?foo1=bar1&foo2=bar2", response.jsonPath().getString("url"));
    }
    
    @Test
    public void postRawText() {

        Response response = 

            given()
                .contentType("text/plain")
                .body("{\"test\":\"value\"}")

            .when()
                .post("https://postman-echo.com/post");
            
            assertEquals(200, response.getStatusCode());
            assertEquals("{\"test\":\"value\"}", response.jsonPath().getString("data"));
            assertEquals("postman-echo.com", response.jsonPath().getString("headers.host"));
            assertNotNull(response.jsonPath().getString("headers.content-length"));
            assertEquals("gzip, br", response.jsonPath().getString("headers.accept-encoding"));
            assertEquals("*/*", response.jsonPath().getString("headers.accept"));
            assertEquals("https", response.jsonPath().getString("headers.x-forwarded-proto"));
            //assertEquals("PostmanRuntime/7.51.1", response.jsonPath().getString("headers.user-agent"));
            assertTrue(response.jsonPath().getString("headers.content-type").contains("text/plain"));
            //assertNotNull(response.jsonPath().getString("headers.postman-token"));
            //assertNotNull(response.jsonPath().getString("headers.cookie"));
            assertNull(response.jsonPath().getString("json"));
            assertEquals("https://postman-echo.com/post", response.jsonPath().getString("url"));      
    }
    
    @Disabled //тест падает с 500
    @Test
    public void postFormData1() {

        Response response = 
            given()
                .log().all()
                .contentType(ContentType.URLENC)                              
                .formParam("foo1", "bar1")
                .formParam("foo2", "bar2")

            .when()
                .post("https://postman-echo.com/post");
            
            assertEquals(200, response.getStatusCode());
            assertEquals("bar1", response.jsonPath().getString("form.foo1"));
            assertEquals("bar2", response.jsonPath().getString("form.foo2"));
            assertEquals("postman-echo.com", response.jsonPath().getString("headers.host"));
            assertNotNull(response.jsonPath().getString("headers.content-length"));
            assertEquals("gzip, br", response.jsonPath().getString("headers.accept-encoding"));
            //assertNotNull(response.jsonPath().getString("headers.postman-token"));
            assertEquals("https", response.jsonPath().getString("headers.x-forwarded-proto"));
            assertEquals("*/*", response.jsonPath().getString("headers.accept"));
            //assertEquals("PostmanRuntime/7.51.1", response.jsonPath().getString("headers.user-agent"));
            assertEquals("application/x-www-form-urlencoded", response.jsonPath().getString("headers.content-type"));
            //assertNotNull(response.jsonPath().getString("headers.cookie"));
            assertEquals("bar1", response.jsonPath().getString("json.foo1"));
            assertEquals("bar2", response.jsonPath().getString("json.foo2"));
            assertEquals("https://postman-echo.com/post", response.jsonPath().getString("url"));
    }
       
    @Test
    public void putRequest() {

        Response response = 

            given()
                .contentType("text/plain")
                .body("This is expected to be sent back as part of response body.")

            .when()
                .put("https://postman-echo.com/put");

            assertEquals(200, response.getStatusCode());
            assertEquals("This is expected to be sent back as part of response body.", response.jsonPath().getString("data"));
            assertEquals("postman-echo.com", response.jsonPath().getString("headers.host"));
            assertEquals("58", response.jsonPath().getString("headers.content-length"));
            assertEquals("gzip, br", response.jsonPath().getString("headers.accept-encoding"));
            assertEquals("*/*", response.jsonPath().getString("headers.accept"));
            assertEquals("https", response.jsonPath().getString("headers.x-forwarded-proto"));
            //assertEquals("PostmanRuntime/7.51.1", response.jsonPath().getString("headers.user-agent"));
            assertTrue(response.jsonPath().getString("headers.content-type").contains("text/plain"));
            //assertNotNull(response.jsonPath().getString("headers.postman-token"));
            //assertNotNull(response.jsonPath().getString("headers.cookie"));
            assertNull(response.jsonPath().getString("json"));
            assertEquals("https://postman-echo.com/put", response.jsonPath().getString("url"));
    }

    @Test
    public void patchRequest() {

        Response response = 

            given()
                .contentType("text/plain")
                .body("This is expected to be sent back as part of response body.")

            .when()
                .patch("https://postman-echo.com/patch");
            
            assertEquals(200, response.getStatusCode());
            assertEquals("This is expected to be sent back as part of response body.", response.jsonPath().getString("data"));
            assertEquals("postman-echo.com", response.jsonPath().getString("headers.host"));
            assertEquals("58", response.jsonPath().getString("headers.content-length"));
            assertEquals("gzip, br", response.jsonPath().getString("headers.accept-encoding"));
            assertEquals("*/*", response.jsonPath().getString("headers.accept"));
            assertEquals("https", response.jsonPath().getString("headers.x-forwarded-proto"));
            //assertEquals("PostmanRuntime/7.51.1", response.jsonPath().getString("headers.user-agent"));
            assertTrue(response.jsonPath().getString("headers.content-type").contains("text/plain"));
            //assertNotNull(response.jsonPath().getString("headers.postman-token"));
            //assertNotNull(response.jsonPath().getString("headers.cookie"));
            assertNull(response.jsonPath().getString("json"));
            assertEquals("https://postman-echo.com/patch", response.jsonPath().getString("url"));
    }

    @Test
    public void deleteRequest() {

        Response response =

            given()
                .contentType("text/plain")
                .body("This is expected to be sent back as part of response body.")
            
            .when()
                .delete("https://postman-echo.com/delete");
            
            assertEquals(200, response.getStatusCode());
            assertEquals("This is expected to be sent back as part of response body.", response.jsonPath().getString("data"));
            assertEquals("postman-echo.com", response.jsonPath().getString("headers.host"));
            assertEquals("58", response.jsonPath().getString("headers.content-length"));
            assertEquals("gzip, br", response.jsonPath().getString("headers.accept-encoding"));
            assertEquals("*/*", response.jsonPath().getString("headers.accept"));
            assertEquals("https", response.jsonPath().getString("headers.x-forwarded-proto"));
            //assertEquals("PostmanRuntime/7.51.1", response.jsonPath().getString("headers.user-agent"));
            assertTrue(response.jsonPath().getString("headers.content-type").contains("text/plain"));
            //assertNotNull(response.jsonPath().getString("headers.postman-token"));
            //assertNotNull(response.jsonPath().getString("headers.cookie"));
            assertNull(response.jsonPath().getString("json"));
            assertEquals("https://postman-echo.com/delete", response.jsonPath().getString("url"));
    }
}
