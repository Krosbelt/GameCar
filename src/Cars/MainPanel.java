/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cars;

import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingConstants;


/**
 *
 * @author Usuario
 */
public class MainPanel extends javax.swing.JFrame {
    
    Cars.Methods meth = new Cars.Methods();
    BackGround wallpaper = new BackGround();
    ImageIcon str_1 = new ImageIcon(getClass().getResource("/Resources/track_street1.png"));
    ImageIcon str_2 = new ImageIcon(getClass().getResource("/Resources/track_street2.png"));
    ImageIcon car_1 = new ImageIcon(getClass().getResource("/Resources/car1.png"));
    ImageIcon car_2 = new ImageIcon(getClass().getResource("/Resources/car2.png"));
    ImageIcon car_3 = new ImageIcon(getClass().getResource("/Resources/car3.png"));
    ImageIcon car_4 = new ImageIcon(getClass().getResource("/Resources/car4.png"));
    ImageIcon car_5 = new ImageIcon(getClass().getResource("/Resources/car5.png"));
    ImageIcon car_6 = new ImageIcon(getClass().getResource("/Resources/car6.png"));
    boolean start_line = false;
    int turn = 0;
    int players = 1000;
    int positions = 0;
    Cars.Vehicle[] send_win= new Cars.Vehicle[3];
    
    String names[] = new String[6];
    
    public MainPanel() {
        initComponents();
    }
    void addPlayer(int players){
            if( players == 6){
                player_6.setIcon(car_6);
            }
            if( players >= 5){
                player_5.setIcon(car_5);
            }
            if( players >= 4){
                player_4.setIcon(car_4);
            }
            if( players >= 3){
                player_3.setIcon(car_3);
                player_2.setIcon(car_2);
                player_1.setIcon(car_1);
            }
    }
    
    void reset(){
        player_1.setIcon(null);
        street_1.setText("P1");
        stadistic_1.setText(null);
        player_2.setIcon(null);
        street_2.setText("P2");
        stadistic_2.setText(null);
        player_3.setIcon(null);
        street_3.setText("P3");
        stadistic_3.setText(null);
        player_4.setIcon(null);
        street_4.setText("P4");
        stadistic_4.setText(null);
        player_5.setIcon(null);
        street_5.setText("P5");
        stadistic_5.setText(null);
        player_6.setIcon(null);
        street_6.setText("P6");
        stadistic_6.setText(null);
        track_name.setText("Track");
        track_kilometers.setText("0.0");
        dice_rsp.setText("Lanza el dado..");
        
    }
    
    void add_names(String names[]){
     
        for(int i=0;i <= names.length;i++){
            
                if(i == 6){
                    street_6.setText(names[i-1]);
                }
                if(i == 5){
                    street_5.setText(names[i-1]);
                }
                if(i == 4){
                    street_4.setText(names[i-1]);
                }
                if(i == 3){
                    street_3.setText(names[i-1]);
                    street_2.setText(names[i-2]);
                    street_1.setText(names[i-3]);
                }
            
        }
    }
    
    void setKlm(int index,String klm){
        double finish = meth.getTrackKil();
        double kilomet = Double.parseDouble(klm);
        double percent;
        switch(index){
            case 0:
                percent = Math.round((kilomet * 100)/finish);
                stadistic_1.setText("<html><body>"+klm+"/"+finish+"<br>"+percent+"%<br>De la carrera</body></html>");
                break;
            case 1:
                percent = Math.round((kilomet * 100)/finish);
                stadistic_2.setText("<html><body>"+klm+"/"+finish+"<br>"+percent+"%<br>De la carrera</body></html>");
                break;
            case 2:
                percent = Math.round((kilomet * 100)/finish);
                stadistic_3.setText("<html><body>"+klm+"/"+finish+"<br>"+percent+"%<br>De la carrera</body></html>");
                break;
            case 3:
                percent = Math.round((kilomet * 100)/finish);
                stadistic_4.setText("<html><body>"+klm+"/"+finish+"<br>"+percent+"%<br>De la carrera</body></html>");
                break;
            case 4:
                percent = Math.round((kilomet * 100)/finish);
                stadistic_5.setText("<html><body>"+klm+"/"+finish+"<br>"+percent+"%<br>De la carrera</body></html>");
                break;
            case 5:
                percent = Math.round((kilomet * 100)/finish);
                stadistic_6.setText("<html><body>"+klm+"/"+finish+"<br>"+percent+"%<br>De la carrera</body></html>");
                break;
            default:
                JOptionPane.showMessageDialog(rootPane, "Error");
        }
    }
    
    void loadWin(){
            send_win = meth.getWins();
            JOptionPane.showConfirmDialog(rootPane, "¡¡¡La Carrera termino!!! \n"
                    + "1ª "+ send_win[0].getDriver()+" -"+" carril: " + send_win[0].getRail() +"\n"
                    + "2ª "+ send_win[1].getDriver()+" -"+" carril: " + send_win[1].getRail() +"\n"
                    + "3ª "+ send_win[2].getDriver()+" -"+" carril: " + send_win[2].getRail() +"\n","Victory",JOptionPane.CLOSED_OPTION);
        meth.savewin();
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        new_race = new javax.swing.JButton();
        win_his = new javax.swing.JButton();
        dices_drop = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        track_name = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        track_kilometers = new javax.swing.JLabel();
        race_panel = new BackGround();
        street_1 = new javax.swing.JLabel("",str_1,SwingConstants.LEFT);
        street_2 = new javax.swing.JLabel("",str_2,SwingConstants.LEFT );
        street_3 = new javax.swing.JLabel("",str_1,SwingConstants.LEFT );
        street_4 = new javax.swing.JLabel("",str_2,SwingConstants.LEFT );
        street_5 = new javax.swing.JLabel("",str_1,SwingConstants.LEFT );
        street_6 = new javax.swing.JLabel("",str_2,SwingConstants.LEFT );
        player_1 = new javax.swing.JLabel();
        player_2 = new javax.swing.JLabel();
        player_3 = new javax.swing.JLabel();
        player_4 = new javax.swing.JLabel();
        player_5 = new javax.swing.JLabel();
        player_6 = new javax.swing.JLabel();
        stadistic_1 = new javax.swing.JLabel();
        stadistic_2 = new javax.swing.JLabel();
        stadistic_3 = new javax.swing.JLabel();
        stadistic_4 = new javax.swing.JLabel();
        stadistic_5 = new javax.swing.JLabel();
        stadistic_6 = new javax.swing.JLabel();
        exit = new javax.swing.JButton();
        dice_rsp = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        new_race.setText("Nueva Carrera");
        new_race.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                new_raceActionPerformed(evt);
            }
        });

        win_his.setText("Historial de campones");
        win_his.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                win_hisActionPerformed(evt);
            }
        });

        dices_drop.setText("Lanzar Dado");
        dices_drop.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dices_dropActionPerformed(evt);
            }
        });

        jLabel1.setText("Pista:");

        track_name.setText("Nombre");

        jLabel2.setText("Meta:");

        track_kilometers.setText("kilometros");

        race_panel.setBackground(new java.awt.Color(255, 255, 255));
        race_panel.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), null));
        race_panel.setMaximumSize(new java.awt.Dimension(0, 0));
        race_panel.setMinimumSize(new java.awt.Dimension(0, 0));
        race_panel.setName(""); // NOI18N
        race_panel.setPreferredSize(new java.awt.Dimension(550, 700));

        street_1.setBackground(new java.awt.Color(0, 0, 255));
        street_1.setForeground(new java.awt.Color(255, 255, 255));
        street_1.setText("P1");
        street_1.setPreferredSize(new java.awt.Dimension(500, 60));

        street_2.setForeground(new java.awt.Color(255, 255, 255));
        street_2.setText("P2");
        street_2.setPreferredSize(new java.awt.Dimension(500, 60));

        street_3.setForeground(new java.awt.Color(255, 255, 255));
        street_3.setText("P3");
        street_3.setPreferredSize(new java.awt.Dimension(500, 60));

        street_4.setForeground(new java.awt.Color(255, 255, 255));
        street_4.setText("P4");
        street_4.setPreferredSize(new java.awt.Dimension(500, 60));

        street_5.setForeground(new java.awt.Color(255, 255, 255));
        street_5.setText("P5");
        street_5.setPreferredSize(new java.awt.Dimension(500, 60));

        street_6.setForeground(new java.awt.Color(255, 255, 255));
        street_6.setText("P6");

        stadistic_1.setForeground(new java.awt.Color(255, 255, 255));

        stadistic_2.setForeground(new java.awt.Color(255, 255, 255));

        stadistic_3.setForeground(new java.awt.Color(255, 255, 255));

        stadistic_4.setForeground(new java.awt.Color(255, 255, 255));

        stadistic_5.setForeground(new java.awt.Color(255, 255, 255));

        stadistic_6.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout race_panelLayout = new javax.swing.GroupLayout(race_panel);
        race_panel.setLayout(race_panelLayout);
        race_panelLayout.setHorizontalGroup(
            race_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(race_panelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(race_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(street_4, javax.swing.GroupLayout.PREFERRED_SIZE, 324, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(street_3, javax.swing.GroupLayout.PREFERRED_SIZE, 324, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(street_2, javax.swing.GroupLayout.PREFERRED_SIZE, 324, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(street_1, javax.swing.GroupLayout.PREFERRED_SIZE, 324, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(street_5, javax.swing.GroupLayout.PREFERRED_SIZE, 324, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(street_6, javax.swing.GroupLayout.PREFERRED_SIZE, 324, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(race_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(stadistic_6, javax.swing.GroupLayout.DEFAULT_SIZE, 125, Short.MAX_VALUE)
                    .addComponent(stadistic_5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(stadistic_2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(stadistic_1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(stadistic_3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(stadistic_4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(race_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(player_2, javax.swing.GroupLayout.DEFAULT_SIZE, 196, Short.MAX_VALUE)
                    .addComponent(player_1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(player_3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(player_4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(player_5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(player_6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        race_panelLayout.setVerticalGroup(
            race_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(race_panelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(race_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(player_1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(street_1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(stadistic_1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(8, 8, 8)
                .addGroup(race_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(race_panelLayout.createSequentialGroup()
                        .addGroup(race_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(player_2, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(street_2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(race_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, race_panelLayout.createSequentialGroup()
                                .addComponent(street_3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18))
                            .addGroup(race_panelLayout.createSequentialGroup()
                                .addComponent(player_3, javax.swing.GroupLayout.DEFAULT_SIZE, 63, Short.MAX_VALUE)
                                .addGap(18, 18, 18)))
                        .addGroup(race_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(player_4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(street_4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(race_panelLayout.createSequentialGroup()
                        .addComponent(stadistic_2, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(stadistic_3, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(stadistic_4, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(race_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(race_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(race_panelLayout.createSequentialGroup()
                            .addGap(17, 17, 17)
                            .addComponent(street_5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(race_panelLayout.createSequentialGroup()
                            .addGap(11, 11, 11)
                            .addComponent(player_5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(race_panelLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(stadistic_5, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(race_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(street_6, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(player_6, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(stadistic_6, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(38, Short.MAX_VALUE))
        );

        exit.setText("Salir");
        exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitActionPerformed(evt);
            }
        });

        dice_rsp.setText("resultado");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(new_race, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(exit, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(track_name, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(track_kilometers, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(win_his))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(224, 224, 224)
                                        .addComponent(dices_drop))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(248, 248, 248)
                                        .addComponent(dice_rsp))))
                            .addComponent(race_panel, javax.swing.GroupLayout.PREFERRED_SIZE, 705, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 8, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(13, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(new_race)
                    .addComponent(exit))
                .addGap(16, 16, 16)
                .addComponent(race_panel, javax.swing.GroupLayout.PREFERRED_SIZE, 493, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(dices_drop)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(track_name)
                        .addGap(11, 11, 11)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(dice_rsp, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(track_kilometers))
                    .addComponent(win_his))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    private void new_raceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_new_raceActionPerformed
        // TODO add your handling code here:
        // add validation
        meth.select();
        String name = "";
        String parss = "";
        String regular_ex="[123456]";
        reset();
        do{
            do{
                parss = JOptionPane.showInputDialog(new_race,"Ingrese numero de jugadores","Numero de corredores",1);
            }while(!parss.matches(regular_ex));
        players = Integer.parseInt(parss);
        
        }while(players > 6 || players < 3);
        addPlayer(players);
        int count = 1;
        for(int i=0;i<players;i++){
            name = JOptionPane.showInputDialog(new_race,"Nombre del jugador #"+ count,"Nombres");
            names[i] = name;
            count++;
        }
        
        add_names(names);
        track_name.setText(meth.getTrackName());
        track_kilometers.setText(Double.toString(meth.getTrackKil()));
        start_line = true;
        meth.setPlayers(names);
    }//GEN-LAST:event_new_raceActionPerformed

    private void dices_dropActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dices_dropActionPerformed
        // TODO add your handling code here:
        if (start_line){
            // null = ya van 3 ganadores , win que ya el ganadoe esta añadido , kilometros
           String klm = meth.runWay(this.turn);
           if(klm == null){
               //tres ganadores
               start_line = false;
               loadWin();
               reset();
           }else if(klm.equalsIgnoreCase("win")){
               // ya existe campeon
               this.turn++;
               dice_rsp.setText("Ganador pasa");
               if(this.turn == this.players){
                   this.turn = 0;
               }
           }else{
               dice_rsp.setText("Avance: "+ meth.getdice());
               setKlm(this.turn,klm);
               this.turn++;
               if(this.turn == this.players){
                   this.turn = 0;
               }
           }
        }else{
            JOptionPane.showConfirmDialog(rootPane, "¡¡¡Primero Inicia La carrera!!!","Error",JOptionPane.CLOSED_OPTION);
        }
    }//GEN-LAST:event_dices_dropActionPerformed

    private void exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_exitActionPerformed

    private void win_hisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_win_hisActionPerformed
        // TODO add your handling code here:
        Cars.HistoryPanel hst = new Cars.HistoryPanel();
        hst.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_win_hisActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainPanel().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel dice_rsp;
    private javax.swing.JButton dices_drop;
    private javax.swing.JButton exit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JButton new_race;
    private javax.swing.JLabel player_1;
    private javax.swing.JLabel player_2;
    private javax.swing.JLabel player_3;
    private javax.swing.JLabel player_4;
    private javax.swing.JLabel player_5;
    private javax.swing.JLabel player_6;
    private javax.swing.JPanel race_panel;
    private javax.swing.JLabel stadistic_1;
    private javax.swing.JLabel stadistic_2;
    private javax.swing.JLabel stadistic_3;
    private javax.swing.JLabel stadistic_4;
    private javax.swing.JLabel stadistic_5;
    private javax.swing.JLabel stadistic_6;
    private javax.swing.JLabel street_1;
    private javax.swing.JLabel street_2;
    private javax.swing.JLabel street_3;
    private javax.swing.JLabel street_4;
    private javax.swing.JLabel street_5;
    private javax.swing.JLabel street_6;
    private javax.swing.JLabel track_kilometers;
    private javax.swing.JLabel track_name;
    private javax.swing.JButton win_his;
    // End of variables declaration//GEN-END:variables
    
    class BackGround extends JPanel{
        private Image wallpaper;
        
        @Override
        public void paint(Graphics g){
            wallpaper = new ImageIcon(getClass().getResource("/Resources/16wallpaper.jpg")).getImage();
            
            g.drawImage(wallpaper, 0, 0, this.getWidth(), this.getHeight() , this);
            
            this.setOpaque(false);
            
            super.paint(g);
        }
    }
    
}

