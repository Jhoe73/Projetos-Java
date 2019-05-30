import java.awt.Dimension;
import java.awt.Toolkit;

public class resolucaoTela {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Toolkit tk = Toolkit.getDefaultToolkit();
		Dimension d = tk.getScreenSize();
		System.out.println("Resolução da tela"+d.getSize());
	}

}
