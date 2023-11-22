package projetoa3;

import java.util.ArrayList;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class TableRender {
        
    public TableRender(String cols[]) {

    }
    
    public static void render(JTable table, String cols[], String fields[], DB db) {
        DefaultTableModel dm = new DefaultTableModel();
        ArrayList data = new ArrayList();
        while(db.next())
        {
            ArrayList row = new ArrayList();
            for (String col : fields) {
                row.add(db.getString(col));
            }
            data.add(row);
        }
        String rawData[][] = new String[data.size()][fields.length];
        int i = 0;
        for(Object lin: data) {
            ArrayList values = (ArrayList) lin;
            int k = 0;
            for (Object value : values) {
                rawData[i][k] = (String) value;
                k++;
            }
            i++;
        }
        dm.setDataVector(rawData,cols);
        table.setModel(dm);
        table.setDefaultEditor(Object.class, null);
    }
    
}
