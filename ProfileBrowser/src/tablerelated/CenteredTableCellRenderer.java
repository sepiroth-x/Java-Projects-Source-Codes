/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tablerelated;
import javax.swing.*;
import javax.swing.table.DefaultTableCellRenderer;
import java.awt.*;

/**
 *
 * @author sepirothx
 */
public class CenteredTableCellRenderer extends DefaultTableCellRenderer {
    public CenteredTableCellRenderer() {
        setHorizontalAlignment(JLabel.CENTER); // Center the text horizontally.
    }

    @Override
    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
        Component rendererComponent = super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);

        // Optionally, you can customize the appearance of the cell here.
        // For example, setting background colors, fonts, etc.

        return rendererComponent;
    }
}