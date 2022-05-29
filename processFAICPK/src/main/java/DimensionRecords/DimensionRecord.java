/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DimensionRecords;

import Specifications.*;
import java.util.Arrays;
import java.util.Collections;

/**
 *
 * @author fatca
 */
public class DimensionRecord implements IDimensionReocord {

    private double[] data;
    private String dimension_no;

    public DimensionRecord(String dimension_no, double[] data) {
        this.data = data;
        this.dimension_no = dimension_no;
    }

    @Override
    public boolean in_spec(ISpecification spec) {
        double max;
        double min;
//        max = Collections.min(Arrays.asList(this.data));
        max= Arrays.stream(data).max().getAsDouble();
//        min = Collections.max(Arrays.asList(this.data));
          min = Arrays.stream(data).min().getAsDouble();
        return max - CONSTANTS.Constants.THRESHOLD <= spec.getUSL() && min + CONSTANTS.Constants.THRESHOLD >= spec.getLSL();

    }

}
