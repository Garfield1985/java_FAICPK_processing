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
public class FAI_AtrributeTest {

    private ISpecification spec = new Specification("FAI1", 1.0, 0.05, 0.02,
            DimensionCatalog.GeneralData, DimensionType.Atrribute);

    private final IDimensionReocord inspectDUT;
    private final IDimensionReocord OOSDUT;
    private final String[] inspectDUTData;
    private final String[] OOSDUTData;
    
    public FAI_AtrributeTest() {
        this.inspectDUTData= new String[]{"PASS","PASS","PASS","PASS","PASS"};
        this.OOSDUTData= new String[]{"PASS","FAIL","PASS","PASS","PASS"};
        this.inspectDUT= new FAI_Atrribute("FAI1",inspectDUTData);
        this.OOSDUT=new FAI_Atrribute("FAI1",OOSDUTData);
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
     * Test of in_spec method, of class FAI_Atrribute.
     */
    @Test
    public void testIn_spec() {
        System.out.println("in_spec");
        ISpecification spec = this.spec;
        assertAll(
                ()-> assertTrue(inspectDUT.in_spec(spec)),
                ()-> assertFalse(OOSDUT.in_spec(spec))
        );
        
    }

}
