/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inulcell;

/**
 *
 * @author prema
 */
public class RekapControl {
    
    RekapHarian UIHarian;
    RekapMingguan UIMingguan;
    RekapBulanan UIBulanan;
    RekapDb dataDB;
    
    public RekapControl(){
        UIHarian=new RekapHarian();
        UIMingguan=new RekapMingguan();
        UIBulanan=new RekapBulanan();
        dataDB=new RekapDb();
    }
    
    public void Harian(){
        
    }
    
    public void Mingguan(){
        
    }
    
    public void Bulanan(){
        
    }
    
    
    
    
    
}
