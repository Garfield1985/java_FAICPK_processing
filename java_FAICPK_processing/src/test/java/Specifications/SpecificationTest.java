/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package Specifications;

import Specifications.Specification;
import Specifications.DimensionType;
import Specifications.DimensionCatalog;
import java.awt.Dimension;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author fatca
 */
public class SpecificationTest {

    private final ISpecification spec = new Specification("FAI1", 1.0, 0.05, 0.02,
            DimensionCatalog.PointData, DimensionType.DoubleSides);

    public SpecificationTest() {
    }

    @BeforeAll
    public static void setUpClass() {
    }

    @AfterAll
    public static void tearDownClass() {
    }

    @BeforeEach
    public void setUp() {

    }

    @AfterEach
    public void tearDown() {
    }

    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
    @Test
    public void test_get_dimension_no() {
        assertEquals("FAI1", spec.getDimension_number());
    }

    @Test
    public void test_get_dimension_catalog() {
        assertEquals(spec.getDimension_catalog(), DimensionCatalog.PointData);
    }

    @Test
    public void test_get_dimensionType() {
        assertEquals(spec.getDimension_type(), DimensionType.DoubleSides);
    }

    @Test
    public void test_get_nominal() {
        assertEquals(spec.getNominal(), 1.0);
    }

    @Test
    public void test_get_positive_tolerance() {
        assertEquals(spec.getPositive_tolerance(), 0.05);
    }

    @Test
    public void test_get_negative_tolerance() {
        assertEquals(spec.getNegative_tolerance(), 0.02);
    }

    @Test
    public void test_get_USL() {
        assertEquals(spec.getUSL(), 1.05);
    }

    @Test
    public void test_get_LSL() {
        assertEquals(spec.getLSL(), 0.98);
    }
}
