/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DimensionRecords;

import Specifications.*;
import java.util.Arrays;

/**
 *
 * @author fatca
 */
public class FAI_DoubleSides implements IDimensionReocord {

    private double[] data;
    private String dimension_no;

    public FAI_DoubleSides(String dimension_no, double[] data) {
        this.data = data;
        this.dimension_no = dimension_no;
    }

    @Override
    public boolean in_spec(ISpecification spec) {
        double max;
        double min;
        max = Arrays.stream(data).max().getAsDouble();
        min = Arrays.stream(data).min().getAsDouble();
        return max - CONSTANTS.Constants.THRESHOLD <= spec.getUSL() && min + CONSTANTS.Constants.THRESHOLD >= spec.getLSL();
    }

}
