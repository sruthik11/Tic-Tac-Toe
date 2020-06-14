
import java.awt.Color;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Random;
import javax.swing.JOptionPane;
import javax.swing.border.LineBorder;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ritwi
 */
public class GamePlay extends javax.swing.JFrame {
    int score=0,score1=0;
    int counter=0;
    int a1;
    int a2;
    int a3;
    int a4;
    int a5;
    int a6;
    int a7;
    int a8;
    int a9;
    int[] arr;
    int[] check;
    int[] edge;
    int[] corner;
    int computerwins;
    int humanwins;
    int chance;
    int lolwa;
    /**
     * Creates new form GamePlay
     */
    public GamePlay() {
        this.a1 = 0;
        this.a2 = 0;
        this.a3 = 0;
        this.a4 = 0;
        this.a5 = 0;
        this.a6 = 0;
        this.a7 = 0;
        this.a8 = 0;
        this.a9 = 0;
        this.arr = new int[] { this.a1, this.a2, this.a3, this.a4, this.a5, this.a6, this.a7, this.a8, this.a9 };
        this.check = new int[] { 1, 3, 7, 9, 2, 4, 5, 6, 8 };
        this.edge = new int[] { 2, 4, 6, 8 };
        this.corner = new int[] { 1, 3, 7, 9 };
        this.computerwins = 0;
        this.humanwins = 0;
        this.chance = 0;
        this.lolwa = 2;
        initComponents();
    }
    
        
     void highlighthuman() {
        if (this.a1 == 1 && this.a2 == 1 && this.a3 == 1) {
            this.jLabel1.setForeground(Color.blue);
            this.jLabel2.setForeground(Color.blue);
            this.jLabel3.setForeground(Color.blue);
        }
        else if (this.a4 == 1 && this.a5 == 1 && this.a6 == 1) {
            this.jLabel4.setForeground(Color.blue);
            this.jLabel5.setForeground(Color.blue);
            this.jLabel6.setForeground(Color.blue);
        }
        else if (this.a7 == 1 && this.a8 == 1 && this.a9 == 1) {
            this.jLabel7.setForeground(Color.blue);
            this.jLabel8.setForeground(Color.blue);
            this.jLabel9.setForeground(Color.blue);
        }
        else if (this.a1 == 1 && this.a5 == 1 && this.a9 == 1) {
            this.jLabel1.setForeground(Color.blue);
            this.jLabel5.setForeground(Color.blue);
            this.jLabel9.setForeground(Color.blue);
        }
        else if (this.a3 == 1 && this.a5 == 1 && this.a7 == 1) {
            this.jLabel3.setForeground(Color.blue);
            this.jLabel5.setForeground(Color.blue);
            this.jLabel7.setForeground(Color.blue);
        }
        else if (this.a1 == 1 && this.a4 == 1 && this.a7 == 1) {
            this.jLabel1.setForeground(Color.blue);
            this.jLabel4.setForeground(Color.blue);
            this.jLabel7.setForeground(Color.blue);
        }
        else if (this.a2 == 1 && this.a5 == 1 && this.a8 == 1) {
            this.jLabel2.setForeground(Color.blue);
            this.jLabel5.setForeground(Color.blue);
            this.jLabel8.setForeground(Color.blue);
        }
        else if (this.a3 == 1 && this.a6 == 1 && this.a9 == 1) {
            this.jLabel3.setForeground(Color.blue);
            this.jLabel6.setForeground(Color.blue);
            this.jLabel9.setForeground(Color.blue);
        }
    }
    
    void highlightcomp() {
        if (this.a1 == 2 && this.a2 == 2 && this.a3 == 2) {
            this.jLabel1.setForeground(Color.blue);
            this.jLabel2.setForeground(Color.blue);
            this.jLabel3.setForeground(Color.blue);
        }
        else if (this.a4 == 2 && this.a5 == 2 && this.a6 == 2) {
            this.jLabel4.setForeground(Color.blue);
            this.jLabel5.setForeground(Color.blue);
            this.jLabel6.setForeground(Color.blue);
        }
        else if (this.a7 == 2 && this.a8 == 2 && this.a9 == 2) {
            this.jLabel7.setForeground(Color.blue);
            this.jLabel8.setForeground(Color.blue);
            this.jLabel9.setForeground(Color.blue);
        }
        else if (this.a1 == 2 && this.a5 == 2 && this.a9 == 2) {
            this.jLabel1.setForeground(Color.blue);
            this.jLabel5.setForeground(Color.blue);
            this.jLabel9.setForeground(Color.blue);
        }
        else if (this.a3 == 2 && this.a5 == 2 && this.a7 == 2) {
            this.jLabel3.setForeground(Color.blue);
            this.jLabel5.setForeground(Color.blue);
            this.jLabel7.setForeground(Color.blue);
        }
        else if (this.a1 == 2 && this.a4 == 2 && this.a7 == 2) {
            this.jLabel1.setForeground(Color.blue);
            this.jLabel4.setForeground(Color.blue);
            this.jLabel7.setForeground(Color.blue);
        }
        else if (this.a2 == 2 && this.a5 == 2 && this.a8 == 2) {
            this.jLabel2.setForeground(Color.blue);
            this.jLabel5.setForeground(Color.blue);
            this.jLabel8.setForeground(Color.blue);
        }
        else if (this.a3 == 2 && this.a6 == 2 && this.a9 == 2) {
            this.jLabel3.setForeground(Color.blue);
            this.jLabel6.setForeground(Color.blue);
            this.jLabel9.setForeground(Color.blue);
        }
    }
    
    boolean computervictory() {
        boolean what = false;
        if (this.a1 == 2 && this.a2 == 2 && this.a3 == 2) {
            what = true;
        }
        else if (this.a4 == 2 && this.a5 == 2 && this.a6 == 2) {
            what = true;
        }
        else if (this.a7 == 2 && this.a8 == 2 && this.a9 == 2) {
            what = true;
        }
        else if (this.a1 == 2 && this.a5 == 2 && this.a9 == 2) {
            what = true;
        }
        else if (this.a3 == 2 && this.a5 == 2 && this.a7 == 2) {
            what = true;
        }
        else if (this.a1 == 2 && this.a4 == 2 && this.a7 == 2) {
            what = true;
        }
        else if (this.a2 == 2 && this.a5 == 2 && this.a8 == 2) {
            what = true;
        }
        else if (this.a3 == 2 && this.a6 == 2 && this.a9 == 2) {
            what = true;
        }
        return what;
    }
    
    boolean humanvictory() {
        boolean what = false;
        if (this.a1 == 1 && this.a2 == 1 && this.a3 == 1) {
            what = true;
        }
        else if (this.a4 == 1 && this.a5 == 1 && this.a6 == 1) {
            what = true;
        }
        else if (this.a7 == 1 && this.a8 == 1 && this.a9 == 1) {
            what = true;
        }
        else if (this.a1 == 1 && this.a5 == 1 && this.a9 == 1) {
            what = true;
        }
        else if (this.a3 == 1 && this.a5 == 1 && this.a7 == 1) {
            what = true;
        }
        else if (this.a1 == 1 && this.a4 == 1 && this.a7 == 1) {
            what = true;
        }
        else if (this.a2 == 1 && this.a5 == 1 && this.a8 == 1) {
            what = true;
        }
        else if (this.a3 == 1 && this.a6 == 1 && this.a9 == 1) {
            what = true;
        }
        return what;
    }
    
    boolean humanmark(final int g) {
        boolean isdone = false;
        if (g == 1 && this.a1 == 0) {
            isdone = true;
            this.a1 = 1;
        }
        else if (g == 2 && this.a2 == 0) {
            isdone = true;
            this.a2 = 1;
        }
        else if (g == 3 && this.a3 == 0) {
            isdone = true;
            this.a3 = 1;
        }
        else if (g == 4 && this.a4 == 0) {
            isdone = true;
            this.a4 = 1;
        }
        else if (g == 5 && this.a5 == 0) {
            isdone = true;
            this.a5 = 1;
        }
        else if (g == 6 && this.a6 == 0) {
            isdone = true;
            this.a6 = 1;
        }
        else if (g == 7 && this.a7 == 0) {
            isdone = true;
            this.a7 = 1;
        }
        else if (g == 8 && this.a8 == 0) {
            isdone = true;
            this.a8 = 1;
        }
        else if (g == 9 && this.a9 == 0) {
            isdone = true;
            this.a9 = 1;
        }
        return isdone;
    }
    
    boolean computerMark(final int o) {
        boolean isdone = false;
        if (o == 1 && this.a1 == 0) {
            isdone = true;
            this.a1 = 2;
        }
        else if (o == 2 && this.a2 == 0) {
            isdone = true;
            this.a2 = 2;
        }
        else if (o == 3 && this.a3 == 0) {
            isdone = true;
            this.a3 = 2;
        }
        else if (o == 4 && this.a4 == 0) {
            isdone = true;
            this.a4 = 2;
        }
        else if (o == 5 && this.a5 == 0) {
            isdone = true;
            this.a5 = 2;
        }
        else if (o == 6 && this.a6 == 0) {
            isdone = true;
            this.a6 = 2;
        }
        else if (o == 7 && this.a7 == 0) {
            isdone = true;
            this.a7 = 2;
        }
        else if (o == 8 && this.a8 == 0) {
            isdone = true;
            this.a8 = 2;
        }
        else if (o == 9 && this.a9 == 0) {
            isdone = true;
            this.a9 = 2;
        }
        return isdone;
    }
    
    void checkandend() {
       String y=EnterName1.playero ;
       String x=EnterName1.playerx ;
       
        if (this.humanvictory()) {
                       
             this.highlighthuman();
            if(Welcome.pvp==1)  { 
            
            JOptionPane.showMessageDialog(null,"PLAYER "+ x +" WON");
            
            
            }
             else { 
                
                
            JOptionPane.showMessageDialog(null, "OMG! YOU DEFEATED THE COMPUTER");
            }

                
            ++this.humanwins;
            score++;
            counter=0;
            
            this.jLabel14.setText(Integer.toString(this.humanwins));
        }
        else if (this.computervictory()) {
            this.highlightcomp();
            if(Welcome.pvp==0)   
            JOptionPane.showMessageDialog(null, "Better luck next time");
            else {
               
            JOptionPane.showMessageDialog(null, "PLAYER "+ y +" wins");
            
            }
            ++this.computerwins;
            score++;
            counter=0;
            
            this.jLabel13.setText(Integer.toString(this.computerwins));
        }
        else if (this.a1 != 0 && this.a2 != 0 && this.a3 != 0 && this.a4 != 0 && this.a5 != 0 && this.a6 != 0 && this.a7 != 0 && this.a8 != 0 && this.a9 != 0) {
            JOptionPane.showMessageDialog(null, "Its a draw!");
            score++;
            counter=0;
           
            
        } 
        if(score==BestOf.num){
            if(Welcome.pvp==0){
            try{
            Connection con=(Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/tic","root","1234");
            Statement  stmt = null;
            ResultSet rs=null;
            stmt = con.createStatement();
            String uname=EnterName2.uname;
            String strSQL1="SELECT score FROM scorre where name=('"+uname+"')";
            rs=stmt.executeQuery(strSQL1);
            while(rs.next()){
            EnterName2.s=rs.getInt("score");
            System.out.println(EnterName2.s);
            }
            String score1=jLabel14.getText();
            int sc=Integer.parseInt(score1);
            System.out.println(x);
            int pl=(EnterName2.s);
            System.out.println(y);
            int sum=sc+pl;
         
            String f=Integer.toString(sum);
            System.out.println(f);
            String strSQL = ("UPDATE scorre set score=? where name=?");
            
            PreparedStatement pr=con.prepareStatement(strSQL);
            pr.setString(1,f);
            pr.setString(2,EnterName2.uname);
            pr.executeUpdate();
            System.out.println("insert new reord");
            

            //JOptionPane.showMessageDialog(null,"1 record inserted");
        }
            catch(Exception e)
        {
            //JOptionPane.showMessageDialog(this,e.getMessage());

        }
    
           Leaderboard w=new Leaderboard();
            w.setVisible(true);
            this.dispose();
        } 
            else{
            try{
            Connection con=(Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/tic","root","1234");
            Statement  stmt = null;
            ResultSet rs=null;
            stmt = con.createStatement();
            String uname=EnterName1.playerx;
            String uname1=EnterName1.playero;
            String strSQL="SELECT score FROM scorre where name=('"+uname+"')";
            rs=stmt.executeQuery(strSQL);
            while(rs.next()){
            EnterName1.s=rs.getInt("score");
            System.out.println(EnterName1.s);
            }
            String score1=jLabel14.getText();
            int sc=Integer.parseInt(score1);
            System.out.println(x);
            int sum=sc+(EnterName1.s);
            String f=Integer.toString(sum);
            System.out.println(f);
            String strSQL1 = ("UPDATE scorre set score=? where name=?");
            PreparedStatement pr=con.prepareStatement(strSQL1);
            pr.setString(1,f);
            pr.setString(2,EnterName1.playerx);
            pr.executeUpdate();
            System.out.println("insert new reord");
            
            
            String strSQL2="SELECT score FROM scorre where name=('"+uname1+"')";
            rs=stmt.executeQuery(strSQL2);
            while(rs.next()){
            EnterName1.s2=rs.getInt("score");
            System.out.println(EnterName1.s2);
            }
            String score2=jLabel13.getText();
            int x1=Integer.parseInt(score2);
            System.out.println(x1);
            int y1=(EnterName1.s2);
            System.out.println(y);
            int sum1=x1+y1;
         
            String f1=Integer.toString(sum1);
            System.out.println(f);
            String strSQL3 = ("UPDATE scorre set score=? where name=?");
            PreparedStatement pr1=con.prepareStatement(strSQL3);
            pr1.setString(1,f1);
            pr1.setString(2,EnterName1.playero);
            pr1.executeUpdate();
            System.out.println("insert new reord");
            

            //JOptionPane.showMessageDialog(null,"1 record inserted");
        }
            catch(Exception e)
        {
            //JOptionPane.showMessageDialog(this,e.getMessage());

        }
    
           Leaderboard w=new Leaderboard();
            w.setVisible(true);
            this.dispose();
        }
        }
       
           
        
    }
    
    boolean computerUnmark(final int g) {
        boolean isdone = false;
        if (g == 1 && this.a1 == 2) {
            isdone = true;
            this.a1 = 0;
        }
        else if (g == 2 && this.a2 == 2) {
            isdone = true;
            this.a2 = 0;
        }
        else if (g == 3 && this.a3 == 2) {
            isdone = true;
            this.a3 = 0;
        }
        else if (g == 4 && this.a4 == 2) {
            isdone = true;
            this.a4 = 0;
        }
        else if (g == 5 && this.a5 == 2) {
            isdone = true;
            this.a5 = 0;
        }
        else if (g == 6 && this.a6 == 2) {
            isdone = true;
            this.a6 = 0;
        }
        else if (g == 7 && this.a7 == 2) {
            isdone = true;
            this.a7 = 0;
        }
        else if (g == 8 && this.a8 == 2) {
            isdone = true;
            this.a8 = 0;
        }
        else if (g == 9 && this.a9 == 2) {
            isdone = true;
            this.a9 = 0;
        }
        return isdone;
    }
    
    boolean humanUnmark(final int g) {
        boolean isdone = false;
        if (g == 1 && this.a1 == 1) {
            isdone = true;
            this.a1 = 0;
        }
        else if (g == 2 && this.a2 == 1) {
            isdone = true;
            this.a2 = 0;
        }
        else if (g == 3 && this.a3 == 1) {
            isdone = true;
            this.a3 = 0;
        }
        else if (g == 4 && this.a4 == 1) {
            isdone = true;
            this.a4 = 0;
        }
        else if (g == 5 && this.a5 == 1) {
            isdone = true;
            this.a5 = 0;
        }
        else if (g == 6 && this.a6 == 1) {
            isdone = true;
            this.a6 = 0;
        }
        else if (g == 7 && this.a7 == 1) {
            isdone = true;
            this.a7 = 0;
        }
        else if (g == 8 && this.a8 == 1) {
            isdone = true;
            this.a8 = 0;
        }
        else if (g == 9 && this.a9 == 1) {
            isdone = true;
            this.a9 = 0;
        }
        return isdone;
    }
    
    boolean mark(final int a) {
        boolean isdone = false;
        if (a == 1 && this.a1 == 0) {
            this.jLabel1.setText("O");
            isdone = true;
            this.a1 = 2;
        }
        else if (a == 2 && this.a2 == 0) {
            this.jLabel2.setText("O");
            isdone = true;
            this.a2 = 2;
        }
        else if (a == 3 && this.a3 == 0) {
            this.jLabel3.setText("O");
            isdone = true;
            this.a3 = 2;
        }
        else if (a == 4 && this.a4 == 0) {
            this.jLabel4.setText("O");
            isdone = true;
            this.a4 = 2;
        }
        else if (a == 5 && this.a5 == 0) {
            this.jLabel5.setText("O");
            isdone = true;
            this.a5 = 2;
        }
        else if (a == 6 && this.a6 == 0) {
            this.jLabel6.setText("O");
            isdone = true;
            this.a6 = 2;
        }
        else if (a == 7 && this.a7 == 0) {
            this.jLabel7.setText("O");
            isdone = true;
            this.a7 = 2;
        }
        else if (a == 8 && this.a8 == 0) {
            this.jLabel8.setText("O");
            isdone = true;
            this.a8 = 2;
        }
        else if (a == 9 && this.a9 == 0) {
            this.jLabel9.setText("O");
            isdone = true;
            this.a9 = 2;
        }
        return isdone;
    }
    //EASY
    void computerplayeasy() {
              int played=0;          
        if (played == 0 && this.chance == 1 && this.lolwa % 2 == 0) {
            final Random y = new Random();
                for (int p = 0; p <= 1000; ++p) {
                    final int neay = y.nextInt(10);
                    if (this.mark(neay)) {
                        ++this.chance;
                        played = 1;
                        break;

        }}}

        if (played == 0 && this.chance == 1 && this.lolwa % 2 == 1) {
            final Random z = new Random();
                for (int p = 0; p <= 1000; ++p) {
                    final int neaz = z.nextInt(10);
                    if (this.mark(neaz)) {
                        ++this.chance;
                        played = 1;
                        break;
                        

        }}}
      /*  else if (this.chance > 0 && played == 0) {
            for (int p2 = 0; p2 <= 8; ++p2) {
              final boolean checker = this.computerMark(this.check[p2]);
                if (this.computervictory()) {
                    this.computerUnmark(this.check[p2]);
                    this.mark(this.check[p2]);
                    System.out.println("GOT It its" + this.check[p2]);
                    played = 1;
                    break;
                }
                if (checker) {
                    this.computerUnmark(this.check[p2]);
                }
            }
        }
        if (this.chance > 0 && played == 0) {
            for (int p2 = 0; p2 <= 8; ++p2) {
                final boolean damn = this.humanmark(this.check[p2]);
                if (this.humanvictory()) {
                    this.humanUnmark(this.check[p2]);
                    this.mark(this.check[p2]);
                    System.out.println("GOT It its" + this.check[p2]);
                    played = 1;
                    break;
                }
                if (damn) {
                    this.humanUnmark(this.check[p2]);
                }
            }
        }*/
        if (played == 0) {
            for (int p2 = 0; p2 <= 8; ++p2) {
                if (this.mark(this.check[p2])) {
                    ++this.chance;
                    played = 1;
                    break;
                }
            }
        }
    }

     /*void computerplay() {
         int played=0;              
        if (played == 0 && this.chance == 1 && this.lolwa % 2 == 0) {
            final Random y = new Random();
                for (int p = 0; p <= 1000; ++p) {
                    final int neay = y.nextInt(10);
                    if (this.mark(neay)) {
                        ++this.chance;
                        played = 1;
                        break;

        }}}

        if (played == 0 && this.chance == 1 && this.lolwa % 2 == 1) {
            final Random z = new Random();
                for (int p = 0; p <= 1000; ++p) {
                    final int neaz = z.nextInt(10);
                    if (this.mark(neaz)) {
                        ++this.chance;
                        played = 1;
                        break;
                        
                        

        }}}
        else if (this.chance > 0 && played == 0) {
            for (int p2 = 0; p2 <= 8; ++p2) {
                final boolean checker = this.computerMark(this.check[p2]);
                if (this.computervictory()) {
                    this.computerUnmark(this.check[p2]);
                    this.mark(this.check[p2]);
                    System.out.println("GOT It its" + this.check[p2]);
                    played = 7;
                    break;
                }
                if (checker) {
                    this.computerUnmark(this.check[p2]);
                }
            }
        }
        if (this.chance > 0 && played == 0) {
            for (int p2 = 0; p2 <= 8; ++p2) {
                final boolean damn = this.humanmark(this.check[p2]);
                if (this.humanvictory()) {
                    this.humanUnmark(this.check[p2]);
                    this.mark(this.check[p2]);
                    System.out.println("GOT It its" + this.check[p2]);
                    played = 1;
                    break;
                }
                if (damn) {
                    this.humanUnmark(this.check[p2]);
                }
            }
        }
        if (played == 0) {
            for (int p2 = 0; p2 <= 8; ++p2) {
                if (this.mark(this.check[p2])) {
                    ++this.chance;
                    played = 1;
                    break;
                }
            }
        }
    }*/

    
        void computerplayhard() {
        int cornerplayed = 0;
        if (this.a1 == 1 && this.a9 == 1) {
            cornerplayed = 1;
        }
        else if (this.a3 == 1 && this.a7 == 1) {
            cornerplayed = 1;
        }
        int played = 0;
        System.out.println("" + this.lolwa % 2 + played + this.chance);
        if (this.lolwa % 2 == 1 && played == 0 && this.chance == 1 && (this.a2 == 1 || this.a4 == 1 || this.a6 == 1 || this.a8 == 1)) {
            this.mark(5);
            played = 1;
            ++this.chance;
        }
        if (this.lolwa % 2 == 0 && played == 0 && this.chance == 0 && (this.a2 == 1 || this.a4 == 1 || this.a6 == 1 || this.a8 == 1)) {
            this.mark(5);
            played = 1;
            ++this.chance;
        }
        if (this.chance == 0 && played == 0) {
            if (this.a1 == 1 || this.a3 == 1 || this.a7 == 1 || this.a9 == 1) {
                this.mark(5);
                played = 1;
                ++this.chance;
            }
            else {
                final Random x = new Random();
                for (int p = 0; p <= 1000; ++p) {
                    final int need = x.nextInt(5);
                    if (this.mark(this.corner[need])) {
                        ++this.chance;
                        played = 1;
                        break;
                    }
                }
            }
        }
        if (played == 0 && this.chance == 1 && cornerplayed == 1 && this.lolwa % 2 == 1) {
            for (int p2 = 0; p2 <= 4; ++p2) {
                if (this.mark(this.edge[p2])) {
                    ++this.chance;
                    played = 1;
                    break;
                }
            }
        }
        if (played == 0 && this.chance == 1 && cornerplayed == 1 && this.lolwa % 2 == 0) {
            for (int p2 = 0; p2 <= 4; ++p2) {
                if (this.mark(this.edge[p2])) {
                    ++this.chance;
                    played = 1;
                    break;
                }
            }
        }
        if (played == 0 && this.chance == 1 && cornerplayed == 0 && this.lolwa % 2 == 1) {
            if (this.a4 == 1) {
                if (this.mark(1)) {
                    ++this.chance;
                    played = 1;
                }
                else {
                    this.mark(7);
                    ++this.chance;
                    played = 1;
                }
            }
            if (this.a6 == 1) {
                if (this.mark(3)) {
                    ++this.chance;
                    played = 1;
                }
                else {
                    this.mark(9);
                    ++this.chance;
                    played = 1;
                }
            }
            if (this.a2 == 1) {
                if (this.mark(1)) {
                    ++this.chance;
                    played = 1;
                }
                else {
                    this.mark(3);
                    ++this.chance;
                    played = 1;
                }
            }
            if (this.a8 == 1) {
                if (this.mark(7)) {
                    ++this.chance;
                    played = 1;
                }
                else {
                    this.mark(9);
                    ++this.chance;
                    played = 1;
                }
            }
        }
        else if (this.chance > 0 && played == 0) {
            for (int p2 = 0; p2 <= 8; ++p2) {
                final boolean checker = this.computerMark(this.check[p2]);
                if (this.computervictory()) {
                    this.computerUnmark(this.check[p2]);
                    this.mark(this.check[p2]);
                    System.out.println("GOT It its" + this.check[p2]);
                    played = 7;
                    break;
                }
                if (checker) {
                    this.computerUnmark(this.check[p2]);
                }
            }
        }
        if (this.chance > 0 && played == 0) {
            for (int p2 = 0; p2 <= 8; ++p2) {
                final boolean damn = this.humanmark(this.check[p2]);
                if (this.humanvictory()) {
                    this.humanUnmark(this.check[p2]);
                    this.mark(this.check[p2]);
                    System.out.println("GOT It its" + this.check[p2]);
                    played = 1;
                    break;
                }
                if (damn) {
                    this.humanUnmark(this.check[p2]);
                }
            }
        }
        if (played == 0) {
            for (int p2 = 0; p2 <= 8; ++p2) {
                if (this.mark(this.check[p2])) {
                    ++this.chance;
                    played = 1;
                    break;
                }
            }
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollBar1 = new javax.swing.JScrollBar();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(0, 153, 153));
        jPanel2.setBorder(javax.swing.BorderFactory.createMatteBorder(6, 8, 6, 8, new java.awt.Color(0, 0, 0)));

        jLabel1.setBackground(new java.awt.Color(204, 255, 255));
        jLabel1.setFont(new java.awt.Font("Segoe Script", 0, 48)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 102, 102), 8, true));
        jLabel1.setOpaque(true);
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });

        jLabel2.setBackground(new java.awt.Color(204, 255, 255));
        jLabel2.setFont(new java.awt.Font("Segoe Script", 0, 48)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 102, 102), 8, true));
        jLabel2.setOpaque(true);
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });

        jLabel3.setBackground(new java.awt.Color(204, 255, 255));
        jLabel3.setFont(new java.awt.Font("Segoe Script", 0, 48)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 102, 102), 8, true));
        jLabel3.setOpaque(true);
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });

        jLabel4.setBackground(new java.awt.Color(204, 255, 255));
        jLabel4.setFont(new java.awt.Font("Segoe Script", 0, 48)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 102, 102), 8, true));
        jLabel4.setOpaque(true);
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
        });

        jLabel5.setBackground(new java.awt.Color(204, 255, 255));
        jLabel5.setFont(new java.awt.Font("Segoe Script", 0, 48)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 102, 102), 8, true));
        jLabel5.setOpaque(true);
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
        });

        jLabel6.setBackground(new java.awt.Color(204, 255, 255));
        jLabel6.setFont(new java.awt.Font("Segoe Script", 0, 48)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 102, 102), 8, true));
        jLabel6.setOpaque(true);
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel6MouseClicked(evt);
            }
        });

        jLabel7.setBackground(new java.awt.Color(204, 255, 255));
        jLabel7.setFont(new java.awt.Font("Segoe Print", 0, 48)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 102, 102), 8, true));
        jLabel7.setOpaque(true);
        jLabel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel7MouseClicked(evt);
            }
        });

        jLabel8.setBackground(new java.awt.Color(204, 255, 255));
        jLabel8.setFont(new java.awt.Font("Segoe Script", 0, 48)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 102, 102), 8, true));
        jLabel8.setOpaque(true);
        jLabel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel8MouseClicked(evt);
            }
        });

        jLabel9.setBackground(new java.awt.Color(204, 255, 255));
        jLabel9.setFont(new java.awt.Font("Segoe Print", 0, 48)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 102, 102), 8, true));
        jLabel9.setOpaque(true);
        jLabel9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel9MouseClicked(evt);
            }
        });

        jButton4.setFont(new java.awt.Font("Agency FB", 1, 14)); // NOI18N
        jButton4.setText("RESTART");
        jButton4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0)));
        jButton4.setOpaque(false);
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jLabel10.setText("X");

        jLabel11.setText("O");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(150, 150, 150)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(64, 64, 64)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(90, 90, 90)
                                .addComponent(jLabel12)
                                .addGap(0, 27, Short.MAX_VALUE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel11)
                                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(64, 64, 64)
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(106, 106, 106)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel12)
                        .addGap(227, 227, 227)
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(11, 11, 11))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(65, 65, 65)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(104, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
   
        this.chance = 0;
        this.jLabel1.setText("");
        this.jLabel2.setText("");
        this.jLabel3.setText("");
        this.jLabel4.setText("");
        this.jLabel5.setText("");
        this.jLabel6.setText("");
        this.jLabel7.setText("");
        this.jLabel8.setText("");
        this.jLabel9.setText("");
        this.humanwins=0;
        this.jLabel13.setText("");
        this.computerwins=0;
        this.jLabel14.setText("");
        this.a1 = 0;
        this.a2 = 0;
        this.a3 = 0;
        this.a4 = 0;
        this.a5 = 0;
        this.a6 = 0;
        this.a7 = 0;
        this.a8 = 0;
        this.a9 = 0;
        JOptionPane.showMessageDialog(null, "New Game!");
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
       if (this.a2 == 0) {
          if(Welcome.pvp==1){
          if(this.lolwa%2==0)
          
          {if(counter%2==0){
           this.jLabel2.setText("X");
           ++this.a2;
          }
           
           else
          {this.jLabel2.setText("O");
          this.a2=2;
          }
             counter++;
          }
          
          else
          {
            if(counter%2==0){
           this.jLabel2.setText("O");
           this.a2=2;
          }
           
           else
          {this.jLabel2.setText("X");
          ++this.a2;
          }
             counter++;  
          }
          }
          
              
          
          
          
          else{
           this.jLabel2.setText("X");
           ++this.a2;
           if(Difficulty.diff==0)
           this.computerplayeasy();
           else 
               this.computerplayhard();
          }
            
           
        }
        this.checkandend(); // TODO add your handling code here: 
    }//GEN-LAST:event_jLabel2MouseClicked

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        if (this.a1 == 0) {
          if(Welcome.pvp==1){ 
          if(this.lolwa%2==0){
          if(counter%2==0){
           this.jLabel1.setText("X");
           ++this.a1;
          }
           
           else
          {this.jLabel1.setText("O");
          this.a1=2;
          }
             counter++;
          }
          else{
              if(counter%2==0){
           this.jLabel1.setText("O");
           this.a1=2;
          }
           
           else
          {this.jLabel1.setText("X");
          ++this.a1;
          }
             counter++;
          }
          }
          else
          {
           this.jLabel1.setText("X");
           ++this.a1;
           if(Difficulty.diff==0)
            this.computerplayeasy();
            else 
                this.computerplayhard();
          }
            
           /* if(Difficulty.diff==0)
            this.computerplayeasy();
            else 
                this.computerplayhard();*/
        }
        this.checkandend(); // TODO add your handling code here: 
    }//GEN-LAST:event_jLabel1MouseClicked

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
     
        if (this.a3 == 0) {
           if(Welcome.pvp==1){ 
          if(this.lolwa%2==0){
          if(counter%2==0){
           this.jLabel3.setText("X");
           ++this.a3;
          }
           
           else
          {this.jLabel3.setText("O");
          this.a3=2;
          }
             counter++;
          }
          else{
              if(counter%2==0){
           this.jLabel3.setText("O");
           this.a3=2;
          }
           
           else
          {this.jLabel3.setText("X");
          ++this.a3;
          }
             counter++;
          }
          }
           else{
           this.jLabel3.setText("X");
           ++this.a3;
           if(Difficulty.diff==0)
            this.computerplayeasy();
           else 
                this.computerplayhard();
               
           }
            
           /* if(Difficulty.diff==0)
            this.computerplayeasy();
            else 
                this.computerplayhard();*/
        }
        this.checkandend(); // TODO add your handling code here: 
    }//GEN-LAST:event_jLabel3MouseClicked

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
        if (this.a4 == 0) {
            if(Welcome.pvp==1){ 
          if(this.lolwa%2==0){
          if(counter%2==0){
           this.jLabel4.setText("X");
           ++this.a4;
          }
           
           else
          {this.jLabel4.setText("O");
          this.a4=2;
          }
             counter++;
          }
          else{
              if(counter%2==0){
           this.jLabel4.setText("O");
           this.a4=2;
          }
           
           else
          {this.jLabel4.setText("X");
          ++this.a4;
          }
             counter++;
          }
          }
            else{
           this.jLabel4.setText("X");
           ++this.a4;
            if(Difficulty.diff==0)
            this.computerplayeasy();
            else 
                this.computerplayhard();
            }
            
           /* if(Difficulty.diff==0)
            this.computerplayeasy();
            else 
                this.computerplayhard();*/
        }
        this.checkandend(); // TODO add your handling code here: 
    }//GEN-LAST:event_jLabel4MouseClicked

    private void jLabel9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseClicked
        if (this.a9 == 0) {
            if(Welcome.pvp==1){ 
          if(this.lolwa%2==0){
          if(counter%2==0){
           this.jLabel9.setText("X");
           ++this.a9;
          }
           
           else
          {this.jLabel9.setText("O");
          this.a9=2;
          }
             counter++;
          }
          else{
              if(counter%2==0){
           this.jLabel9.setText("O");
           this.a9=2;
          }
           
           else
          {this.jLabel9.setText("X");
          ++this.a9;
          }
             counter++;
          }
          }
            else{
                this.jLabel9.setText("X");
           ++this.a9;
                if(Difficulty.diff==0)
            this.computerplayeasy();
            else 
                this.computerplayhard();
            }
            
           /* if(Difficulty.diff==0)
            this.computerplayeasy();
            else 
                this.computerplayhard();*/
        }
        this.checkandend(); // TODO add your handling code here: 
    }//GEN-LAST:event_jLabel9MouseClicked

    private void jLabel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseClicked
        if (this.a6 == 0) {
            if(Welcome.pvp==1){ 
          if(this.lolwa%2==0){
          if(counter%2==0){
           this.jLabel6.setText("X");
           ++this.a6;
          }
           
           else
          {this.jLabel6.setText("O");
          this.a6=2;
          }
             counter++;
          }
          else{
              if(counter%2==0){
           this.jLabel6.setText("O");
           this.a6=2;
          }
           
           else
          {this.jLabel6.setText("X");
          ++this.a6;
          }
             counter++;
          }
          }
            else
            {
            this.jLabel6.setText("X");
           ++this.a6;
           if(Difficulty.diff==0)
            this.computerplayeasy();
            else 
                this.computerplayhard();
                
            }
            
           /* if(Difficulty.diff==0)
            this.computerplayeasy();
            else 
                this.computerplayhard();*/
        }
        this.checkandend(); // TODO add your handling code here: 
    }//GEN-LAST:event_jLabel6MouseClicked

    private void jLabel8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseClicked
        if (this.a8 == 0) {
           if(Welcome.pvp==1){ 
          if(this.lolwa%2==0){
          if(counter%2==0){
           this.jLabel8.setText("X");
           ++this.a8;
          }
           
           else
          {this.jLabel8.setText("O");
          this.a8=2;
          }
             counter++;
          }
          else{
              if(counter%2==0){
           this.jLabel8.setText("O");
           this.a8=2;
          }
           
           else
          {this.jLabel8.setText("X");
          ++this.a8;
          }
             counter++;
          }
          }
            else{
            this.jLabel8.setText("X");
            ++this.a8;
            if(Difficulty.diff==0)
            this.computerplayeasy();
            else 
            this.computerplayhard();
                
            }
            
           /* if(Difficulty.diff==0)
            this.computerplayeasy();
            else 
                this.computerplayhard();*/
        }
        this.checkandend(); // TODO add your handling code here: 
    }//GEN-LAST:event_jLabel8MouseClicked

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked
        if (this.a5 == 0) {
          if(Welcome.pvp==1){ 
          if(this.lolwa%2==0){
          if(counter%2==0){
           this.jLabel5.setText("X");
           ++this.a5;
          }
           
           else
          {this.jLabel5.setText("O");
          this.a5=2;
          }
             counter++;
          }
          else{
              if(counter%2==0){
           this.jLabel5.setText("O");
           this.a5=2;
          }
           
           else
          {this.jLabel5.setText("X");
          ++this.a5;
          }
             counter++;
          }
          }
            else{this.jLabel5.setText("X");
            ++this.a5;
                if(Difficulty.diff==0)
            this.computerplayeasy();
            else 
                this.computerplayhard();
            }
            
           /* if(Difficulty.diff==0)
            this.computerplayeasy();
            else 
                this.computerplayhard();*/
        }
        this.checkandend(); // TODO add your handling code here: 
    }//GEN-LAST:event_jLabel5MouseClicked

    private void jLabel7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseClicked
        if (this.a7 == 0) {
           if(Welcome.pvp==1){ 
          if(this.lolwa%2==0){
          if(counter%2==0){
           this.jLabel7.setText("X");
           ++this.a7;
          }
           
           else
          {this.jLabel7.setText("O");
          this.a7=2;
          }
             counter++;
          }
          else{
              if(counter%2==0){
           this.jLabel7.setText("O");
           this.a7=2;
          }
           
           else
          {this.jLabel7.setText("X");
          ++this.a7;
          }
             counter++;
          }
          }
            else {this.jLabel7.setText("X");
            ++this.a7;
                if(Difficulty.diff==0)
            this.computerplayeasy();
            else 
                this.computerplayhard();
            }
            
           /* if(Difficulty.diff==0)
            this.computerplayeasy();
            else 
                this.computerplayhard();*/
        }
        this.checkandend(); // TODO add your handling code here: 
    }//GEN-LAST:event_jLabel7MouseClicked

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
       this.chance = 0;
        this.jLabel1.setText("");
        this.jLabel2.setText("");
        this.jLabel3.setText("");
        this.jLabel4.setText("");
        this.jLabel5.setText("");
        this.jLabel6.setText("");
        this.jLabel7.setText("");
        this.jLabel8.setText("");
        this.jLabel9.setText("");
        this.jLabel1.setForeground(Color.black);
        this.jLabel2.setForeground(Color.black);
        this.jLabel3.setForeground(Color.black);
        this.jLabel4.setForeground(Color.black);
        this.jLabel5.setForeground(Color.black);
        this.jLabel6.setForeground(Color.black);
        this.jLabel7.setForeground(Color.black);
        this.jLabel8.setForeground(Color.black);
        this.jLabel9.setForeground(Color.black);
        this.a1 = 0;
        this.a2 = 0;
        this.a3 = 0;
        this.a4 = 0;
        this.a5 = 0;
        this.a6 = 0;
        this.a7 = 0;
        this.a8 = 0;
        this.a9 = 0;
        if (this.lolwa % 2 == 0) {
            if(Welcome.pvp==0){
            if(Difficulty.diff==0)
            this.computerplayeasy();
            else 
                this.computerplayhard();
            }
            
                
            
        }
        ++this.lolwa; // TODO add your handling code here:
    }//GEN-LAST:event_formWindowActivated
 
    
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
            java.util.logging.Logger.getLogger(GamePlay.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GamePlay.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GamePlay.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GamePlay.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GamePlay().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollBar jScrollBar1;
    // End of variables declaration//GEN-END:variables
}
