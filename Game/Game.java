package Game;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
/*
* 
*/

import javax.imageio.ImageIO;
import javax.swing.AbstractButton;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class Game extends JFrame implements ActionListener {

	/**
	 * 
	 */
	private static final long serialVersionUID = -1586911601975608765L;

	private JFrame board;
	private JPanel p1;
	private JPanel p2;
	private JPanel p3;
	private JPanel p4;
	private JPanel p5;
	private JPanel p6;
	private JPanel p7;
	private JPanel p8;
	private JPanel p9;
	private JPanel p10;
	private JPanel p11;
	private JPanel p12;
	private JPanel p13;
	private Dimension d;

	private JButton start;
	private JButton freshmanYear;
	private JButton chooseMajor;
	private JButton chooseDormLife;
	private JButton mealPlan;
	private JButton club;
	private JButton ra;
	private JButton party2;
	private JButton extraTime;
	private JButton loseDormKey;
	private JButton getDrinkingTicket;
	private JButton meetAdvisor;
	private JButton registerClass;
	private JButton buyBooks1;
	private JButton payTuition1;
	private JButton applyScholarship;
	private JButton changeMajor;
	private JButton job;
	private JButton getJob;
	private JButton getScholarship1;
	private JButton attendClass1;
	private JButton dropClass1;
	private JButton takeExams;
	private JButton passClass;
	private JButton failClass;
	private JButton sophomoreYear;
	private JButton register;
	private JButton buyBooks2;
	private JButton payTuition;
	private JButton getScholarship;
	private JButton buyParkingPass;
	private JButton payRent;
	private JButton buyGas;
	private JButton chooseCommute;
	private JButton attendClass;
	private JButton dropClass;
	private JButton takeExam2;
	private JButton takeExam1;
	private JButton buyBooks;
	private JButton attendInterview;
	private JButton party;
	private JButton gown;
	private JButton applyGraduation;
	private JButton thesisPresent;
	private JButton thesisPrepare;
	private JButton sickButton;
	private JButton stressButton;
	private JButton takeExam;
	private JButton fullJob;
	private JButton takeClass;
	private JButton gRE = new JButton("55.Take GRE Exam");
	private JButton pack = new JButton("65.Pack Stuff");
	private JButton intern = new JButton("40.Get Internship");
	private JButton relationship = new JButton("41.In a Relationship");
	private JButton sport = new JButton("42.Go to Sport Event");
	private JButton travel = new JButton("54.Travel");
	private JButton graduation = new JButton("66. Graduation");
	private JButton lookintern = new JButton("39.Look for Internship");
	private JButton movie = new JButton("43.Go to Movie");
	private JButton bookButton = new JButton("53.Buy Books");
	private JButton blank41 = new JButton(" ");
	private JButton juniorYear = new JButton("38.Junior Year");
	private JButton addlPay = new JButton("44.Get Additional Pay");
	private JButton prepareGRE = new JButton("52.Prepare GRE");
	private JButton clickSpin = new JButton("Click to Spin");
	private JButton eatOutside = new JButton("47. Eat Outside");
	private JButton seniorYear = new JButton("48. Senior Year");
	private JButton attendJobFair = new JButton("49. Attend Job Fair");

	final int startingMoney = 0;
	public final int WIDTH = 1000;
	public final int HEIGHT = 1000;
	private JTextArea theText;
	public static int LINES = 5;
	public static int CHAR_PER_LINE = 20;
	public String[] partyOptions = { "overslept", "have a massive hangover", "missed a morning exam" };

	public String result;

	Graphics canvas;

	Random rand = new Random();

	private Player current;

	private Player player1;
	private Player player2;
	private Player player3;

	public static void main(String[] args) {

		Game a = new Game();

		a.setVisible(true);

	}

	public Game() {
		player1 = new Player("Player1", "Start", 0, 0.0, null, null);
		player2 = new Player("Player2", "Start", 0, 0.0, null, null);
		player3 = new Player("Player3", "Start", 0, 0.0, null, null);

		init();
		initP1();
		initP2();
		initP3();
		initP4();
		initP5();
		initP6();

		initP7();
		initP8();
		initP9();
		initP10();
		initP11();

		initP12();
		initP13();

		current = player1;

		theText = new JTextArea(LINES, CHAR_PER_LINE);
		board.add(theText);
		theText.setText(current.toString());

	}

	private void autoRollingSequence(String playerName, int n) {
		switch (current.getCurrentStep() + n) {
		case 1:
			start.setBackground(current.getPlayerColor());
			current.setCurrentStep(current.getCurrentStep() + n);
			break;
		case 2:
			freshmanYear.setBackground(current.getPlayerColor());
			freshmanYear.doClick();
			current.setCurrentStep(current.getCurrentStep() + n);
			break;
		case 3:
			chooseMajor.setBackground(current.getPlayerColor());
			chooseMajor.doClick();
			current.setCurrentStep(current.getCurrentStep() + n);
			break;
		case 4:
			chooseDormLife.setBackground(current.getPlayerColor());
			chooseDormLife.doClick();
			current.setCurrentStep(current.getCurrentStep() + n);
			break;
		case 5:
			mealPlan.setBackground(current.getPlayerColor());
			mealPlan.doClick();
			current.setCurrentStep(current.getCurrentStep() + n);
			break;
		case 6:
			club.setBackground(current.getPlayerColor());
			club.doClick();
			current.setCurrentStep(current.getCurrentStep() + n);
			break;
		case 7:
			ra.setBackground(current.getPlayerColor());
			ra.doClick();
			current.setCurrentStep(current.getCurrentStep() + n);
			break;
		case 8:
			party2.setBackground(current.getPlayerColor());
			party2.doClick();
			current.setCurrentStep(current.getCurrentStep() + n);
			break;
		case 9:
			extraTime.setBackground(current.getPlayerColor());
			extraTime.doClick();
			current.setCurrentStep(current.getCurrentStep() + n);
			break;
		case 10:
			loseDormKey.setBackground(current.getPlayerColor());
			loseDormKey.doClick();
			current.setCurrentStep(current.getCurrentStep() + n);
			break;
		case 11:
			getDrinkingTicket.setBackground(current.getPlayerColor());
			getDrinkingTicket.doClick();
			current.setCurrentStep(current.getCurrentStep() + n);
			break;
		case 12:
			chooseCommute.setBackground(current.getPlayerColor());
			chooseCommute.doClick();
			current.setCurrentStep(current.getCurrentStep() + n);
			break;
		case 13:
			payRent.setBackground(current.getPlayerColor());
			payRent.doClick();
			current.setCurrentStep(current.getCurrentStep() + n);
			break;
		case 14:
			buyParkingPass.setBackground(current.getPlayerColor());
			buyParkingPass.doClick();
			current.setCurrentStep(current.getCurrentStep() + n);
			break;
		case 15:
			buyGas.setBackground(current.getPlayerColor());
			buyGas.doClick();
			current.setCurrentStep(current.getCurrentStep() + n);
			break;
		case 16:
			meetAdvisor.setBackground(current.getPlayerColor());
			meetAdvisor.doClick();
			current.setCurrentStep(current.getCurrentStep() + n);
			break;
		case 17:
			registerClass.setBackground(current.getPlayerColor());
			registerClass.doClick();
			current.setCurrentStep(current.getCurrentStep() + n);
			break;
		case 18:
			buyBooks1.setBackground(current.getPlayerColor());
			buyBooks1.doClick();
			current.setCurrentStep(current.getCurrentStep() + n);
			break;
		case 19:
			payTuition1.setBackground(current.getPlayerColor());
			payTuition1.doClick();
			current.setCurrentStep(current.getCurrentStep() + n);
			break;
		case 20:
			applyScholarship.setBackground(current.getPlayerColor());
			applyScholarship.doClick();
			current.setCurrentStep(current.getCurrentStep() + n);
			break;
		case 21:
			getScholarship1.setBackground(current.getPlayerColor());
			getScholarship1.doClick();
			current.setCurrentStep(current.getCurrentStep() + n);
			break;
		case 22:
			attendClass1.setBackground(current.getPlayerColor());
			attendClass1.doClick();
			current.setCurrentStep(current.getCurrentStep() + n);
			break;
		case 23:
			dropClass1.setBackground(current.getPlayerColor());
			dropClass1.doClick();
			current.setCurrentStep(current.getCurrentStep() + n);
			break;
		case 24:
			takeExams.setBackground(current.getPlayerColor());
			takeExams.doClick();
			current.setCurrentStep(current.getCurrentStep() + n);
			break;
		case 25:
			passClass.setBackground(current.getPlayerColor());
			passClass.doClick();
			current.setCurrentStep(current.getCurrentStep() + n);
			break;
		case 26:
			failClass.setBackground(current.getPlayerColor());
			failClass.doClick();
			current.setCurrentStep(current.getCurrentStep() + n);
			break;
		case 27:
			sophomoreYear.setBackground(current.getPlayerColor());
			sophomoreYear.doClick();
			current.setCurrentStep(current.getCurrentStep() + n);
			break;
		case 28:
			changeMajor.setBackground(current.getPlayerColor());
			changeMajor.doClick();
			current.setCurrentStep(current.getCurrentStep() + n);
			break;
		case 29:
			job.setBackground(current.getPlayerColor());
			job.doClick();
			current.setCurrentStep(current.getCurrentStep() + n);
			break;
		case 30:
			getJob.setBackground(current.getPlayerColor());
			getJob.doClick();
			current.setCurrentStep(current.getCurrentStep() + n);
			break;
		case 31:
			register.setBackground(current.getPlayerColor());
			register.doClick();
			current.setCurrentStep(current.getCurrentStep() + n);
			break;
		case 32:
			buyBooks2.setBackground(current.getPlayerColor());
			buyBooks2.doClick();
			current.setCurrentStep(current.getCurrentStep() + n);
			break;
		case 33:
			payTuition.setBackground(current.getPlayerColor());
			payTuition.doClick();
			current.setCurrentStep(current.getCurrentStep() + n);
			break;
		case 34:
			getScholarship.setBackground(current.getPlayerColor());
			getScholarship.doClick();
			current.setCurrentStep(current.getCurrentStep() + n);
			break;
		case 35:
			attendClass.setBackground(current.getPlayerColor());
			attendClass.doClick();
			current.setCurrentStep(current.getCurrentStep() + n);
			break;

		case 36:
			dropClass.setBackground(current.getPlayerColor());
			dropClass.doClick();
			current.setCurrentStep(current.getCurrentStep() + n);
			break;
		case 37:
			takeExam1.setBackground(current.getPlayerColor());
			takeExam1.doClick();
			current.setCurrentStep(current.getCurrentStep() + n);
			break;
		case 38:
			juniorYear.setBackground(current.getPlayerColor());
			juniorYear.doClick();
			current.setCurrentStep(current.getCurrentStep() + n);
			break;
		case 39:
			lookintern.setBackground(current.getPlayerColor());
			lookintern.doClick();
			current.setCurrentStep(current.getCurrentStep() + n);
			break;
		case 40:
			intern.setBackground(current.getPlayerColor());
			intern.doClick();
			current.setCurrentStep(current.getCurrentStep() + n);
			break;
		case 41:
			relationship.setBackground(current.getPlayerColor());
			relationship.doClick();
			current.setCurrentStep(current.getCurrentStep() + n);
			break;
		case 42:
			sport.setBackground(current.getPlayerColor());
			sport.doClick();
			current.setCurrentStep(current.getCurrentStep() + n);
			break;
		case 43:
			movie.setBackground(current.getPlayerColor());
			movie.doClick();
			current.setCurrentStep(current.getCurrentStep() + n);
			break;
		case 44:
			addlPay.setBackground(current.getPlayerColor());
			addlPay.doClick();
			current.setCurrentStep(current.getCurrentStep() + n);
			break;
		case 45:
			buyBooks.setBackground(current.getPlayerColor());
			buyBooks.doClick();
			current.setCurrentStep(current.getCurrentStep() + n);
			break;
		case 46:
			takeExam2.setBackground(current.getPlayerColor());
			takeExam2.doClick();
			current.setCurrentStep(current.getCurrentStep() + n);
			break;
		case 47:
			eatOutside.setBackground(current.getPlayerColor());
			eatOutside.doClick();
			current.setCurrentStep(current.getCurrentStep() + n);
			break;
		case 48:
			seniorYear.setBackground(current.getPlayerColor());
			seniorYear.doClick();
			current.setCurrentStep(current.getCurrentStep() + n);
			break;
		case 49:
			attendJobFair.setBackground(current.getPlayerColor());
			attendJobFair.doClick();
			current.setCurrentStep(current.getCurrentStep() + n);
			break;
		case 50:
			takeClass.setBackground(current.getPlayerColor());
			takeClass.doClick();
			current.setCurrentStep(current.getCurrentStep() + n);
			break;
		case 51:
			attendInterview.setBackground(current.getPlayerColor());
			attendInterview.doClick();
			current.setCurrentStep(current.getCurrentStep() + n);
			break;
		case 52:
			prepareGRE.setBackground(current.getPlayerColor());
			prepareGRE.doClick();
			current.setCurrentStep(current.getCurrentStep() + n);
			break;
		case 53:
			bookButton.setBackground(current.getPlayerColor());
			bookButton.doClick();
			current.setCurrentStep(current.getCurrentStep() + n);
			break;
		case 54:
			travel.setBackground(current.getPlayerColor());
			travel.doClick();
			current.setCurrentStep(current.getCurrentStep() + n);
			break;
		case 55:
			gRE.setBackground(current.getPlayerColor());
			gRE.doClick();
			current.setCurrentStep(current.getCurrentStep() + n);
			break;
		case 56:
			takeExam.setBackground(current.getPlayerColor());
			takeExam.doClick();
			current.setCurrentStep(current.getCurrentStep() + n);
			break;
		case 57:
			stressButton.setBackground(current.getPlayerColor());
			stressButton.doClick();
			current.setCurrentStep(current.getCurrentStep() + n);
			break;
		case 58:
			sickButton.setBackground(current.getPlayerColor());
			sickButton.doClick();
			current.setCurrentStep(current.getCurrentStep() + n);
			break;
		case 59:
			thesisPrepare.setBackground(current.getPlayerColor());
			thesisPrepare.doClick();
			current.setCurrentStep(current.getCurrentStep() + n);
			break;
		case 60:
			thesisPresent.setBackground(current.getPlayerColor());
			thesisPresent.doClick();
			current.setCurrentStep(current.getCurrentStep() + n);
			break;
		case 61:
			applyGraduation.setBackground(current.getPlayerColor());
			applyGraduation.doClick();
			current.setCurrentStep(current.getCurrentStep() + n);
			break;
		case 62:
			gown.setBackground(current.getPlayerColor());
			gown.doClick();
			current.setCurrentStep(current.getCurrentStep() + n);
			break;
		case 63:
			party.setBackground(current.getPlayerColor());
			party.doClick();
			current.setCurrentStep(current.getCurrentStep() + n);
			break;
		case 64:
			fullJob.setBackground(current.getPlayerColor());
			fullJob.doClick();
			current.setCurrentStep(current.getCurrentStep() + n);
			break;
		case 65:
			pack.setBackground(current.getPlayerColor());
			pack.doClick();
			current.setCurrentStep(current.getCurrentStep() + n);
			break;
		case 66:
			graduation.setBackground(current.getPlayerColor());
			graduation.doClick();
			current.setCurrentStep(current.getCurrentStep() + n);
			break;
		}
		
	}

	public void actionPerformed(ActionEvent e) {
		double playerMoney;
		String actionCommand = e.getActionCommand();

		if (actionCommand.equals("Click to Spin")) {
			int n = rand.nextInt(6) + 1;
			ImageIcon spinIcon = new ImageIcon(getClass().getResource("PYU9Seb.gif"));

			JOptionPane.showMessageDialog(null, "You spin a " + n, null, JOptionPane.INFORMATION_MESSAGE, spinIcon);
			int[] buttonPos = new int[118];
			for (int i = 0; i < 118; i++) {
				buttonPos[i] = i;
			}

			if (current.getPlayerName().equals("Player1"))
				autoRollingSequence("Player1", n);
			if (current.getPlayerName().equals("Player2"))
				autoRollingSequence("Player2", n);
			if (current.getPlayerName().equals("Player3"))
				autoRollingSequence("Player3", n);
		}

		// button 2
		else if (actionCommand.equals("2. Freshman Year")) {
			JOptionPane.showMessageDialog(null, "Entering Freshman year");
			current.setYearInSchool("Freshman");
			current.setPosition("Freshman Year");
			result = theText.getText();
			theText.setText(current.toString());
		}
		// button 3
		else if (actionCommand.equals("3. Choose Major")) {
			String major = JOptionPane.showInputDialog("Tell us your major");
			current.setPosition("Choose Major");
			JOptionPane.showMessageDialog(null, "You have chosen " + major);
			current.setCurrentMajor(major);
			result = theText.getText();
			theText.setText(current.toString());
		}
		// button 4
		else if (actionCommand.equals("4. Choose Dorm Life")) {
			playerMoney = current.getPlayerTotalMoney() - 2000;
			current.setPlayerTotalMoney(playerMoney);
			current.setPosition("Choose Dorm Life");
			JOptionPane.showMessageDialog(null, "You chose dorm life, pay $2,000");
			result = theText.getText();
			theText.setText(current.toString());
		}
		// button 5
		else if (actionCommand.equals("5. Buy Meal Plan")) {
			playerMoney = current.getPlayerTotalMoney() - 600;
			current.setPlayerTotalMoney(playerMoney);
			current.setPosition("Buy a meal plan");
			JOptionPane.showMessageDialog(null, "Buy a meal plan, pay $600");
			result = theText.getText();
			theText.setText(current.toString());
		}
		// button 6
		else if (actionCommand.equals("6. Become president of a Club")) {
			current.setPosition("Buy a meal plan");
			JOptionPane.showMessageDialog(null, "Become president of a club, congrats! Spin again.");
		}
		// button 7
		else if (actionCommand.equals("7. Become an RA")) {
			playerMoney = current.getPlayerTotalMoney() + 2600;
			current.setPlayerTotalMoney(playerMoney);
			current.setPosition("Become an RA");
			JOptionPane.showMessageDialog(null, "Become an RA, get free room and board/refund");
			result = theText.getText();
			theText.setText(current.toString());
		}
		// button 8
		else if (actionCommand.equals("8. Go to party")) {
			current.setPosition("8. Go to party");
			JOptionPane.showMessageDialog(null, "Go to a party, lose next turn");
			result = theText.getText();
			theText.setText(current.toString());
		}
		// button 9
		else if (actionCommand.equals("9.Get Extra Study Time")) {
			current.setPosition("9.Get Extra Study Time");
			JOptionPane.showMessageDialog(null, "Get Extra Study Time, lose next turn");
			result = theText.getText();
			theText.setText(current.toString());
		}
		// button 10
		else if (actionCommand.equals("10. Lose Dorm Key, Pay for Replacement")) {
			playerMoney = current.getPlayerTotalMoney() - 20;
			current.setPlayerTotalMoney(playerMoney);
			current.setPosition("10. Lose Dorm Key, Pay for Replacement");
			JOptionPane.showMessageDialog(null, "Lose dorm key, pay $20 dollars to replace it");
			result = theText.getText();
			theText.setText(current.toString());
		}
		// button 11
		else if (actionCommand.equals("11. Get Drinking Ticket")) {
			playerMoney = current.getPlayerTotalMoney() - 50;
			current.setPlayerTotalMoney(playerMoney);
			current.setPosition("11. Get Drinking Ticket");
			JOptionPane.showMessageDialog(null,
					"You went out to party and got caught drinking underage, pay $50 drinking ticket");
			result = theText.getText();
			theText.setText(current.toString());
		}
		// button 12
		else if (actionCommand.equals("12. Choose to commute")) {
			current.setPosition("12. Choose to commute");
			JOptionPane.showMessageDialog(null, "You chose to commute");
		}
		// button 13
		else if (actionCommand.equals("13. Pay Rent")) {
			playerMoney = current.getPlayerTotalMoney() - 400;
			current.setPlayerTotalMoney(playerMoney);
			current.setPosition("13. Pay rent");
			JOptionPane.showMessageDialog(null, "Rent is due! Pay $400");
			result = theText.getText();
			theText.setText(current.toString());
		}
		// button 14
		else if (actionCommand.equals("14. Buy Parking Pass")) {
			playerMoney = current.getPlayerTotalMoney() - 50;
			current.setPlayerTotalMoney(playerMoney);
			current.setPosition("14. Buy Parking Pass");
			JOptionPane.showMessageDialog(null, "Buy a parking pass, pay $50");
			result = theText.getText();
			theText.setText(current.toString());
		}
		// button 15
		else if (actionCommand.equals("15. Buy Gas")) {
			playerMoney = current.getPlayerTotalMoney() - 20;
			current.setPlayerTotalMoney(playerMoney);
			current.setPosition("15. Buy Gas");
			JOptionPane.showMessageDialog(null, "Time to buy gas! Pay $20");
			result = theText.getText();
			theText.setText(current.toString());
		}
		// button 16
		else if (actionCommand.equals("16. Meet the Advisor")) {
			current.setPosition("16. Meet the Advisor");
			JOptionPane.showMessageDialog(null, "You met your advisor!");
		}
		// button 17
		else if (actionCommand.equals("17. Register for classes")) {
			current.setPosition("17. Register for classes");
			JOptionPane.showMessageDialog(null, "Register for classes and learn your schedule");
			result = theText.getText();
			theText.setText(current.toString());
		}
		// button 18
		else if (actionCommand.equals("18. Buy Book")) {
			playerMoney = current.getPlayerTotalMoney() - 200;
			current.setPlayerTotalMoney(playerMoney);
			current.setPosition("Buy Books");
			JOptionPane.showMessageDialog(null, "You landed on Buy Books and paid $200");
			result = theText.getText();
			theText.setText(current.toString());
		}
		// button 19
		else if (actionCommand.equals("19. Tuition due")) {
			playerMoney = current.getPlayerTotalMoney() - 5000;
			current.setPlayerTotalMoney(playerMoney);
			current.setPosition("19. Tuition due");
			JOptionPane.showMessageDialog(null, "Uh oh, tuition due! Pay $5000");
			result = theText.getText();
			theText.setText(current.toString());
		}
		// button 20
		else if (actionCommand.equals("20. Apply for Scholarships")) {
			JOptionPane.showMessageDialog(null, "Apply for scholarships, spin again");
			current.setPosition("20. Apply for Scholarships");
			result = theText.getText();
			theText.setText(current.toString());
		}
		// button 21
		else if (actionCommand.equals("21. Get Scholarship")) {
			playerMoney = current.getPlayerTotalMoney() + 2000;
			current.setPlayerTotalMoney(playerMoney);
			current.setPosition("21. Get Scholarship");
			JOptionPane.showMessageDialog(null, "You received a scholarship, collect $2,000!");
			result = theText.getText();
			theText.setText(current.toString());
		}
		// button 22
		else if (actionCommand.equals("22. Attend Class")) {
			JOptionPane.showMessageDialog(null, "Class goes over time, lose next turn");
			current.setPosition("22. Attend Class");
			result = theText.getText();
			theText.setText(current.toString());
		}
		// button 23
		else if (actionCommand.equals("23. Drop class")) {
			playerMoney = current.getPlayerTotalMoney() + 1000;
			current.setPlayerTotalMoney(playerMoney);
			current.setPosition("Drop Class");
			JOptionPane.showMessageDialog(null, "You get your money back but lose a turn");
			result = theText.getText();
			theText.setText(current.toString());
		}

		// button 24
		else if (actionCommand.equals("24. Take exam")) {
			JOptionPane.showMessageDialog(null, "You are taking exams and stay for 1 turn");
			result = theText.getText();
			current.setPosition("Take exams");
			theText.setText(current.toString());
		}
		// button 25
		else if (actionCommand.equals("25. Pass Class")) {
			JOptionPane.showMessageDialog(null,
					"You landed on Pass a class and go forward two squares. Now you are a Sophomore.");
			current.setPosition("Sophomore Year");
			current.setYearInSchool("Sophomore");
			result = theText.getText();
			theText.setText(current.toString());
		}
		// button 26
		else if (actionCommand.equals("26. Fail a class")) {
			JOptionPane.showMessageDialog(null,
					"You fail a class and go back two squares. Now you take the exams again.");
			current.setPosition("Take Exams");
			result = theText.getText();
			theText.setText(current.toString());
		}
		// button 27
		else if (actionCommand.equals("27. Sophomore Year")) {
			JOptionPane.showMessageDialog(null, "You are a Sophomore now.");
			current.setPosition("27. Sophomore Year");
			current.setYearInSchool("Sophomore");
			result = theText.getText();
			theText.setText(current.toString());
		}
		// button 28
		else if (actionCommand.equals("28. Change Major")) {
			JOptionPane.showMessageDialog(null, "You change your major and go back one square.");
			current.setPosition("28. Change Major");
			current.setYearInSchool("Sophomore");
			result = theText.getText();
			theText.setText(current.toString());
		}
		// button 29
		else if (actionCommand.equals("29. Look for part time job")) {
			JOptionPane.showMessageDialog(null, "You are looking for a part-time job");
			current.setPosition("29.Look for part time job");
			result = theText.getText();
			theText.setText(current.toString());
		}
		// button 30
		else if (actionCommand.equals("30. Get a part time job")) {
			playerMoney = current.getPlayerTotalMoney() + 600;
			current.setPlayerTotalMoney(playerMoney);
			current.setPosition("30.Get a part-time job");
			JOptionPane.showMessageDialog(null, "You get a part-time job and earn $600.");
			current.setYearInSchool("Sophomore");
			result = theText.getText();
			theText.setText(current.toString());
		}
		// button 31
		else if (actionCommand.equals("31. Register for classes")) {
			current.setPosition("31. Register for classes");
			JOptionPane.showMessageDialog(null, "Register for classes and learn your schedule");
			result = theText.getText();
			theText.setText(current.toString());
		}
		// button 32
		else if (actionCommand.equals("32. Buy Book")) {
			playerMoney = current.getPlayerTotalMoney() - 200;
			current.setPlayerTotalMoney(playerMoney);
			current.setPosition("32. Buy Books");
			JOptionPane.showMessageDialog(null, "You landed on Buy Books and paid $200");
			result = theText.getText();
			theText.setText(current.toString());
		}
		// button 33
		else if (actionCommand.equals("33. Pay Tuition")) {
			playerMoney = current.getPlayerTotalMoney() - 5000;
			current.setPlayerTotalMoney(playerMoney);
			current.setPosition("33. Pay Tuition");
			JOptionPane.showMessageDialog(null, "Uh oh, tuition due! Pay $5000");
			result = theText.getText();
			theText.setText(current.toString());
		}
		// button 34
		else if (actionCommand.equals("34. Get Scholarship")) {
			playerMoney = current.getPlayerTotalMoney() + 2000;
			current.setPlayerTotalMoney(playerMoney);
			current.setPosition("34. Get Scholarship");
			JOptionPane.showMessageDialog(null, "You received a scholarship, collect $2,000!");
			result = theText.getText();
			theText.setText(current.toString());
		}
		// button 35
		else if (actionCommand.equals("35. Attend Class")) {
			JOptionPane.showMessageDialog(null, "Class goes over time, lose next turn");
			current.setPosition("35. Attend Class");
			result = theText.getText();
			theText.setText(current.toString());
		}
		// button 36
		else if (actionCommand.equals("36. Drop Class")) {
			playerMoney = current.getPlayerTotalMoney() + 1000;
			current.setPlayerTotalMoney(playerMoney);
			current.setPosition("36. Drop Class");
			JOptionPane.showMessageDialog(null, "You get your money back, but lose a turn");
			result = theText.getText();
			theText.setText(current.toString());
		}
		// button 37
		else if (actionCommand.equals("37. Take Exam")) {
			JOptionPane.showMessageDialog(null, "You are taking exams and stay for 1 turn");
			result = theText.getText();
			current.setPosition("37. Take Exam");
			theText.setText(current.toString());
		}
		// button 38
		else if (actionCommand.equals("38.Junior Year")) {
			JOptionPane.showMessageDialog(null, "You are a Junior now.");
			current.setPosition("38.Junior Year");
			current.setYearInSchool("Junior");
			result = theText.getText();
			theText.setText(current.toString());
		}
		// button 39
		else if (actionCommand.equals("39.Look for Internship")) {
			JOptionPane.showMessageDialog(null, "You are looking for an internship.");
			current.setPosition("39.Look for Internship");
			result = theText.getText();
			theText.setText(current.toString());
		}
		// button 40
		else if (actionCommand.equals("40.Get Internship")) {
			playerMoney = current.getPlayerTotalMoney() + 1000;
			current.setPlayerTotalMoney(playerMoney);
			current.setPosition("40.Get Internship");
			JOptionPane.showMessageDialog(null, "You get an internship and earn $1000.");
			current.setYearInSchool("Sophomore");
			result = theText.getText();
			theText.setText(current.toString());
		}
		// button 41
		else if (actionCommand.equals("41.In a Relationship")) {
			JOptionPane.showMessageDialog(null,
					"Great! You are in a relationship, so please stay here for the next turn.");
			current.setPosition("41.In a Relationship");
			result = theText.getText();
			theText.setText(current.toString());
		}
		// button 42
		else if (actionCommand.equals("42.Go to Sport Event")) {
			playerMoney = current.getPlayerTotalMoney() - 50;
			current.setPlayerTotalMoney(playerMoney);
			current.setPosition("42.Go to Sport Event");
			JOptionPane.showMessageDialog(null, "You enjoy the sport event and spend $50.");
			result = theText.getText();
			theText.setText(current.toString());
		}
		// button 43
		else if (actionCommand.equals("43.Go to Movie")) {
			playerMoney = current.getPlayerTotalMoney() - 10;
			current.setPlayerTotalMoney(playerMoney);
			current.setPosition("43.Go to Movie");
			JOptionPane.showMessageDialog(null, "You enjoy the movie and spend $10.");
			result = theText.getText();
			theText.setText(current.toString());
		}
		// button 44
		else if (actionCommand.equals("44.Get Additional Pay")) {
			playerMoney = current.getPlayerTotalMoney() + 1000;
			current.setPlayerTotalMoney(playerMoney);
			current.setPosition("44.Get Additional Pay");
			JOptionPane.showMessageDialog(null, "You received a scholarship, collect $1,000!");
			result = theText.getText();
			theText.setText(current.toString());
		}
		// button 45
		else if (actionCommand.equals("45. Buy Books")) {
			playerMoney = current.getPlayerTotalMoney() - 200;
			current.setPlayerTotalMoney(playerMoney);
			current.setPosition("45. Buy Books");
			JOptionPane.showMessageDialog(null, "You landed on buy books and paid $200");
			result = theText.getText();
			theText.setText(current.toString());
		}
		// button 46
		else if (actionCommand.equals("46. Take Exam")) {
			JOptionPane.showMessageDialog(null, "You are taking exam and stay for one turn");
			result = theText.getText();
			current.setPosition("46. Take Exam");
			theText.setText(current.toString());
		}
		// button 47
		else if (actionCommand.equals("47. Eat Outside")) {
			playerMoney = current.getPlayerTotalMoney() - 20;
			current.setPlayerTotalMoney(playerMoney);
			current.setPosition("47. Eat Outside");
			JOptionPane.showMessageDialog(null, "You landed on eat outside and paid $20");
			result = theText.getText();
			theText.setText(current.toString());
		}
		// button 48
		else if (actionCommand.equals("48. Senior Year")) {
			JOptionPane.showMessageDialog(null, "You are a senior now.");
			current.setPosition("48. Senior Year");
			current.setYearInSchool("Senior");
			result = theText.getText();
			theText.setText(current.toString());
		}
		// button 49
		else if (actionCommand.equals("49. Attend Job Fair")) {
			JOptionPane.showMessageDialog(null, "You are looking for a full-time job.");
			current.setPosition("49. Attend Job Fail");
			result = theText.getText();
			theText.setText(current.toString());
		}
		// button 50
		else if (actionCommand.equals("50. Take Class")) {
			JOptionPane.showMessageDialog(null, "You are taking class and stay for one turn");
			result = theText.getText();
			current.setPosition("50. Take Class");
			theText.setText(current.toString());
		}
		// button 51
		else if (actionCommand.equals("51. Attend Interview")) {
			playerMoney = current.getPlayerTotalMoney() - 300;
			current.setPlayerTotalMoney(playerMoney);
			current.setPosition("51. Attend Interview");
			JOptionPane.showMessageDialog(null, "You landed on buy a suit for interview and paid $300");
			result = theText.getText();
			theText.setText(current.toString());
		}
		// button 52
		else if (actionCommand.equals("52.Prepare GRE")) {
			playerMoney = current.getPlayerTotalMoney() - 500;
			current.setPlayerTotalMoney(playerMoney);
			current.setPosition("52.Prepare GRE");
			JOptionPane.showMessageDialog(null, "You landed on register GRE exam and paid $500");
			result = theText.getText();
			theText.setText(current.toString());
		}
		// button 53
		else if (actionCommand.equals("53.Buy Books")) {
			playerMoney = current.getPlayerTotalMoney() - 200;
			current.setPlayerTotalMoney(playerMoney);
			current.setPosition("53.Buy Book");
			JOptionPane.showMessageDialog(null, "You landed on buy books and paid $200");
			result = theText.getText();
			theText.setText(current.toString());
		}
		// button 54
		else if (actionCommand.equals("54.Travel")) {
			playerMoney = current.getPlayerTotalMoney() - 1500;
			current.setPlayerTotalMoney(playerMoney);
			current.setPosition("54.Travel");
			JOptionPane.showMessageDialog(null, "You landed on travel and paid $1500");
			result = theText.getText();
			theText.setText(current.toString());
		}
		// button 55
		else if (actionCommand.equals("55.Take GRE Exam")) {
			current.setPosition("55.Take GRE Exam");
			JOptionPane.showMessageDialog(null, "You are taking GRE exam and stay for one turn");
			result = theText.getText();
			theText.setText(current.toString());
		}
		// button 56
		else if (actionCommand.equals("56.Take Exam")) {
			JOptionPane.showMessageDialog(null, "You are taking exam and stay for one turn");
			current.setPosition("56.Take Exam");
			result = theText.getText();
			theText.setText(current.toString());
		}
		// button 57
		else if (actionCommand.equals("57.Stressful Day")) {
			JOptionPane.showMessageDialog(null, "You need to relax and stay for one turn");
			current.setPosition("57.Stressful Day");
			result = theText.getText();
			theText.setText(current.toString());
		}
		// button 58
		else if (actionCommand.equals("58.Sick Day")) {
			playerMoney = current.getPlayerTotalMoney() - 30;
			current.setPlayerTotalMoney(playerMoney);
			current.setPosition("58.Sick Day");
			JOptionPane.showMessageDialog(null, "You landed on buy medicine and paid $30");
			result = theText.getText();
			theText.setText(current.toString());
		}
		// button 59
		else if (actionCommand.equals("59.Prepare the Thesis")) {
			JOptionPane.showMessageDialog(null, "You are preparing the thesis and stay for one turn");
			current.setPosition("59.Prepare the Thesis");
			result = theText.getText();
			theText.setText(current.toString());
		}
		// button 60
		else if (actionCommand.equals("60.Thesis Presentation")) {
			JOptionPane.showMessageDialog(null, "You are doing thesis presentation.");
			current.setPosition("60.Thesis Presentation");
			result = theText.getText();
			theText.setText(current.toString());
		}
		// button 61
		else if (actionCommand.equals("61.Apply for Graduation")) {
			playerMoney = current.getPlayerTotalMoney() - 50;
			current.setPlayerTotalMoney(playerMoney);
			current.setPosition("61.Apply for Graduation");
			JOptionPane.showMessageDialog(null, "You landed on apply for graduation and paid $50");
			result = theText.getText();
			theText.setText(current.toString());
		}
		// button 62
		else if (actionCommand.equals("62.Order Gown")) {
			playerMoney = current.getPlayerTotalMoney() - 200;
			current.setPlayerTotalMoney(playerMoney);
			current.setPosition("62.Order Gown");
			JOptionPane.showMessageDialog(null, "You landed on order gown and paid $200");
			result = theText.getText();
			theText.setText(current.toString());
		}
		// button 63
		else if (actionCommand.equals("63.Go to Party")) {
			partyOptions();
		}
		// button 64
		else if (actionCommand.equals("64.Get Full-Time Job")) {
			playerMoney = current.getPlayerTotalMoney() + 3000;
			current.setPlayerTotalMoney(playerMoney);
			JOptionPane.showMessageDialog(null, "Get a full-time job and earn $3,000.");
			current.setPosition("64.Get Full-Time Job");
			result = theText.getText();
			theText.setText(current.toString());
		}
		// button 65
		else if (actionCommand.equals("65.Pack Stuff")) {
			current.setPosition("65.Pack Stuff");
			JOptionPane.showMessageDialog(null, "Pack stuff and lose next turn");
			result = theText.getText();
			theText.setText(current.toString());
		}
		// button 66
		else if (actionCommand.equals("66. Graduation")) {
			JOptionPane.showMessageDialog(null, "Attend graduation ceremony. " + current.getPlayerName() + " is Winner!");
			clickSpin.setEnabled(false);

		}
		// This goes in game class
		else if (actionCommand.equals("Player1")) {
			switchPlayer(PlayerNumber.PLAYER1);
			result = theText.getText();
			theText.setText(current.toString());
		}

		else if (actionCommand.equals("Player2")) {
			switchPlayer(PlayerNumber.PLAYER2);
			result = theText.getText();
			theText.setText(current.toString());
		}

		else if (actionCommand.equals("Player3")) {
			switchPlayer(PlayerNumber.PLAYER3);
			result = theText.getText();
			theText.setText(current.toString());
		}

	}

	private Player switchPlayer(PlayerNumber playerNumber) {
		switch (playerNumber) {
		case PLAYER1:
			current = player1;
			return current;
		case PLAYER2:
			current = player2;
			return current;
		case PLAYER3:
			current = player3;
			return current;
		default:
			current = player1;
			return current;
		}
	}

	// put this in game class*

	////////////////////////////

	public void partyOptions() {
		Random rand1 = new Random();
		int n1 = rand1.nextInt(4) + 1;
		if (n1 == 3) {
			JOptionPane.showMessageDialog(null, "You went to a party and " + partyOptions[0]);
		} else if (n1 == 2) {
			JOptionPane.showMessageDialog(null, "You went to a party and " + partyOptions[1]);
		} else if (n1 == 1) {
			JOptionPane.showMessageDialog(null, "You went to a party and " + partyOptions[2]);
		} else {
			JOptionPane.showMessageDialog(null, "You went to a party and were fine the next day");
		}
	}

	private void init() {

		board = new JFrame();

		board.setLayout(new GridLayout(15, 15, 10, 10));

		String[] partyOptions = { "overslept", "have a massive hangover", "missed a morning exam" };

		//////////////////////////////////////////////////////////////////////////////////// Buttons

	}

	private void initP1() {
		p1 = new JPanel();
		
		// p1.setBackground(Color.GREEN);
		p1.setPreferredSize(new Dimension(50, 200));
		d = new Dimension(110, 50);
		board.setBackground(Color.GREEN);
		JButton blank1 = new JButton("Player1");
		p1.add(blank1);
		blank1.setPreferredSize(d);
		blank1.addActionListener(this);
		blank1.setBackground(Color.cyan);
		JButton blank2 = new JButton("Player2");
		p1.add(blank2);
		blank2.setPreferredSize(d);
		blank2.setBackground(Color.MAGENTA);
		blank2.addActionListener(this);
		JButton blank3 = new JButton("Player3");
		p1.add(blank3);
		blank3.setPreferredSize(d);
		blank3.addActionListener(this);
		blank3.setBackground(Color.YELLOW);

		JLabel blank4 = new JLabel("");
		p1.add(blank4);
		blank4.setPreferredSize(d);
		JLabel blank5 = new JLabel(" ");
		p1.add(blank5);
		blank5.setPreferredSize(d);
		JLabel blank6 = new JLabel(" ");
		p1.add(blank6);
		blank6.setPreferredSize(d);

		party = new JButton("63.Go to Party");
		p1.add(party);
		party.setBackground(Color.orange);
		party.setOpaque(true);
		party.setBorderPainted(false);
		party.addActionListener(this);
		party.setPreferredSize(d);

		gown = new JButton("62.Order Gown");
		p1.add(gown);
		gown.setBackground(Color.orange);
		gown.setOpaque(true);
		gown.setBorderPainted(false);
		gown.addActionListener(this);
		gown.setPreferredSize(d);
		applyGraduation = new JButton("61.Apply for Graduation");
		p1.add(applyGraduation);
		applyGraduation.setBackground(Color.orange);
		applyGraduation.setOpaque(true);
		applyGraduation.setBorderPainted(false);
		applyGraduation.addActionListener(this);
		applyGraduation.setPreferredSize(d);
		//applyGraduation.setText("<html><center>" + "61.Apply for Graduation" + "</center></html>");
		thesisPresent = new JButton("60.Thesis Presentation");
		p1.add(thesisPresent);
		thesisPresent.setBackground(Color.orange);
		thesisPresent.setOpaque(true);
		thesisPresent.setBorderPainted(false);
		thesisPresent.addActionListener(this);
		thesisPresent.setPreferredSize(d);
		thesisPrepare = new JButton("59.Prepare the Thesis");
		p1.add(thesisPrepare);
		thesisPrepare.setBackground(Color.orange);
		thesisPrepare.setOpaque(true);
		thesisPrepare.setBorderPainted(false);
		thesisPrepare.addActionListener(this);
		thesisPrepare.setPreferredSize(d);
		sickButton = new JButton("58.Sick Day");
		p1.add(sickButton);
		sickButton.setBackground(Color.orange);
		sickButton.setOpaque(true);
		sickButton.setBorderPainted(false);
		sickButton.addActionListener(this);
		sickButton.setPreferredSize(d);
		stressButton = new JButton("57.Stressful Day");
		p1.add(stressButton);
		stressButton.setBackground(Color.orange);
		stressButton.setOpaque(true);
		stressButton.setBorderPainted(false);
		stressButton.addActionListener(this);
		stressButton.setPreferredSize(d);
		takeExam = new JButton("56.Take Exam");
		p1.add(takeExam);
		takeExam.setBackground(Color.orange);
		takeExam.setOpaque(true);
		takeExam.setBorderPainted(false);
		takeExam.addActionListener(this);
		takeExam.setPreferredSize(d);
		board.add(p1);
		p1.setVisible(true);
		// spinner.addActionListener(this);
	}
	/////////////////////////////////////////////////////////////////

	private void initP2() {
		p2 = new JPanel();
		p2.setPreferredSize(new Dimension(30, 100));
		JLabel blank8 = new JLabel(" ");
		p2.add(blank8);
		blank8.setVisible(true);
		blank8.setPreferredSize(d);
		JLabel blank9 = new JLabel(" ");
		p2.add(blank9);
		blank9.setVisible(true);
		blank9.setPreferredSize(d);
		JLabel blank10 = new JLabel(" ");
		p2.add(blank10);
		blank10.setVisible(true);
		blank10.setPreferredSize(d);
		JLabel blank11 = new JLabel(" ");
		p2.add(blank11);
		blank11.setVisible(true);
		blank11.setPreferredSize(d);
		JLabel blank12 = new JLabel(" ");
		p2.add(blank12);
		blank12.setVisible(true);
		blank12.setPreferredSize(d);
		JLabel blank13 = new JLabel(" ");
		p2.add(blank13);
		blank13.setVisible(true);
		blank13.setPreferredSize(d);
		fullJob = new JButton("64.Get Full-Time Job");
		p2.add(fullJob);
		fullJob.setBackground(Color.green);
		fullJob.setOpaque(true);
		fullJob.setBorderPainted(false);
		fullJob.addActionListener(this);
		fullJob.setPreferredSize(d);
		JLabel blank14 = new JLabel(" ");
		p2.add(blank14);
		blank14.setPreferredSize(d);
		JLabel blank15 = new JLabel(" ");
		p2.add(blank15);
		blank15.setPreferredSize(d);
		JLabel blank16 = new JLabel(" ");
		p2.add(blank16);
		blank16.setPreferredSize(d);
		JLabel blank17 = new JLabel(" ");
		p2.add(blank17);
		blank17.setPreferredSize(d);
		JLabel blank18 = new JLabel(" ");
		p2.add(blank18);
		blank18.setPreferredSize(d);
		JLabel blank19 = new JLabel(" ");
		p2.add(blank19);
		blank19.setPreferredSize(d);
		p2.add(gRE);
		gRE.setBackground(Color.orange);
		gRE.setOpaque(true);
		gRE.setBorderPainted(false);
		gRE.addActionListener(this);
		gRE.setPreferredSize(d);
		board.add(p2);
		p2.setVisible(true);
	}
	///////////////////////////////////////////////////////////////////////////////

	private void initP3() {
		p3 = new JPanel();
		// p3.setPreferredSize(new Dimension(30, 100));
		JLabel blank21 = new JLabel(" ");
		p3.add(blank21);
		blank21.setPreferredSize(d);
		JLabel blank22 = new JLabel(" ");
		p3.add(blank22);
		blank22.setPreferredSize(d);
		JLabel blank23 = new JLabel(" ");
		p3.add(blank23);
		blank23.setPreferredSize(d);
		JLabel blank24 = new JLabel(" ");
		p3.add(blank24);
		blank24.setPreferredSize(d);
		JLabel blank25 = new JLabel(" ");
		p3.add(blank25);
		blank25.setPreferredSize(d);
		JLabel blank26 = new JLabel(" ");
		p3.add(blank26);
		blank26.setPreferredSize(d);
		p3.add(pack);
		pack.setBackground(Color.orange);
		pack.setOpaque(true);
		pack.setBorderPainted(false);
		pack.addActionListener(this);
		pack.setPreferredSize(d);
		JLabel blank27 = new JLabel(" ");
		p3.add(blank27);
		blank27.setPreferredSize(d);
		JLabel blank28 = new JLabel(" ");
		p3.add(blank28);
		blank28.setPreferredSize(d);
		p3.add(intern);
		intern.setBackground(Color.green);
		intern.setOpaque(true);
		intern.setBorderPainted(false);
		intern.addActionListener(this);
		intern.setPreferredSize(d);
		p3.add(relationship);
		relationship.setBackground(Color.orange);
		relationship.setOpaque(true);
		relationship.setBorderPainted(false);
		relationship.addActionListener(this);
		relationship.setPreferredSize(d);
		p3.add(sport);
		sport.setBackground(Color.orange);
		sport.setOpaque(true);
		sport.setBorderPainted(false);
		sport.addActionListener(this);
		sport.setPreferredSize(d);
		JLabel blank29 = new JLabel(" ");
		p3.add(blank29);
		blank29.setPreferredSize(d);
		p3.add(travel);
		travel.setBackground(Color.orange);
		travel.setOpaque(true);
		travel.setBorderPainted(false);
		travel.addActionListener(this);
		travel.setPreferredSize(d);
		board.add(p3);
		p3.setVisible(true);
	}

	////////////////////////////////////////////////////////////////////

	private void initP4() {
		p4 = new JPanel();
		party2 = new JButton("8. Go to party");
		p4.add(party2);
		party2.setBackground(Color.orange);
		party2.setOpaque(true);
		party2.setBorderPainted(false);
		party2.addActionListener(this);
		party2.setPreferredSize(d);
		ra = new JButton("7. Become an RA");
		p4.add(ra);
		ra.setBackground(Color.orange);
		ra.setOpaque(true);
		ra.setBorderPainted(false);
		ra.addActionListener(this);
		ra.setPreferredSize(d);
		club = new JButton("6. Become president of a Club");
		p4.add(club);
		club.setBackground(Color.orange);
		club.setOpaque(true);
		club.setBorderPainted(false);
		club.addActionListener(this);
		club.setPreferredSize(d);
		JLabel blank30 = new JLabel(" ");
		p4.add(blank30);
		blank30.setPreferredSize(d);
		JLabel blank31 = new JLabel(" ");
		p4.add(blank31);
		blank31.setPreferredSize(d);
		JLabel blank32 = new JLabel(" ");
		p4.add(blank32);
		blank32.setPreferredSize(d);
		p4.add(graduation);
		graduation.setBackground(Color.orange);
		graduation.setOpaque(true);
		graduation.setBorderPainted(false);
		graduation.addActionListener(this);
		graduation.setPreferredSize(d);
		JLabel blank33 = new JLabel(" ");
		p4.add(blank33);
		blank33.setPreferredSize(d);
		JLabel blank34 = new JLabel(" ");
		p4.add(blank34);
		blank34.setPreferredSize(d);
		p4.add(lookintern);
		lookintern.setBackground(Color.orange);
		lookintern.setOpaque(true);
		lookintern.setBorderPainted(false);
		lookintern.addActionListener(this);
		lookintern.setPreferredSize(d);
		JLabel blank35 = new JLabel(" ");
		p4.add(blank35);
		blank35.setPreferredSize(d);
		p4.add(movie);
		movie.setBackground(Color.orange);
		movie.setOpaque(true);
		movie.setBorderPainted(false);
		movie.addActionListener(this);
		movie.setPreferredSize(d);
		JLabel blank36 = new JLabel(" ");
		p4.add(blank36);
		blank36.setPreferredSize(d);
		try {
			Image img3 = ImageIO.read(getClass().getResource("book.png"));
			bookButton.setIcon(new ImageIcon(img3.getScaledInstance(110, 50, Image.SCALE_SMOOTH)));
			p4.add(bookButton);
			bookButton.setPreferredSize(d);
			bookButton.addActionListener(this);
		} catch (Exception ex) {
			System.out.println(ex);
		}

		board.add(p4);
		p4.setVisible(true);
	}

	private void initP5() {
		////////////////////////////////////////////////////////////////////////////
		p5 = new JPanel();
		extraTime = new JButton("9.Get Extra Study Time");
		p5.add(extraTime);
		extraTime.setBackground(Color.orange);
		extraTime.setOpaque(true);
		extraTime.setBorderPainted(false);
		extraTime.setPreferredSize(d);
		extraTime.addActionListener(this);
		JLabel blank37 = new JLabel(" ");
		p5.add(blank37);
		blank37.setPreferredSize(d);
		blank37.setVisible(true);
		mealPlan = new JButton("5. Buy Meal Plan");
		p5.add(mealPlan);
		mealPlan.setBackground(Color.orange);
		mealPlan.setOpaque(true);
		mealPlan.setBorderPainted(false);
		mealPlan.setPreferredSize(d);
		mealPlan.addActionListener(this);
		JLabel blank38 = new JLabel(" ");
		p5.add(blank38);
		blank38.setPreferredSize(d);
		JLabel blank39 = new JLabel(" ");
		p5.add(blank39);
		blank39.setPreferredSize(d);
		JLabel blank40 = new JLabel(" ");
		p5.add(blank40);
		blank40.setPreferredSize(d);
		try {
			Image img1 = ImageIO.read(getClass().getResource("graduation.jpg"));
			blank41.setIcon(new ImageIcon(img1.getScaledInstance(110, 50, Image.SCALE_SMOOTH)));
			p5.add(blank41);
			blank41.setPreferredSize(d);
			blank41.addActionListener(this);
		} catch (Exception ex) {
			System.out.println(ex);
		}
		JLabel blank42 = new JLabel(" ");
		p5.add(blank42);
		blank42.setPreferredSize(d);
		JLabel blank43 = new JLabel(" ");
		p5.add(blank43);
		blank43.setPreferredSize(d);
		p5.add(juniorYear);
		juniorYear.setBackground(Color.red);
		juniorYear.setOpaque(true);
		juniorYear.setBorderPainted(false);
		juniorYear.setPreferredSize(d);
		juniorYear.addActionListener(this);
		JLabel blank44 = new JLabel(" ");
		p5.add(blank44);
		blank44.setPreferredSize(d);
		addlPay.setBackground(Color.GREEN);
		addlPay.setOpaque(true);
		addlPay.setBorderPainted(false);
		addlPay.setPreferredSize(d);
		addlPay.addActionListener(this);
		p5.add(addlPay);
		JLabel blank45 = new JLabel(" ");
		p5.add(blank45);
		blank45.setPreferredSize(d);
		p5.add(prepareGRE);
		prepareGRE.setBackground(Color.orange);
		prepareGRE.setOpaque(true);
		prepareGRE.setBorderPainted(false);
		prepareGRE.setPreferredSize(d);
		prepareGRE.addActionListener(this);
		board.add(p5);
		p5.setVisible(true);
	}

	///////////////////////////////////////////////////////////////////
	private void initP6() {
		p6 = new JPanel();
		loseDormKey = new JButton("10. Lose Dorm Key, Pay for Replacement");
		p6.add(loseDormKey);
		loseDormKey.setBackground(Color.orange);
		loseDormKey.setOpaque(true);
		loseDormKey.setBorderPainted(false);
		loseDormKey.setPreferredSize(d);
		loseDormKey.addActionListener(this);
		JLabel blank46 = new JLabel(" ");
		p6.add(blank46);
		blank46.setPreferredSize(d);
		blank46.setVisible(true);
		chooseDormLife = new JButton("4. Choose Dorm Life");
		p6.add(chooseDormLife);
		chooseDormLife.setBackground(Color.orange);
		chooseDormLife.setOpaque(true);
		chooseDormLife.setBorderPainted(false);
		chooseDormLife.setPreferredSize(d);
		chooseDormLife.addActionListener(this);
		JLabel blank47 = new JLabel(" ");
		p6.add(blank47);
		blank47.setPreferredSize(d);
		blank47.setVisible(true);
		JLabel blank48 = new JLabel(" ");
		p6.add(blank48);
		blank48.setPreferredSize(d);
		blank48.setVisible(true);
		JLabel blank49 = new JLabel(" ");
		p6.add(blank49);
		blank49.setPreferredSize(d);
		blank49.setVisible(true);
		JLabel blank50 = new JLabel(" ");
		p6.add(blank50);
		blank50.setPreferredSize(d);
		blank50.setVisible(true);
		JLabel blank51 = new JLabel(" ");
		p6.add(blank51);
		blank51.setPreferredSize(d);
		blank51.setVisible(true);
		JLabel blank52 = new JLabel(" ");
		p6.add(blank52);
		blank52.setPreferredSize(d);
		blank52.setVisible(true);
		takeExam1 = new JButton("37. Take Exam");
		p6.add(takeExam1);
		takeExam1.setBackground(Color.orange);
		takeExam1.setOpaque(true);
		takeExam1.setBorderPainted(false);
		takeExam1.setPreferredSize(d);
		takeExam1.addActionListener(this);
		JLabel blank53 = new JLabel(" ");
		p6.add(blank53);
		blank53.setPreferredSize(d);
		blank53.setVisible(true);
		buyBooks = new JButton("45. Buy Books");
		try {
			Image img10 = ImageIO.read(getClass().getResource("book.png"));
			buyBooks.setIcon(new ImageIcon(img10.getScaledInstance(110, 50, Image.SCALE_SMOOTH)));
			p6.add(buyBooks);
			buyBooks.setPreferredSize(d);
			buyBooks.addActionListener(this);
			
			buyBooks.setOpaque(true);
			buyBooks.setBorderPainted(false);
		} catch (Exception ex) {
			System.out.println(ex);
		}
		
		
		
		
		JLabel blank54 = new JLabel(" ");
		p6.add(blank54);
		blank54.setPreferredSize(d);
		blank54.setVisible(true);
		attendInterview = new JButton("51. Attend Interview");
		p6.add(attendInterview);
		attendInterview.setBackground(Color.orange);
		attendInterview.setOpaque(true);
		attendInterview.setBorderPainted(false);
		attendInterview.setPreferredSize(d);
		attendInterview.addActionListener(this);
		board.add(p6);
		p6.setVisible(true);
	}

	/////////////////////////////////////////////////////////////////
	private void initP7() {

		p7 = new JPanel();
		getDrinkingTicket = new JButton("11. Get Drinking Ticket");
		p7.add(getDrinkingTicket);
		getDrinkingTicket.setBackground(Color.orange);
		getDrinkingTicket.setOpaque(true);
		getDrinkingTicket.setBorderPainted(false);
		getDrinkingTicket.setPreferredSize(d);
		getDrinkingTicket.addActionListener(this);
		JLabel blank56 = new JLabel(" ");
		p7.add(blank56);
		blank56.setPreferredSize(d);
		blank56.setVisible(true);
		chooseMajor = new JButton("3. Choose Major");
		p7.add(chooseMajor);
		chooseMajor.setBackground(Color.orange);
		chooseMajor.setOpaque(true);
		chooseMajor.setBorderPainted(false);
		chooseMajor.setPreferredSize(d);
		chooseMajor.addActionListener(this);
		freshmanYear = new JButton("2. Freshman Year");
		p7.add(freshmanYear);
		freshmanYear.setBackground(Color.red);
		freshmanYear.setOpaque(true);
		freshmanYear.setBorderPainted(false);
		freshmanYear.setPreferredSize(d);
		freshmanYear.addActionListener(this);
		start = new JButton("1. Start");
		p7.add(start);
		start.setBackground(Color.orange);
		start.setOpaque(true);
		start.setBorderPainted(false);
		start.setPreferredSize(d);
		start.addActionListener(this);
		try {
			Image img = ImageIO.read(getClass().getResource("spinner.jpeg"));
			clickSpin.setIcon(new ImageIcon(img.getScaledInstance(110, 50, Image.SCALE_SMOOTH)));
			p7.add(clickSpin);
			p7.add(clickSpin);
			clickSpin.setPreferredSize(d);
			clickSpin.addActionListener(this);
		} catch (Exception ex) {
			System.out.println(ex);
		}
		JLabel blank57 = new JLabel(" ");
		p7.add(blank57);
		blank57.setPreferredSize(d);
		blank57.setVisible(true);
		JLabel blank58 = new JLabel(" ");
		p7.add(blank58);
		blank58.setPreferredSize(d);
		blank58.setVisible(true);
		JLabel blank59 = new JLabel(" ");
		p7.add(blank59);
		blank59.setPreferredSize(d);
		blank59.setVisible(true);
		dropClass = new JButton("36. Drop Class");
		p7.add(dropClass);
		dropClass.setBackground(Color.orange);
		dropClass.setOpaque(true);
		dropClass.setBorderPainted(false);
		dropClass.setPreferredSize(d);
		dropClass.addActionListener(this);
		JLabel blank60 = new JLabel(" ");
		p7.add(blank60);
		blank60.setPreferredSize(d);
		blank60.setVisible(true);
		takeExam2 = new JButton("46. Take Exam");
		p7.add(takeExam2);
		takeExam2.setBackground(Color.orange);
		takeExam2.setOpaque(true);
		takeExam2.setBorderPainted(false);
		takeExam2.setPreferredSize(d);
		takeExam2.addActionListener(this);
		JLabel blank61 = new JLabel(" ");
		p7.add(blank61);
		blank61.setPreferredSize(d);
		blank61.setVisible(true);
		JButton takeClass = new JButton("50. Take Class");
		p7.add(takeClass);
		takeClass.setBackground(Color.orange);
		takeClass.setOpaque(true);
		takeClass.setBorderPainted(false);
		takeClass.setPreferredSize(d);
		takeClass.addActionListener(this);
		board.add(p7);
		p7.setVisible(true);
	}
	/////////////////////////////////////////////////////////////

	private void initP8() {
		p8 = new JPanel();
		meetAdvisor = new JButton("16. Meet the Advisor");
		p8.add(meetAdvisor);
		meetAdvisor.setBackground(Color.orange);
		meetAdvisor.setOpaque(true);
		meetAdvisor.setBorderPainted(false);
		meetAdvisor.setPreferredSize(d);
		meetAdvisor.addActionListener(this);
		buyGas = new JButton("15. Buy Gas");
		p8.add(buyGas);
		buyGas.setBackground(Color.orange);
		buyGas.setOpaque(true);
		buyGas.setBorderPainted(false);
		buyGas.setPreferredSize(d);
		buyGas.addActionListener(this);
		chooseCommute = new JButton("12. Choose to commute");
		p8.add(chooseCommute);
		chooseCommute.setBackground(Color.orange);
		chooseCommute.setOpaque(true);
		chooseCommute.setBorderPainted(false);
		chooseCommute.setPreferredSize(d);
		chooseCommute.addActionListener(this);

		try {
			JLabel blank62 = new JLabel(" ");
			p8.add(blank62);
			Image w = ImageIO.read(getClass().getResource("w.png"));
			blank62.setIcon(new ImageIcon(w.getScaledInstance(110, 50, Image.SCALE_SMOOTH)));
			p8.add(blank62);
			p8.add(blank62);
			blank62.setPreferredSize(d);
			blank62.setVisible(true);
			JLabel blank63 = new JLabel(" ");
			p8.add(blank63);
			Image e = ImageIO.read(getClass().getResource("e.png"));
			blank63.setIcon(new ImageIcon(e.getScaledInstance(110, 50, Image.SCALE_SMOOTH)));
			blank63.setPreferredSize(d);
			blank63.setVisible(true);
			JLabel blank64 = new JLabel(" ");
			p8.add(blank64);
			Image l = ImageIO.read(getClass().getResource("l.png"));
			blank64.setIcon(new ImageIcon(l.getScaledInstance(110, 50, Image.SCALE_SMOOTH)));
			blank64.setPreferredSize(d);
			blank64.setVisible(true);
			JLabel blank65 = new JLabel(" ");
			p8.add(blank65);
			Image c = ImageIO.read(getClass().getResource("c.png"));
			blank65.setIcon(new ImageIcon(c.getScaledInstance(110, 50, Image.SCALE_SMOOTH)));
			blank65.setPreferredSize(d);
			blank65.setVisible(true);
			JLabel blank66 = new JLabel(" ");
			p8.add(blank66);
			Image o = ImageIO.read(getClass().getResource("o.png"));
			blank66.setIcon(new ImageIcon(o.getScaledInstance(110, 50, Image.SCALE_SMOOTH)));
			blank66.setPreferredSize(d);
			blank66.setVisible(true);
			JLabel blank67 = new JLabel(" ");
			p8.add(blank67);
			Image m = ImageIO.read(getClass().getResource("m.png"));
			blank67.setIcon(new ImageIcon(m.getScaledInstance(110, 50, Image.SCALE_SMOOTH)));
			blank67.setPreferredSize(d);
			blank67.setVisible(true);

			JLabel blank68 = new JLabel(" ");
			p8.add(blank68);
			blank68.setIcon(new ImageIcon(e.getScaledInstance(110, 50, Image.SCALE_SMOOTH)));
			blank68.setPreferredSize(d);
			blank68.setVisible(true);

		} catch (Exception ex) {
			System.out.println(ex);
		}

		attendClass = new JButton("35. Attend Class");
		p8.add(attendClass);
		attendClass.setBackground(Color.orange);
		attendClass.setOpaque(true);
		attendClass.setBorderPainted(false);
		attendClass.setPreferredSize(d);
		attendClass.addActionListener(this);

		p8.add(eatOutside);
		eatOutside.setBackground(Color.orange);
		eatOutside.setOpaque(true);
		eatOutside.setBorderPainted(false);
		eatOutside.setPreferredSize(d);
		eatOutside.addActionListener(this);
		p8.add(seniorYear);
		seniorYear.setBackground(Color.red);
		seniorYear.setOpaque(true);
		seniorYear.setBorderPainted(false);
		seniorYear.setPreferredSize(d);
		seniorYear.addActionListener(this);
		p8.add(attendJobFair);
		attendJobFair.setBackground(Color.orange);
		attendJobFair.setOpaque(true);
		attendJobFair.setBorderPainted(false);
		attendJobFair.setPreferredSize(d);
		attendJobFair.addActionListener(this);
		board.add(p8);
		p8.setVisible(true);
	}

	////////////////////////////////////////////////////////////////////////////
	private void initP9() {
		p9 = new JPanel();
		registerClass = new JButton("17. Register for classes");
		p9.add(registerClass);
		registerClass.setBackground(Color.orange);
		registerClass.setOpaque(true);
		registerClass.setBorderPainted(false);
		registerClass.setPreferredSize(d);
		registerClass.addActionListener(this);
		buyParkingPass = new JButton("14. Buy Parking Pass");
		p9.add(buyParkingPass);
		buyParkingPass.setBackground(Color.orange);
		buyParkingPass.setOpaque(true);
		buyParkingPass.setBorderPainted(false);
		buyParkingPass.setPreferredSize(d);
		buyParkingPass.addActionListener(this);
		payRent = new JButton("13. Pay Rent");
		p9.add(payRent);
		payRent.setBackground(Color.orange);
		payRent.setOpaque(true);
		payRent.setBorderPainted(false);
		payRent.setPreferredSize(d);
		payRent.addActionListener(this);
		JLabel blank84 = new JLabel(" ");
		p9.add(blank84);
		blank84.setPreferredSize(d);
		blank84.setVisible(true);
		JLabel blank85 = new JLabel(" ");
		p9.add(blank85);
		blank85.setPreferredSize(d);
		blank85.setVisible(true);
		
		try {
			JLabel blank69 = new JLabel(" ");
			p9.add(blank69);
			Image t = ImageIO.read(getClass().getResource("t.png"));
			blank69.setIcon(new ImageIcon(t.getScaledInstance(110, 50, Image.SCALE_SMOOTH)));
			blank69.setPreferredSize(d);
			blank69.setVisible(true);
			JLabel blank70 = new JLabel(" ");
			p9.add(blank70);
			Image o = ImageIO.read(getClass().getResource("o.png"));
			blank70.setIcon(new ImageIcon(o.getScaledInstance(110, 50, Image.SCALE_SMOOTH)));
			blank70.setPreferredSize(d);
			blank70.setVisible(true);
				
		} catch (Exception ex) {
			System.out.println(ex);
		}
		JLabel blank86 = new JLabel(" ");
		p9.add(blank86);
		blank86.setPreferredSize(d);
		blank86.setVisible(true);
		JLabel blank80 = new JLabel(" ");
		p9.add(blank80);
		blank80.setPreferredSize(d);
		blank80.setVisible(true);
		getScholarship = new JButton("34. Get Scholarship");
		p9.add(getScholarship);
		getScholarship.setBackground(Color.green);
		getScholarship.setOpaque(true);
		getScholarship.setBorderPainted(false);
		getScholarship.setPreferredSize(d);
		getScholarship.addActionListener(this);
		JLabel blank75 = new JLabel(" ");
		p9.add(blank75);
		blank75.setPreferredSize(d);
		blank75.setVisible(true);
		JLabel blank76 = new JLabel(" ");
		p9.add(blank76);
		blank76.setPreferredSize(d);
		blank76.setVisible(true);
		JLabel blank77 = new JLabel(" ");
		p9.add(blank77);
		blank77.setPreferredSize(d);
		blank77.setVisible(true);
		JLabel blank78 = new JLabel(" ");
		p9.add(blank78);
		blank78.setPreferredSize(d);
		blank78.setVisible(true);
		board.add(p9);
		p9.setVisible(true);
	}

	///////////////////////////////////////////////////////////////////
	private void initP10() {
		p10 = new JPanel();
		buyBooks1 = new JButton("18. Buy Book");
		try {
			Image img4 = ImageIO.read(getClass().getResource("book.png"));
			buyBooks1.setIcon(new ImageIcon(img4.getScaledInstance(110, 50, Image.SCALE_SMOOTH)));
			p10.add(buyBooks1);
			buyBooks1.setPreferredSize(d);
			buyBooks1.addActionListener(this);
		} catch (Exception ex) {
			System.out.println(ex);
		}
		
		JLabel blank81 = new JLabel(" ");
		p10.add(blank81);
		blank81.setPreferredSize(d);
		blank81.setVisible(true);
		JLabel blank82 = new JLabel(" ");
		p10.add(blank82);
		blank82.setPreferredSize(d);
		blank82.setVisible(true);
		JLabel blank83 = new JLabel(" ");
		p10.add(blank83);
		blank83.setPreferredSize(d);
		blank83.setVisible(true);
		
		try{
			JLabel blank71 = new JLabel(" ");
			p10.add(blank71);
			blank71.setPreferredSize(d);
			blank71.setVisible(true);
			JLabel blank72 = new JLabel(" ");
			p10.add(blank72);
			Image i = ImageIO.read(getClass().getResource("i.png"));
			blank72.setIcon(new ImageIcon(i.getScaledInstance(110, 50, Image.SCALE_SMOOTH)));
			blank72.setPreferredSize(d);
			blank72.setVisible(true);
			JLabel blank73 = new JLabel(" ");
			p10.add(blank73);
			Image s = ImageIO.read(getClass().getResource("s.png"));
			blank73.setIcon(new ImageIcon(s.getScaledInstance(110, 50, Image.SCALE_SMOOTH)));
			blank73.setPreferredSize(d);
			blank73.setVisible(true);
			JLabel blank74 = new JLabel(" ");
			p10.add(blank74);
			Image u = ImageIO.read(getClass().getResource("u.png"));
			blank74.setIcon(new ImageIcon(u.getScaledInstance(110, 50, Image.SCALE_SMOOTH)));
			blank74.setPreferredSize(d);
			blank74.setVisible(true);
		}catch(Exception ex) {
			System.out.println(ex);
		}
		
		JLabel blank87 = new JLabel(" ");
		p10.add(blank87);
		blank87.setPreferredSize(d);
		blank87.setVisible(true);
		payTuition = new JButton("33. Pay Tuition");
		p10.add(payTuition);
		payTuition.setBackground(Color.orange);
		payTuition.setOpaque(true);
		payTuition.setBorderPainted(false);
		payTuition.setPreferredSize(d);
		payTuition.addActionListener(this);
		
		try{
			JLabel blank89 = new JLabel(" ");
			p10.add(blank89);
			blank89.setPreferredSize(d);
			blank89.setVisible(true);
			JLabel blank72 = new JLabel(" ");
			p10.add(blank72);
			Image i = ImageIO.read(getClass().getResource("redbird.png"));
			blank72.setIcon(new ImageIcon(i.getScaledInstance(110, 50, Image.SCALE_SMOOTH)));
			blank72.setPreferredSize(d);
			blank72.setVisible(true);
		}catch(Exception ex) {
			System.out.println(ex);
		}
		
		
		JLabel blank90 = new JLabel(" ");
		p10.add(blank90);
		blank90.setPreferredSize(d);
		blank90.setVisible(true);
		JLabel blank91 = new JLabel(" ");
		p10.add(blank91);
		blank91.setPreferredSize(d);
		blank91.setVisible(true);
		board.add(p10);
		p10.setVisible(true);
	}

	////////////////////////////////////////////////////////////////////////////
	private void initP11() {
		p11 = new JPanel();
		payTuition1 = new JButton("19. Tuition due");
		p11.add(payTuition1);
		payTuition1.setBackground(Color.orange);
		payTuition1.setOpaque(true);
		payTuition1.setBorderPainted(false);
		payTuition1.setPreferredSize(d);
		payTuition1.addActionListener(this);
		JLabel blank93 = new JLabel(" ");
		p11.add(blank93);
		blank93.setPreferredSize(d);
		JLabel blank94 = new JLabel(" ");
		p11.add(blank94);
		blank94.setPreferredSize(d);
		JLabel blank95 = new JLabel(" ");
		p11.add(blank95);
		blank95.setPreferredSize(d);
		JLabel blank96 = new JLabel(" ");
		p11.add(blank96);
		blank96.setPreferredSize(d);
		JLabel blank97 = new JLabel(" ");
		p11.add(blank97);
		blank97.setPreferredSize(d);
		JLabel blank98 = new JLabel(" ");
		p11.add(blank98);
		blank98.setPreferredSize(d);
		JLabel blank99 = new JLabel(" ");
		p11.add(blank99);
		blank99.setPreferredSize(d);
		JLabel blank100 = new JLabel(" ");
		p11.add(blank100);
		blank100.setPreferredSize(d);
		buyBooks2 = new JButton("32. Buy Book");
		try {
			Image img7 = ImageIO.read(getClass().getResource("book.png"));
			buyBooks2.setIcon(new ImageIcon(img7.getScaledInstance(110, 50, Image.SCALE_SMOOTH)));
			p11.add(buyBooks2);
			buyBooks2.setPreferredSize(d);
			buyBooks2.addActionListener(this);
		} catch (Exception ex) {
			System.out.println(ex);
		}
		JLabel blank101 = new JLabel(" ");
		p11.add(blank101);
		blank101.setPreferredSize(d);
		JLabel blank102 = new JLabel(" ");
		p11.add(blank102);
		blank102.setPreferredSize(d);
		JLabel blank103 = new JLabel(" ");
		p11.add(blank103);
		blank103.setPreferredSize(d);
		JLabel blank104 = new JLabel(" ");
		p11.add(blank104);
		blank104.setPreferredSize(d);
		board.add(p11);
		p11.setVisible(true);
	}

	////////////////////////////////////////////////////////////////////////////////////
	private void initP12() {
		p12 = new JPanel();
		applyScholarship = new JButton("20. Apply for Scholarships");
		p12.add(applyScholarship);
		board.add(p12);
		applyScholarship.setBackground(Color.orange);
		applyScholarship.setOpaque(true);
		applyScholarship.setBorderPainted(false);
		applyScholarship.setPreferredSize(d);
		applyScholarship.addActionListener(this);
		getScholarship1 = new JButton("21. Get Scholarship");
		p12.add(getScholarship1);
		board.add(p12);
		getScholarship1.setBackground(Color.green);
		getScholarship1.setOpaque(true);
		getScholarship1.setBorderPainted(false);
		getScholarship1.setPreferredSize(d);
		getScholarship1.addActionListener(this);
		attendClass1 = new JButton("22. Attend Class");
		p12.add(attendClass1);
		board.add(p12);
		attendClass1.setBackground(Color.orange);
		attendClass1.setOpaque(true);
		attendClass1.setBorderPainted(false);
		attendClass1.setPreferredSize(d);
		attendClass1.addActionListener(this);
		dropClass1 = new JButton("23. Drop class");
		p12.add(dropClass1);
		dropClass1.setBackground(Color.orange);
		dropClass1.setOpaque(true);
		dropClass1.setBorderPainted(false);
		dropClass1.addActionListener(this);
		board.add(p12);
		dropClass1.setPreferredSize(d);
		takeExams = new JButton("24. Take exam");
		p12.add(takeExams);
		takeExams.setBackground(Color.orange);
		takeExams.setOpaque(true);
		takeExams.setBorderPainted(false);
		takeExams.addActionListener(this);
		board.add(p12);
		takeExams.setPreferredSize(d);
		passClass = new JButton("25. Pass Class");
		p12.add(passClass);
		passClass.setBackground(Color.orange);
		passClass.setOpaque(true);
		passClass.setBorderPainted(false);
		passClass.addActionListener(this);
		board.add(p12);
		passClass.setPreferredSize(d);
		failClass = new JButton("26. Fail a class");
		failClass.setBackground(Color.orange);
		failClass.setOpaque(true);
		failClass.setBorderPainted(false);
		failClass.addActionListener(this);
		p12.add(failClass);
		board.add(p12);
		failClass.setPreferredSize(d);
		sophomoreYear = new JButton("27. Sophomore Year");
		sophomoreYear.setBackground(Color.red);
		sophomoreYear.setOpaque(true);
		sophomoreYear.setBorderPainted(false);
		sophomoreYear.addActionListener(this);
		p12.add(sophomoreYear);
		sophomoreYear.setPreferredSize(d);
		JLabel blank105 = new JLabel(" ");
		p12.add(blank105);
		blank105.setPreferredSize(d);
		register = new JButton("31. Register for classes");
		p12.add(register);
		register.setBackground(Color.orange);
		register.setOpaque(true);
		register.setBorderPainted(false);
		register.addActionListener(this);
		board.add(p12);
		register.setPreferredSize(d);
		JLabel blank106 = new JLabel(" ");
		p12.add(blank106);
		blank106.setPreferredSize(d);
		JLabel blank107 = new JLabel(" ");
		p12.add(blank107);
		blank107.setPreferredSize(d);
		JLabel blank108 = new JLabel(" ");
		p12.add(blank108);
		blank108.setPreferredSize(d);
		JLabel blank109 = new JLabel(" ");
		p12.add(blank109);
		blank109.setPreferredSize(d);
		board.add(p12);
		p12.setVisible(true);
	}

	//////////////////////////////////////////////////////////////////////
	private void initP13() {
		p13 = new JPanel();
		JLabel blank110 = new JLabel(" ");
		p13.add(blank110);
		blank110.setPreferredSize(d);
		JLabel blank111 = new JLabel(" ");
		p13.add(blank111);
		blank111.setPreferredSize(d);
		JLabel blank112 = new JLabel(" ");
		p13.add(blank112);
		blank112.setPreferredSize(d);
		JLabel blank113 = new JLabel(" ");
		p13.add(blank113);
		blank113.setPreferredSize(d);
		JLabel blank114 = new JLabel(" ");
		p13.add(blank114);
		blank114.setPreferredSize(d);
		JLabel blank115 = new JLabel(" ");
		p13.add(blank115);
		blank115.setPreferredSize(d);
		JLabel blank116 = new JLabel(" ");
		p13.add(blank116);
		blank116.setPreferredSize(d);
		changeMajor = new JButton("28. Change Major");
		p13.add(changeMajor);
		changeMajor.setBackground(Color.orange);
		changeMajor.setOpaque(true);
		changeMajor.setBorderPainted(false);
		changeMajor.addActionListener(this);
		board.add(p13);
		changeMajor.setPreferredSize(d);
		job = new JButton("29. Look for part time job");
		p13.add(job);
		job.setBackground(Color.orange);
		job.setOpaque(true);
		job.setBorderPainted(false);
		job.addActionListener(this);
		board.add(p13);
		job.setPreferredSize(d);
		getJob = new JButton("30. Get a part time job");
		p13.add(getJob);
		getJob.setBackground(Color.green);
		getJob.setOpaque(true);
		getJob.setBorderPainted(false);
		getJob.addActionListener(this);
		board.add(p13);
		getJob.setPreferredSize(d);
		JLabel blank117 = new JLabel(" ");
		p13.add(blank117);
		blank117.setPreferredSize(d);
		JLabel blank118 = new JLabel(" ");
		p13.add(blank118);
		blank118.setPreferredSize(d);
		JLabel blank119 = new JLabel(" ");
		p13.add(blank119);
		blank119.setPreferredSize(d);
		JLabel blank120 = new JLabel(" ");
		p13.add(blank120);
		blank120.setPreferredSize(d);
		board.add(p13);
		p13.setVisible(true);
		board.setVisible(true);
		board.pack();

	}

}
