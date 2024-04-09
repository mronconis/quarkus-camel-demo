package org.acme.quarkus.camel.demo;

import io.quarkus.test.junit.NativeImageTest;

@NativeImageTest
public class NativeTimerRouteIT extends TimerRouteTest {
    // Execute the same tests but in native mode.
}
