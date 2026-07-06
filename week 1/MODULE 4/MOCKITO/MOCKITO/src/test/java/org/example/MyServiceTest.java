package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

public class MyServiceTest {

//    // Exercise 1
//    @Test
//    public void testExternalApi() {
//
//        ExternalApi mockApi = mock(ExternalApi.class);
//
//        when(mockApi.getData()).thenReturn("Mock Data");
//
//        MyService service = new MyService(mockApi);
//
//        String result = service.fetchData();
//
//        assertEquals("Mock Data", result);
//    }



    //Exercise3
        @Test
        public void testArgumentMatching () {

            ExternalApi mockApi = mock(ExternalApi.class);

            when(mockApi.getData(anyString())).thenReturn("Mock Data");

            MyService service = new MyService(mockApi);

            service.fetchData("Siva");

            verify(mockApi).getData(eq("Siva"));
        }
    }

