/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Records.CPK;

import Records.FAI.FAI_Atrribute;
import Specifications.ISpecification;

/**
 *
 * @author fatca
 */
public class CPK_Attribute extends FAI_Atrribute implements ICPKDimensionRecord {

    public CPK_Attribute(String dimension_no, String[] data) {
        super(dimension_no, data);
    }

    @Override
    public double get_CPK(ISpecification spec) {
        return -99;
    }

    @Override
    public ISpecification get_proposed_spec(ISpecification spec, double required_cpk_index) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
