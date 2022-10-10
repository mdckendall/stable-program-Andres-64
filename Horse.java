//Create the Horse class here.
import javax.swing.JOptionPane;
public class Horse
{
	private String name;
	private String weight;
	private String tame;
	
   public void setName()
	{
	   name = JOptionPane.showInputDialog(null,"What is the name of the horse?");  
	}
   public void setWeight()
	{
	   weight = JOptionPane.showInputDialog(null,"What is the weight of the horse?");  
	}
   public void setTame()
	{
	   tame = JOptionPane.showInputDialog(null,"Enter true if the horse is tame or false if it is not."); 
	}
   public String getName()
   {
	   return name;
   }
   public String getWeight()
   {
	   return weight;
   }
   public String getTame()
   {
	   return tame;
   }
   
   
}