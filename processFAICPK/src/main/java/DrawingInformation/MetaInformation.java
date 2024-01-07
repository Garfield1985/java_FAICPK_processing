/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DrawingInformation;

/**
 *
 * @author fatca
 */
class MetaInformation {

    private final String part_number;
    private final String part_description;
    private final String drawing_version;
    private final String vendor_name;
    private final String tooling_number;
    private final String cavity;

    public MetaInformation(String part_number, String part_description, String drawing_version, String vendor_name, String tooling_number, String cavity) {
        this.part_number = part_number;
        this.part_description = part_description.toUpperCase();
        this.drawing_version = drawing_version.toUpperCase();
        this.vendor_name = vendor_name.toUpperCase();
        this.tooling_number = tooling_number.toUpperCase();
        this.cavity = cavity;
    }

    public String getPart_number() {
        return part_number;
    }

    public String getPart_description() {
        return part_description;
    }

    public String getDrawing_version() {
        return drawing_version;
    }

    public String getVendor_name() {
        return vendor_name;
    }

    public String getTooling_number() {
        return tooling_number;
    }

    public String getCavity() {
        return cavity;
    }
}
