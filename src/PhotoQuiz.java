
/*
 *    Copyright (c) The League of Amazing Programmers 2013-2017
 *    Level 1
 */

import java.awt.Component;
import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class PhotoQuiz {

	public static void main(String[] args) throws Exception {
		JFrame quizWindow = new JFrame();
		quizWindow.setVisible(true);
		quizWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // This will make sure the program exits when you
																	// close the window

		// 1. find an image on the internet, and put its URL in a String variable (from
		// your browser, right click on the image, and select “Copy Image Address”)
		String url = "https://www.google.com/url?sa=i&rct=j&q=&esrc=s&source=images&cd=&cad=rja&uact=8&ved=2ahUKEwj90ZWkm5jcAhXEIjQIHUGaCTwQjRx6BAgBEAU&url=https%3A%2F%2Fwww.inc.com%2Fkaren-schrier%2F4-brilliant-ideas-you-should-steal-from-food-industry.html&psig=AOvVaw1ZqnKjwHCaTwE7XOqfgY36&ust=1531438532315896";
		// 2. create a variable of type "Component" that will hold your image
		Component component;
		// 3. use the "createImage()" method below to initialize your Component
		component = createImage(url);
		// 4. add the image to the quiz window
		quizWindow.add(component);
		// 5. call the pack() method on the quiz window
		quizWindow.pack();
		// 6. ask a question that relates to the image
		String cor = JOptionPane.showInputDialog("Wat is the first thing you see???????????????");
		// 7. print "CORRECT" if the user gave the right answer
		if (cor.equals("food")) {
			System.out.println("CORRECT");
		}
		// 8. print "INCORRECT" if the answer is wrong
		else {
			System.out.println("INCORRECT");
		}
		// 9. remove the component from the quiz window (you may not see the effect of
		// this until step 12)
		quizWindow.remove(component);
		// 10. find another image and create it (might take more than one line of code)
		String url2 = "https://www.google.com/imgres?imgurl=https%3A%2F%2Fwww.caranddriver.com%2Fimages%2F17q4%2F692996%2F2019-mclaren-senna-hypercar-official-photos-and-info-news-car-and-driver-photo-698055-s-original.jpg&imgrefurl=https%3A%2F%2Fwww.caranddriver.com%2Freviews%2F2018-mclaren-570s-spider-first-drive-review&docid=jRGX_DPZSSBhFM&tbnid=yA9yLp2u0qj0JM%3A&vet=10ahUKEwjOmL2Y3qncAhU5FzQIHemAAIoQMwjdASgCMAI..i&w=2250&h=1375&safe=strict&client=ubuntu&bih=628&biw=1301&q=car&ved=0ahUKEwjOmL2Y3qncAhU5FzQIHemAAIoQMwjdASgCMAI&iact=mrc&uact=8";
		// 2. create a variable of type "Component" that will hold your image
		// 3. use the "createImage()" method below to initialize your Component
		component = createImage(url2);
		// 4. add the image to the quiz window
		quizWindow.add(component);
		// 5. call the pack() method on the quiz window
		quizWindow.pack();
		// 6. ask a question that relates to the image
		String cor2 = JOptionPane.showInputDialog("Wat is the first thing you see???????????????");
		// 7. print "CORRECT" if the user gave the right answer
		if (cor2.equals("food")) {
			System.out.println("CORRECT");
		}
		// 8. print "INCORRECT" if the answer is wrong
		else {
			System.out.println("INCORRECT");
		}
		// 11. add the second image to the quiz window

		// 12. pack the quiz window

		// 13. ask another question

		// 14+ check answer, say if correct or incorrect, etc.

	}

	private static Component createImage(String imageUrl) throws MalformedURLException {
		URL url = new URL(imageUrl);
		Icon icon = new ImageIcon(url);
		JLabel imageLabel = new JLabel(icon);
		return imageLabel;
	}

	/* OPTIONAL */
	// *14. add scoring to your quiz
	// *15. make something happen when mouse enters image
	// (imageComponent.addMouseMotionListener())
}
