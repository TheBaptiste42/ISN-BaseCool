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
	private String[] nom = {"Stéphane Gentilhomme Le Bûcheron", "Anonyme"}; // Les choix possibles
	private JOptionPane jop = new JOptionPane(); // La boite elle même
	
	// Variables de base
	private String var_title; // Le titre
	private String[] var_baselist = { // Le tableau avec le nom des systèmes
			"Système binaire : 2", 
			"Système trinaire : 3", 
			"Système quaternaire : 4", 
			"Système quinaire : 5", 
			"Système sénaire : 6", 
			"Système septénaire : 7",
			"Système octal : 8",
			"Système nonaire : 9",
			"Système decimal : 10",
			"Système undecimal : 11",
			"Système duodecimal : 12",
			"Système tridecimal : 13",
			"Système tetradecimal : 14",
			"Système pentadecimal : 15",
			"Système hexadecimal : 16",
			"Système septemdecimal : 17",
			"Système octodecimal : 18",
			"Système nonadecimal : 19",
			"Système vigesimal : 20",
			"Système unvigesimal : 21",
			"Système duovigesimal : 22",
			"Système trigesimal : 23",
			"Système tetravigesimal : 24",
			"Système pentavigesimal : 25",
			"Système hexavigesimal : 26",
			"Système septemvigesimal : 27",
			"Système octovigesimal : 28",
			"Système nonavigesimal : 29",
			"Système trigesimal : 30",
			"Système untrigesimal : 31",
			"Système duotrigesimal : 32",
			"Système tritrigesimal : 33",
			"Système tetratrigesimal : 34",
			"Système pentatrigesimal : 35",
			"Système hexatrigesimal : 36",
			"Système septemtrigesimal : 37",
			"Système octotrigesimal : 38",
			"Système nonatrigesimal : 39",
			"Système tetragesimal : 40",
			"Système untetragesimal : 41",
			"Système duotetragesimal : 42",
			"Système tritetragesimal : 43",
			"Système tetratetragesimal : 44",
			"Système pentatetragesimal : 45",
			"Système hexatetragesimal : 46",
			"Système septemtetragesimal : 47",
			"Système octotetragesimal : 48",
			"Système nonatetragesimal : 49",
			"Système pentagesimal : 50",
			"Système unpentagesimal : 51",
			"Système duopentagesimal : 52",
			"Système tripentagesimal : 53",
			"Système tetrapentagesimal : 54",
			"Système pentapentagesimal : 55",
			"Système hexapentagesimal : 56",
			"Système septempentagesimal : 57",
			"Système octopentagesimal : 58",
			"Système nonapentagesimal : 59",
			"Système sexagesimal : 60",
			"Système unsexagesimal : 61",
			"Système tetrasexagesimal : 62",
			};
	private String[] var_arbres = { // Le tableau avec le nom des arbres pour la version Gentilhomme
			"Le bûcheron",
			"Le chataigner",
			"Le chêne",
			"Le cerisier",
			"Le poirier",
			"Le pommier",
			"Le figuier",
			"L'Epicea",
			"L'élève",
			"Le frêne",
			"Le marronier",
			"L'if",
			"L'erable",
			"Le magnolia",
			"Le platane",
			"Le pin",
			"Le sapin",
			"Le palmier",
			"Le mûrier",
			"Le noyer",
			"L'orme",
			"Le peuplier",
			"Le prunier",
			"Le tilleul",
			"Le sumac",
			"L'eucalyptus",
			"L'hêtre",
			"Le houx",
			"L'aubépine",
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
			"La cédrèle",
			"Le sophora du japon",
			"La cytise",
			"Le virgilier",
			"Le baguenaudier",
			"L'arbre de judée",
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
	private JLabel label_avert = new JLabel("Attention à ne pas traiter des nombres trop grands");
	private JLabel label_avert2 = new JLabel("Attention : l'ordre des nombre est 0123456789abcd{...}ABC{...}. Par exemple en hexadécimal a = 10 mais A est IMPOSSIBLE. Le programme est sensible a la casse");
	private JLabel label_option = new JLabel("Base de départ : ");
	private JLabel label_ent = new JLabel("Nombre a convertir : ");
	// Déclaration du bouton calculer
	private JButton but_calc = new JButton("Calculer");
	// Déclaration de variables autres.
	private String[] fusion = new String[61];
	private JComboBox base_list;
	private JTextField jtf = new JTextField();
	private Object [][] data = new Object [61][2];
	private JTable tableau;
	private String  title[] = {"Base", "Valeur"};
	private JOptionPane jop3 = new JOptionPane();
 
@SuppressWarnings("static-access")
public Fenetre(){ // Ouverture de la classe (Fonction mère si vous voulez)
	
	// Affichage de la boite de dialogue qui demande le nom et on récupère la valeur dans la variable int
	int rang = jop.showOptionDialog(null, "Veuillez indiquer votre nom !", "GIGN", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, nom, nom[0]);

	if (rang == 0) { // Si on est le bucheron
		var_title = new String("Guide du bûcheron"); // Le titre de la fenetre ceci
		for (int i = 0; i < 61; i++) {
			fusion[i] = var_arbres[i] + " - " +  var_baselist[i]; // On fusionne le nom des arbres avec les nom des systèmes décimaux
		}
		base_list = new JComboBox(fusion); // On crée la liste déroulante avec le nom des arbres et des bases
	} else {
		var_title = new String("Convertisseur de bases"); // Sinon on donne ce titre
		base_list = new JComboBox(var_baselist); // et on ne prends que les base sans les arbres
	}
	
	base_list.setPreferredSize(new Dimension(520, 20)); // On donnne une taille par défaut aux objets
	jtf.setPreferredSize(new Dimension(300, 20));
	but_calc.addActionListener(this); // cette ligne va demander a java d'appeller la fonction actionPerformed(ActionEvent arg0) plus bas en cas d'appui sur le bouton calculer.
	
    this.setTitle(var_title); // On donne le titre definit plus haut a la fenetre
    this.setSize(1280, 1024); // On lui donne une taille
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // On exige la fermeture du processus quand on clique sur la croix rouge
    this.setLocationRelativeTo(null);
    
	/* Cette boucle va définir la colonne de gauche */
    for (int i = 0; i < 61; i++) {
		if (rang == 0) {
			data[i][0] = fusion[i];
		} else {
			data[i][0] = var_baselist[i];
		}
	}
    
	// On crée le tableau de valeur en précisant qu'il n'est pas modifiable
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

//Méthode qui sera appelée lors d'un clic sur le bouton
public void actionPerformed(ActionEvent arg0) {  
		String value = jtf.getText(); // On récupère le nombre entré
		int base = base_list.getSelectedIndex() + 2; // On retrouve la base, qui est l'index de la liste + 2.
		long value_env;
		String rec;
		
		try {
			rec = deconv(base, value); // On remet le nombre en base 10
			if (rec.equals("BASE INCOHERENTE")) {
				jop3.showMessageDialog(null, "Votre nombre est incohérent par rapport à sa base. Annulation du calcul", "Erreur", JOptionPane.ERROR_MESSAGE, null); // Problème de base trouvé (comme un 2 en base 2)
			} else {
				value_env = Integer.parseInt(rec); // On rempli le tableau.
				for (int i = 0; i < 61; i++) {
					data[i][1] = conv(i+2, value_env);
				}
			}
		} catch (NumberFormatException e) {
			jop3.showMessageDialog(null, "Votre nombre est soit trop grand, soit de base impossible, soit ce n'est pas du tout un nombre", "Erreur", JOptionPane.ERROR_MESSAGE, null);
		} catch (Error e) {
			jop3.showMessageDialog(null, "Une erreur inconnue est survenue. Verifiez le nombre entré et sa BASE", "Erreur", JOptionPane.ERROR_MESSAGE, null);
		} catch (ArrayIndexOutOfBoundsException e) {
			jop3.showMessageDialog(null, "Votre nombre est soit trop grand, soit de base impossible, soit ce n'est pas du tout un nombre", "Erreur", JOptionPane.ERROR_MESSAGE, null);
		}
	
    tableau.repaint();
} 

// Conversion d'un nombre de Base 10 vers une autre base
public static String conv(int base, long entry) {
	// On crée un tableau pouvant contenir 60 bits en char (le char est un caractère, cela permet d'accepter des lettres).
	char tab[] = new char[60];
	// On crée un tableau pouvant contenir toute les valeurs possibles
	char alphatab[] = {'0','1','2','3','4','5','6','7','8','9','a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','t','u','v','w','x','y','z',
				'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};
	// On crée notre variable de comptage, pas forcémenent besoin des 1024 bits
	int i = 0;
	// On copie notre entrée en cas de besoin ultérieur (pas ici)
	double es = entry;
	if (base > 1 && base < 63) {
		// Un boucle do--while : condition testée à la fin !
		do {
			// On met dans un tableau à l'index I le RESTE de es / 2
			tab[i] = alphatab[(int) (es % base)];
			// On récupère l'entier de la division par deux
			es = Math.floor(es / base);
			// On incrémente le comptage
			i++;
		} while (es > 0); // Tout cela tant que es est superieur à 0.
		// On crée une nouvelle variable texte (suffisant et facile a manier) qui spécifie notre nombre (0b pour binaire)
		String resultat = new String();
		// La boucle à incrémenté i une fois de trop ! On le décrémente donc.
		i--;
		do {
			// On concaténise une chaine avec la valeur de notre tableau à l'index I dans le sens INVERSE !!!
			resultat = resultat + tab[i];
			i--;
		} while (i > -1); // Il faut prendre en compte I = 0. Donc on arrete quand I == -1
		// On retourne le résultat de la fonction*/
		return resultat;
	} else {
		return "ERROR : LA BASE DEMANDEE EST ICONNUE / IMPOSSIBLE";
	}
}

// Conversion d'un nombre de base n vers la base 10
public static String deconv(int base, String entry) {
	// On crée un tableau pouvant contenir 60 bits.
	int tab[] = new int[60];
	// On crée un tableau pouvant contenir toute les valeurs possibles
	char alphatab[] = {'0','1','2','3','4','5','6','7','8','9','a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','t','u','v',
				'w','x','y','z','A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};
	// On crée notre variable de comptage, pas forcémenent besoin des 1024 bits
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
		int resultat = 0; // Notre résultat
		int pow = 0; // Notre puissance
		do {
			resultat = (int) (resultat + tab[i] * Math.pow(base, pow)); // J'ai vraiment besoin d'expliquer ?
			i--;
			pow++;
		} while (i > -1);
		return Integer.toString(resultat); // On retourne le résultat
	} else {
		return "ERROR : LA BASE DEMANDEE EST ICONNUE / IMPOSSIBLE";
	}
}

/* CETTE FONCTION SERT A TROUVER L'INDEX D'UNE DONNEE DANS UN TABLEAU. 
 * Comme si c'était une fonction. En effet tab[i] = Bonjour, on cherche la valeur de i pour laquelle tab[i] est egal à bonjour
 */
public static int searchtbl(char tbl[], char demd) {
	int i = 0;
	while (tbl[i] != demd) {
		i++;
	}
	return i;
}
}