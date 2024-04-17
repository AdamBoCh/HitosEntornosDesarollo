package com.pruebas;
import static org.junit.jupiter.api.Assertions.*;

import com.example.demo.service.SmartPhoneServiceImpl;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.*;
import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;
import org.junit.jupiter.api.Order;
import static org.junit.jupiter.api.Assertions.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
@DisplayName("Pruebas para el SmartPhoneServiceImpl")
public class SmartPhoneServiceImplTest {

    @BeforeAll
    public static void setUpAll() {
        System.out.println("Configurando estado inicial para todas las pruebas");
    }

    @BeforeAll
    public static void TearDownAll() {
        System.out.println("Limpiando despues de todas las pruebas");
    }

    private SmartPhoneServiceImpl service;

    @BeforeEach
    public void setUp() {
        System.out.println("Configurando estado inicial");
        service = new SmartPhoneServiceImpl();
    }

    @AfterEach
    public void tearDown() {
        System.out.println("Limpieza después de cada prueba");
        service = null;
    }

    @Test
    @Order(1)
    @DisplayName("Prueba del método count() no devuelve NULL")
    public void testCountNotNull() {
        SmartPhoneServiceImpl service = new SmartPhoneServiceImpl();
        assertNotNull(service.count());
    }

    @Test
    @Order(2)
    @DisplayName("El valor que devuelve el metodo count() es mayor que 0")
    public void testCountMayorZero() {
        SmartPhoneServiceImpl service = new SmartPhoneServiceImpl();
        assertTrue(service.count() > 0);
    }

    @Test
    @Order(3)
    @DisplayName("El valor que devuelve el metodo count() es justo 3")
    public void testCountEqualsTres() {
        SmartPhoneServiceImpl service = new SmartPhoneServiceImpl();
        assertEquals(3, service.count());
    }

    @Test
    @Order(4)
    @DisplayName("El valor que devuelve ID no es NULL")
    public void testIdIlegal() {
        SmartPhoneServiceImpl service = new SmartPhoneServiceImpl();
        assertThrows(IllegalArgumentException.class, () -> {
            service.findOne(null);
        });
    }

    @Test
    @Order(5)
    @DisplayName("CountMethod")
    public void testCountMethodAssertions() {
        assertAll("Count Method Assertions",
                () -> assertNotNull(service.count(), "Count should not be null"),
                () -> assertTrue(service.count() > 0, "Count should not be greater than 0"),
                () -> assertEquals(3, service.count(), "Count should be 0")
        );
    }
}
