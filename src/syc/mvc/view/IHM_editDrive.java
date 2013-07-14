package syc.mvc.view;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.util.Observable;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JPanel;

import syc.mvc.model.Model;

public class IHM_editDrive extends IHM_SYC
{
	private JButton jBt_BackToDrives = new JButton("Retour au Drive"); 
	private JButton jBt_EditDrive = new JButton("Modifier"); 
	private JButton jBt_Browse = new JButton("Parcourir");
	private JFileChooser JFC_Browse = new JFileChooser();
	
	private TextField txt_Account = new TextField(model_SYC.getTxt_Account_editDrive());  
	private TextField txt_Login = new TextField(model_SYC.getTxt_Login_editDrive());		
	private TextField txt_LocalLocation = new TextField(model_SYC.getTxt_LocalLocation_editDrive());
	
	private JLabel jLab_Account = new JLabel("Compte : ");
	private JLabel jLab_Login = new JLabel("Identifiant : ");	
	private JLabel jLab_LocalLocation = new JLabel("Emplacement local : ");
	
	public IHM_editDrive(Model aModel_SYC) 
	{
		super(aModel_SYC);
		
		this.jLab_Welcome.setText("Modifiez le label associ� ou l'emplacement local du Drive");
		this.setTitle("Page de Modification");
		
		jPan3.add(jBt_EditDrive);
		jPan3.add(jBt_BackToDrives);
			
		
		JPanel jPan4a = new JPanel();
        jPan4a.setBackground(Color.WHITE);
        jPan4a.setBorder(BorderFactory.createMatteBorder(3, 5, 3, 5, Color.BLACK));
        jPan4a.setPreferredSize(new Dimension(125,32));
        jPan4a.add(jLab_Account);
		gBC_gBLay_Level_2.gridx = 0;
		gBC_gBLay_Level_2.gridy = 0;
		gBC_gBLay_Level_2.gridwidth = 1;
		gBC_gBLay_Level_2.gridheight = 1;
		gBC_gBLay_Level_2.anchor = GridBagConstraints.LINE_START;
		gBC_gBLay_Level_2.insets = new Insets(2, 2, 2, 2);	//top,left,bottom,right
		jPan4.add(jPan4a, gBC_gBLay_Level_2);
         
        gBC_gBLay_Level_2.gridx = 1;
        gBC_gBLay_Level_2.gridy = 0;
        gBC_gBLay_Level_2.gridwidth = 2;
        gBC_gBLay_Level_2.gridheight = 1;
        gBC_gBLay_Level_2.anchor = GridBagConstraints.CENTER;
        gBC_gBLay_Level_2.insets = new Insets(2, 2, 2, 2);
        jPan4.add(txt_Account, gBC_gBLay_Level_2);
        
        
        JPanel jPan4b = new JPanel();
        jPan4b.setBackground(Color.WHITE);
        jPan4b.setBorder(BorderFactory.createMatteBorder(3, 5, 3, 5, Color.BLACK));
        jPan4b.setPreferredSize(new Dimension(125,32));
        jPan4b.add(jLab_Login);
        gBC_gBLay_Level_2.gridx = 0;
        gBC_gBLay_Level_2.gridy = 1;
        gBC_gBLay_Level_2.gridwidth = 1;
        gBC_gBLay_Level_2.gridheight = 1;
        gBC_gBLay_Level_2.anchor = GridBagConstraints.LINE_START;
        gBC_gBLay_Level_2.insets = new Insets(2, 2, 2, 2);
        jPan4.add(jPan4b, gBC_gBLay_Level_2);
         
        gBC_gBLay_Level_2.gridx = 1;
        gBC_gBLay_Level_2.gridy = 1;
        gBC_gBLay_Level_2.gridwidth = 2;
        gBC_gBLay_Level_2.gridheight = 1;
        gBC_gBLay_Level_2.anchor = GridBagConstraints.CENTER;
        gBC_gBLay_Level_2.insets = new Insets(2, 2, 2, 2);
        jPan4.add(txt_Login, gBC_gBLay_Level_2);   
        
        
        JPanel jPan4c = new JPanel();
        jPan4c.setBackground(Color.WHITE);
        jPan4c.setBorder(BorderFactory.createMatteBorder(3, 5, 3, 5, Color.BLACK));
        jPan4c.setPreferredSize(new Dimension(125,32));
        jPan4c.add(jLab_LocalLocation);
        gBC_gBLay_Level_2.gridx = 0;
        gBC_gBLay_Level_2.gridy = 3;
        gBC_gBLay_Level_2.gridwidth = 1;
        gBC_gBLay_Level_2.gridheight = 1;
        gBC_gBLay_Level_2.anchor = GridBagConstraints.LINE_START;
        gBC_gBLay_Level_2.insets = new Insets(2, 2, 2, 2);
        jPan4.add(jPan4c, gBC_gBLay_Level_2);
         
        gBC_gBLay_Level_2.gridx = 1;
        gBC_gBLay_Level_2.gridy = 3;
        gBC_gBLay_Level_2.gridwidth = 2;
        gBC_gBLay_Level_2.gridheight = 1;
        gBC_gBLay_Level_2.anchor = GridBagConstraints.CENTER;
        gBC_gBLay_Level_2.insets = new Insets(2, 2, 0, 2);
        jPan4.add(txt_LocalLocation, gBC_gBLay_Level_2);   
        
        gBC_gBLay_Level_2.gridx = 3;
        gBC_gBLay_Level_2.gridy = 3;
        gBC_gBLay_Level_2.gridwidth = 1;
        gBC_gBLay_Level_2.gridheight = 1;
        gBC_gBLay_Level_2.anchor = GridBagConstraints.CENTER;
        gBC_gBLay_Level_2.insets = new Insets(2, 0, 2, 2);
        jPan4.add(jBt_Browse, gBC_gBLay_Level_2);
        
        
        txt_Account.setPreferredSize(new Dimension(125,25));
        txt_Login.setPreferredSize(new Dimension(125,25));
		txt_LocalLocation.setPreferredSize(new Dimension(125,25));
        
		txt_Account.setFont(police);
		txt_Login.setFont(police);
		txt_LocalLocation.setFont(police);
		
		jLab_Account.setFont(police);
		jLab_Login.setFont(police);
		jLab_LocalLocation.setFont(police);
		
		jBt_Browse.setFont(police);	
	}
	
	public void displayIHM_editDrive(boolean displayed)
	{	
		this.repaint();
		this.setVisible(displayed);
	}
	
	public JButton getjBt_BackToDrives() {
		return jBt_BackToDrives;
	}

	public void setjBt_BackToDrives(JButton jBt_BackToDrives) {
		this.jBt_BackToDrives = jBt_BackToDrives;
	}

	public JButton getjBt_EditDrive() {
		return jBt_EditDrive;
	}

	public void setjBt_EditDrive(JButton jBt_EditDrive) {
		this.jBt_EditDrive = jBt_EditDrive;
	}

	public JButton getjBt_Browse() {
		return jBt_Browse;
	}

	public void setjBt_Browse(JButton jBt_Browse) {
		this.jBt_Browse = jBt_Browse;
	}

	public JFileChooser getJFC_Browse() {
		return JFC_Browse;
	}

	public void setJFC_Browse(JFileChooser jFC_Browse) {
		JFC_Browse = jFC_Browse;
	}

	public TextField getTxt_Account() {
		return txt_Account;
	}

	public void setTxt_Account(TextField txt_Account) {
		this.txt_Account = txt_Account;
	}

	public TextField getTxt_Login() {
		return txt_Login;
	}

	public void setTxt_Login(TextField txt_Login) {
		this.txt_Login = txt_Login;
	}

	public TextField getTxt_LocalLocation() {
		return txt_LocalLocation;
	}

	public void setTxt_LocalLocation(TextField txt_LocalLocation) {
		this.txt_LocalLocation = txt_LocalLocation;
	}

	public void update(Observable arg0, Object arg1) 
	{
		super.update(arg0, arg1);
		displayIHM_editDrive(model_SYC.getDisplay_editDrive());
	}
}