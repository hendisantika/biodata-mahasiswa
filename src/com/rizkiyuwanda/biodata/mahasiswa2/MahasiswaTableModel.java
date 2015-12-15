/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rizkiyuwanda.biodata.mahasiswa2;

import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author rizkiyuwanda
 */
public class MahasiswaTableModel extends AbstractTableModel{
    
    private List <Mahasiswa> listMahasiswa = new ArrayList<>();

    public void insert (Mahasiswa mahasiswaBaru){
        listMahasiswa.add   (mahasiswaBaru);
        fireTableDataChanged();
    }
    
    public void update (int index, Mahasiswa mahasiswaUpdate){
        listMahasiswa.set(index, mahasiswaUpdate);
        fireTableDataChanged();
    }
    
    public void delete(int index){
        listMahasiswa.remove(index);
        fireTableDataChanged();
    }
    
    public Mahasiswa getMahasiswa(int index){
        return listMahasiswa.get(index);        
    }
    
    public void setListMahasiswa(List<Mahasiswa> listMahasiswaBaru){
        listMahasiswa = listMahasiswaBaru;
        fireTableDataChanged();
    }   

    @Override
    public int getRowCount() {
        return listMahasiswa.size();
    }

    @Override
    public int getColumnCount() {
        return 4;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        switch(columnIndex){
            case 0:
                return rowIndex + 1;
            case 1:
                return listMahasiswa.get(rowIndex).getNim();
            case 2:
                return listMahasiswa.get(rowIndex).getNama();
            case 3:
                return listMahasiswa.get(rowIndex).getJenisKelamin();
            default:
                return null;
        }
    }

    @Override
    public String getColumnName(int column) {
        switch(column){
            case 0:
                return "No";
            case 1:
                return "NIM";
            case 2:
                return "Nama";
            case 3:
                return "Jenis Kelamin";
            default:
                return null;
        }
    }    
}