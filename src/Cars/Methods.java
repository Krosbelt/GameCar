/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cars;

/**
 *
 * @author Usuario
 */
import java.io.*;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

public class Methods {
    private final Cars.Vehicle car1 = new Cars.Vehicle();
    private final Cars.Vehicle car2 = new Cars.Vehicle();
    private final Cars.Vehicle car3 = new Cars.Vehicle();
    private final Cars.Vehicle car4 = new Cars.Vehicle();
    private final Cars.Vehicle car5 = new Cars.Vehicle();
    private final Cars.Vehicle car6 = new Cars.Vehicle();
    private final Cars.Track track = new Cars.Track();
    private String track_play;
    private double track_kil;
    private int num_player;
    private final Cars.Vehicle list_car[];
    private final Cars.Vehicle list_wins[];
    private int pos;
    private double result_dice;
    private final String track_list[];
    private final double track_k[];
    JFileChooser selector = new JFileChooser();
    File files;
    FileInputStream inside;
    FileOutputStream outside;
    
    public Methods() {
        this.track_list = track.getTrackList();
        this.track_k = track.getKilometersList();
        this.list_car = new Cars.Vehicle[6];
        this.list_wins = new Cars.Vehicle[3];
        this.num_player = 0;
    }
    
    public void select(){
        int index = (int)(Math.random()*7);
        this.track_play = track_list[index];
        this.track_kil = track_k[index];
    }
    
    private double throwDice(){
        double kilometers = (Math.floor(Math.random()*10))*100;
        this.result_dice = kilometers;
        return kilometers;
    }
    public double getdice(){
        return this.result_dice;
    }
    public String getTrackName(){
        return this.track_play;
    }
    public double getTrackKil(){
        return this.track_kil;
    }
    
    public void setPlayers(String names[]){
        this.num_player = 0;
        for (String name : names) {
            if (name != null) {
                this.num_player++;
            }
        }
        this.list_car[0] = this.car1;
        this.list_car[1] = this.car2;
        this.list_car[2] = this.car3;
        switch(this.num_player){
            case 6:
                this.list_car[5] = this.car6;
                this.list_car[4] = this.car5;
                this.list_car[3] = this.car4;
                break;
            case 5:
                this.list_car[4] = this.car5;
                this.list_car[3] = this.car4;
                break;
            case 4:
                this.list_car[3] = this.car4;
                break;
        }
        for(int i=0;i<this.num_player;i++){
            if(this.list_car[i] != null){
                this.list_car[i].setDriver(names[i]);
                this.list_car[i].setRail(i);
            }
        }
    }
    
    public String runWay(int index){
        double dice = this.throwDice();
        boolean confirm = false;
        this.list_car[index].setKlm(dice);
        double klm = this.list_car[index].getKlm();
        if(klm >= this.track_kil){
            if(this.pos < 3){
                for(int y=0;y<this.list_wins.length;y++){
                    if(this.list_car[index] == this.list_wins[y]){
                        confirm = true;
                    }
                }
                if(confirm){
                    return "win";
                }
                this.list_wins[pos] = this.list_car[index];
                pos ++;
            }else{
                return null;
            }
        }
        return Double.toString(klm);
    }
    
    public Cars.Vehicle[] getWins(){
        return this.list_wins;
    }

    public String openTxt(File doc_txt){
        String document = "";
        try{
            inside = new FileInputStream(doc_txt);
            int ascci;
            while((ascci=inside.read()) != -1){
                char caracter = (char) ascci;
                document += caracter;
            }
        }catch(IOException e){
            System.out.print("Falat Error:_"+e);
        }
        return document;
    }
        
    public String saveTxt(File doc_txt, String document){
        String msj = null;
        try{
            outside = new FileOutputStream(doc_txt);
            byte[] bytxt=document.getBytes();
            outside.write(bytxt);
            msj = "Archivo Guardado";
        }catch(IOException e){
            System.out.print("Falat Error:_"+e);
        }
        return msj;
    }
    
    public void savewin(){
        String win_txt = this.track_play+":\n";
        for(int i =0;i<this.list_wins.length;i++){
            win_txt += i+1+")" +this.list_wins[i].getDriver()+"\n";
        }
        if(selector.showDialog(null, "Guardar") == JFileChooser.APPROVE_OPTION){
            files = selector.getSelectedFile();
            String last_races = this.addextra(files);
            win_txt += last_races;
            if(files.getName().endsWith("txt")){
                String msj = this.saveTxt(files, win_txt);
                if(msj != null){
                    JOptionPane.showMessageDialog(null, msj);
                }else{
                    JOptionPane.showMessageDialog(null, "Error al guardar");
                }
            }else{
                JOptionPane.showMessageDialog(null, "Lista de ganadores guardada");
            }
        }
    }
    
    private String addextra(File files){
        String doc = "\n";
            if(files.canRead()){
                if(files.getName().endsWith("txt")){
                    doc = this.openTxt(files); 
                }else{
                    JOptionPane.showMessageDialog(null, "Archivo no compatible");
                }
            }
        return doc;
    }
}
