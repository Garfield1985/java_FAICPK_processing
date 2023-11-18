/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package DimensionRecords;

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
public class FAI_SingleSideUSLTest {

    private ISpecification spec = new Specification("FAI1", 1.0, 0.05, 0.02,
            DimensionCatalog.GeneralData, DimensionType.DoubleSides);

    private final double[] inSpecData;
    private final double[] OOSUSLData;
    private final double[] OOSLSLData;
    private double[] boundaryData;

    private final IDimensionReocord inspecDUT;
    private final IDimensionReocord OOSUSLDUT;
    private final IDimensionReocord OOSLSLDUT;
    private final IDimensionReocord boundaryDUT;

    public FAI_SingleSideUSLTest() {
                this.inSpecData = new double[]{1.0, 1.02, 1.03, 1.04, 0.98};
        this.OOSUSLData = new double[]{1.0, 1.02, 1.03, 1.04, 1.052};
        this.OOSLSLData = new double[]{1.0, 1.02, 1.03, 0.975, 0.98};
        this.boundaryData = new double[]{1.0, 1.02, 1.03, 0.98, 1.05};
        this.inspecDUT = new FAI_SingleSideUSL("FAI1", inSpecData);
        this.OOSUSLDUT = new FAI_SingleSideUSL("FAI1", OOSUSLData);
        this.OOSLSLDUT = new FAI_SingleSideUSL("FAI1", OOSLSLData);
        this.boundaryDUT = new FAI_SingleSideUSL("FAI1", boundaryData);
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
     * Test of in_spec method, of class FAI_SingleSideUSL.
     */
    @Test
    public void testIn_spec() {
        System.out.println("in_spec");
        ISpecification spec = this.spec;
        
        assertAll("Single Side-LSL",
                ()-> assertEquals(true, inspecDUT.in_spec(spec)),
                ()-> assertEquals(false, OOSUSLDUT.in_spec(spec)),
                ()-> assertEquals(true, OOSLSLDUT.in_spec(spec)),
                ()-> assertEquals(true,boundaryDUT.in_spec(spec))
        );
    }

}
