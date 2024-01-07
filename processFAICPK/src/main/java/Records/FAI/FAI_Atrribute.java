/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Records.FAI;

import Specifications.ISpecification;

/**
 *
 * @author fatca
 */
public class FAI_Atrribute implements IFAIDimensionReocord {

    private final String[] data;
    private final String dimension_no;

    public FAI_Atrribute(String dimension_no, String[] data) {
        this.data = data;
        this.dimension_no = dimension_no;
    }

    @Override
    public boolean in_spec(ISpecification spec) {
        for (String i : this.data) {
            if (i.toUpperCase().contains(CONSTANTS.Constants.FAIL)) {
                return false;
            }
        }
        return true;
    }

    @Override
    public String getDimension_number() {
        return this.dimension_no;
    }
}
