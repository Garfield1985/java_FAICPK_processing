/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package InspectionRecords;

import Specifications.ISpecification;
import java.util.Arrays;

/**
 *
 * @author fatca
 */
public class FAI_SingleSideUSL implements IFAIDimensionReocord {

    private final double[] data;
    private final String dimension_no;

    public FAI_SingleSideUSL(String dimension_no, double[] data) {
        this.dimension_no = dimension_no;
        this.data = data;
    }

    @Override
    public boolean in_spec(ISpecification spec) {
        double max;
        max = Arrays.stream(data).max().getAsDouble();
        return max - CONSTANTS.Constants.THRESHOLD <= spec.getUSL();
    }

    @Override
    public String getDimension_number() {
        return this.dimension_no;
    }

}
