/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Specifications;


/**
 *
 * @author fatca
 */
public interface ISpecification {

    String getDimension_number();

    DimensionType getDimension_type();

    double getLSL();

    double getNegative_tolerance();

    double getNominal();

    double getPositive_tolerance();

    double getUSL();
    
}
