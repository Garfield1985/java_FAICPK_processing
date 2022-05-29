/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package MetaInformation;

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
public class MetaInformationTest {
    
    private MetaInformation metaInformation = new MetaInformation("870-12345-22", "Ramp", "x22", "HiP", "S210122", "4");
    
    public MetaInformationTest() {
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
    public void get_part_number(){
        assertEquals(metaInformation.getPart_number(), "870-12345-22");
    }
    
    @Test
    public void get_part_descritpion(){
        assertEquals(metaInformation.getPart_description(), "RAMP");
    }
    
    @Test
    public void get_drawing_version(){
        assertEquals(metaInformation.getDrawing_version(), "X22");
    }
    
    @Test
    public void get_vendor_name(){
        assertEquals(metaInformation.getVendor_name(), "HIP");
    }
    
    @Test
    public void get_tooling_number(){
        assertEquals(metaInformation.getTooling_number(), "S210122");
    }
    
    @Test
    public void get_cavity(){
        assertEquals(metaInformation.getCavity(), "4");
    }
}
