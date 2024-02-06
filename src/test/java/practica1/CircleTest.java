package practica1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CircleTest {
    @Test
    void test_GivenNonFigure_SHouldReturnFalse(){
        // Arrange
        Circle c = new Circle(0, 0, 1);
        Object o = new Object();
        // Act
        boolean result = c.equals(o);
        // Assert
        assertFalse(result);
    }

    @Test
    void test_GivenDifferentFigure_ShouldReturnFalse(){
        // Arrange
        Circle c = new Circle(0, 0, 1);
        Figure f2 = new Triangle(2, 2, 2, 2);
        // Act
        boolean result = c.equals(f2);
        // Assert
        assertFalse(result);
    }

    @Test
    void test_GivenCircleDifferentRadius_ShouldReturnFalse(){
        // Arrange
        Circle c = new Circle(0, 0, 1);
        Circle c2 = new Circle(0, 0, 2);
        // Act
        boolean result = c.equals(c2);
        // Assert
        assertFalse(result);
    }

    @Test
    void test_GivenCircleSameRadius_ShouldReturnTrue(){
        // Arrange
        Circle c = new Circle(0, 0, 1);
        Circle c2 = new Circle(0, 0, 1);
        // Act
        boolean result = c.equals(c2);
        // Assert
        assertTrue(result);
    }
}