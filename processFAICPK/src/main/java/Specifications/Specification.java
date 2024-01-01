/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Specifications;


/**
 *
 * @author fatca
 */
public class Specification implements ISpecification {

    private final String dimension_number;
    private final double nominal;
    private final double pos_tolerance;
    private final double neg_tolerance;
    private final DimensionType dimension_type;
    private final double USL;
    private final double LSL;

    public Specification(String dimensionNumber, double nominal, double positive_tolerance, double negative_tolerance, DimensionType dimensionType) {
        this.dimension_number = dimensionNumber;
        this.nominal = nominal;
        this.pos_tolerance = positive_tolerance;
        this.neg_tolerance = negative_tolerance;
        this.dimension_type = dimensionType;
        this.USL = nominal + positive_tolerance;
        this.LSL = nominal - negative_tolerance;
    }


    @Override
    public String getDimension_number() {
        return dimension_number;
    }


    @Override
    public double getNominal() {
        return nominal;
    }

    @Override
    public double getPositive_tolerance() {
        return pos_tolerance;
    }

    @Override
    public double getNegative_tolerance() {
        return neg_tolerance;
    }


    @Override
    public DimensionType getDimension_type() {
        return dimension_type;
    }

    @Override
    public double getUSL() {
        return USL;
    }

    @Override
    public double getLSL() {
        return LSL;
    }

}
