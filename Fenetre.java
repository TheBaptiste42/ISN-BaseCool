package bvds;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;

/* CHOSE DEMANDEE, CHOSE DONNEE
 * VOICI VOTRE PROGRAMME QUI CONVERTI EN NIMPORTE QUELLE BASE !
 * IL EST FONCTIONNEL MAIS ECRIT EN JAVA. COMME VOUS NE CONNAISSEZ PAS LE LANGUAGE J'AI COMMENTE UN MAX. MAIS LA SYNTHAXE EST PROCHE DU JAVASCRIPT
 */
 
@SuppressWarnings("serial")
public class Fenetre extends JFrame implements ActionListener{
	
	// Boite de dialogue
	private String[] nom = {"St�phane Gentilhomme Le B�cheron", "Anonyme"}; // Les choix possibles
	private JOptionPane jop = new JOptionPane(); // La boite elle m�me
	
	// Variables de base
	private String var_title; // Le titre
	private String[] var_baselist = { // Le tableau avec le nom des syst�mes
			"Syst�me binaire : 2", 
			"Syst�me trinaire : 3", 
			"Syst�me quaternaire : 4", 
			"Syst�me quinaire : 5", 
			"Syst�me s�naire : 6", 
			"Syst�me sept�naire : 7",
			"Syst�me octal : 8",
			"Syst�me nonaire : 9",
			"Syst�me decimal : 10",
			"Syst�me undecimal : 11",
			"Syst�me duodecimal : 12",
			"Syst�me tridecimal : 13",
			"Syst�me tetradecimal : 14",
			"Syst�me pentadecimal : 15",
			"Syst�me hexadecimal : 16",
			"Syst�me septemdecimal : 17",
			"Syst�me octodecimal : 18",
			"Syst�me nonadecimal : 19",
			"Syst�me vigesimal : 20",
			"Syst�me unvigesimal : 21",
			"Syst�me duovigesimal : 22",
			"Syst�me trigesimal : 23",
			"Syst�me tetravigesimal : 24",
			"Syst�me pentavigesimal : 25",
			"Syst�me hexavigesimal : 26",
			"Syst�me septemvigesimal : 27",
			"Syst�me octovigesimal : 28",
			"Syst�me nonavigesimal : 29",
			"Syst�me trigesimal : 30",
			"Syst�me untrigesimal : 31",
			"Syst�me duotrigesimal : 32",
			"Syst�me tritrigesimal : 33",
			"Syst�me tetratrigesimal : 34",
			"Syst�me pentatrigesimal : 35",
			"Syst�me hexatrigesimal : 36",
			"Syst�me septemtrigesimal : 37",
			"Syst�me octotrigesimal : 38",
			"Syst�me nonatrigesimal : 39",
			"Syst�me tetragesimal : 40",
			"Syst�me untetragesimal : 41",
			"Syst�me duotetragesimal : 42",
			"Syst�me tritetragesimal : 43",
			"Syst�me tetratetragesimal : 44",
			"Syst�me pentatetragesimal : 45",
			"Syst�me hexatetragesimal : 46",
			"Syst�me septemtetragesimal : 47",
			"Syst�me octotetragesimal : 48",
			"Syst�me nonatetragesimal : 49",
			"Syst�me pentagesimal : 50",
			"Syst�me unpentagesimal : 51",
			"Syst�me duopentagesimal : 52",
			"Syst�me tripentagesimal : 53",
			"Syst�me tetrapentagesimal : 54",
			"Syst�me pentapentagesimal : 55",
			"Syst�me hexapentagesimal : 56",
			"Syst�me septempentagesimal : 57",
			"Syst�me octopentagesimal : 58",
			"Syst�me nonapentagesimal : 59",
			"Syst�me sexagesimal : 60",
			"Syst�me unsexagesimal : 61",
			"Syst�me tetrasexagesimal : 62",
			};
	private String[] var_arbres = { // Le tableau avec le nom des arbres pour la version Gentilhomme
			"Le b�cheron",
			"Le chataigner",
			"Le ch�ne",
			"Le cerisier",
			"Le poirier",
			"Le pommier",
			"Le figuier",
			"L'Epicea",
			"L'�l�ve",
			"Le fr�ne",
			"Le marronier",
			"L'if",
			"L'erable",
			"Le magnolia",
			"Le platane",
			"Le pin",
			"Le sapin",
			"Le palmier",
			"Le m�rier",
			"Le noyer",
			"L'orme",
			"Le peuplier",
			"Le prunier",
			"Le tilleul",
			"Le sumac",
			"L'eucalyptus",
			"L'h�tre",
			"Le houx",
			"L'aub�pine",
			"L'amandier",
			"Le bouleau",
			"Le cognassier",
			"L'arbre a soie",
			"Le manguier",
			"Le cocotier",
			"Le sureau",
			"L'avocatier",
			"Le laurier",
			"Le tulipier",
			"L'olivier",
			"Le citronnier",
			"L'Eucommia",
			"L'oranger",
			"L'ailante",
			"Le jasmin",
			"Le margousier",
			"La c�dr�le",
			"Le sophora du japon",
			"La cytise",
			"Le virgilier",
			"Le baguenaudier",
			"L'arbre de jud�e",
			"Le bauhinia",
			"Le banzai",
			"Le fevier",
			"L'acacia",
			"Le mimosa",
			"Le styrax",
			"Le karsura",
			"Le liquidambar",
			"Le Sassafras",
	};
	/* Ici on a les labels (textes) qui apparaissent */
	private JLabel label_avert = new JLabel("Attention � ne pas traiter des nombres trop grands");
	private JLabel label_avert2 = new JLabel("Attention : l'ordre des nombre est 0123456789abcd{...}ABC{...}. Par exemple en hexad�cimal a = 10 mais A est IMPOSSIBLE. Le programme est sensible a la casse");
	private JLabel label_option = new JLabel("Base de d�part : ");
	private JLabel label_ent = new JLabel("Nombre a convertir : ");
	// D�claration du bouton calculer
	private JButton but_calc = new JButton("Calculer");
	// D�claration de variables autres.
	private String[] fusion = new String[61];
	private JComboBox base_list;
	private JTextField jtf = new JTextField();
	private Object [][] data = new Object [61][2];
	private JTable tableau;
	private String  title[] = {"Base", "Valeur"};
	private JOptionPane jop3 = new JOptionPane();
 
@SuppressWarnings("static-access")
public Fenetre(){ // Ouverture de la classe (Fonction m�re si vous voulez)
	
	// Affichage de la boite de dialogue qui demande le nom et on r�cup�re la valeur dans la variable int
	int rang = jop.showOptionDialog(null, "Veuillez indiquer votre nom !", "GIGN", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, nom, nom[0]);

	if (rang == 0) { // Si on est le bucheron
		var_title = new String("Guide du b�cheron"); // Le titre de la fenetre ceci
		for (int i = 0; i < 61; i++) {
			fusion[i] = var_arbres[i] + " - " +  var_baselist[i]; // On fusionne le nom des arbres avec les nom des syst�mes d�cimaux
		}
		base_list = new JComboBox(fusion); // On cr�e la liste d�roulante avec le nom des arbres et des bases
	} else {
		var_title = new String("Convertisseur de bases"); // Sinon on donne ce titre
		base_list = new JComboBox(var_baselist); // et on ne prends que les base sans les arbres
	}
	
	base_list.setPreferredSize(new Dimension(520, 20)); // On donnne une taille par d�faut aux objets
	jtf.setPreferredSize(new Dimension(300, 20));
	but_calc.addActionListener(this); // cette ligne va demander a java d'appeller la fonction actionPerformed(ActionEvent arg0) plus bas en cas d'appui sur le bouton calculer.
	
    this.setTitle(var_title); // On donne le titre definit plus haut a la fenetre
    this.setSize(1280, 1024); // On lui donne une taille
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // On exige la fermeture du processus quand on clique sur la croix rouge
    this.setLocationRelativeTo(null);
    
	/* Cette boucle va d�finir la colonne de gauche */
    for (int i = 0; i < 61; i++) {
		if (rang == 0) {
			data[i][0] = fusion[i];
		} else {
			data[i][0] = var_baselist[i];
		}
	}
    
	// On cr�e le tableau de valeur en pr�cisant qu'il n'est pas modifiable
    tableau = new JTable(data, title){
    	public boolean isCellEditable(int row, int col) {
    		return false;}
    };
   
    /* CE QUI SUIT CONCERNE LA DISPOSITION DES OBJETS SUR LA FENETRE, JE NE DETAILLERAI PAS */
    JPanel jaa = new JPanel();
    jaa.add(label_avert);
    JPanel jab = new JPanel();
    jab.add(label_avert2);
    
    JPanel ja = new JPanel();
    ja.setLayout(new BorderLayout());
    ja.add(jaa, BorderLayout.NORTH);
    ja.add(jab, BorderLayout.SOUTH);
    
    JPanel jba = new JPanel();
    jba.add(label_option);
    jba.add(base_list);
    JPanel jbb = new JPanel();
    jbb.add(label_ent);
    jbb.add(jtf);
    JPanel jbc = new JPanel();
    jbb.add(but_calc);
    
    
    JPanel jb = new JPanel();
    jb.setLayout(new BorderLayout());
    jb.add(jba, BorderLayout.NORTH);
    jb.add(jbb, BorderLayout.CENTER);
    jb.add(jbc, BorderLayout.SOUTH);
    
    JPanel j = new JPanel();
    j.setLayout(new BorderLayout());
    j.add(ja, BorderLayout.NORTH);
    j.add(jb, BorderLayout.SOUTH);
    
    
	this.setLayout(new BorderLayout());
    this.getContentPane().add(j, BorderLayout.NORTH);
    this.getContentPane().add(new JScrollPane(tableau), BorderLayout.CENTER);
    /*this.getContentPane().add(base_list, BorderLayout.SOUTH);
    this.getContentPane().add(jtf, BorderLayout.SOUTH);*/
    this.setVisible(true); // On affiche le tout
  }

//M�thode qui sera appel�e lors d'un clic sur le bouton
public void actionPerformed(ActionEvent arg0) {  
		String value = jtf.getText(); // On r�cup�re le nombre entr�
		int base = base_list.getSelectedIndex() + 2; // On retrouve la base, qui est l'index de la liste + 2.
		long value_env;
		String rec;
		
		try {
			rec = deconv(base, value); // On remet le nombre en base 10
			if (rec.equals("BASE INCOHERENTE")) {
				jop3.showMessageDialog(null, "Votre nombre est incoh�rent par rapport � sa base. Annulation du calcul", "Erreur", JOptionPane.ERROR_MESSAGE, null); // Probl�me de base trouv� (comme un 2 en base 2)
			} else {
				value_env = Integer.parseInt(rec); // On rempli le tableau.
				for (int i = 0; i < 61; i++) {
					data[i][1] = conv(i+2, value_env);
				}
			}
		} catch (NumberFormatException e) {
			jop3.showMessageDialog(null, "Votre nombre est soit trop grand, soit de base impossible, soit ce n'est pas du tout un nombre", "Erreur", JOptionPane.ERROR_MESSAGE, null);
		} catch (Error e) {
			jop3.showMessageDialog(null, "Une erreur inconnue est survenue. Verifiez le nombre entr� et sa BASE", "Erreur", JOptionPane.ERROR_MESSAGE, null);
		} catch (ArrayIndexOutOfBoundsException e) {
			jop3.showMessageDialog(null, "Votre nombre est soit trop grand, soit de base impossible, soit ce n'est pas du tout un nombre", "Erreur", JOptionPane.ERROR_MESSAGE, null);
		}
	
    tableau.repaint();
} 

// Conversion d'un nombre de Base 10 vers une autre base
public static String conv(int base, long entry) {
	// On cr�e un tableau pouvant contenir 60 bits en char (le char est un caract�re, cela permet d'accepter des lettres).
	char tab[] = new char[60];
	// On cr�e un tableau pouvant contenir toute les valeurs possibles
	char alphatab[] = {'0','1','2','3','4','5','6','7','8','9','a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','t','u','v','w','x','y','z',
				'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};
	// On cr�e notre variable de comptage, pas forc�menent besoin des 1024 bits
	int i = 0;
	// On copie notre entr�e en cas de besoin ult�rieur (pas ici)
	double es = entry;
	if (base > 1 && base < 63) {
		// Un boucle do--while : condition test�e � la fin !
		do {
			// On met dans un tableau � l'index I le RESTE de es / 2
			tab[i] = alphatab[(int) (es % base)];
			// On r�cup�re l'entier de la division par deux
			es = Math.floor(es / base);
			// On incr�mente le comptage
			i++;
		} while (es > 0); // Tout cela tant que es est superieur � 0.
		// On cr�e une nouvelle variable texte (suffisant et facile a manier) qui sp�cifie notre nombre (0b pour binaire)
		String resultat = new String();
		// La boucle � incr�ment� i une fois de trop ! On le d�cr�mente donc.
		i--;
		do {
			// On concat�nise une chaine avec la valeur de notre tableau � l'index I dans le sens INVERSE !!!
			resultat = resultat + tab[i];
			i--;
		} while (i > -1); // Il faut prendre en compte I = 0. Donc on arrete quand I == -1
		// On retourne le r�sultat de la fonction*/
		return resultat;
	} else {
		return "ERROR : LA BASE DEMANDEE EST ICONNUE / IMPOSSIBLE";
	}
}

// Conversion d'un nombre de base n vers la base 10
public static String deconv(int base, String entry) {
	// On cr�e un tableau pouvant contenir 60 bits.
	int tab[] = new int[60];
	// On cr�e un tableau pouvant contenir toute les valeurs possibles
	char alphatab[] = {'0','1','2','3','4','5','6','7','8','9','a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','t','u','v',
				'w','x','y','z','A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};
	// On cr�e notre variable de comptage, pas forc�menent besoin des 1024 bits
	int i = 0;
	// On met nos chiffres dans un tableau, un par un.
	while (i < entry.length()) {
		String ent = entry.substring(i, i+1);
		tab[i] = searchtbl(alphatab, ent.charAt(0));
		//System.out.println(tab[i]);
		if (tab[i] >= base) {
			return "BASE INCOHERENTE";
		}
		i++;
	}
	i--;
	
	if (base > 1 && base < 63) {
		int resultat = 0; // Notre r�sultat
		int pow = 0; // Notre puissance
		do {
			resultat = (int) (resultat + tab[i] * Math.pow(base, pow)); // J'ai vraiment besoin d'expliquer ?
			i--;
			pow++;
		} while (i > -1);
		return Integer.toString(resultat); // On retourne le r�sultat
	} else {
		return "ERROR : LA BASE DEMANDEE EST ICONNUE / IMPOSSIBLE";
	}
}

/* CETTE FONCTION SERT A TROUVER L'INDEX D'UNE DONNEE DANS UN TABLEAU. 
 * Comme si c'�tait une fonction. En effet tab[i] = Bonjour, on cherche la valeur de i pour laquelle tab[i] est egal � bonjour
 */
public static int searchtbl(char tbl[], char demd) {
	int i = 0;
	while (tbl[i] != demd) {
		i++;
	}
	return i;
}
}