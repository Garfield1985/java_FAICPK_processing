/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DimensionRecords;

import Specifications.ISpecification;
import java.util.Arrays;

/**
 *
 * @author fatca
 */
public class FAI_SingleSideLSL implements IDimensionReocord {

    private final double[] data;
    private final String dimension_no;

    public FAI_SingleSideLSL(String dimension_no, double[] data) {
        this.data = data;
        this.dimension_no = dimension_no;
    }

    @Override
    public boolean in_spec(ISpecification spec) {
        double min;
        min = Arrays.stream(data).min().getAsDouble();
        return min + CONSTANTS.Constants.THRESHOLD >= spec.getLSL();
    }

}
