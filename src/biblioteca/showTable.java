package biblioteca;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class showTable extends JFrame {

    private JTable jTable1;

    public void showDataTable(String[] columnas, Object[][] datos) {

        DefaultTableModel modelo = new DefaultTableModel(datos, columnas) {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false; // Celdas no editables
            }
        };

        jTable1 = new JTable(modelo);

        // ScrollPane
        JScrollPane scroll = new JScrollPane(jTable1);
        // Añadir el scroll a la ventana
        this.add(scroll);

        this.setTitle("Visor de Datos Generales");
        // Configuración básica de la ventana
        this.setSize(400, 300);
        this.setLocationRelativeTo(null); // Centra la ventana en la pantalla
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        // Hacer la ventana visible
        this.setVisible(true);
    }
}
