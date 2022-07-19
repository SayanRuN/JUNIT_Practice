import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class CarsTest {

    Cars car;

    @BeforeEach
    void newCar() {
        car = new Cars("Hyundai", "KZ-245-01", 2020, "Sayan");
    }

    @Test
    void getManufacturer() {
        assertEquals("Hyundai", car.getManufacturer());
    }

    @Test
    void getException() {
        car.setManufacturer(null);
        assertThrows(NullPointerException.class, () -> car.getManufacturer());
    }

    @Test
    void setManufacturer() {
        car.setManufacturer("KIA");
        assertEquals("KIA", car.getManufacturer());
    }

    @Test
    public void getNumber() {
        assertEquals("KZ-245-01", car.getNumber());
    }

    @Test
    void setNumber() {
        car.setNumber("KZ-345-14");
        assertEquals("KZ-345-14", car.getNumber());
    }

    @Test
    void getYear() {
        assertEquals(2020, car.getYear());
    }

    @Test
    void setYear() {
        car.setYear(2022);
        assertEquals(2022, car.getYear());
    }

    @Test
    void getOwner() {
        assertEquals("Sayan", car.getOwner());
    }

    @Test
    void setOwner() {
        car.setOwner("Daulet");
        assertEquals("Daulet", car.getOwner());
    }
}