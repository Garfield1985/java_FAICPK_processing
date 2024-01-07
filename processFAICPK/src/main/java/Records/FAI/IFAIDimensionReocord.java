/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Records.FAI;

import Specifications.ISpecification;

/**
 *
 * @author fatca
 */
public interface IFAIDimensionReocord {

    boolean in_spec(ISpecification spec);

    String getDimension_number();

}
