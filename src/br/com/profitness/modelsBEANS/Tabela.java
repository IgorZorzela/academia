package br.com.profitness.modelsBEANS;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author igorz
 */
public class Tabela extends AbstractTableModel{
    private ArrayList lines = null;
    private String [] columns = null;

    public ArrayList getLines() {
        return lines;
    }

    public void setLines(ArrayList lines) {
        this.lines = lines;
    }

    public String[] getColumns() {
        return columns;
    }

    public void setColumns(String[] columns) {
        this.columns = columns;
    }
    
    public Tabela(ArrayList lin, String[] col){
        setLines(lin);
        setColumns(col);
    }
    
    public int getColumnCount(){
        return columns.length;
    }
    
    public int getRowCount(){
        return lines.size();
    }
    
    public String getColumnName (int numCol){
        return columns[numCol];
    }
    
    public Object getValueAt(int numLin, int numCol){
        Object[] line = (Object [])getLines().get(numLin);
        return line [numCol];
    }
    
}
