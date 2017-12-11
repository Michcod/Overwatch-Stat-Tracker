import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JToggleButton;

public  class ST{
static boolean gS = false;
static boolean sS = false;
static GridLayout gl;
static String[] heroes = {"ana" , "bastion" , "d.va" , "doomfist" , "genji" , "hanzo" , "junkrat" , "lucio" , "mccree" , "mei" , "mercy" , "moira" , "orisa" , "pharah" , "reaper" , "reinhardt" , "roadhog" , "soldier:76" , "sombra" , "symmetra" , "torbjorn" , "tracer" , "widowmaker" , "winston" , "zarya" , "zenyatta"};
static JFrame disp;
static JPanel line2;
	public static void main(String[] args) {
		String un = null;
		FlowLayout flow = new FlowLayout();
		BufferedReader br;
		BufferedWriter bw;
		File file = new File("C:/Users/Michael/workspace/OwStatTrack/info.txt");
		try {
			br = new BufferedReader(new FileReader(file));
			bw = new BufferedWriter(new FileWriter(file, true));
			
			un = br.readLine();
			un="Username: "+un;
			
			
		} catch (FileNotFoundException e) {
			System.out.println("muh file again");
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("?IOExeption?");
			e.printStackTrace();
		}
		gl = new GridLayout(2,1);
		disp = new JFrame(un);
		JPanel buttons = new JPanel();
		line2 = new JPanel();
		JToggleButton getStats = new JToggleButton("Input new stats");
		JButton seeStats = new JButton("Look at old stats");
		disp.setLayout(gl);

		JComboBox selHero = new JComboBox(heroes);

		buttons.setLayout(flow);
		buttons.add(seeStats);
		buttons.add(getStats);
		line2.setLayout(flow);
		line2.add(selHero);
		System.out.println(selHero.getEditor().getItem());
		disp.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		disp.setVisible(true);
		disp.add(selHero);
		disp.pack();
		
		
		
		
	}

	public static void getStat(String hero, int mode){
		
	}

}
