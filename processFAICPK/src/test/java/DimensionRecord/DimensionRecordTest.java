/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package DimensionRecord;

import DimensionRecords.DimensionRecord;
import Specifications.DimensionCatalog;
import Specifications.DimensionType;
import Specifications.ISpecification;
import Specifications.Specification;
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
public class DimensionRecordTest {

    private ISpecification spec = new Specification("FAI1", 1.0, 0.05, 0.2,
            DimensionCatalog.GeneralData, DimensionType.DoubleSides);

    private final double[] inSpecData;
    private final double[] OOSUSLData;
    private final double[] OOSLSLData;
    private double[] boundaryData;

    private final DimensionRecord inspecDUT;
    private final DimensionRecord OOSUSLDUT;
    private final DimensionRecord OOSLSLDUT;
    private final DimensionRecord boundaryDUT;

    public DimensionRecordTest() {
        this.inSpecData = new double[]{1.0, 1.02, 1.03, 1.04, 0.98};
        this.OOSUSLData = new double[]{1.0, 1.02, 1.03, 1.04, 1.052};
        this.OOSLSLData = new double[]{1.0, 1.02, 1.03, 0.975, 0.98};
        this.boundaryData = new double[]{1.0, 1.02, 1.03, 0.98, 1.05};
        this.inspecDUT = new DimensionRecord("FAI1", inSpecData);
        this.OOSUSLDUT = new DimensionRecord("FAI1", OOSUSLData);
        this.OOSLSLDUT = new DimensionRecord("FAI1", OOSLSLData);
        this.boundaryDUT = new DimensionRecord("FAI1", boundaryData);
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

    /**
     * Test of in_spec method, of class DimensionRecord.
     */
    @Test
    public void testIn_spec() {
        System.out.println("in_spec");
        ISpecification specDUT = this.spec;
        DimensionRecord instance = inspecDUT;
        boolean expResult = true;
        boolean result = instance.in_spec(specDUT);
        assertEquals(expResult, result);

    }

}
