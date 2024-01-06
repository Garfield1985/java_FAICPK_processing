/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package InspectionRecords;

import Specifications.ISpecification;

/**
 *
 * @author fatca
 */
public interface ICPKDimensionRecord extends IFAIDimensionReocord {

    double get_CPK(ISpecification spec);

    double get_CPU(ISpecification spec);

    double get_CPL(ISpecification spec);

    ISpecification get_proposed_spec(ISpecification spec, double required_cpk_index);
}
