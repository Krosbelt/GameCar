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
import java.lang.Math;

public class Track {
    private final double kilometers[] = new double[7];
    private final String track_name[] = new String[7];
    private final String winner[];

    public Track() {
        this.winner = new String[3];
        this.track_name[0] = "Pista 0";
        this.track_name[1] = "Pista 1";
        this.track_name[2] = "Pista 2";
        this.track_name[3] = "Pista 3";
        this.track_name[4] = "Pista 4";
        this.track_name[5] = "Pista 5";
        this.track_name[6] = "Pista 6";
        this.kilometers[0] = 10000;
        this.kilometers[1] = 12500;
        this.kilometers[2] = 13500;
        this.kilometers[3] = 15500;
        this.kilometers[4] = 16000;
        this.kilometers[5] = 17500;
        this.kilometers[6] = 20000;
    }

    public void setWinners(String winners[]) {
        System.arraycopy(winners, 0, this.winner, 0, 3);
    }

    public double[] getKilometersList() {
        return kilometers;
    }

    public String[] getWinner1() {
        return winner;
    }
    
    public String[] getTrackList() {
       return track_name;
    }
    
}
